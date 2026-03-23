---
title: "TileBiome"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.biome"
fqcn: "com.hypixel.hytale.server.worldgen.biome.TileBiome"
api_surface: false
extends: "Biome"
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
public class TileBiome extends Biome
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `TileBiome[]` | `EMPTY_ARRAY` |
| `protected final` | `double` | `weight` |
| `protected final` | `double` | `sizeModifier` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TileBiome(int id,
        String name,
        BiomeInterpolation interpolation,
        @Nonnull IHeightThresholdInterpreter heightmapInterpreter,
        CoverContainer coverContainer,
        LayerContainer layerContainer,
        PrefabContainer prefabContainer,
        TintContainer tintContainer,
        EnvironmentContainer environmentContainer,
        WaterContainer waterContainer,
        FadeContainer fadeContainer,
        NoiseProperty heightmapNoise,
        double weight,
        double sizeModifier,
        int mapColor)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getWeight()` |
| `public` | `double` | `getSizeModifier()` |
| `@Nonnull @Override public` | `String` | `toString()` |
