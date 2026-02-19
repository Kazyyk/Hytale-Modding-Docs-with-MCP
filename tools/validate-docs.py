#!/usr/bin/env python3
"""
Hydex Doc Validator — Phase 4.2

Cross-references generated documentation against decompiled source to catch:
1. Accessor name mismatches (doc vs actual method names in .java source)
2. ECS store type mismatches (listening examples using wrong Store type)
3. Stale uniqueness claims ("only", "sole" applied to interface impls)
4. Undefined placeholders (MAX, TBD, TODO, UNKNOWN in content)

Usage: python3 tools/validate-docs.py [--fix-artifacts]

Exit codes:
  0 = no issues found
  1 = issues found (printed to stdout)
"""

import json
import os
import re
import sys
from pathlib import Path
from typing import Optional

PROJECT_ROOT = Path(__file__).resolve().parent.parent
DOCS_DIR = PROJECT_ROOT / "output" / "docs"
DECOMPILED_DIR = PROJECT_ROOT / "artifacts" / "decompiled"
SYSTEMS_JSON = PROJECT_ROOT / "artifacts" / "systems.json"


class Issue:
    def __init__(self, file: str, line: int, check: str, message: str):
        self.file = file
        self.line = line
        self.check = check
        self.message = message

    def __str__(self):
        return f"  [{self.check}] {self.file}:{self.line} — {self.message}"


def find_java_source(fqcn: str) -> Optional[Path]:
    """Resolve FQCN to decompiled .java file path."""
    rel_path = fqcn.replace(".", "/") + ".java"
    source = DECOMPILED_DIR / rel_path
    return source if source.exists() else None


def extract_methods_from_source(source_path: Path) -> "set[str]":
    """Extract all public method names from a decompiled Java file."""
    methods = set()
    content = source_path.read_text()
    # Match public/protected method declarations, handling generic return types
    # e.g. "public Map<String, Map<String, String>> getChangedMessages("
    for m in re.finditer(r'(?:public|protected)\s+(?:static\s+)?(?:final\s+)?(?:@\w+\s+)*[\w.<>,\s\[\]?]+\s+(\w+)\s*\(', content):
        name = m.group(1)
        # Skip constructors (capitalized) and common false positives
        if not name[0].isupper():
            methods.add(name)
    return methods


def extract_methods_with_inheritance(fqcn: str) -> "set[str]":
    """Extract methods from a class and all its superclasses."""
    methods = set()
    visited = set()
    queue = [fqcn]

    while queue:
        current = queue.pop(0)
        if current in visited:
            continue
        visited.add(current)

        source = find_java_source(current)
        if not source:
            continue

        methods.update(extract_methods_from_source(source))

        # Find superclass
        content = source.read_text()
        m = re.search(r'(?:class|interface)\s+\w+(?:<[^>]*>)?\s+extends\s+([\w.]+)(?:<[^>]*>)?', content)
        if m:
            parent_name = m.group(1)
            # Resolve to FQCN using imports
            for imp in re.finditer(r'import\s+([\w.]+\.' + re.escape(parent_name) + r')\s*;', content):
                queue.append(imp.group(1))
                break
            else:
                # Try same package
                pkg_match = re.match(r'package\s+([\w.]+)\s*;', content)
                if pkg_match:
                    queue.append(pkg_match.group(1) + "." + parent_name)

    return methods


def extract_store_type_from_dispatch_system(fqcn: str) -> Optional[str]:
    """Determine the Store type parameter from the event's dispatch system."""
    source = find_java_source(fqcn)
    if not source:
        return None
    content = source.read_text()
    # Look for "extends ...System<StoreType>" pattern
    m = re.search(r'extends\s+\w+System<(\w+)>', content)
    if m:
        return m.group(1)
    return None


def check_accessor_mismatches(issues: list[Issue]):
    """Check 1: Accessor names in docs vs actual method names in decompiled source."""
    for md_path in DOCS_DIR.rglob("*.md"):
        content = md_path.read_text()
        lines = content.split("\n")

        # Extract FQCN from frontmatter
        fqcn = None
        for line in lines:
            if line.startswith("fqcn:"):
                fqcn = line.split(":", 1)[1].strip().strip('"')
                break
        if not fqcn:
            continue

        methods = extract_methods_with_inheritance(fqcn)
        if not methods:
            continue

        # Find accessor columns in markdown tables
        for i, line in enumerate(lines, 1):
            if "|" not in line:
                continue
            # Match accessor patterns like `getXxx()` or `isXxx()` or `willXxx()`
            for m in re.finditer(r'`(\w+)\(\)`', line):
                accessor = m.group(1)
                # Skip constructors and non-accessor patterns
                if accessor[0].isupper():
                    continue
                if accessor not in methods:
                    # Check if it's in a table row (heuristic: has multiple | separators)
                    if line.count("|") >= 4:
                        rel = md_path.relative_to(PROJECT_ROOT)
                        issues.append(Issue(
                            str(rel), i, "ACCESSOR",
                            f"`{accessor}()` not found in decompiled source. "
                            f"Available methods: {sorted(m for m in methods if m.startswith('get') or m.startswith('is') or m.startswith('will'))}"
                        ))


