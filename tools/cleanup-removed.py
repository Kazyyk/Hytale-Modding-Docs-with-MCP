#!/usr/bin/env python3
"""
Cleans up documentation after types are removed in an incremental run.

For each removed type:
1. Deletes the type's documentation page
2. Updates the package index.md to remove or delink the type entry
3. Converts any remaining broken .md links to inline code

Usage:
    python3 tools/cleanup-removed.py <stable-index> <pre-release-index> <docs-root>

Example:
    python3 tools/cleanup-removed.py \
        artifacts/class-index.json \
        artifacts/pre-release/class-index.json \
        output/pre-release/docs
"""

import json
import os
import re
import shutil
import sys


def find_removed_types(stable_path, prerelease_path):
    """Diff two class-index.json files and return removed FQCNs."""
    stable = json.load(open(stable_path))
    pre = json.load(open(prerelease_path))
    stable_fqcns = set(c['fqcn'] for c in stable['classes'])
    pre_fqcns = set(c['fqcn'] for c in pre['classes'])
    return sorted(stable_fqcns - pre_fqcns)


def delete_type_pages(removed, docs_root):
    """Delete documentation pages for removed types."""
    packages_dir = os.path.join(docs_root, 'packages')
    deleted = 0

    for fqcn in removed:
        parts = fqcn.rsplit('.', 1)
        if len(parts) != 2:
            continue
        pkg, name = parts

        # Try direct match: packages/{pkg}/{Name}.md
        page = os.path.join(packages_dir, pkg, f"{name}.md")
        if os.path.exists(page):
            os.remove(page)
            deleted += 1

        # Try inner class format: packages/{outer_pkg}/{Outer.Inner}.md
        # Inner classes have the outer class package, not their own
        if '.' in name:
            # This is already handled by the direct match above
            pass

    print(f"  Deleted {deleted} type pages")
    return deleted


def fix_broken_links(docs_root):
    """Convert any broken .md links to inline code."""
    packages_dir = os.path.join(docs_root, 'packages')
    link_pattern = re.compile(r'\[([^\]]*)\]\(([^)]+\.md[^)]*)\)')
    fixed_files = 0
    fixed_links = 0

    for root, dirs, files in os.walk(packages_dir):
        for f in files:
            if not f.endswith('.md'):
                continue
            filepath = os.path.join(root, f)
            with open(filepath) as fh:
                content = fh.read()

            new_content = content
            for match in link_pattern.finditer(content):
                target = match.group(2).split('#')[0]
                resolved = os.path.normpath(
                    os.path.join(os.path.dirname(filepath), target)
                )
                if not os.path.exists(resolved):
                    text = match.group(1)
                    new_content = new_content.replace(
                        match.group(0), f'`{text}`'
                    )
                    fixed_links += 1

            if new_content != content:
                with open(filepath, 'w') as fh:
                    fh.write(new_content)
                fixed_files += 1

    print(f"  Fixed {fixed_links} broken links across {fixed_files} files")
    return fixed_links


def cleanup_empty_dirs(docs_root):
    """Remove package directories that have no type pages (only index.md)."""
    packages_dir = os.path.join(docs_root, 'packages')
    cleaned = 0

    for d in os.listdir(packages_dir):
        pkg_dir = os.path.join(packages_dir, d)
        if not os.path.isdir(pkg_dir):
            continue
        md_files = [f for f in os.listdir(pkg_dir)
                     if f.endswith('.md') and f != 'index.md']
        if len(md_files) == 0:
            shutil.rmtree(pkg_dir)
            cleaned += 1

    print(f"  Cleaned {cleaned} empty package directories")
    return cleaned


def main():
    if len(sys.argv) != 4:
        print(__doc__)
        sys.exit(1)

    stable_index = sys.argv[1]
    pre_index = sys.argv[2]
    docs_root = sys.argv[3]

    print("Incremental cleanup: removing deleted types from docs")
    print(f"  Stable index: {stable_index}")
    print(f"  Pre-release index: {pre_index}")
    print(f"  Docs root: {docs_root}")
    print()

    # Step 1: Find removed types
    removed = find_removed_types(stable_index, pre_index)
    print(f"Found {len(removed)} removed types")

    # Step 2: Delete their pages
    delete_type_pages(removed, docs_root)

    # Step 3: Fix broken links in remaining docs (index.md files, etc.)
    fix_broken_links(docs_root)

    # Step 4: Clean up empty directories
    cleanup_empty_dirs(docs_root)

    # Step 5: Verify zero violations
    link_pattern = re.compile(r'\[([^\]]*)\]\(([^)]+\.md[^)]*)\)')
    packages_dir = os.path.join(docs_root, 'packages')
    violations = 0
    for root, dirs, files in os.walk(packages_dir):
        for f in files:
            if not f.endswith('.md'):
                continue
            filepath = os.path.join(root, f)
            with open(filepath) as fh:
                content = fh.read()
            for match in link_pattern.finditer(content):
                target = match.group(2).split('#')[0]
                resolved = os.path.normpath(
                    os.path.join(os.path.dirname(filepath), target)
                )
                if not os.path.exists(resolved):
                    violations += 1

    print(f"\nVerification: {violations} remaining violations")
    if violations > 0:
        print("WARNING: Some broken links remain — manual review needed")
        sys.exit(1)
    else:
        print("All clean.")


if __name__ == '__main__':
    main()
