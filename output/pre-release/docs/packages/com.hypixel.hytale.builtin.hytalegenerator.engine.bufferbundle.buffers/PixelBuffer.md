---
title: "PixelBuffer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.PixelBuffer"
api_surface: false
extends: "Buffer"
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
public abstract class PixelBuffer<T> extends Buffer
```

Abstract [Buffer](Buffer.md) for 2D pixel data on an 8x1x8 grid (single Y-layer). Used to store per-column data such as biome IDs and tint values. Subclasses include [SimplePixelBuffer](SimplePixelBuffer.md) and [CountedPixelBuffer](CountedPixelBuffer.md).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `BUFFER_SIZE_BITS` |
| `@Nonnull public static final` | `Vector3i` | `SIZE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public abstract` | `T` | `getPixelContent(@Nonnull Vector3i var1)` |
| `public abstract` | `void` | `setPixelContent(@Nonnull Vector3i var1, @Nullable T var2)` |
| `@Nonnull public abstract` | `Class<T>` | `getPixelType()` |