def check_ecs_store_types(issues: list[Issue]):
    """Check 2: ECS event listening examples use the correct Store type."""
    if not SYSTEMS_JSON.exists():
        return

    systems = json.loads(SYSTEMS_JSON.read_text())
    events = systems.get("systems", {}).get("events", {}).get("concrete_events", [])

    # Build map of ECS events to their dispatch system class
    ecs_events = {}
    for evt in events:
        fqcn = evt.get("fqcn", "")
        fired_by = evt.get("fired_by", {})
        dispatch_class = fired_by.get("class", "")
        if evt.get("extends") and "EcsEvent" in (evt.get("extends") or ""):
            ecs_events[fqcn.split(".")[-1]] = dispatch_class

    for md_path in (DOCS_DIR / "api" / "events").glob("*.md"):
        content = md_path.read_text()
        event_name = md_path.stem

        if event_name not in ecs_events:
            continue

        dispatch_class = ecs_events[event_name]
        if not dispatch_class or dispatch_class == "unknown":
            continue

        # Determine expected store type from dispatch system
        dispatch_source = find_java_source(dispatch_class)
        if not dispatch_source:
            continue

        dispatch_content = dispatch_source.read_text()
        store_match = re.search(r'extends\s+\w+(?:System|Systems)<(\w+)>', dispatch_content)
        if not store_match:
            continue

        expected_store = store_match.group(1)

        # Check what store type the doc example uses
        lines = content.split("\n")
        for i, line in enumerate(lines, 1):
            m = re.search(r'EntityEventSystem<(\w+),', line)
            if m:
                actual_store = m.group(1)
                if actual_store != expected_store:
                    rel = md_path.relative_to(PROJECT_ROOT)
                    issues.append(Issue(
                        str(rel), i, "STORE_TYPE",
                        f"Example uses `{actual_store}` but dispatch system "
                        f"`{dispatch_class.split('.')[-1]}` operates on `{expected_store}`"
                    ))


def check_uniqueness_claims(issues: list[Issue]):
    """Check 3: Uniqueness claims about interface implementations."""
    if not SYSTEMS_JSON.exists():
        return

    systems = json.loads(SYSTEMS_JSON.read_text())
    events = systems.get("systems", {}).get("events", {}).get("concrete_events", [])

    # Build interface implementation counts
    impl_counts = {}  # type: dict[str, list[str]]
    for evt in events:
        for iface in evt.get("implements", []):
            base = re.sub(r'<.*>', '', iface)
            impl_counts.setdefault(base, []).append(evt["fqcn"].split(".")[-1])

    # Patterns that assert uniqueness
    uniqueness_patterns = [
        r'(?:the\s+)?only\s+\w+\s+event',
        r'sole\s+\w+\s+event',
        r'unique(?:ly)?\s+\w+\s+event',
    ]

    for md_path in (DOCS_DIR / "api" / "events").glob("*.md"):
        content = md_path.read_text()
        lines = content.split("\n")

        # Extract what interfaces this event implements
        event_interfaces = set()
        for line in lines:
            if "Implements:" in line:
                for m in re.finditer(r'`(\w+)(?:<[^>]*>)?`', line):
                    event_interfaces.add(m.group(1))

        for i, line in enumerate(lines, 1):
            for pattern in uniqueness_patterns:
                if re.search(pattern, line, re.IGNORECASE):
                    # Check if the claim is true
                    for iface in event_interfaces:
                        impls = impl_counts.get(iface, [])
                        if len(impls) > 1:
                            rel = md_path.relative_to(PROJECT_ROOT)
                            issues.append(Issue(
                                str(rel), i, "UNIQUENESS",
                                f"Claims uniqueness but `{iface}` is implemented by "
                                f"{len(impls)} events: {', '.join(impls)}"
                            ))


def check_placeholders(issues: list[Issue]):
    """Check 4: Undefined placeholders in doc content."""
    placeholder_patterns = [
        (r'\bMAX\b(?!_VALUE)', "Undefined `MAX` — use concrete value (e.g., `Double.MAX_VALUE`)"),
        (r'\bTBD\b', "Placeholder `TBD` found"),
        (r'\bTODO\b', "Placeholder `TODO` found"),
        (r'\bUNKNOWN\b(?!`)', "Placeholder `UNKNOWN` found"),
        (r'\bFIXME\b', "Placeholder `FIXME` found"),
    ]

    for md_path in DOCS_DIR.rglob("*.md"):
        content = md_path.read_text()
        lines = content.split("\n")

        for i, line in enumerate(lines, 1):
            # Skip frontmatter
            if i <= 1 and line == "---":
                continue
            # Skip code blocks
            if line.strip().startswith("```"):
                continue

            for pattern, message in placeholder_patterns:
                if re.search(pattern, line):
                    rel = md_path.relative_to(PROJECT_ROOT)
                    issues.append(Issue(str(rel), i, "PLACEHOLDER", message))


def main():
    issues = []  # type: list[Issue]

    print("Hydex Doc Validator — Phase 4.2")
    print("================================")
    print()

    print("Check 1: Accessor name mismatches...")
    check_accessor_mismatches(issues)
    count_1 = len(issues)
    print(f"  Found {count_1} issues")

    print("Check 2: ECS store type mismatches...")
    check_ecs_store_types(issues)
    count_2 = len(issues) - count_1
    print(f"  Found {count_2} issues")

    print("Check 3: Stale uniqueness claims...")
    check_uniqueness_claims(issues)
    count_3 = len(issues) - count_1 - count_2
    print(f"  Found {count_3} issues")

    print("Check 4: Undefined placeholders...")
    check_placeholders(issues)
    count_4 = len(issues) - count_1 - count_2 - count_3
    print(f"  Found {count_4} issues")

    print()
    if issues:
        print(f"FAIL: {len(issues)} issue(s) found:\n")
        for issue in sorted(issues, key=lambda i: (i.check, i.file, i.line)):
            print(issue)
        print()
        return 1
    else:
        print("PASS: No issues found.")
        return 0


if __name__ == "__main__":
    sys.exit(main())
