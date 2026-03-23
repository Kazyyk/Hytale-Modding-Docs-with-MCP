---
title: "DensityPointEvaluator"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic.cell.evaluator"
fqcn: "com.hypixel.hytale.procedurallib.logic.cell.evaluator.DensityPointEvaluator"
api_surface: false
extends: ~
implements: ["PointEvaluator"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "procedurallib"
  - "logic"
  - "cell"
  - "evaluator"
  - "class"
---

**Package:** `com.hypixel.hytale.procedurallib.logic.cell.evaluator`

```java
public class DensityPointEvaluator implements PointEvaluator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `PointEvaluator` | `pointEvaluator` |
| `protected final` | `IIntCondition` | `density` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `CellJitter` | `getJitter()` |
| `@Override public` | `void` | `evalPoint( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer )` |
| `@Override public` | `void` | `evalPoint2( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer )` |
| `@Override public` | `void` | `evalPoint( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )` |
| `@Override public` | `void` | `evalPoint2( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )` |
| `@Override public <T>` | `void` | `collectPoint(int cellHash, int cellX, int cellY, double x, double y, T t, @Nonnull PointConsumer<T> consumer)` |
| `@Override @Nonnull public` | `String` | `toString()` |
| `@Nonnull public static` | `IIntCondition` | `getDensityCondition(@Nullable IDoubleCondition threshold)` |
| `public static` | `double` | `randomDensityCondition(int seed)` |
