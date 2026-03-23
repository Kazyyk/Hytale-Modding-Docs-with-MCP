---
title: "BorderDistanceFunction"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic.cell"
fqcn: "com.hypixel.hytale.procedurallib.logic.cell.BorderDistanceFunction"
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
public class BorderDistanceFunction implements CellDistanceFunction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `CellDistanceFunction` | `distanceFunction` |
| `protected final` | `PointEvaluator` | `cellEvaluator` |
| `protected final` | `PointEvaluator` | `borderEvaluator` |
| `protected final` | `IIntCondition` | `density` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BorderDistanceFunction(CellDistanceFunction distanceFunction, @Nonnull PointEvaluator borderEvaluator, IDoubleCondition density)` |
| `public` | `double` | `scale(double value)` |
| `public` | `double` | `invScale(double value)` |
| `public` | `int` | `getCellX(double x, double y)` |
| `public` | `int` | `getCellY(double x, double y)` |
| `public` | `void` | `nearest2D(int seed, double x, double y, int cellX, int cellY, @Nonnull ResultBuffer.ResultBuffer2d buffer, PointEvaluator pointEvaluator)` |
| `public` | `void` | `transition2D(int seed, double x, double y, int cellX, int cellY, @Nonnull ResultBuffer.ResultBuffer2d buffer, PointEvaluator pointEvaluator)` |
| `public` | `void` | `nearest3D( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator )` |
| `public` | `void` | `transition3D( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator )` |
| `public` | `void` | `evalPoint(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, PointEvaluator pointEvaluator)` |
| `public` | `void` | `evalPoint2(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, PointEvaluator pointEvaluator)` |
| `public` | `void` | `evalPoint( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator )` |
| `public` | `void` | `evalPoint2( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator )` |
| `public` | `<T> void` | `collect( int originalSeed, int seed, int minX, int minY, int maxX, int maxY, ResultBuffer.Bounds2d bounds, T ctx, PointConsumer<T> collector, PointEvaluator pointEvaluator )` |
| `public` | `String` | `toString()` |
