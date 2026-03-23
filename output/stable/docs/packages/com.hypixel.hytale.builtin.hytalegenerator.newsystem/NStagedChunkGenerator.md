---
title: "NStagedChunkGenerator"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.NStagedChunkGenerator"
api_surface: false
extends: ~
implements: ["ChunkGenerator"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
  - "newsystem"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem`

```java
public class NStagedChunkGenerator implements ChunkGenerator
```

Multi-stage chunk generator that processes buffer bundles through configurable generation stages with concurrent execution and material/entity/tint/environment transfer.

## Constants

| Type | Name |
|---|---|
| `int` | `WORLD_MIN_Y_BUFFER_GRID` |
| `int` | `WORLD_MAX_Y_BUFFER_GRID` |
| `int` | `WORLD_HEIGHT_BUFFER_GRID` |
| `Bounds3i` | `CHUNK_BOUNDS_BUFFER_GRID` |
| `Bounds3i` | `SINGLE_BUFFER_TILE_BOUNDS_BUFFER_GRID` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `GeneratedChunk` | `generate(@Nonnull ChunkRequest.Arguments arguments)` |
| `public` | `PositionProvider` | `getSpawnPositions()` |
| `public` | `NStagedChunkGenerator` | `build()` |
| `public` | `NStagedChunkGenerator.Builder` | `withStats(@Nonnull String statsHeader, @Nonnull Set<Integer> statsCheckpoints)` |
| `public` | `NStagedChunkGenerator.Builder` | `withSpawnPositions(@Nonnull PositionProvider spawnPositions)` |
| `public` | `NStagedChunkGenerator.Builder` | `withConcurrentExecutor(@Nonnull ExecutorService executor, @Nonnull WorkerIndexer workerIndexer)` |
| `public` | `NStagedChunkGenerator.Builder` | `withMaterialCache(@Nonnull MaterialCache materialCache)` |
| `public` | `NStagedChunkGenerator.Builder` | `withBufferCapacity(double factor, double targetViewDistance, double targetPlayerCount)` |
| `public` | `NStagedChunkGenerator.Builder` | `appendStage(@Nonnull NStage stage)` |
