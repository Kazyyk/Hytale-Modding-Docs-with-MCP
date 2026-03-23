---
title: "BiomeDistanceStage.BiomeDistanceCounter"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages.BiomeDistanceStage.BiomeDistanceCounter"
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
private static class BiomeDistanceStage.BiomeDistanceCounter
```

Accumulates the closest distance to each biome during the [BiomeDistanceStage](BiomeDistanceStage.md) scan. Maintains a list of [BiomeDistanceStage.BiomeDistanceEntry](BiomeDistanceStage.BiomeDistanceEntry.md) objects and a cached last-accessed entry for fast repeated lookups of the same biome.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull final` | `List<BiomeDistanceStage.BiomeDistanceEntry>` | `entries` |
| `@Nullable` | `BiomeDistanceStage.BiomeDistanceEntry` | `cachedEntry` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `boolean` | `isCloserThanCounted(int biomeId, double distance_voxelGrid)` |
| | `void` | `accountFor(int biomeId, double distance_voxelGrid)` |
