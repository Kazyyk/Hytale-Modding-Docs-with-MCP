---
title: "NTestTerrainStage"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NTestTerrainStage"
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
public class NTestTerrainStage implements NStage
```

Test stage that fills a voxel buffer with ground or empty material based on 3D simplex noise, with a hard cutoff at y=150 and partial cutoff at y=130.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `run(@Nonnull NStage.Context context)` |
| `@Nonnull public` | `Map<NBufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull public` | `List<NBufferType>` | `getOutputTypes()` |
| `@Nonnull public` | `String` | `getName()` |
