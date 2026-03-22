---
title: "ChunkGeneratorResource"
kind: "class"
package: "com.hypixel.hytale.server.worldgen"
fqcn: "com.hypixel.hytale.server.worldgen.ChunkGeneratorResource"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
---

**Package:** `com.hypixel.hytale.server.worldgen`

```java
public class ChunkGeneratorResource
```

Provides ChunkGeneratorResource functionality within the worldgen subsystem.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull public final` | `Random` | `random` |  |
| `@Nonnull public final` | `Random` | `random2` |  |
| `@Nonnull public final` | `IntList` | `coverArray` |  |
| `@Nonnull public final` | `BlockPriorityChunk` | `priorityChunk` |  |
| `@Nonnull public final` | `CoordinateCache.CoordinateKey` | `cacheCoordinateKey` |  |
| `@Nonnull public final` | `ExtendedCoordinateCache.ExtendedCoordinateKey<CaveType>` | `cacheCaveCoordinateKey` |  |
| `@Nonnull public final` | `ResultBuffer.Bounds2d` | `bounds2d` |  |
| `@Nonnull public final` | `ResultBuffer.ResultBuffer2d` | `resultBuffer2d` |  |
| `@Nonnull public final` | `ResultBuffer.ResultBuffer3d` | `resultBuffer3d` |  |
| `@Nonnull public final` | `PrefabPasteUtil.PrefabPasteBuffer` | `prefabBuffer` |  |
| `@Nonnull public final` | `ZoneBiomeResult` | `zoneBiomeResult` |  |
| `public final` | `ClimateNoise.Buffer` | `climateBuffer` | `new ClimateNoise.Buffer()` |
| `public final` | `PrefabPopulator` | `prefabPopulator` | `new PrefabPopulator()` |
| `public final` | `WorldGenPrefabLoader.PrefabPathCollector` | `prefabCollector` | `new WorldGenPrefabLoader.PrefabPathCollector()` |
| `@Nonnull public final` | `Vector2d` | `cacheVector2d` |  |
| `protected` | `ChunkGenerator` | `chunkGenerator` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ChunkGeneratorResource()` |
| `public` | `void` | `init(ChunkGenerator chunkGenerator)` |
| `public` | `void` | `release()` |
| `@Nonnull public` | `Random` | `getRandom()` |
| `@Nonnull protected` | `IPrefabBuffer` | `getPrefab(WorldGenPrefabSupplier prefabSupplier)` |
