---
title: "CellNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.CellNoise"
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
public class CellNoise implements NoiseFunction
```

Voronoi/cellular noise that finds the nearest cell point and evaluates a configurable `CellFunction` to produce the output value. Supports both 2D and 3D evaluation. The `CellFunction` interface and the `CellMode` enum provide built-in modes: `CELL_VALUE` (hash-based random), `NOISE_LOOKUP` (sample another noise at cell center), `DISTANCE` (distance to nearest point), and `DIRECTION` (directional distance with angle, 2D only).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `CellDistanceFunction` | `distanceFunction` |
| `protected final` | `PointEvaluator` | `pointEvaluator` |
| `protected final` | `CellNoise.CellFunction` | `cellFunction` |
| `@Nullable protected final` | `NoiseProperty` | `noiseLookup` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CellDistanceFunction` | `getDistanceFunction()` |
| `public` | `CellNoise.CellFunction` | `getCellFunction()` |
| `@Nullable public` | `NoiseProperty` | `getNoiseLookup()` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z)` |

## Inner Types

### CellFunction (interface)

```java
public interface CellFunction
```

| Return Type | Signature |
|---|---|
| `double` | `eval(int var1, int var2, double var3, double var5, ResultBuffer.ResultBuffer2d var7, CellDistanceFunction var8, NoiseProperty var9)` |
| `double` | `eval(int var1, int var2, double var3, double var5, double var7, ResultBuffer.ResultBuffer3d var9, CellDistanceFunction var10, NoiseProperty var11)` |

### CellMode (enum)

```java
public static enum CellMode
```

| Constant | Description |
|---|---|
| `CELL_VALUE` | Hash-based random value per cell. |
| `NOISE_LOOKUP` | Evaluates a secondary noise at the nearest cell center. |
| `DISTANCE` | Returns the distance to the nearest cell point. |
| `DIRECTION` | Directional cell function using angle and line-side distance (2D only). |

| Return Type | Signature |
|---|---|
| `CellNoise.CellFunction` | `getFunction()` |
