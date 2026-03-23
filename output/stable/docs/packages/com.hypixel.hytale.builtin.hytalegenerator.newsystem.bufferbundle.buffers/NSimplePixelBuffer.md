---
title: "NSimplePixelBuffer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers.NSimplePixelBuffer"
api_surface: false
extends: "NPixelBuffer"
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
public class NSimplePixelBuffer<T> extends NPixelBuffer<T>
```

A buffer used in the world generation pipeline for storing voxel or pixel data.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private` | `NSimplePixelBuffer.State` | `state` |
| `@Nullable private` | `NSimplePixelBuffer.ArrayContents<T>` | `arrayContents` |
| `@Nullable private` | `T` | `singleValue` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `T` | `getPixelContent(@Nonnull Vector3i position)` |
| `@Override public` | `void` | `setPixelContent(@Nonnull Vector3i position, @Nullable T value)` |
| `@Override public` | `Class<T>` | `getPixelType()` |
| `` | `public void` | `copyFrom(@Nonnull NSimplePixelBuffer<T> sourceBuffer)` |
| `@Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
| `` | `private void` | `ensureContents()` |
| `` | `private void` | `switchFromSingleValueToArray()` |
| `` | `private static int` | `index(@Nonnull Vector3i position)` |

## Enum Constants

- `EMPTY`
- `SINGLE_VALUE`
- `ARRAY`
