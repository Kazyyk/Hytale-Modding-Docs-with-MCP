---
title: "ImageCarta"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.cartas"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.cartas.ImageCarta"
api_surface: false
extends: "TriCarta<R>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.framework.cartas`

```java
public class ImageCarta<R> extends TriCarta<R>
```

Concrete implementation extending `TriCarta<R>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `rgbArray` | `int[]` | int[] field. |
| `width` | `int` | int field. |
| `height` | `int` | int field. |
| `functionX` | `TriDoubleFunction<Double>` | TriDoubleFunction<Double> field. |
| `functionY` | `TriDoubleFunction<Double>` | TriDoubleFunction<Double> field. |
| `rgbToTerrainMap` | `Map<Integer, R>` | Map<Integer, R> field. |
| `allPossibleValues` | `List<R>` | List<R> field. |

## Constructors

| Constructor | Description |
|---|---|
| `ImageCarta()` | Creates a new ImageCarta instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `apply(int x, int y, int z, @Nonnull WorkerIndexer.Id tHreadId)` | `R` | public method. |
| `allPossibleValues()` | `List<R>` | public method. |
| `greenFromRgb(int rgb)` | `int` | static public method. |
| `redFromRgb(int rgb)` | `int` | static public method. |
| `blueFromRgb(int rgb)` | `int` | static public method. |
| `coloursToRgb(int red, int green, int blue)` | `int` | static public method. |
| `toString()` | `String` | public method. |
