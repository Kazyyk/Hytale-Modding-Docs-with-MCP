# Hytale API Index MCP Server

A remote [Model Context Protocol](https://modelcontextprotocol.io/) (MCP) server deployed on Cloudflare Workers that exposes the Hytale API documentation corpus via semantic search.

## Architecture

```
MCP Client
        │
        ▼
  MCP Worker (Cloudflare Workers)
        │
        ▼
  AI Search (Vectorize + Workers AI)
        │
        ▼
  R2 Bucket (hytale-modding-corpus)
    65 markdown docs
```

The Worker uses the Cloudflare Agents SDK `McpAgent` class to implement the MCP protocol, and the Workers AI binding to query the AI Search instance.

## Tools

### `search_docs`

Semantic search over the Hytale API documentation corpus.

**Parameters:**
- `query` (string, required) — Natural language search query
- `max_results` (number, optional, default: 5) — Maximum chunks to return (1-20)

**Returns:** Ranked document chunks with source filenames, relevance scores, and content.

## Setup

### Prerequisites

- Node.js 22+
- Wrangler CLI (`npm i -g wrangler`)
- Cloudflare account with:
  - AI Search instance named `hytale-modding-corpus`
  - R2 bucket `hytale-modding-corpus` populated with docs

### Deploy

```bash
cd mcp
npm install
npx wrangler deploy
```

The server will be live at:
`https://hytale-api-index-mcp.<your-account>.workers.dev/mcp` (HTTP transport)
and `https://hytale-api-index-mcp.<your-account>.workers.dev/sse` (SSE transport)

### Connect an MCP Client

The server exposes both `/mcp` (HTTP transport) and `/sse` (SSE transport) endpoints. Most MCP-compatible clients can connect using the URL directly.

**Claude Code:**
```bash
claude mcp add --transport http hytale-api-index https://hytale-api-index-mcp.<your-account>.workers.dev/mcp
```

**Claude Desktop** (`claude_desktop_config.json`):
```json
{
  "mcpServers": {
    "hytale-api-index": {
      "type": "http",
      "url": "https://hytale-api-index-mcp.<your-account>.workers.dev/mcp"
    }
  }
}
```

**Other MCP clients** — point at either endpoint URL.

### Local Development

```bash
npm run dev
# Server runs at http://localhost:8787/sse

# In another terminal, test with MCP Inspector:
npx @modelcontextprotocol/inspector@latest
# Connect to http://localhost:8787/sse
```

## Design Decisions

- **`search()` over `aiSearch()`**: We return raw chunks rather than AI-generated answers. MCP clients typically have their own LLM for synthesis — using `aiSearch()` would double-LLM the response, waste tokens, and add latency.
- **Query rewriting enabled**: The AI Search query rewrite step reformulates natural language into retrieval-optimized queries, improving recall for conversational questions.
- **Reranking enabled**: BGE reranker reorders initial vector results by semantic relevance, improving precision.
- **No authentication**: This is a public documentation corpus. Auth can be added later via the Cloudflare Agents SDK OAuth provider pattern.
