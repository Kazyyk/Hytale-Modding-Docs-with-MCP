# Hydex — Agent Instructions

## Project Overview

This project generates documentation from the Hytale server JAR. The output
is structured markdown that feeds a static documentation site and a RAG
corpus. All documentation is mechanically derived from the game files — never
from external sources.

## Pipeline

Run phases in order. Each phase reads from `artifacts/` and writes to
`artifacts/` or `output/`. Do not skip phases.

### Phase 1: Decompile & Index

1. Decompile `input/HytaleServer.jar` using Vineflower.
   Output to `artifacts/decompiled/`.
2. Parse the decompiled source with JavaParser and produce
   `artifacts/class-index.json` per the schema in the spec.
3. This phase is deterministic. Do not use LLM judgment. If the decompiler
   or parser fails on a file, log the error and continue.

### Phase 2: Classify API Surface

1. Load `artifacts/class-index.json`.
2. Start from the seed types listed in the spec (Section 2, Phase 2).
3. Expand transitively per the expansion rules.
4. Write `artifacts/surface.json` and `artifacts/internal-index.json`.
5. Flag borderline cases in `artifacts/surface-review.json` for human
   review. Do not silently reclassify.

### Phase 3: Map Systems & Cross-Reference

1. Load the decompiled source and the API surface classification.
2. Apply the exploration heuristics from Section 4 of the spec.
3. For each system (events, ECS, commands, registries, JSON schemas):
   - Identify all relevant types.
   - Trace relationships (dispatch sites, access patterns, etc.).
   - Record findings in `artifacts/systems.json` and
     `artifacts/cross-refs.json`.
4. When uncertain about a classification, record your confidence level
   and reasoning. Prefer false positives (documenting too much) over
   false negatives (missing something).

### Phase 4: Generate Docs

1. Load all artifacts.
2. For each type in the API surface, generate a markdown file following
   the templates in Section 3 of the spec.
3. For structural content (signatures, fields, hierarchies): template
   directly from the structured artifacts. Do not rephrase or reformat
   method signatures.
4. For prose content (descriptions, usage notes, "fired by" context):
   generate concise, accurate descriptions based on the decompiled source.
   State what the code does, not what you think it might do. If you
   cannot determine purpose from the code, say so explicitly.
5. Generate index files for each directory.
6. Write output to `output/stable/docs/`.

### Phase 4.1: Validate Links & Gap-Fill

Run this after Phase 4 completes, before deploying. It is safe to re-run.

1. **Scan all generated docs for link targets.**
   Walk every `.md` file in `output/stable/docs/`. For each markdown link targeting
   a `.md` file (regex: `\[...\](...\.md...)`), resolve the relative path
   against the file's directory to get a normalized path within the output
   tree.

2. **Build the file set.**
   Collect all `.md` files in `output/stable/docs/` into a set of normalized paths.

3. **Identify violations.** For each link target not in the file set:
   - **Wrong path?** Check if a file with the same basename exists elsewhere
     in the tree. If so, correct the relative path in the source file.
     Example: `api/commands/index.md` links to `AbstractCommand.md` but the
     file is at `api/classes/AbstractCommand.md` → fix to
     `../classes/AbstractCommand.md`.
   - **Missing API surface type?** Look up the type name in
     `artifacts/surface.json`. If it's a public API type, generate its
     documentation page using the same templates and quality rules as Phase 4.
   - **Internal type?** Convert the link to inline code: `[Foo](Foo.md)` →
     `` `Foo` ``.
   - **Unknown?** Log it for human review. Do not guess.

4. **Generate missing pages.** For each must-generate type:
   - Load the decompiled source from `artifacts/decompiled/`.
   - Load any relevant context from `artifacts/systems.json`.
   - Generate the page following the standard class/interface/enum template.
   - Write to the correct location in `output/stable/docs/`.
   - Add the file to `output/stable/docs/progress.json`.

5. **Write the audit report** to `artifacts/link-audit.json` (schema in the
   spec addendum). This documents every violation found and the action taken.

6. **Re-scan and assert zero violations.** After all fixes and generation,
   scan again. If any `.md` link still targets a nonexistent file, stop and
   report the failures. Do not proceed.

### Phase 4.2: Validate Docs Against Source

Run this after Phase 4.1 completes. It is safe to re-run.

Cross-references generated documentation against decompiled source to catch
errors that link validation cannot detect:

1. **Accessor name mismatches** — verifies every `getX()` / `isX()` /
   `willX()` in doc tables exists in the decompiled `.java` source,
   walking the inheritance chain.
