---
title: "BiomeStage"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages.BiomeStage"
api_surface: false
extends: null
implements: ["Stage"]
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
public class BiomeStage implements Stage
```

A [Stage](Stage.md) that populates biome IDs into a `CountedPixelBuffer<Integer>` grid. For each (x, z) column in the output bounds, queries the `WorldStructure`'s biome map (`BiCarta<Integer>`) and writes the resulting biome ID. This is typically the first stage in the generation pipeline, requiring no input buffers.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `Class<CountedPixelBuffer>` | `bufferClass` |
| `@Nonnull public static final` | `Class<Integer>` | `biomeClass` |
| `@Nonnull private final` | `ParametrizedBufferType` | `biomeOutputBufferType` |
| `@Nonnull private final` | `String` | `stageName` |
| `@Nonnull private final` | `WorkerIndexer.Data<WorldStructure>` | `worldStructure_workerData` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BiomeStage(@Nonnull String stageName, @Nonnull ParametrizedBufferType biomeOutputBufferType, @Nonnull WorkerIndexer.Data<WorldStructure> worldStructure_workerData)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `run(@Nonnull Stage.Context context)` |
| `@Nonnull @Override public` | `Map<BufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull @Override public` | `List<BufferType>` | `getOutputTypes()` |
| `@Nonnull @Override public` | `String` | `getName()` |
