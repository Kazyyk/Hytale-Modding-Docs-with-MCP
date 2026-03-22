---
title: "BorderPointEvaluator"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic.cell.evaluator"
fqcn: "com.hypixel.hytale.procedurallib.logic.cell.evaluator.BorderPointEvaluator"
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
public class BorderPointEvaluator implements PointEvaluator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BorderPointEvaluator` | `INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `evalPoint( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, @Nonnull ResultBuffer.ResultBuffer2d buffer )` |
| `@Override public` | `void` | `evalPoint2( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, @Nonnull ResultBuffer.ResultBuffer2d buffer )` |
| `@Override public` | `void` | `evalPoint( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )` |
| `@Override public` | `void` | `evalPoint2( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )` |
| `@Override @Nonnull public` | `String` | `toString()` |
| `protected static` | `boolean` | `isOrigin(int cellX, int cellY, @Nonnull ResultBuffer.ResultBuffer2d buffer)` |
| `protected static` | `double` | `getBorderDistance(double x, double y, double originX, double originY, double cellPointX, double cellPointY)` |
