#!/usr/bin/env bash
#
# Incremental Pipeline Run
#
# Orchestrates an incremental documentation update for a branch.
# Assumes Phase 1 (decompile + index) has already been run.
#
# Usage: ./tools/incremental-run.sh <branch> <base-index>
#
# Arguments:
#   branch      - Branch name (pre-release, stable)
#   base-index  - Path to the previous class-index.json to diff against
#
# Example (first pre-release run, diff against stable):
#   ./tools/incremental-run.sh pre-release artifacts/class-index.json
#
# Example (subsequent pre-release run, diff against previous pre-release):
#   ./tools/incremental-run.sh pre-release artifacts/pre-release/class-index-prev.json
#
# Steps:
#   1. Phase 1.5: Diff & Plan (diff-plan.py)
#   2. Phase 2: Classify (classify.sh)
#   3. Copy base docs if output doesn't exist
#   4. Cleanup removed types (cleanup-removed.py)
#   5. Report: ready for Phase 3 (system mapping) and Phase 4 (doc generation)
#
# Phase 3 and 4 are LLM agent work and must be run interactively or
# by the automation daemon. This script prepares the artifacts they need.

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"

if [ $# -lt 2 ]; then
    echo "Usage: $0 <branch> <base-index>"
    echo "  Example: $0 pre-release artifacts/class-index.json"
    exit 1
fi

BRANCH="$1"
BASE_INDEX="$2"
BRANCH_ARTIFACTS="$PROJECT_ROOT/artifacts/$BRANCH"
BRANCH_INDEX="$BRANCH_ARTIFACTS/class-index.json"

# Verify prerequisites
if [ ! -f "$BRANCH_INDEX" ]; then
    echo "ERROR: Branch class-index not found: $BRANCH_INDEX"
    echo "Run Phase 1 first: ./tools/run.sh input/$BRANCH/HytaleServer.jar $BRANCH"
    exit 1
fi

if [ ! -f "$BASE_INDEX" ]; then
    echo "ERROR: Base index not found: $BASE_INDEX"
    exit 1
fi

echo "Incremental Pipeline Run"
echo "========================"
echo "Branch:     $BRANCH"
echo "Base index: $BASE_INDEX"
echo "New index:  $BRANCH_INDEX"
echo ""

# Step 1: Phase 1.5 — Diff & Plan
echo "--- Phase 1.5: Diff & Plan ---"
python3 "$SCRIPT_DIR/diff-plan.py" "$BASE_INDEX" "$BRANCH_INDEX" "$BRANCH_ARTIFACTS"
echo ""

# Step 2: Phase 2 — Classify
echo "--- Phase 2: Classify ---"
"$SCRIPT_DIR/classify.sh" "$BRANCH"
echo ""

# Step 3: Copy base docs if output doesn't exist
BRANCH_DOCS="$PROJECT_ROOT/output/$BRANCH/docs"
if [ "$BRANCH" = "stable" ]; then
    BRANCH_DOCS="$PROJECT_ROOT/output/docs"
fi

BASE_DOCS="$PROJECT_ROOT/output/docs"
if [ ! -d "$BRANCH_DOCS/packages" ]; then
    echo "--- Copying base docs ---"
    mkdir -p "$BRANCH_DOCS"
    cp -r "$BASE_DOCS/"* "$BRANCH_DOCS/"
    echo "Copied base docs to $BRANCH_DOCS"
    echo ""
fi

# Step 4: Cleanup removed types
echo "--- Cleanup removed types ---"
python3 "$SCRIPT_DIR/cleanup-removed.py" "$BASE_INDEX" "$BRANCH_INDEX" "$BRANCH_DOCS"
echo ""

# Step 5: Summary
PLAN="$BRANCH_ARTIFACTS/regeneration-plan.json"
if [ -f "$PLAN" ]; then
    REGEN_COUNT=$(python3 -c "import json; print(json.load(open('$PLAN'))['regeneration_count'])")
    TOTAL_COUNT=$(python3 -c "import json; print(json.load(open('$PLAN'))['total_types'])")
    SCOPE=$(python3 -c "import json; print(json.load(open('$PLAN'))['regeneration_scope_pct'])")
    echo "========================"
    echo "Incremental preparation complete."
    echo ""
    echo "Regeneration plan: $REGEN_COUNT / $TOTAL_COUNT types ($SCOPE%)"
    echo "Plan file: $PLAN"
    echo ""
    echo "Next steps:"
    echo "  1. Phase 3: Re-map changed subsystems (if needed)"
    echo "  2. Phase 4: Generate docs for types in regeneration-plan.json"
    echo "  3. Phase 4.1: Validate links"
    echo "  4. Phase 4.2: Validate docs against source"
fi