2. **ECS store type mismatches** — verifies listening examples use the
   correct `Store` type parameter (`ChunkStore` vs `EntityStore`) by
   checking the event's dispatch system.
3. **Stale uniqueness claims** — detects phrases like "only async event"
   and cross-checks against the full event corpus.
4. **Undefined placeholders** — flags `MAX`, `TBD`, `TODO`, `UNKNOWN` in
   doc content.

CLI: `./tools/validate.sh` (or `python3 tools/validate-docs.py`)

Exit code 0 = pass, 1 = issues found.

### Link rules (apply during Phase 4 AND Phase 4.1)

- Every `.md` link must resolve to a file in the output docs. If the
  target file doesn't exist yet (batch generation in progress), use
  inline code (`` `TypeName` ``) instead of a link.
- Relative paths must be correct for the file's directory. Files in the
  same package link as `[Foo](Foo.md)`. Files in different packages link
  as `[Foo](../com.hypixel.hytale.other.package/Foo.md)`.
- Standard library types (java.*, javax.*, org.slf4j.*) are never linked —
  use inline code.
- When generating a new page, check whether existing pages already reference
  it and ensure bidirectional links are consistent.
- Do not curate "key types" lists by hand. The generation set is ALL types
  in class-index.json.

## Quality Rules

- Never invent API that doesn't exist in the source.
- Never omit public API that does exist in the source.
- Method signatures must be character-perfect copies from the decompiled
  source.
- Cross-references must be bidirectional: if A references B, B must
  reference A.
- Every generated file must have complete frontmatter per the spec.
- Do not include a `# Title` H1 in the markdown body. The frontmatter
  `title` field is rendered as the page heading by Starlight.
- When you don't know something, say "Purpose unknown — inferred from
  usage context" rather than guessing.

## File Locations

- `input/{branch}/` — Place the HytaleServer.jar for each branch here.
- `artifacts/{branch}/` — Intermediate pipeline outputs per branch.
  Committed to git for debuggability.
- `output/stable/docs/` — Stable generated documentation.
- `output/pre-release/docs/` — Pre-release generated documentation.
- `output/stable/corpus/` — Stable corpus optimized for AI Search (built by build-corpus.py).
- `output/pre-release/corpus/` — Pre-release corpus optimized for AI Search.
- `spec/` — This spec and related design documents.
- `site/stable/` — Starlight site for hydex.dev.
- `site/pre-release/` — Starlight site for pre.hydex.dev.
- `mcp/stable/` — MCP worker for mcp.hydex.dev.
- `mcp/pre-release/` — MCP worker for mcp.pre.hydex.dev.
- `legacy/` — Pre-v2 artifacts and old docs for reference.

## Tooling

- **Phase 1 CLI:** `tools/run.sh <jar> [branch]` — Decompiles JAR and
  produces class-index.json. Java + Gradle project using Vineflower 1.11.2
  and JavaParser 3.28.0. If branch is provided (stable, pre-release),
  outputs go to `artifacts/{branch}/`.
- **Phase 2 CLI:** `tools/classify.sh [branch]` — Classifies types into
  API surface vs internal (metadata only — does not gate generation).
  Reads/writes from `artifacts/{branch}/` if branch is provided.
- **Phase 1.5 CLI:** `python3 tools/diff-plan.py <prev-index> <curr-index>
  <output-dir>` — Diffs two class-index.json files and produces
  `changeset.json` (added/removed/modified types) and
  `regeneration-plan.json` (types needing doc regeneration with reasons).
  Includes affected types that reference modified types.
- **Incremental orchestrator:** `tools/incremental-run.sh <branch>
  <base-index>` — Runs Phase 1.5, Phase 2, copies base docs, and cleans
  up removed types. Prepares everything for Phase 3-4 agent work.
- **Phases 3-4:** LLM agent work. See `spec/generator-spec.md` for
  exploration heuristics and output templates.
- **Incremental cleanup:** `python3 tools/cleanup-removed.py <old-index>
  <new-index> <docs-root>` — Deletes pages for removed types, fixes
  broken links in index files, and cleans up empty package directories.
  Called automatically by `incremental-run.sh`.
- **Phase 4.2 CLI:** `tools/validate.sh` — Cross-references docs against
  decompiled source. Catches accessor mismatches, store type errors, stale
  claims, and placeholders.
- **Corpus builder:** `python3 tools/build-corpus.py [branch]` — Transforms
  raw docs into an optimized corpus for AI Search vectorization. Strips
  frontmatter noise, flattens tables, resolves links, excludes index pages.
  Writes to `output/{branch}/corpus/`.
