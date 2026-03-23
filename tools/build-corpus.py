#!/usr/bin/env python3
"""
Transforms raw documentation markdown into an optimized corpus for AI Search.

Reads from output/docs/ (or output/{branch}/docs/) and writes to
output/corpus/ (or output/{branch}/corpus/). The corpus format strips
frontmatter noise, flattens tables, resolves links, and removes formatting
overhead to maximize embedding signal per chunk.

Index pages (index.md) are excluded entirely — they're navigation tables
that fail AI Search vectorization and contain no unique semantic content.

Usage:
    python3 tools/build-corpus.py [branch]

    branch: stable (default) or pre-release
"""

import os
import re
import sys
import yaml
from pathlib import Path

PROJECT_ROOT = Path(__file__).resolve().parent.parent


def resolve_paths(branch: str) -> tuple[Path, Path]:
    """Return (source_docs, target_corpus) paths for the given branch."""
    if branch == "stable":
        return PROJECT_ROOT / "output" / "docs", PROJECT_ROOT / "output" / "corpus"
    else:
        return (
            PROJECT_ROOT / "output" / branch / "docs",
            PROJECT_ROOT / "output" / branch / "corpus",
        )


def parse_frontmatter(content: str) -> tuple[dict, str]:
    """Split YAML frontmatter from markdown body. Returns (metadata, body)."""
    if not content.startswith("---"):
        return {}, content
    end = content.find("\n---\n", 3)
    if end == -1:
        return {}, content
    fm_text = content[4:end]
    body = content[end + 5:]
    try:
        meta = yaml.safe_load(fm_text) or {}
    except yaml.YAMLError:
        meta = {}
    return meta, body


def build_metadata_header(meta: dict) -> str:
    """Build a compact metadata header line from frontmatter fields."""
    title = meta.get("title", "Unknown")
    kind = meta.get("kind", "")
    package = meta.get("package", "")
    extends = meta.get("extends")
    implements = meta.get("implements", [])

    parts = []
    if kind:
        parts.append(f"Type: {kind}")
    if package:
        parts.append(f"Package: {package}")
    if extends and extends != "~":
        parts.append(f"Extends: {extends}")
    if implements:
        parts.append(f"Implements: {', '.join(implements)}")

    header = f"# {title}\n\n"
    if parts:
        header += " | ".join(parts) + "\n"
    return header


def resolve_links(text: str) -> str:
    """Convert markdown links to plain text: [Foo](Bar.md) → Foo"""
    return re.sub(r"\[([^\]]*)\]\([^)]*\)", r"\1", text)


def strip_code_fences(text: str) -> str:
    """Remove code fence markers but keep the content."""
    return re.sub(r"^```\w*\s*$", "", text, flags=re.MULTILINE)


def flatten_tables(text: str) -> str:
    """Convert markdown tables to flat lists.

    Method tables (Modifier | Return Type | Signature) become:
        - @Nonnull public Path getFile()

    Simple tables (Name | Description) become:
        - Name: Description

    Type tables in index pages (Type | Kind | ...) become:
        - TypeName (kind): Description
    """
    lines = text.split("\n")
    result = []
    i = 0
    while i < len(lines):
        line = lines[i]

        # Detect table header row (contains |)
        if "|" in line and i + 1 < len(lines) and re.match(r"^\s*\|[-\s|:]+\|\s*$", lines[i + 1]):
            # Parse header columns
            headers = [h.strip() for h in line.strip().strip("|").split("|")]
            headers_lower = [h.lower() for h in headers]
            # Skip separator row
            i += 2

            # Determine table type from headers
            is_method_table = "signature" in headers_lower
            is_value_table = "name" in headers_lower and "description" in headers_lower
            is_constructor_table = "signature" in headers_lower and len(headers) == 1
            is_constant_table = "name" in headers_lower and "type" in headers_lower

            # Find column indices
            sig_idx = headers_lower.index("signature") if "signature" in headers_lower else -1
            mod_idx = headers_lower.index("modifier") if "modifier" in headers_lower else -1
            ret_idx = headers_lower.index("return type") if "return type" in headers_lower else -1
            name_idx = headers_lower.index("name") if "name" in headers_lower else -1
            desc_idx = headers_lower.index("description") if "description" in headers_lower else -1
            type_idx = headers_lower.index("type") if "type" in headers_lower else -1

            while i < len(lines) and "|" in lines[i] and not lines[i].strip().startswith("---"):
                cols = [c.strip().strip("`") for c in lines[i].strip().strip("|").split("|")]

                if is_method_table and sig_idx >= 0 and sig_idx < len(cols):
                    parts = []
                    if mod_idx >= 0 and mod_idx < len(cols) and cols[mod_idx]:
                        parts.append(cols[mod_idx])
                    if ret_idx >= 0 and ret_idx < len(cols) and cols[ret_idx]:
                        parts.append(cols[ret_idx])
                    parts.append(cols[sig_idx])
                    result.append(f"- {' '.join(parts)}")
                elif is_constructor_table and sig_idx >= 0 and sig_idx < len(cols):
                    result.append(f"- {cols[sig_idx]}")
                elif is_constant_table and name_idx >= 0 and type_idx >= 0:
                    mod_part = ""
                    if mod_idx >= 0 and mod_idx < len(cols) and cols[mod_idx]:
                        mod_part = cols[mod_idx] + " "
                    type_val = cols[type_idx] if type_idx < len(cols) else ""
                    name_val = cols[name_idx] if name_idx < len(cols) else ""
                    result.append(f"- {mod_part}{type_val} {name_val}")
                elif is_value_table and name_idx >= 0:
                    name_val = cols[name_idx] if name_idx < len(cols) else ""
                    desc_val = cols[desc_idx] if desc_idx >= 0 and desc_idx < len(cols) else ""
                    if desc_val:
                        result.append(f"- {name_val}: {desc_val}")
                    else:
                        result.append(f"- {name_val}")
                else:
                    # Generic table row — join non-empty cells
                    cell_text = " | ".join(c for c in cols if c)
                    if cell_text:
                        result.append(f"- {cell_text}")

                i += 1
            continue

        result.append(line)
        i += 1

    return "\n".join(result)


