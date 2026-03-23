---
title: "NTestPropStage"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NTestPropStage"
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
public class NTestPropStage implements NStage
```

Test stage that copies input voxel data and places a 5-block-tall column of prop material at a randomly selected scan position where floor and anchor materials match.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `run(@Nonnull NStage.Context context)` |
| `@Nonnull public` | `Map<NBufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull public` | `List<NBufferType>` | `getOutputTypes()` |
| `@Nonnull public` | `String` | `getName()` |
