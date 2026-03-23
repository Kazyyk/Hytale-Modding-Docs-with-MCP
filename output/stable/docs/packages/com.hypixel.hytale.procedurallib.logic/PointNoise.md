---
title: "PointNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.PointNoise"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.procedurallib.NoiseFunction"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "radial"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public class PointNoise implements NoiseFunction
```

Radial distance noise from a fixed point. Returns -1 within the inner radius, +1 beyond the outer radius, and linearly interpolates between them. Supports both 2D and 3D evaluation.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `double` | `x` |
| `private final` | `double` | `y` |
| `private final` | `double` | `z` |
| `private final` | `double` | `innerRadius2` |
| `private final` | `double` | `outerRadius2` |

## Constructor

```java
public PointNoise(double x, double y, double z, double innerRadius, double outerRadius)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `get(int seed, int seedOffset, double x, double y)` |
| `public` | `double` | `get(int seed, int seedOffset, double x, double y, double z)` |
