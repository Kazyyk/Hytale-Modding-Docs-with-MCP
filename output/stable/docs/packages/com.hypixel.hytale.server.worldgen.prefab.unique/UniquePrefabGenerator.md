---
title: "UniquePrefabGenerator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.prefab.unique"
fqcn: "com.hypixel.hytale.server.worldgen.prefab.unique.UniquePrefabGenerator"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "worldgen"
  - "prefab"
  - "unique"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.prefab.unique`

```java
public class UniquePrefabGenerator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `int` | `UNIQUE_ZONE_PLACEMENT_HEURISTIC_ITERATIONS` |
| `protected final` | `String` | `name` |
| `protected final` | `PrefabCategory` | `category` |
| `protected final` | `IWeightedMap<WorldGenPrefabSupplier>` | `prefabs` |
| `protected final` | `UniquePrefabConfiguration` | `configuration` |
| `protected final` | `int` | `zoneIndex` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `UniquePrefabGenerator(String name, PrefabCategory category, IWeightedMap<WorldGenPrefabSupplier> prefabs, UniquePrefabConfiguration configuration, int zoneIndex)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getName()` |
| `public` | `PrefabCategory` | `getCategory()` |
| `public` | `IWeightedMap<WorldGenPrefabSupplier>` | `getPrefabs()` |
| `@Nullable public` | `WorldGenPrefabSupplier` | `generatePrefab(Random random)` |
| `@Nonnull public` | `Vector3i` | `generate(int seed,
        @Nullable Vector2i position,
        @Nonnull ChunkGenerator chunkGenerator,
        @Nonnull Random random,
        int maxFailed,
        @Nonnull UniquePrefabContainer.UniquePrefabEntry[] entries)` |
| `@Nullable protected` | `Vector3i` | `tryPlacement(int seed, @Nonnull ChunkGenerator chunkGenerator, @Nonnull Random random, @Nonnull UniquePrefabContainer.UniquePrefabEntry[] entries)` |
| `@Nonnull protected` | `Vector3i` | `forceGeneration(int seed, @Nonnull ChunkGenerator chunkGenerator)` |
| `@Nonnull protected` | `Vector3i` | `forceUniqueZonePlacement(int seed, @Nonnull Vector2i position, @Nonnull ChunkGenerator chunkGenerator)` |
| `protected` | `int` | `getHeight(int seed, @Nonnull ChunkGenerator chunkGenerator, @Nonnull Biome biome, int x, int z)` |
| `protected` | `boolean` | `isMatchingHeight(int seed, int x, int z, Random random, int y)` |
| `protected` | `boolean` | `isMatchingNoiseDensity(int seed, int x, int z)` |
| `protected` | `boolean` | `isMatchingParentBlock(int seed, int x, int y, int z, @Nonnull Random random, @Nonnull ZoneBiomeResult zoneAndBiomeResult)` |
| `protected` | `BlockFluidEntry` | `getCoverInGroundAt(int seed, int x, int y, int z, @Nonnull Random random, @Nonnull Biome biome)` |
| `protected` | `boolean` | `isMatchingCover(int seed, @Nonnull CoverContainer.CoverContainerEntry coverContainerEntry, @Nonnull Random random, int x, int y, int z)` |
| `public` | `UniquePrefabConfiguration` | `getConfiguration()` |
