# Hytale Modding Docs (with MCP)

Automatically generated API documentation for the Hytale dedicated server, served as a static site and queryable via MCP.

**Live site:** [hytale-docs.kazyyk.dev](https://hytale-docs.kazyyk.dev)

**Live MCP server:** [mcp.hytale-docs.kazyyk.dev/mcp](https://mcp.hytale-docs.kazyyk.dev/mcp) ([/sse](https://mcp.hytale-docs.kazyyk.dev/sse) also available)

## What This Is

A four-phase pipeline that takes a Hytale server JAR, decompiles it, classifies the plugin API surface, maps game systems, and generates 65 structured markdown documents covering events, commands, JSON schemas, key classes, and internals. The output feeds both a Starlight documentation site and a Cloudflare AI Search corpus accessible through a remote MCP server.

## Architecture

```
HytaleServer.jar
       │
       ▼
┌─────────────────────────────────────────────┐
│  Pipeline (Phases 1-4)                      │
│  Decompile → Classify → Map → Generate      │
└─────────────────┬───────────────────────────┘
                  │
                  ▼
           output/docs/
           65 markdown files
          ┌───────┴───────┐
          ▼               ▼
   Starlight Site    R2 Bucket
   (Cloudflare       (hytale-modding-corpus)
    Pages)                │
                          ▼
                    AI Search
                    (Vectorize + Workers AI)
                          │
                          ▼
                    MCP Worker
                    (Cloudflare Workers)
                          │
                          ▼
                   Claude Code / Desktop
```

## Pipeline

| Phase | Task | Method | Status |
|-------|------|--------|--------|
| 1. Decompile & Index | Decompile JAR, parse source, produce class index | Vineflower + JavaParser (deterministic) | **Complete** |
| 2. Classify API Surface | Separate plugin API from internals | Seed-and-expand algorithm | **Complete** |
| 3. Map Systems | Identify events, ECS, commands, registries, JSON schemas | LLM-assisted exploration | **Complete** |
| 4. Generate Docs | Produce markdown documentation | Templated + LLM prose | **Complete** |

See `spec/generator-spec.md` for the full engineering specification.

## Generated Documentation

65 markdown files organized by system:

- **31 Events** — Player, block, entity, chat, command, and server lifecycle events with dispatch context, parameters, and cancellation behavior
- **4 Commands** — Built-in command implementations with argument schemas and permission requirements
- **3 JSON Schemas** — Block state, prefab, and creature type data asset schemas with field types, defaults, and validation rules
- **18 Key Classes** — Plugin entry points, registries, ECS components, command framework, and server internals
- **Section indexes** — Overview pages for each category with cross-references

Every file includes structured frontmatter (kind, FQCN, package, API surface, related types, tags) that drives site navigation and RAG chunk metadata.

## Documentation Site

Built with [Astro Starlight](https://starlight.astro.build/) and deployed to [Cloudflare Pages](https://pages.cloudflare.com). The site syncs from `output/docs/` at build time via a script that copies files and patches the landing page with Starlight's splash template.

Deployed automatically on push via Cloudflare Pages git integration.

## MCP Server

A remote MCP server on Cloudflare Workers exposes the documentation corpus via semantic search. It uses Cloudflare AI Search (Vectorize + Workers AI) for retrieval with query rewriting and BGE reranking, returning raw chunks that Claude synthesizes directly.

### Connect from Claude Code

```bash
claude mcp add-json "hytale-modding" \
  '{"command":"npx","args":["mcp-remote","https://mcp.hytale-docs.kazyyk.dev/mcp"]}'
```

### Connect from Claude Desktop

Add to `~/Library/Application Support/Claude/claude_desktop_config.json`:

```json
{
  "mcpServers": {
    "hytale-modding": {
      "command": "npx",
      "args": [
        "mcp-remote",
        "https://mcp.hytale-docs.kazyyk.dev/mcp"
      ]
    }
  }
}
```

See `mcp/README.md` for setup, deployment, and design decisions.

## CI/CD

A GitHub Action (`.github/workflows/sync-r2.yml`) syncs `output/docs/` to the R2 bucket on push to `main`, excluding JSON metadata files. AI Search re-indexes automatically when the bucket changes.

## Project Structure

```
hytale-modding-mcp/
├── CLAUDE.md                  # Claude Code project instructions
├── README.md                  # This file
├── spec/
│   └── generator-spec.md     # Engineering specification
├── input/                     # Place HytaleServer.jar here
├── artifacts/                 # Pipeline intermediate outputs
│   ├── decompiled/            # (gitignored)
│   ├── class-index.json       # Phase 1: structured class index
│   ├── surface.json           # Phase 2: API surface classification
│   ├── internal-index.json    # Phase 2: internal types
│   ├── surface-review.json    # Phase 2: borderline cases
│   ├── systems.json           # Phase 3: mapped systems
│   └── cross-refs.json        # Phase 3: cross-references
├── output/
│   └── docs/                  # Phase 4: generated documentation (65 files)
├── tools/                     # Phase 1-2 CLI tools (Java + Gradle)
│   ├── run.sh                 # Phase 1 entry point
│   ├── classify.sh            # Phase 2 entry point
│   ├── gradlew                # Gradle wrapper
│   └── app/                   # Java source
├── site/                      # Documentation site (Astro Starlight)
│   ├── astro.config.mjs
│   ├── scripts/sync-docs.mjs
│   ├── src/
│   │   ├── content.config.ts  # Extended frontmatter schema
│   │   └── styles/custom.css
│   └── package.json
├── mcp/                       # MCP server (Cloudflare Workers)
│   ├── src/index.ts           # McpAgent with search_docs tool
│   ├── wrangler.jsonc
│   └── package.json
└── .github/
    └── workflows/
        └── sync-r2.yml        # R2 bucket sync on push
```

## Tooling

| Tool | Version | Purpose |
|------|---------|---------|
| Java JDK | 25.0.2 | Hytale targets Java 25 |
| Vineflower | 1.11.2 | Decompiler (modern Fernflower fork) |
| JavaParser | 3.28.0 | Source parser with Java 25 support |
| Gradle | 9.3.1 | Build tool for Phase 1-2 CLI |
| Astro | 5 | Static site framework |
| Starlight | 0.37.6 | Documentation theme with Pagefind search |
| Node.js | 22 | Site build + MCP Worker |
| Wrangler | 4 | Cloudflare Workers CLI |

## Running the Pipeline

The pipeline has already been run and the outputs are committed. To re-run from a new JAR:

```bash
# Phase 1: Decompile & index
cd tools && ./run.sh ../input/HytaleServer.jar

# Phase 2: Classify API surface
cd tools && ./classify.sh

# Phases 3-4: Run via Claude Code (LLM-assisted)
# See CLAUDE.md for instructions

# Build site locally
cd site && npm install && npm run dev

# Deploy MCP server
cd mcp && npm install && npx wrangler deploy
```

## License

This project generates documentation from Hytale's game files for community reference. Hytale is a trademark of Hypixel Studios. This project is not affiliated with or endorsed by Hypixel Studios.
