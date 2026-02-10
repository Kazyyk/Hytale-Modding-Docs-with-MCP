# Hytale Modding Documentation Generator

Pipeline that generates structured documentation from the Hytale server JAR. The output feeds a static documentation site (Cloudflare Pages) and a RAG corpus (Cloudflare AutoRAG via MCP).

All documentation is mechanically derived from the game files — never from external sources.

## Prerequisites

- **Java 25 JDK** (tested with Temurin 25.0.2)
- **Node.js 22** (for the documentation site)

No other dependencies needed — the Gradle wrapper in `tools/` handles build tooling automatically, and `npm install` in `site/` handles the site.

## Usage

### Phase 1: Decompile & Index

Place `HytaleServer.jar` in the `input/` directory and run:

```bash
./tools/run.sh input/HytaleServer.jar
```

This produces:
- `artifacts/decompiled/` — Full decompiled Java source tree
- `artifacts/class-index.json` — Structured index of every class, method, field, and annotation

### Phase 2: Classify API Surface

```bash
./tools/classify.sh
```

This reads `class-index.json` and produces:
- `artifacts/surface.json` — 811 API surface types
- `artifacts/internal-index.json` — 6,062 internal types
- `artifacts/surface-review.json` — Borderline cases flagged for human review

### Phases 3-4: Map Systems & Generate Docs

Phases 3 and 4 are Claude Code agent work. They read the decompiled source and Phase 1-2 artifacts, then produce:

- `artifacts/systems.json` — 5 mapped systems (events, commands, ECS, registries, codecs), 31 events with dispatch traces, 3 JSON schema extractions
- `artifacts/cross-refs.json` — 32 cross-references
- `output/docs/` — 65 markdown files (landing page, API overview, 31 event docs, 4 command docs, 3 JSON schema docs, 18 key class docs, index pages, internals disclaimer)

### Documentation Site

```bash
cd site
npm install
npm run dev       # Syncs docs + starts dev server at localhost:4321
npm run build     # Syncs docs + builds static site to dist/
```

The site deploys to Cloudflare Pages at `https://hytale-docs.kazyyk.dev`. Full-text search is provided by Pagefind, built into Starlight.

## Pipeline Overview

| Phase | What | How | Status |
|-------|------|-----|--------|
| 1. Decompile & Index | Decompile JAR, parse source, produce class index | Vineflower + JavaParser (deterministic) | **Complete** |
| 2. Classify API Surface | Separate plugin API from internals | Seed-and-expand algorithm | **Complete** |
| 3. Map Systems | Identify events, ECS, commands, registries, JSON schemas | LLM-assisted exploration | **Complete** |
| 4. Generate Docs | Produce markdown documentation | Templated + LLM prose | **Complete** |

See `spec/generator-spec.md` for the full engineering specification.

## Project Structure

```
hytale-modding-mcp/
├── CLAUDE.md               # Claude Code project instructions
├── README.md               # This file
├── spec/                   # Engineering specification
│   └── generator-spec.md
├── input/                  # Place HytaleServer.jar here
├── artifacts/              # Pipeline intermediate outputs
│   ├── decompiled/         # (gitignored — too large)
│   ├── class-index.json    # Phase 1: structured class index
│   ├── surface.json        # Phase 2: API surface types
│   ├── internal-index.json # Phase 2: internal types
│   ├── surface-review.json # Phase 2: borderline cases
│   ├── systems.json        # Phase 3: mapped systems
│   └── cross-refs.json     # Phase 3: cross-references
├── output/
│   └── docs/               # Phase 4: generated documentation (65 markdown files)
├── tools/                  # Phase 1-2 CLI tools (Java + Gradle)
│   ├── run.sh              # Phase 1 entry point
│   ├── classify.sh         # Phase 2 entry point
│   ├── gradlew             # Gradle wrapper
│   └── app/                # Java source
└── site/                   # Documentation site (Astro Starlight)
    ├── astro.config.mjs    # Starlight config (sidebar, theme, metadata)
    ├── package.json
    ├── scripts/
    │   └── sync-docs.mjs   # Copies + patches docs at build time
    ├── src/
    │   ├── content.config.ts   # Extended frontmatter schema
    │   ├── content/docs/       # Synced from output/docs/ (gitignored)
    │   └── styles/custom.css   # Hytale-themed color overrides
    └── public/             # Static assets (favicon, etc.)
```

## Tooling Versions

| Tool | Version | Notes |
|------|---------|-------|
| Java JDK | 25.0.2 (LTS) | Required — Hytale targets Java 25 |
| Vineflower | 1.11.2 | Decompiler (modern Fernflower fork). Released Nov 2025, post-Java 25 GA. |
| JavaParser | 3.28.0 | Source parser. Explicit Java 25 support (records, sealed classes, pattern matching, flexible constructors). |
| Gradle | 9.3.1 | Build tool (via wrapper). Java 25 toolchain support. |
| Gson | 2.11.0 | JSON serialization for class-index.json. |
| Astro | 5 | Static site framework for the documentation site. |
| Starlight | 0.37.6 | Astro documentation theme with built-in Pagefind search. |
| Node.js | 22 | Required for the documentation site build. |

## Next Steps

- **RAG corpus:** Upload generated docs to a Cloudflare R2 bucket and connect Cloudflare AI Search for retrieval-augmented generation.
- **MCP server:** Deploy a Cloudflare Worker as a public MCP server for programmatic access to the documentation.

## Assumptions

1. **Vineflower handles Java 25 bytecode.** Vineflower 1.11.2 was released after Java 25 GA (Nov 2025 vs Sep 2025) and handles modern Java features. However, explicit class file version 69 support is not confirmed in release notes. If decompilation fails on specific classes, they will be logged and skipped.

2. **JavaParser language level set to JAVA_21.** JAVA_25 is available but causes 15 extra parse failures due to stricter `yield` keyword handling in Vineflower's decompiled output. JAVA_21 gives 99.9% parse rate (5,232/5,237). The one file needing JAVA_25 (ArrayVoxelSpace, JEP 513 flexible constructors) is an internal implementation detail. A two-pass approach (JAVA_21 first, JAVA_25 fallback) is deferred to post-MVP.

3. **Inner classes are indexed as separate entries.** Both the outer class and inner class appear as top-level entries in class-index.json, with the inner class using dot-separated FQCN (e.g., `Outer.Inner`).

4. **Type names are simple names, not fully qualified.** Field types, return types, and parameter types in the index use the name as written in source (e.g., `Logger` not `org.slf4j.Logger`). Full qualification would require symbol resolution, which is deferred.
