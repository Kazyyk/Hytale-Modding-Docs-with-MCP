#!/usr/bin/env python3
"""
Phase 1.5: Diff & Plan — Incremental regeneration planning.

Compares two class-index.json files (previous and current) and produces:
1. changeset.json — List of added, removed, and modified types
2. regeneration-plan.json — Types whose docs need regeneration, with reasons

Usage:
    python3 tools/diff-plan.py <previous-index> <current-index> <output-dir>

Example:
    python3 tools/diff-plan.py \
        artifacts/class-index.json \
        artifacts/pre-release/class-index.json \
        artifacts/pre-release

The regeneration plan is used by Phase 4 to generate only the changed types
rather than the full corpus. On future incremental runs, the previous index
is the same branch's prior version (not stable).
"""

import json
import os
import sys
from collections import defaultdict
from datetime import datetime, timezone


def load_index(path):
    """Load a class-index.json and return a dict keyed by FQCN."""
    data = json.load(open(path))
    return {c['fqcn']: c for c in data['classes']}, data


def compute_changeset(prev_types, curr_types):
    """Compute added, removed, and modified types between two indexes."""
    prev_set = set(prev_types.keys())
    curr_set = set(curr_types.keys())

    added = sorted(curr_set - prev_set)
    removed = sorted(prev_set - curr_set)

    modified = []
    for fqcn in sorted(prev_set & curr_set):
        p = prev_types[fqcn]
        c = curr_types[fqcn]
        changes = []

        pm = len(p.get('methods', []))
        cm = len(c.get('methods', []))
        if pm != cm:
            changes.append(f"methods {pm}→{cm}")

        pf = len(p.get('fields', []))
        cf = len(c.get('fields', []))
        if pf != cf:
            changes.append(f"fields {pf}→{cf}")

        if p.get('superclass') != c.get('superclass'):
            changes.append(f"extends {p.get('superclass')}→{c.get('superclass')}")

        if p.get('interfaces') != c.get('interfaces'):
            changes.append("implements changed")

        if p.get('kind') != c.get('kind'):
            changes.append(f"kind {p.get('kind')}→{c.get('kind')}")

        if changes:
            modified.append({
                'fqcn': fqcn,
                'changes': changes
            })

    return added, removed, modified


def compute_affected_types(modified_fqcns, curr_types):
    """
    Find types whose docs may need updating because they reference
    modified types. This is a simple name-based heuristic — a full
    dependency graph would be more accurate but requires Phase 4 output.
    """
    modified_names = set()
    for fqcn in modified_fqcns:
        modified_names.add(fqcn.rsplit('.', 1)[-1])
        modified_names.add(fqcn)

    affected = set()
    for fqcn, info in curr_types.items():
        if fqcn in modified_fqcns:
            continue  # Already in the modified set

        # Check superclass
        if info.get('superclass') in modified_fqcns:
            affected.add(fqcn)
            continue

        # Check interfaces
        for iface in info.get('interfaces', []):
            if iface in modified_fqcns:
                affected.add(fqcn)
                break

        # Check method signatures for references to modified types
        for method in info.get('methods', []):
            if method.get('return_type') in modified_names:
                affected.add(fqcn)
                break
            for param in method.get('parameters', []):
                if param.get('type') in modified_names:
                    affected.add(fqcn)
                    break

    return sorted(affected)


def group_by_package(fqcns, types_dict):
    """Group FQCNs by their Java package."""
    pkg_map = defaultdict(list)
    for fqcn in fqcns:
        if fqcn in types_dict:
            pkg = types_dict[fqcn].get('package', fqcn.rsplit('.', 1)[0])
        else:
            pkg = fqcn.rsplit('.', 1)[0]
        pkg_map[pkg].append(fqcn)
    return dict(pkg_map)


def main():
    if len(sys.argv) != 4:
        print(__doc__)
        sys.exit(1)

    prev_path = sys.argv[1]
    curr_path = sys.argv[2]
    output_dir = sys.argv[3]

    os.makedirs(output_dir, exist_ok=True)

    print("Phase 1.5: Diff & Plan")
    print("======================")
    print(f"  Previous: {prev_path}")
    print(f"  Current:  {curr_path}")
    print(f"  Output:   {output_dir}")
    print()

    prev_types, prev_data = load_index(prev_path)
    curr_types, curr_data = load_index(curr_path)

    # Step 1: Compute changeset
    added, removed, modified = compute_changeset(prev_types, curr_types)
    modified_fqcns = [m['fqcn'] for m in modified]

    print(f"Previous types: {len(prev_types)}")
    print(f"Current types:  {len(curr_types)}")
    print(f"Added:          {len(added)}")
    print(f"Removed:        {len(removed)}")
    print(f"Modified:       {len(modified)}")

    # Step 2: Find affected types (types that reference modified types)
    affected = compute_affected_types(modified_fqcns, curr_types)
    print(f"Affected:       {len(affected)} (reference modified types)")

    # Step 3: Build regeneration set
    regen_set = sorted(set(added + modified_fqcns + affected))
    print(f"Regeneration:   {len(regen_set)} types")
    print(f"Scope:          {len(regen_set)}/{len(curr_types)} = {len(regen_set)/len(curr_types)*100:.1f}%")

    # Check if full run would be more efficient
    if len(regen_set) / len(curr_types) > 0.8:
        print("WARNING: >80% regeneration — full run would be more efficient")

    # Step 4: Write changeset.json
    changeset = {
        "version": "1.0.0",
        "generated_at": datetime.now(timezone.utc).isoformat(),
        "previous_jar_hash": prev_data.get('jar_hash', 'unknown'),
        "current_jar_hash": curr_data.get('jar_hash', 'unknown'),
        "previous_types": len(prev_types),
        "current_types": len(curr_types),
        "added": added,
        "removed": removed,
        "modified": modified,
    }

    changeset_path = os.path.join(output_dir, "changeset.json")
    with open(changeset_path, 'w') as f:
        json.dump(changeset, f, indent=2)
    print(f"\nWritten: {changeset_path}")

    # Step 5: Write regeneration-plan.json
    regen_entries = []
    for fqcn in regen_set:
        if fqcn in added:
            reason = "added"
        elif fqcn in modified_fqcns:
            changes = next(m['changes'] for m in modified if m['fqcn'] == fqcn)
            reason = f"modified: {', '.join(changes)}"
        elif fqcn in affected:
            reason = "affected: references modified type"
        else:
            reason = "unknown"
        regen_entries.append({"fqcn": fqcn, "reason": reason})

    plan = {
        "version": "1.0.0",
        "generated_at": datetime.now(timezone.utc).isoformat(),
        "previous_jar_hash": prev_data.get('jar_hash', 'unknown'),
        "current_jar_hash": curr_data.get('jar_hash', 'unknown'),
        "total_types": len(curr_types),
        "added_count": len(added),
        "removed_count": len(removed),
        "modified_count": len(modified),
        "affected_count": len(affected),
        "regeneration_count": len(regen_set),
        "regeneration_scope_pct": round(len(regen_set) / len(curr_types) * 100, 1),
        "removed_types": removed,
        "regeneration_set": regen_entries,
        "by_package": group_by_package(regen_set, curr_types),
    }

    plan_path = os.path.join(output_dir, "regeneration-plan.json")
    with open(plan_path, 'w') as f:
        json.dump(plan, f, indent=2)
    print(f"Written: {plan_path}")


if __name__ == '__main__':
    main()
