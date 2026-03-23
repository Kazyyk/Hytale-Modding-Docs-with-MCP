---
title: "com.hypixel.hytale.server.worldgen.cache"
kind: "package"
package: "com.hypixel.hytale.server.worldgen.cache"
fqcn: "com.hypixel.hytale.server.worldgen.cache"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "cache"
---

**Package:** `com.hypixel.hytale.server.worldgen.cache`

Caching infrastructure for the world generation pipeline. Provides coordinate-keyed, size-limited, time-expiring caches for biome data, height maps, cave generation results, and unique prefab positions to avoid redundant computation during chunk generation.

## Types

| Type | Kind | Description |
|---|---|---|
| [CoordinateCache](CoordinateCache.md) | class | Abstract base for seed+coordinate-keyed caches. |
| [ExtendedCoordinateCache](ExtendedCoordinateCache.md) | class | Extended coordinate cache adding a generic key parameter `K` in addition to seed and coordinates. |
| [CaveGeneratorCache](CaveGeneratorCache.md) | class | Cache for generated cave data, keyed by cave type, seed, and chunk coordinates. |
| [ChunkGeneratorCache](ChunkGeneratorCache.md) | class | Primary cache for chunk generation core data. |
| [CoreDataCacheEntry](CoreDataCacheEntry.md) | class | Mutable cache entry holding zone biome result, interpolated biome count list, height, and height noise values. |
| [InterpolatedBiomeCountList](InterpolatedBiomeCountList.md) | class | Accumulates biome sample counts and height data for biome interpolation. |
| [UniquePrefabCache](UniquePrefabCache.md) | class | Cache for unique prefab entry arrays, keyed by world seed. |
