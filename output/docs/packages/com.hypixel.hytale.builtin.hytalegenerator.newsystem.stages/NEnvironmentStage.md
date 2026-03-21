---
title: "NEnvironmentStage"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NEnvironmentStage"
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
public class NEnvironmentStage implements NStage
```

Fills a voxel buffer with environment IDs. For each (x, z) column, looks up the biome from the input pixel buffer and queries its `EnvironmentProvider` for every y level.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `run(@Nonnull NStage.Context context)` |
| `@Nonnull public` | `Map<NBufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull public` | `List<NBufferType>` | `getOutputTypes()` |
| `@Nonnull public` | `String` | `getName()` |
