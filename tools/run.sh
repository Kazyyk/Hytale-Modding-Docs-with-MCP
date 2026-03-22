#!/usr/bin/env bash
#
# Hytale JAR Indexer — Phase 1 CLI
#
# Usage: ./tools/run.sh <path-to-jar> [branch]
#
# Decompiles the given JAR using Vineflower and produces:
#   artifacts/[branch/]decompiled/   - Full decompiled source tree
#   artifacts/[branch/]class-index.json - Structured class index
#
# If branch is provided (stable, pre-release), outputs go to
# artifacts/{branch}/. Otherwise outputs go to artifacts/ directly.

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

if [ $# -lt 1 ]; then
    echo "Usage: $0 <path-to-jar> [branch]"
    echo "  Example: $0 input/stable/HytaleServer.jar stable"
    echo "  Example: $0 input/pre-release/HytaleServer.jar pre-release"
    exit 1
fi

JAR_PATH="$1"
BRANCH="${2:-}"

# Resolve to absolute path
if [[ ! "$JAR_PATH" = /* ]]; then
    JAR_PATH="$(pwd)/$JAR_PATH"
fi

if [ ! -f "$JAR_PATH" ]; then
    echo "ERROR: File not found: $JAR_PATH"
    exit 1
fi

echo "Hytale JAR Indexer — Phase 1"
echo "============================"
echo "JAR: $JAR_PATH"
if [ -n "$BRANCH" ]; then
    echo "Branch: $BRANCH"
fi
echo ""

# Build if needed (Gradle's up-to-date checks handle incremental builds)
echo "Building indexer..."
"$SCRIPT_DIR/gradlew" -p "$SCRIPT_DIR" :app:build -x test --quiet

echo ""
echo "Running indexer..."
if [ -n "$BRANCH" ]; then
    "$SCRIPT_DIR/gradlew" -p "$SCRIPT_DIR" :app:run --args="$JAR_PATH $BRANCH" --quiet
else
    "$SCRIPT_DIR/gradlew" -p "$SCRIPT_DIR" :app:run --args="$JAR_PATH" --quiet
fi
