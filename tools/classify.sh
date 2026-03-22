#!/usr/bin/env bash
#
# Hytale API Surface Classifier — Phase 2 CLI
#
# Usage: ./tools/classify.sh [branch]
#
# Reads class-index.json and classifies types into API surface vs internal.
# Produces:
#   artifacts/[branch/]surface.json         - API surface types with categories
#   artifacts/[branch/]internal-index.json  - Internal types with tags
#   artifacts/[branch/]surface-review.json  - Borderline cases for human review
#
# If branch is provided (stable, pre-release), reads/writes from
# artifacts/{branch}/. Otherwise uses artifacts/ directly.

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"

BRANCH="${1:-}"

if [ -n "$BRANCH" ]; then
    INDEX_PATH="$PROJECT_ROOT/artifacts/$BRANCH/class-index.json"
else
    INDEX_PATH="$PROJECT_ROOT/artifacts/class-index.json"
fi

if [ ! -f "$INDEX_PATH" ]; then
    echo "ERROR: File not found: $INDEX_PATH"
    echo "Usage: $0 [branch]"
    echo "  Example: $0 stable"
    echo "  Example: $0 pre-release"
    exit 1
fi

echo "Hytale API Surface Classifier — Phase 2"
echo "========================================"
echo "Index: $INDEX_PATH"
if [ -n "$BRANCH" ]; then
    echo "Branch: $BRANCH"
fi
echo ""

# Build if needed
echo "Building classifier..."
"$SCRIPT_DIR/gradlew" -p "$SCRIPT_DIR" :app:build -x test --quiet

echo ""
echo "Running classifier..."
"$SCRIPT_DIR/gradlew" -p "$SCRIPT_DIR" :app:classify --args="$INDEX_PATH" --quiet
