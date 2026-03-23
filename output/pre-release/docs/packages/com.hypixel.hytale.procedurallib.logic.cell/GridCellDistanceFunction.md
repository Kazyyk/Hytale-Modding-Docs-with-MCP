---
title: "GridCellDistanceFunction"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic.cell"
fqcn: "com.hypixel.hytale.procedurallib.logic.cell.GridCellDistanceFunction"
api_surface: false
extends: null
implements:
  - "CellDistanceFunction"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "procedural"
  - "cell"
---
**Package:** `com.hypixel.hytale.procedurallib.logic.cell`

```java
public class GridCellDistanceFunction implements CellDistanceFunction
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `GridCellDistanceFunction` | `DISTANCE_FUNCTION` | `new GridCellDistanceFunction()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getHash(int seed, int cellX, int cellY)` |
| `public` | `DoubleArray.Double2` | `getOffsets(int hash)` |
| `public` | `double` | `getX(double x, double y)` |
| `public` | `double` | `getY(double x, double y)` |
| `public` | `void` | `nearest2D(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator)` |
| `public` | `void` | `nearest3D( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, @Nonnull PointEvaluator pointEvaluator )` |
| `public` | `void` | `transition2D(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator)` |
| `public` | `void` | `transition3D( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, @Nonnull PointEvaluator pointEvaluator )` |
| `public` | `void` | `evalPoint(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator)` |
| `public` | `void` | `evalPoint( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, @Nonnull PointEvaluator pointEvaluator )` |
| `public` | `void` | `evalPoint2(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator)` |
| `public` | `void` | `evalPoint2( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, @Nonnull PointEvaluator pointEvaluator )` |
| `public` | `<T> void` | `collect( int originalSeed, int seed, int minX, int minY, int maxX, int maxY, ResultBuffer.Bounds2d bounds, T ctx, @Nonnull PointConsumer<T> collector, @Nonnull PointEvaluator pointEvaluator )` |
| `public` | `String` | `toString()` |
| `public static` | `int` | `getHash(int seed, int cellX, int cellY)` |
