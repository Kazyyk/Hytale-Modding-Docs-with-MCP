---
title: "IWorldChunksAsync"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.IWorldChunksAsync"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "async"
  - "deprecated"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
@Deprecated
public interface IWorldChunksAsync
```

Deprecated asynchronous chunk retrieval interface. Provides `CompletableFuture`-based methods for loading ticking and non-ticking chunks by coordinate index or (x, z) pair.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getChunkAsync(long)` | `CompletableFuture<WorldChunk>` | Asynchronously loads a ticking chunk by packed coordinate index. |
| `getNonTickingChunkAsync(long)` | `CompletableFuture<WorldChunk>` | Asynchronously loads a non-ticking chunk by packed coordinate index. |
| `getChunkAsync(int, int)` | `CompletableFuture<WorldChunk>` | Convenience overload that packs (x, z) via `ChunkUtil.indexChunk`. |
| `getNonTickingChunkAsync(int, int)` | `CompletableFuture<WorldChunk>` | Convenience overload that packs (x, z) via `ChunkUtil.indexChunk`. |

## See Also

- [IWorldChunks](IWorldChunks.md)
