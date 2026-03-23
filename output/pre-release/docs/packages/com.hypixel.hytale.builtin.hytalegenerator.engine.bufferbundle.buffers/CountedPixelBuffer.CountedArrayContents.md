---
title: "CountedPixelBuffer.CountedArrayContents"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.CountedPixelBuffer.CountedArrayContents"
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
  - "buffers"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers`

```java
public static class CountedPixelBuffer.CountedArrayContents<T> implements MemInstrument
```

Backing storage for a [CountedPixelBuffer](CountedPixelBuffer.md) in ARRAY state. Contains a flat array of size 8x1x8 = 64 elements and a list tracking all unique values (biomes) present in the array.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `T[]` | `array` |
| `@Nonnull private final` | `List<T>` | `allBiomes` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `copyFrom(@Nonnull CountedPixelBuffer.CountedArrayContents<T> countedArrayContents)` |
| `@Nonnull @Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
