---
title: "DistanceNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.DistanceNoise"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.procedurallib.NoiseFunction"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "voronoi"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public abstract class DistanceNoise implements NoiseFunction
```

Abstract noise function that computes the two nearest cell distances and combines them via a `Distance2Function`. Supports both 2D and 3D evaluation. Subclasses must provide thread-local result buffers via `localBuffer2d()` and `localBuffer3d()`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `CellDistanceFunction` | `cellDistanceFunction` |
| `protected final` | `PointEvaluator` | `pointEvaluator` |
| `protected final` | `DistanceNoise.Distance2Function` | `distance2Function` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CellDistanceFunction` | `getCellDistanceFunction()` |
| `public` | `DistanceNoise.Distance2Function` | `getDistance2Function()` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z)` |
| `protected abstract` | `ResultBuffer.ResultBuffer2d` | `localBuffer2d()` |
| `protected abstract` | `ResultBuffer.ResultBuffer3d` | `localBuffer3d()` |

## Inner Types

### Distance2Function (interface)

```java
@FunctionalInterface
public interface Distance2Function
```

| Return Type | Signature |
|---|---|
| `double` | `eval(double var1, double var3)` |

### Distance2Mode (enum)

```java
public static enum Distance2Mode
```

| Constant | Description |
|---|---|
| `ADD` | Sum of two nearest distances. |
| `SUB` | Difference (distance2 - distance). |
| `MUL` | Product of two nearest distances. |
| `DIV` | Ratio (distance / distance2). |
| `MIN` | Returns the nearest distance only. |
| `MAX` | Returns the second-nearest distance only. |

| Return Type | Signature |
|---|---|
| `DistanceNoise.Distance2Function` | `getFunction()` |
