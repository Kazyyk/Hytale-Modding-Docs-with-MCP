#!/usr/bin/env bash
#
# Hydex Doc Validator — Phase 4.2 CLI
#
# Usage: ./tools/validate.sh
#
# Cross-references generated documentation against decompiled source.
# Catches accessor mismatches, ECS store type errors, stale claims,
# and undefined placeholders.
#
# Exit codes:
#   0 = no issues found
#   1 = issues found

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"

python3 "$SCRIPT_DIR/validate-docs.py"
