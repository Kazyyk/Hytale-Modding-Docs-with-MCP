---
title: "LocalCachedChunkAccessor"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.accessor"
fqcn: "com.hypixel.hytale.server.core.universe.world.accessor.LocalCachedChunkAccessor"
api_surface: false
extends: ~
implements: ["OverridableChunkAccessor<WorldChunk>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "accessor"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.accessor`

```java
public class LocalCachedChunkAccessor implements OverridableChunkAccessor<WorldChunk>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ChunkAccessor<WorldChunk>` | `delegate` |
| `private final` | `int` | `minX` |
| `private final` | `int` | `minZ` |
| `private final` | `int` | `length` |
| `private final` | `WorldChunk[]` | `chunks` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `LocalCachedChunkAccessor` | `atWorldCoords(ChunkAccessor<WorldChunk> delegate, int centerX, int centerZ, int blockRadius)` |
| `@Nonnull public static` | `LocalCachedChunkAccessor` | `atChunkCoords(ChunkAccessor<WorldChunk> delegate, int centerX, int centerZ, int chunkRadius)` |
| `@Nonnull public static` | `LocalCachedChunkAccessor` | `atChunk(ChunkAccessor<WorldChunk> delegate, @Nonnull WorldChunk chunk, int chunkRadius)` |
| `public` | `ChunkAccessor` | `getDelegate()` |
| `public` | `int` | `getMinX()` |
| `public` | `int` | `getMinZ()` |
| `public` | `int` | `getLength()` |
| `public` | `int` | `getCenterX()` |
| `public` | `int` | `getCenterZ()` |
| `public` | `void` | `cacheChunksInRadius()` |
| `public` | `void` | `overwrite(@Nonnull WorldChunk wc)` |
| `public` | `WorldChunk` | `getChunkIfInMemory(long index)` |
| `@Nullable public` | `WorldChunk` | `getChunkIfInMemory(int x, int z)` |
| `public` | `WorldChunk` | `loadChunkIfInMemory(long index)` |
| `@Nullable public` | `WorldChunk` | `getChunkIfLoaded(long index)` |
| `@Nullable public` | `WorldChunk` | `getChunkIfLoaded(int x, int z)` |
| `@Nullable public` | `WorldChunk` | `getChunkIfNonTicking(long index)` |
| `public` | `WorldChunk` | `getChunk(long index)` |
| `public` | `WorldChunk` | `getNonTickingChunk(long index)` |
