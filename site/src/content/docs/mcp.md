---
title: "MCP Integration"
kind: "overview"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "mcp"
  - "ai"
  - "integration"
---

Hydex provides an MCP (Model Context Protocol) endpoint that gives AI
coding assistants direct access to the full documentation corpus. Instead
of crawling the website, agents can search 5,500+ documented types
programmatically.

## Endpoint

```
https://mcp.hydex.dev/mcp
```

## Configuration

### Claude Code / Claude Desktop

Add to your MCP settings:

```json
{
  "mcpServers": {
    "hydex": {
      "type": "url",
      "url": "https://mcp.hydex.dev/mcp"
    }
  }
}
```

### Other MCP Clients

Any MCP-compatible client can connect using Streamable HTTP transport at
`https://mcp.hydex.dev/mcp`.

## Available Tools

### search_docs

Search the Hytale source documentation. Returns relevant chunks from
5,500+ documented types.

| Parameter | Type | Default | Description |
|-----------|------|---------|-------------|
| `query` | string | (required) | Search query — type names, method names, or natural language questions |
| `max_results` | number | 10 | Maximum results to return (1-20) |

#### Example Queries

- `"PluginBase lifecycle methods"` — find plugin lifecycle documentation
- `"how to register a command"` — find command registration patterns
- `"BlockType JSON schema fields"` — find block configuration options
- `"NPC behavior tree actions"` — find NPC AI documentation
- `"EcsEvent vs IEvent"` — compare event system hierarchies

## Why MCP Instead of Crawling?

The MCP endpoint returns clean, structured documentation chunks with
relevance scoring. Crawling the website gives you HTML wrapped in
navigation and layout markup. For AI-assisted development, the MCP
provides better results with less noise.

The website's `robots.txt` discourages automated crawling. Use the MCP
endpoint for programmatic access.
