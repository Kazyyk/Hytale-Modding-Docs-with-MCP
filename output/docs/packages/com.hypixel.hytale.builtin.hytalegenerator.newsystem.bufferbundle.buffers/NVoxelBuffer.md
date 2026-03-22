---
title: "NVoxelBuffer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers.NVoxelBuffer"
api_surface: false
extends: "NBuffer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "newsystem"
  - "bufferbundle"
  - "buffers"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers`

```java
public class NVoxelBuffer<T> extends NBuffer
```

A buffer used in the world generation pipeline for storing voxel or pixel data.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `BUFFER_SIZE_BITS` | `3` |
| `@Nonnull public static final` | `Vector3i` | `SIZE` | `new Vector3i(8, 8, 8)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private` | `NVoxelBuffer.State` | `state` |
| `@Nullable private` | `NVoxelBuffer.ArrayContents<T>` | `arrayContents` |
| `@Nullable private` | `T` | `singleValue` |
| `@Nullable private` | `NVoxelBuffer<T>` | `referenceBuffer` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `T` | `getVoxelContent(@Nonnull Vector3i position)` |
| `@Nonnull public` | `Class<T>` | `getVoxelType()` |
| `` | `public void` | `setVoxelContent(@Nonnull Vector3i position, @Nullable T value)` |
| `` | `public void` | `reference(@Nonnull NVoxelBuffer<T> sourceBuffer)` |
| `@Nonnull private` | `NVoxelBuffer<T>` | `lastReference(@Nonnull NVoxelBuffer<T> sourceBuffer)` |
| `@Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
| `` | `private void` | `switchFromSingleValueToArray()` |
| `` | `private void` | `dereference()` |
| `` | `private static int` | `index(@Nonnull Vector3i position)` |

## Enum Constants

- `EMPTY`
- `SINGLE_VALUE`
- `ARRAY`
- `REFERENCE`
