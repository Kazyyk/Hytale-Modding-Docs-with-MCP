---
title: "ValueNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.ValueNoise"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.procedurallib.NoiseFunction"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "value"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public class ValueNoise implements NoiseFunction
```

Value noise that uses hash-based random values at integer lattice points with configurable interpolation (linear, Hermite, or quintic). Output is mapped to [-1, 1]. Supports both 2D and 3D evaluation.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `GeneralNoise.InterpolationFunction` | `interpolationFunction` |

## Constructor

```java
public ValueNoise(GeneralNoise.InterpolationFunction interpolationFunction)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `GeneralNoise.InterpolationFunction` | `getInterpolationFunction()` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z)` |
