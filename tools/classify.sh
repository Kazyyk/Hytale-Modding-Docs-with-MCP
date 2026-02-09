#!/usr/bin/env bash
#
# Hytale API Surface Classifier — Phase 2 CLI
#
# Usage: ./tools/classify.sh [artifacts/class-index.json]
#
# Reads class-index.json and classifies types into API surface vs internal.
# Produces:
#   artifacts/surface.json         - API surface types with categories
#   artifacts/internal-index.json  - Internal types with tags
#   artifacts/surface-review.json  - Borderline cases for human review

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"

INDEX_PATH="${1:-$PROJECT_ROOT/artifacts/class-index.json}"

# Resolve to absolute path
if [[ ! "$INDEX_PATH" = /* ]]; then
    INDEX_PATH="$(pwd)/$INDEX_PATH"
fi

if [ ! -f "$INDEX_PATH" ]; then
    echo "ERROR: File not found: $INDEX_PATH"
    echo "Usage: $0 [path-to-class-index.json]"
    exit 1
fi

echo "Hytale API Surface Classifier — Phase 2"
echo "========================================"
echo "Index: $INDEX_PATH"
echo ""

# Build if needed
echo "Building classifier..."
"$SCRIPT_DIR/gradlew" -p "$SCRIPT_DIR" :app:build -x test --quiet

echo ""
echo "Running classifier..."
"$SCRIPT_DIR/gradlew" -p "$SCRIPT_DIR" :app:classify --args="$INDEX_PATH" --quiet
