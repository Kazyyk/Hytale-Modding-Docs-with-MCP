# Hytale API Index

Automatically generated API documentation for the Hytale dedicated server, served as a static site and queryable via MCP.

**Live site:** [api.hytale.kazyyk.dev](https://api.hytale.kazyyk.dev)

**Live MCP server:** [mcp.hytale.kazyyk.dev/mcp](https://mcp.hytale.kazyyk.dev/mcp) ([/sse](https://mcp.hytale.kazyyk.dev/sse) also available)

## What This Is / What This Is Not

**What this is:** An automated API reference index generated from the Hytale server JAR. It is a tooling pipeline that decompiles, classifies, and maps the server's internal APIs into a structured, searchable reference for mod developers.

**What this is not:** Official documentation, manually authored content, or a replacement for Hypixel Studios' own documentation efforts. Every documented type, method, and field is mechanically derived from the game files.

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
                   MCP Client
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
- **22 Key Classes** — Plugin entry points, command framework, registries, ECS components, and server internals
- **3 JSON Schemas** — Block, item, and crafting recipe data asset schemas with field types, defaults, and validation rules
- **Section indexes** — Overview pages for each category including command system reference with 55+ built-in commands

Every file includes structured frontmatter (kind, FQCN, package, API surface, related types, tags) that drives site navigation and RAG chunk metadata.

## Documentation Site

Built with [Astro Starlight](https://starlight.astro.build/) and deployed to [Cloudflare Pages](https://pages.cloudflare.com). The site syncs from `output/docs/` at build time via a script that copies files and patches the landing page with Starlight's splash template.

Deployed automatically on push via Cloudflare Pages git integration.

## MCP Server

A remote MCP server on Cloudflare Workers exposes the documentation corpus via semantic search. It uses Cloudflare AI Search (Vectorize + Workers AI) for retrieval with query rewriting and BGE reranking, returning raw document chunks for the client to process.

### Connecting

The MCP endpoint is `https://mcp.hytale.kazyyk.dev/mcp` (HTTP transport). An SSE endpoint is also available at `/sse`.

Most MCP-compatible clients can connect using the HTTP URL directly. Examples:

**Claude Code:**
```bash
claude mcp add --transport http hytale-api-index https://mcp.hytale.kazyyk.dev/mcp
```

**Claude Desktop** (`claude_desktop_config.json`):
```json
{
  "mcpServers": {
    "hytale-api-index": {
      "type": "http",
      "url": "https://mcp.hytale.kazyyk.dev/mcp"
    }
  }
}
```

See `mcp/README.md` for setup, deployment, and design decisions.

## CI/CD

A GitHub Action (`.github/workflows/sync-docs-r2.yml`) syncs `output/docs/` to the R2 bucket on push to `main`, excluding JSON metadata files. AI Search re-indexes automatically when the bucket changes.

## Project Structure

```
hytale-api-index/
├── AGENTS.md                  # Agent instructions (CLAUDE.md symlinks here)
├── CONTRIBUTING.md            # Contribution guidelines
├── LICENSE                    # Project license
├── README.md                  # This file
├── SECURITY.md                # Security policy
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
        └── sync-docs-r2.yml   # R2 bucket sync on push
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

# Phases 3-4: LLM-assisted (see AGENTS.md for instructions)

# Build site locally
cd site && npm install && npm run dev

# Deploy MCP server
cd mcp && npm install && npx wrangler deploy
```

## License

This project generates documentation from Hytale's game files for community reference. Hytale is a trademark of Hypixel Studios. This project is not affiliated with or endorsed by Hypixel Studios.
