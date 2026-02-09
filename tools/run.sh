#!/usr/bin/env bash
#
# Hytale JAR Indexer — Phase 1 CLI
#
# Usage: ./tools/run.sh input/HytaleServer.jar
#
# Decompiles the given JAR using Vineflower and produces:
#   artifacts/decompiled/   - Full decompiled source tree
#   artifacts/class-index.json - Structured class index

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

if [ $# -lt 1 ]; then
    echo "Usage: $0 <path-to-jar>"
    echo "  Example: $0 input/HytaleServer.jar"
    exit 1
fi

JAR_PATH="$1"

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
echo ""

# Build if needed (Gradle's up-to-date checks handle incremental builds)
echo "Building indexer..."
"$SCRIPT_DIR/gradlew" -p "$SCRIPT_DIR" :app:build -x test --quiet

echo ""
echo "Running indexer..."
"$SCRIPT_DIR/gradlew" -p "$SCRIPT_DIR" :app:run --args="$JAR_PATH" --quiet
