---
title: "NBiomeDistanceStage"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NBiomeDistanceStage"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "pipeline"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages`

```java
public class NBiomeDistanceStage implements NStage
```

Computes per-pixel minimum distance to the nearest different biome for each position within a configurable radius. Scans surrounding buffers, resolving per-voxel biome IDs when a buffer contains multiple biomes. Produces `BiomeDistanceEntries` objects recording all nearby biome distances.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `run(@Nonnull NStage.Context context)` |
| `@Nonnull public` | `Map<NBufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull public` | `List<NBufferType>` | `getOutputTypes()` |
| `@Nonnull public` | `String` | `getName()` |
