---
title: "BufferBundle"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.BufferBundle"
api_surface: false
extends: null
implements: ["MemInstrument"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "bufferbundle"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle`

```java
public class BufferBundle implements MemInstrument
```

Container that manages a collection of typed buffer grids for the world generation engine. Each grid is keyed by a `BufferType` and stores `Buffer` instances organized spatially in a 3D grid. Implements `MemInstrument` to report aggregate memory usage across all grids.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [BufferBundle.Access](BufferBundle.Access.md) | class | Provides bounded access into a grid's buffers |
| [BufferBundle.Grid](BufferBundle.Grid.md) | class | Spatial grid of tracked buffers with LRU column eviction |
| [BufferBundle.MemoryReport](BufferBundle.MemoryReport.md) | class | Formatted memory usage report across all grids |
| [BufferBundle.Tracker](BufferBundle.Tracker.md) | class | Tracks generation stage index for cache validity |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Map<BufferType, BufferBundle.Grid>` | `grids` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `BufferBundle.Grid` | `createGrid(@Nonnull BufferType bufferType, int capacity)` |
| `@Nonnull public` | `BufferBundle.Access` | `createBufferAccess(@Nonnull BufferType bufferType, @Nonnull Bounds3i bounds_bufferGrid)` |
| `public` | `void` | `closeALlAccesses()` |
| `@Nonnull public` | `BufferBundle.Grid` | `getGrid(@Nonnull BufferType contentType)` |
| `@Nonnull @Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
| `private` | `boolean` | `existingGridHasBufferTypeIndex(int bufferTypeIndex)` |
| `@Nonnull public` | `BufferBundle.MemoryReport` | `createMemoryReport()` |
