---
title: "SimplePixelBuffer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.SimplePixelBuffer"
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
public class SimplePixelBuffer<T> extends PixelBuffer<T>
```

A [PixelBuffer](PixelBuffer.md) implementation using a tri-state storage strategy: EMPTY (no data), SINGLE_VALUE (uniform content), or ARRAY (heterogeneous content). Unlike [CountedPixelBuffer](CountedPixelBuffer.md), this variant does not track unique values. Used for tint and biome-distance data.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [SimplePixelBuffer.ArrayContents](SimplePixelBuffer.ArrayContents.md) | class | Backing array storage |
| [SimplePixelBuffer.State](SimplePixelBuffer.State.md) | enum | Storage state: EMPTY, SINGLE_VALUE, ARRAY |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `Bounds3i` | `bounds` |
| `@Nonnull private final` | `Class<T>` | `pixelType` |
| `@Nonnull private` | `SimplePixelBuffer.State` | `state` |
| `@Nullable private` | `SimplePixelBuffer.ArrayContents<T>` | `arrayContents` |
| `@Nullable private` | `T` | `singleValue` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SimplePixelBuffer(@Nonnull Class<T> pixelType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable @Override public` | `T` | `getPixelContent(@Nonnull Vector3i position)` |
| `@Override public` | `void` | `setPixelContent(@Nonnull Vector3i position, @Nullable T value)` |
| `@Nonnull @Override public` | `Class<T>` | `getPixelType()` |
| `public` | `void` | `copyFrom(@Nonnull SimplePixelBuffer<T> sourceBuffer)` |
| `@Nonnull @Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
| `private` | `void` | `ensureContents()` |
| `private` | `void` | `switchFromSingleValueToArray()` |
| `private static` | `int` | `index(@Nonnull Vector3i position)` |
