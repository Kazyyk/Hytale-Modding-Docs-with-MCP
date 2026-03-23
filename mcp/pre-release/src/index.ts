import { McpAgent } from "agents/mcp";
import { McpServer } from "@modelcontextprotocol/sdk/server/mcp.js";
import { z } from "zod";

// AI Search instance name — must match the name in Cloudflare dashboard
const AI_SEARCH_INSTANCE = "hydex-search-pre";

/**
 * Format search results into a readable text block for MCP tool responses.
 * Each result includes the source filename, relevance score, and content chunk.
 */
function formatSearchResults(
  data: AutoRagSearchResponse["data"]
): string {
  if (data.length === 0) {
    return "No matching documents found.";
  }

  return data
    .map((result, i) => {
      const content = result.content.map((c) => c.text).join("\n");
      return [
        `--- Result ${i + 1} ---`,
        `Source: ${result.filename}`,
        `Score: ${result.score.toFixed(3)}`,
        ``,
        content,
      ].join("\n");
    })
    .join("\n\n");
}

export class HydexMCPPre extends McpAgent<Env> {
  server = new McpServer({
    name: "hydex-pre",
    version: "1.0.0",
  });

  async init() {
    // Primary tool: semantic search over the Hytale pre-release documentation corpus
    this.server.tool(
      "search_docs",
      "Search the Hytale pre-release source documentation. Returns relevant " +
        "chunks from 5,800+ documented types covering the full pre-release " +
        "server — plugin API, events, ECS, commands, NPC system, world " +
        "generation, protocol, builtin modules, codecs, and more.",
      {
        query: z
          .string()
          .describe(
            "Natural language search query about Hytale modding " +
              "(e.g. 'how to cancel a block break event', " +
              "'player inventory commands', 'block state schema')"
          ),
        max_results: z
          .number()
          .min(1)
          .max(20)
          .default(10)
          .describe("Maximum number of document chunks to return (1-20)"),
      },
      async ({ query, max_results }) => {
        try {
          const searchResult = await this.env.AI.autorag(
            AI_SEARCH_INSTANCE
          ).search({
            query,
            rewrite_query: true,
            max_num_results: max_results,
            ranking_options: {
              score_threshold: 0.2,
            },
            reranking: {
              enabled: true,
              model: "@cf/baai/bge-reranker-base",
            },
          });

          const formatted = formatSearchResults(searchResult.data);

          return {
            content: [
              {
                type: "text" as const,
                text: formatted,
              },
            ],
          };
        } catch (error) {
          const message =
            error instanceof Error ? error.message : String(error);
          return {
            content: [
              {
                type: "text" as const,
                text: `Search failed: ${message}`,
              },
            ],
            isError: true,
          };
        }
      }
    );
  }
}

// Primary handler on /mcp (Streamable HTTP)
const handler = HydexMCPPre.serve("/mcp", { binding: "MCP_OBJECT" });

// Expose /mcp as primary, rewrite /sse for backwards compatibility
export default {
  async fetch(request: Request, env: Env, ctx: ExecutionContext) {
    const url = new URL(request.url);

    if (url.pathname === "/sse" || url.pathname.startsWith("/sse/")) {
      const rewritten = new URL(request.url);
      rewritten.pathname = url.pathname.replace(/^\/sse/, "/mcp");
      return handler.fetch(new Request(rewritten, request), env, ctx);
    }

    return handler.fetch(request, env, ctx);
  },
};
