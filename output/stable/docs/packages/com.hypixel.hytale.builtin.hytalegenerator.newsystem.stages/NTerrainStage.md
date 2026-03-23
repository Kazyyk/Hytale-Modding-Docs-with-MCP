---
title: "NTerrainStage"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NTerrainStage"
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
public class NTerrainStage implements NStage
```

Generates terrain density values with biome-weight interpolation, then assigns materials column-by-column. Computes floor/ceiling depth arrays for material provider context. Uses circle-area weighting for smooth biome transitions.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `run(@Nonnull NStage.Context context)` |
| `@Nonnull public` | `Map<NBufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull public` | `List<NBufferType>` | `getOutputTypes()` |
| `@Nonnull public` | `String` | `getName()` |
