---
title: "BiomeDistanceStage.BiomeDistanceEntries"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages.BiomeDistanceStage.BiomeDistanceEntries"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "stages"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.stages`

```java
public static class BiomeDistanceStage.BiomeDistanceEntries
```

Container holding a list of [BiomeDistanceStage.BiomeDistanceEntry](BiomeDistanceStage.BiomeDistanceEntry.md) records for a single voxel column. Provides `distanceToClosestOtherBiome` to find the nearest biome boundary distance excluding a specified biome.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public final` | `List<BiomeDistanceStage.BiomeDistanceEntry>` | `entries` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BiomeDistanceEntries(@Nonnull List<BiomeDistanceStage.BiomeDistanceEntry> entries)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `distanceToClosestOtherBiome(int thisBiomeId)` |