def remove_redundant_package_line(text: str) -> str:
    """Remove the '**Package:** `com.hypixel...`' line (already in header)."""
    return re.sub(r"^\*\*Package:\*\*\s*`[^`]+`\s*$", "", text, flags=re.MULTILINE)


def collapse_blank_lines(text: str) -> str:
    """Collapse 3+ consecutive blank lines to 2."""
    return re.sub(r"\n{4,}", "\n\n\n", text)


def transform_type_page(content: str) -> str:
    """Transform a single type documentation page into corpus format."""
    meta, body = parse_frontmatter(content)
    if not meta:
        return content  # Not a standard doc page, pass through

    header = build_metadata_header(meta)
    body = remove_redundant_package_line(body)
    body = resolve_links(body)
    body = flatten_tables(body)
    body = strip_code_fences(body)
    body = collapse_blank_lines(body)

    return header + "\n" + body.strip() + "\n"


def main():
    branch = sys.argv[1] if len(sys.argv) > 1 else "stable"
    if branch not in ("stable", "pre-release"):
        print(f"ERROR: Unknown branch '{branch}'. Use 'stable' or 'pre-release'.")
        sys.exit(1)

    source_dir, target_dir = resolve_paths(branch)

    if not source_dir.exists():
        print(f"ERROR: Source directory not found: {source_dir}")
        sys.exit(1)

    # Collect all .md files
    all_files = []
    skipped_indexes = 0
    for root, _dirs, files in os.walk(source_dir):
        for fname in files:
            if not fname.endswith(".md"):
                continue
            full = Path(root) / fname
            rel = full.relative_to(source_dir)

            # Skip index pages — they're navigation tables that fail vectorization
            if fname == "index.md":
                skipped_indexes += 1
                continue

            all_files.append(rel)

    print(f"Building corpus for {branch}")
    print(f"  Source: {source_dir}")
    print(f"  Target: {target_dir}")
    print(f"  Type pages: {len(all_files)}")
    print(f"  Index pages skipped: {skipped_indexes}")

    # Transform and write
    written = 0
    unchanged = 0
    total_source_bytes = 0
    total_corpus_bytes = 0

    for rel in sorted(all_files):
        src = source_dir / rel
        dest = target_dir / rel
        dest.parent.mkdir(parents=True, exist_ok=True)

        content = src.read_text(encoding="utf-8")
        total_source_bytes += len(content.encode("utf-8"))

        transformed = transform_type_page(content)
        total_corpus_bytes += len(transformed.encode("utf-8"))

        # Incremental: only write if changed
        try:
            existing = dest.read_text(encoding="utf-8")
        except FileNotFoundError:
            existing = None

        if existing != transformed:
            dest.write_text(transformed, encoding="utf-8")
            written += 1
        else:
            unchanged += 1

    # Remove stale files from corpus that no longer exist in source
    removed = 0
    if target_dir.exists():
        for root, _dirs, files in os.walk(target_dir):
            for fname in files:
                if not fname.endswith(".md"):
                    continue
                full = Path(root) / fname
                rel = full.relative_to(target_dir)
                if rel not in set(all_files):
                    full.unlink()
                    removed += 1
        # Clean empty directories
        for root, dirs, files in os.walk(target_dir, topdown=False):
            for d in dirs:
                dp = Path(root) / d
                if not any(dp.iterdir()):
                    dp.rmdir()

    reduction = (1 - total_corpus_bytes / total_source_bytes) * 100 if total_source_bytes else 0
    print(f"\nResults:")
    print(f"  Written: {written}, Unchanged: {unchanged}, Removed stale: {removed}")
    print(f"  Source size:  {total_source_bytes:,} bytes")
    print(f"  Corpus size:  {total_corpus_bytes:,} bytes")
    print(f"  Reduction:    {reduction:.1f}%")


if __name__ == "__main__":
    main()
