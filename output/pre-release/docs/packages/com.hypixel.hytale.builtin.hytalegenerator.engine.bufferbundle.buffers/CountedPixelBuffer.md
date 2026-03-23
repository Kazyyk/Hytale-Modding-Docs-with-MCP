---
title: "CountedPixelBuffer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.CountedPixelBuffer"
api_surface: false
extends: "PixelBuffer<T>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "bufferbundle"
  - "buffers"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers`

```java
public class CountedPixelBuffer<T> extends PixelBuffer<T>
```

A [PixelBuffer](PixelBuffer.md) variant that tracks all unique values (biomes) stored in the buffer. Uses a tri-state storage strategy: EMPTY (no data), SINGLE_VALUE (all cells share one value), or ARRAY (heterogeneous content with a tracked unique-values list). The buffer covers an 8x1x8 voxel grid. The unique-entries tracking is used by `BiomeDistanceStage` to optimize distance calculations.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [CountedPixelBuffer.CountedArrayContents](CountedPixelBuffer.CountedArrayContents.md) | class | Holds the backing array and unique-values list |
| [CountedPixelBuffer.State](CountedPixelBuffer.State.md) | enum | Storage state: EMPTY, SINGLE_VALUE, ARRAY |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `BUFFER_SIZE_BITS` |
| `@Nonnull public static final` | `Vector3i` | `SIZE_VOXEL_GRID` |
| `@Nonnull public static final` | `Bounds3i` | `BOUNDS_VOXEL_GRID` |
| `@Nonnull private final` | `Class<T>` | `pixelType` |
| `@Nonnull private` | `CountedPixelBuffer.State` | `state` |
| `@Nullable private` | `CountedPixelBuffer.CountedArrayContents<T>` | `countedArrayContents` |
| `@Nullable private` | `T` | `singleValue` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CountedPixelBuffer(@Nonnull Class<T> voxelType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable @Override public` | `T` | `getPixelContent(@Nonnull Vector3i position)` |
| `@Override public` | `void` | `setPixelContent(@Nonnull Vector3i position, @Nullable T value)` |
| `@Nonnull @Override public` | `Class<T>` | `getPixelType()` |
| `@Nonnull public` | `List<T>` | `getUniqueEntries()` |
| `public` | `void` | `copyFrom(@Nonnull CountedPixelBuffer<T> sourceBuffer)` |
| `@Nonnull @Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
| `private` | `void` | `switchFromSingleValueToArray()` |
| `private static` | `int` | `index(@Nonnull Vector3i position)` |
