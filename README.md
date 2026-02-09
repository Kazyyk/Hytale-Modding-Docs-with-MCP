# Hytale Modding Documentation Generator

Pipeline that generates structured documentation from the Hytale server JAR. The output feeds a static documentation site (Cloudflare Pages) and a RAG corpus (Cloudflare AutoRAG via MCP).

All documentation is mechanically derived from the game files — never from external sources.

## Prerequisites

- **Java 25 JDK** (tested with Temurin 25.0.2)

No other dependencies needed — the Gradle wrapper in `tools/` handles build tooling automatically.

## Usage

1. Place `HytaleServer.jar` in the `input/` directory.
2. Run the Phase 1 indexer:

```bash
./tools/run.sh input/HytaleServer.jar
```

This produces:
- `artifacts/decompiled/` — Full decompiled Java source tree
- `artifacts/class-index.json` — Structured index of every class, method, field, and annotation

## Pipeline Overview

| Phase | What | How | Status |
|-------|------|-----|--------|
| 1. Decompile & Index | Decompile JAR, parse source, produce class index | Vineflower + JavaParser (deterministic) | **Implemented** |
| 2. Classify API Surface | Separate plugin API from internals | Seed-and-expand algorithm | Planned |
| 3. Map Systems | Identify events, ECS, commands, registries, JSON schemas | LLM-assisted exploration | Planned |
| 4. Generate Docs | Produce markdown documentation | Templated + LLM prose | Planned |

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
│   └── class-index.json    # Structured class index (committed)
├── output/
│   └── docs/               # Generated documentation (Phases 2-4)
└── tools/                  # Phase 1 CLI tool (Java + Gradle)
    ├── run.sh              # Entry point
    ├── gradlew             # Gradle wrapper
    └── app/                # Java source
```

## Tooling Versions

| Tool | Version | Notes |
|------|---------|-------|
| Java JDK | 25.0.2 (LTS) | Required — Hytale targets Java 25 |
| Vineflower | 1.11.2 | Decompiler (modern Fernflower fork). Released Nov 2025, post-Java 25 GA. |
| JavaParser | 3.28.0 | Source parser. Explicit Java 25 support (records, sealed classes, pattern matching, flexible constructors). |
| Gradle | 9.3.1 | Build tool (via wrapper). Java 25 toolchain support. |
| Gson | 2.11.0 | JSON serialization for class-index.json. |

## Assumptions

1. **Vineflower handles Java 25 bytecode.** Vineflower 1.11.2 was released after Java 25 GA (Nov 2025 vs Sep 2025) and handles modern Java features. However, explicit class file version 69 support is not confirmed in release notes. If decompilation fails on specific classes, they will be logged and skipped.

2. **JavaParser language level set to JAVA_21.** JavaParser 3.28.0 claims Java 25 support, but the `LanguageLevel` enum may not have a `JAVA_25` constant yet. We use `JAVA_21` which covers all finalized features (records, sealed classes, pattern matching for switch). Decompiled output from Vineflower should not contain syntax beyond what JAVA_21 covers.

3. **Inner classes are indexed as separate entries.** Both the outer class and inner class appear as top-level entries in class-index.json, with the inner class using dot-separated FQCN (e.g., `Outer.Inner`).

4. **Type names are simple names, not fully qualified.** Field types, return types, and parameter types in the index use the name as written in source (e.g., `Logger` not `org.slf4j.Logger`). Full qualification would require symbol resolution, which is deferred.
