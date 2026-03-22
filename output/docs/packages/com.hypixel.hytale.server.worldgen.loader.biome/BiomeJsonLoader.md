---
title: "BiomeJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.biome"
fqcn: "com.hypixel.hytale.server.worldgen.loader.biome.BiomeJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, Biome>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "biome"
  - "loader"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.biome`

```java
public abstract class BiomeJsonLoader extends JsonLoader<SeedStringResource, Biome>
```

Abstract base class for loading biome definitions from JSON. Provides protected methods for loading each biome sub-container: terrain height threshold, covers, fade, layers, prefabs, tint, environment, water, heightmap noise, map color, and interpolation. Each method delegates to the corresponding container-specific JSON loader.

Also defines a `Constants` inner interface with all JSON key names and error message strings used by biome loaders.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull protected` | `IHeightThresholdInterpreter` | `loadTerrainHeightThreshold()` |
| `@Nonnull protected` | `CoverContainer` | `loadCoverContainer()` |
| `@Nonnull protected` | `FadeContainer` | `loadFadeContainer()` |
| `@Nonnull protected` | `LayerContainer` | `loadLayerContainers()` |
| `@Nullable protected` | `PrefabContainer` | `loadPrefabContainer()` |
| `@Nonnull protected` | `TintContainer` | `loadTintContainer()` |
| `@Nonnull protected` | `EnvironmentContainer` | `loadEnvironmentContainer()` |
| `@Nonnull protected` | `WaterContainer` | `loadWaterContainer()` |
| `@Nullable protected` | `NoiseProperty` | `loadHeightmapNoise()` |
| `protected` | `int` | `loadColor()` |
| `@Nullable protected` | `BiomeInterpolation` | `loadInterpolation()` |
