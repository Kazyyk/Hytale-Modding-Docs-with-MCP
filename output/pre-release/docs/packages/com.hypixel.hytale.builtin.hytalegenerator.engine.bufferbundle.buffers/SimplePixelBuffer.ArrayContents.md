---
title: "SimplePixelBuffer.ArrayContents"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.SimplePixelBuffer.ArrayContents"
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
public static class SimplePixelBuffer.ArrayContents<T> implements MemInstrument
```

Backing array storage for a [SimplePixelBuffer](SimplePixelBuffer.md) in ARRAY state. Holds a flat array of size 8x1x8 = 64 elements.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `T[]` | `array` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
