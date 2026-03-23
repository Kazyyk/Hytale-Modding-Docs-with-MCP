---
title: "NPixelBuffer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers.NPixelBuffer"
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
public abstract class NPixelBuffer<T> extends NBuffer
```

A buffer used in the world generation pipeline for storing voxel or pixel data.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `BUFFER_SIZE_BITS` | `3` |
| `@Nonnull public static final` | `Vector3i` | `SIZE` | `new Vector3i(8, 1, 8)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `T` | `getPixelContent(@Nonnull Vector3i var1)` |
| `` | `public abstract void` | `setPixelContent(@Nonnull Vector3i var1, @Nullable T var2)` |
| `@Nonnull public` | `Class<T>` | `getPixelType()` |
