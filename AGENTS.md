# Hytale API Index — Agent Instructions

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
6. Write output to `output/docs/`.

### Phase 4.1: Validate Links & Gap-Fill

Run this after Phase 4 completes, before deploying. It is safe to re-run.

1. **Scan all generated docs for link targets.**
   Walk every `.md` file in `output/docs/`. For each markdown link targeting
   a `.md` file (regex: `\[...\](...\.md...)`), resolve the relative path
   against the file's directory to get a normalized path within the output
   tree.

2. **Build the file set.**
   Collect all `.md` files in `output/docs/` into a set of normalized paths.

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
   - Write to the correct location in `output/docs/`.
   - Add the file to `output/docs/progress.json`.

5. **Write the audit report** to `artifacts/link-audit.json` (schema in the
   spec addendum). This documents every violation found and the action taken.

6. **Re-scan and assert zero violations.** After all fixes and generation,
   scan again. If any `.md` link still targets a nonexistent file, stop and
   report the failures. Do not proceed.

### Link rules (apply during Phase 4 AND Phase 4.1)

- Every `.md` link must resolve to a file in `output/docs/`. If the file
  doesn't exist, use inline code (`` `TypeName` ``) instead of a link.
- Relative paths must be correct for the file's directory. A file in
  `api/commands/` linking to a class in `api/classes/` must use
  `../classes/Foo.md`, not `Foo.md`.
- Internal types (not in `surface.json`) are NEVER linked. Use inline code.
- When generating a new page, check whether existing pages already reference
  it and ensure bidirectional links are consistent.
- Do not curate "key types" lists by hand. Derive the generation set from
  `surface.json` cross-referenced with types actually referenced by existing
  generated pages.

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

- `input/` — Place the HytaleServer.jar here.
- `artifacts/` — Intermediate pipeline outputs. Committed to git for
  debuggability.
- `output/docs/` — Final generated documentation. This becomes the
  static site content and RAG source.
- `spec/` — This spec and related design documents.

## Tooling

- **Phase 1 CLI:** `tools/run.sh input/HytaleServer.jar` — Decompiles JAR and
  produces class-index.json. Java + Gradle project using Vineflower 1.11.2
  and JavaParser 3.28.0.
- **Phases 2-4:** LLM agent work. See `spec/generator-spec.md` for
  exploration heuristics and output templates.
