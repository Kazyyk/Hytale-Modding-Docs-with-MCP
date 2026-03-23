---
title: "IWorldChunks"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.IWorldChunks"
api_surface: true
extends: "IChunkAccessorSync"
implements:
  - "IWorldChunksAsync"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "deprecated"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
@Deprecated
public interface IWorldChunks extends IChunkAccessorSync<WorldChunk>, IWorldChunksAsync
```

Deprecated synchronous chunk access interface. Provides blocking `getChunk` and `getNonTickingChunk` methods that attempt to load from memory first, then fall back to async loading with a spin-wait that processes task queues while holding the asset lock.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `consumeTaskQueue()` | `void` | Processes pending tasks in the world thread queue. Deprecated. |
| `isInThread()` | `boolean` | Returns whether the caller is on the world thread. |
| `getChunk(long)` | `WorldChunk` | Synchronously retrieves a ticking chunk by coordinate index. Blocks if not in memory. |
| `getNonTickingChunk(long)` | `WorldChunk` | Synchronously retrieves a non-ticking chunk by coordinate index. Blocks if not in memory. |
| `waitForFutureWithoutLock(CompletableFuture<T>)` | `T` | Waits for a future, processing task queues if on the world thread to avoid deadlock. |

## See Also

- [IWorldChunksAsync](IWorldChunksAsync.md)
- [World](World.md)
