---
title: "BiomePatternGenerator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.biome"
fqcn: "com.hypixel.hytale.server.worldgen.biome.BiomePatternGenerator"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "worldgen"
  - "biome"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.biome`

```java
public class BiomePatternGenerator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `IPointGenerator` | `pointGenerator` |
| `@Nonnull protected final` | `IWeightedMap<TileBiome>` | `tileBiomes` |
| `@Nonnull protected final` | `CustomBiome[]` | `customBiomes` |
| `@Nonnull protected final` | `Biome[]` | `biomes` |
| `protected final` | `int` | `extents` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BiomePatternGenerator(IPointGenerator pointGenerator, @Nonnull IWeightedMap<TileBiome> tileBiomes, @Nonnull CustomBiome[] customBiomes)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getExtents()` |
| `@Nonnull public` | `Biome[]` | `getBiomes()` |
| `@Nonnull public` | `CustomBiome[]` | `getCustomBiomes()` |
| `@Nullable public` | `TileBiome` | `getBiome(int seed, int x, int z)` |
| `protected` | `double` | `getBiomeIndex(int seed, int x, int z)` |
| `@Nullable public` | `TileBiome` | `getBiomeDirect(int seed, int x, int z)` |
| `@Nonnull public` | `Biome` | `generateBiomeAt(@Nonnull ZoneGeneratorResult zoneResult, int seed, int x, int z)` |
| `@Nullable public` | `CustomBiome` | `getCustomBiomeAt(int seed, double x, double z, @Nonnull ZoneGeneratorResult zoneResult, @Nonnull Biome parentResult)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `private static` | `int` | `getExtents(@Nonnull Biome[] biomes)` |
