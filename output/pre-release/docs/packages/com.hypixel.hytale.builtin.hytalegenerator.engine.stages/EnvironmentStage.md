---
title: "EnvironmentStage"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages.EnvironmentStage"
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
public class EnvironmentStage implements Stage
```

A [Stage](Stage.md) that generates per-voxel environment IDs. Reads biome IDs from a `CountedPixelBuffer<Integer>` input and writes environment values into a `VoxelBuffer<Integer>` output. For each (x, z) column, looks up the biome from the registry and queries its `EnvironmentProvider` for every Y level.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `Class<CountedPixelBuffer>` | `biomeBufferClass` |
| `@Nonnull public static final` | `Class<Integer>` | `biomeTypeClass` |
| `@Nonnull public static final` | `Class<VoxelBuffer>` | `environmentBufferClass` |
| `@Nonnull public static final` | `Class<Integer>` | `environmentClass` |
| `@Nonnull private final` | `ParametrizedBufferType` | `biomeInputBufferType` |
| `@Nonnull private final` | `ParametrizedBufferType` | `environmentOutputBufferType` |
| `@Nonnull private final` | `Bounds3i` | `inputBounds_bufferGrid` |
| `@Nonnull private final` | `String` | `stageName` |
| `@Nonnull private final` | `WorkerIndexer.Data<WorldStructure>` | `worldStructure_workerData` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `EnvironmentStage(@Nonnull String stageName, @Nonnull ParametrizedBufferType biomeInputBufferType, @Nonnull ParametrizedBufferType environmentOutputBufferType, @Nonnull WorkerIndexer.Data<WorldStructure> worldStructure_workerData)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `run(@Nonnull Stage.Context context)` |
| `@Nonnull @Override public` | `Map<BufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull @Override public` | `List<BufferType>` | `getOutputTypes()` |
| `@Nonnull @Override public` | `String` | `getName()` |
