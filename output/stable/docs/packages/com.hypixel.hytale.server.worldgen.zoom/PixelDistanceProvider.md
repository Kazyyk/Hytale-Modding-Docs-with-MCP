---
title: "PixelDistanceProvider"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.zoom"
fqcn: "com.hypixel.hytale.server.worldgen.zoom.PixelDistanceProvider"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "worldgen"
  - "zoom"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.zoom`

```java
public class PixelDistanceProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `int` | `TABLE_SIZE` |
| `protected final` | `PixelProvider` | `image` |
| `protected final` | `int` | `width` |
| `protected final` | `int` | `height` |
| `protected final` | `int` | `cellsX` |
| `protected final` | `int` | `cellsY` |
| `protected final` | `PixelDistanceProvider.IPixelSet[]` | `table` |
| `protected final` | `IntSet` | `pixels` |
| `private final` | `IntSet` | `pixels` |
| `private final` | `int` | `pixel` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `IntSet` | `getColors()` |
| `public` | `double` | `distanceSqToDifferentPixel(double ox, double oy, int px, int py)` |
| `protected` | `double` | `distanceSqToDiffInSeq(double ox, double oy, int pixel, int cellX, int cellY)` |
| `protected` | `boolean` | `hasDifferentPixel(int cellX, int cellY, int pixel)` |
| `private` | `void` | `prepareSegmentTable()` |
| `protected` | `int` | `clampX(int x)` |
| `protected` | `int` | `clampY(int y)` |
| `protected` | `int` | `cellIndex(int cellX, int cellY)` |
| `private static` | `double` | `distanceSqToPixel(double ox, double oy, int px, int py)` |
| `@Override public` | `boolean` | `contains(int pixel)` |
| `@Override public` | `int` | `size()` |
| `@Override @Nonnull public` | `String` | `toString()` |

## Inner Types

- `PixelDistanceProvider.IPixelSet`
- `PixelDistanceProvider.MultiplePixelSet`
- `PixelDistanceProvider.SinglePixelSet`
