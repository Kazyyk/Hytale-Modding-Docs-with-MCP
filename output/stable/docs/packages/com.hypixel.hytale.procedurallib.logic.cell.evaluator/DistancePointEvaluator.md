---
title: "DistancePointEvaluator"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic.cell.evaluator"
fqcn: "com.hypixel.hytale.procedurallib.logic.cell.evaluator.DistancePointEvaluator"
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
public class DistancePointEvaluator implements PointEvaluator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `PointDistanceFunction` | `distanceFunction` |
| `protected final` | `ISeedDoubleRange` | `distanceMod` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `evalPoint( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, @Nonnull ResultBuffer.ResultBuffer2d buffer )` |
| `@Override public` | `void` | `evalPoint2( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, @Nonnull ResultBuffer.ResultBuffer2d buffer )` |
| `@Override public` | `void` | `evalPoint( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, @Nonnull ResultBuffer.ResultBuffer3d buffer )` |
| `@Override public` | `void` | `evalPoint2( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, @Nonnull ResultBuffer.ResultBuffer3d buffer )` |
| `@Override @Nonnull public` | `String` | `toString()` |
| `@Nonnull public static` | `ISeedDoubleRange` | `getDistanceModifier(@Nullable IDoubleRange range)` |
| `public static` | `double` | `randomDistanceModification(int seed)` |
