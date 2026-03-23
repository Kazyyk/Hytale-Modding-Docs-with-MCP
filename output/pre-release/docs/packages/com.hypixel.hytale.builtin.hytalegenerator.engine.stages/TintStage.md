---
title: "TintStage"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages.TintStage"
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
public class TintStage implements Stage
```

A [Stage](Stage.md) that generates per-column tint values. Reads biome IDs from a `CountedPixelBuffer<Integer>` input and writes tint integers into a `SimplePixelBuffer<Integer>` output. For each (x, z) column, looks up the biome's `TintProvider` and applies it. Falls back to `TintProvider.DEFAULT_TINT` when the provider returns no value.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `Class<CountedPixelBuffer>` | `biomeBufferClass` |
| `@Nonnull public static final` | `Class<Integer>` | `biomeClass` |
| `@Nonnull public static final` | `Class<SimplePixelBuffer>` | `tintBufferClass` |
| `@Nonnull public static final` | `Class<Integer>` | `tintClass` |
| `@Nonnull private final` | `ParametrizedBufferType` | `biomeInputBufferType` |
| `@Nonnull private final` | `ParametrizedBufferType` | `tintOutputBufferType` |
| `@Nonnull private final` | `Bounds3i` | `inputBounds_bufferGrid` |
| `@Nonnull private final` | `String` | `stageName` |
| `@Nonnull private final` | `WorkerIndexer.Data<WorldStructure>` | `worldStructure_workerData` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TintStage(@Nonnull String stageName, @Nonnull ParametrizedBufferType biomeInputBufferType, @Nonnull ParametrizedBufferType tintOutputBufferType, @Nonnull WorkerIndexer.Data<WorldStructure> worldStructure_workerData)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `run(@Nonnull Stage.Context context)` |
| `@Nonnull @Override public` | `Map<BufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull @Override public` | `List<BufferType>` | `getOutputTypes()` |
| `@Nonnull @Override public` | `String` | `getName()` |
