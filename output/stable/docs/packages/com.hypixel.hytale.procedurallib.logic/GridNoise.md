---
title: "GridNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.GridNoise"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.procedurallib.NoiseFunction"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "grid"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public class GridNoise implements NoiseFunction
```

Produces a distance-to-nearest-grid-edge value. Each axis has an independent thickness parameter controlling the width of the grid lines. Returns values in [-1, 1] where -1 is on a grid line and 1 is at maximum distance from any line. Supports both 2D and 3D evaluation.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `double` | `thicknessX` |
| `protected final` | `double` | `thicknessY` |
| `protected final` | `double` | `thicknessZ` |

## Constructor

```java
public GridNoise(double thicknessX, double thicknessY, double thicknessZ)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z)` |
