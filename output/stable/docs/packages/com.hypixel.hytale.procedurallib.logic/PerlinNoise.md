---
title: "PerlinNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.PerlinNoise"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.procedurallib.NoiseFunction"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "perlin"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public class PerlinNoise implements NoiseFunction
```

Classic Perlin gradient noise with a configurable interpolation function (linear, Hermite, or quintic). Computes gradient dot products at integer lattice corners and bilinearly (2D) or trilinearly (3D) interpolates the result.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `GeneralNoise.InterpolationFunction` | `interpolationFunction` |

## Constructor

```java
public PerlinNoise(GeneralNoise.InterpolationFunction interpolationFunction)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `GeneralNoise.InterpolationFunction` | `getInterpolationFunction()` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z)` |
