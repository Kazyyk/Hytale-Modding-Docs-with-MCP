# Hytale Modding Docs MCP Server

A remote [Model Context Protocol](https://modelcontextprotocol.io/) (MCP) server deployed on Cloudflare Workers that exposes the Hytale modding documentation corpus via semantic search.

## Architecture

```
Claude Code / Desktop / MCP Client
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

Semantic search over the Hytale modding documentation corpus.

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
`https://hytale-modding-mcp.<your-account>.workers.dev/sse`

### Connect from Claude Desktop

Add to your Claude Desktop MCP config (`~/Library/Application Support/Claude/claude_desktop_config.json`):

```json
{
  "mcpServers": {
    "hytale-modding": {
      "command": "npx",
      "args": [
        "mcp-remote",
        "https://hytale-modding-mcp.<your-account>.workers.dev/sse"
      ]
    }
  }
}
```

### Connect from Claude Code

```bash
claude mcp add-json "hytale-modding" '{"command":"npx","args":["mcp-remote","https://hytale-modding-mcp.<your-account>.workers.dev/sse"]}'
```

### Local Development

```bash
npm run dev
# Server runs at http://localhost:8787/sse

# In another terminal, test with MCP Inspector:
npx @modelcontextprotocol/inspector@latest
# Connect to http://localhost:8787/sse
```

## Design Decisions

- **`search()` over `aiSearch()`**: We return raw chunks rather than AI-generated answers. Claude Code / Desktop already has Claude for synthesis — using `aiSearch()` would double-LLM the response, waste tokens, and add latency.
- **Query rewriting enabled**: The AI Search query rewrite step reformulates natural language into retrieval-optimized queries, improving recall for conversational questions.
- **Reranking enabled**: BGE reranker reorders initial vector results by semantic relevance, improving precision.
- **No authentication**: This is a public documentation corpus. Auth can be added later via the Cloudflare Agents SDK OAuth provider pattern.
