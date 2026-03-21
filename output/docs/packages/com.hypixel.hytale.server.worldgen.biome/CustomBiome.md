---
title: "CustomBiome"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.biome"
fqcn: "com.hypixel.hytale.server.worldgen.biome.CustomBiome"
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
public class CustomBiome extends Biome
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `CustomBiomeGenerator` | `customBiomeGenerator` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CustomBiome(int id,
        String name,
        BiomeInterpolation interpolation,
        CustomBiomeGenerator customBiomeGenerator,
        @Nonnull IHeightThresholdInterpreter heightmapInterpreter,
        CoverContainer coverContainer,
        LayerContainer layerContainer,
        PrefabContainer prefabContainer,
        TintContainer tintContainer,
        EnvironmentContainer environmentContainer,
        WaterContainer waterContainer,
        FadeContainer fadeContainer,
        NoiseProperty heightmapNoise,
        int mapColor)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CustomBiomeGenerator` | `getCustomBiomeGenerator()` |
| `@Nonnull @Override public` | `String` | `toString()` |
