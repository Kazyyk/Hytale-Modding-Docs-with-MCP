---
title: "PointGenerator"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic.point"
fqcn: "com.hypixel.hytale.procedurallib.logic.point.PointGenerator"
api_surface: false
extends: ~
implements: ["IPointGenerator"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "procedurallib"
  - "logic"
  - "point"
  - "class"
---

**Package:** `com.hypixel.hytale.procedurallib.logic.point`

```java
public class PointGenerator implements IPointGenerator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `int` | `seedOffset` |
| `protected final` | `CellDistanceFunction` | `cellDistanceFunction` |
| `protected final` | `PointEvaluator` | `pointEvaluator` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `PointGenerator(int seedOffset, CellDistanceFunction cellDistanceFunction, PointEvaluator pointEvaluator)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull protected` | `ResultBuffer.Bounds2d` | `localBounds2d()` |
| `@Nonnull protected` | `ResultBuffer.ResultBuffer2d` | `localBuffer2d()` |
| `@Nonnull protected` | `ResultBuffer.ResultBuffer3d` | `localBuffer3d()` |
| `@Nonnull @Override public` | `ResultBuffer.ResultBuffer2d` | `nearest2D(int seed, double x, double y)` |
| `@Nonnull @Override public` | `ResultBuffer.ResultBuffer3d` | `nearest3D(int seed, double x, double y, double z)` |
| `@Nonnull @Override public` | `ResultBuffer.ResultBuffer2d` | `transition2D(int seed, double x, double y)` |
| `@Nonnull @Override public` | `ResultBuffer.ResultBuffer3d` | `transition3D(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `getInterval()` |
| `@Override public` | `void` | `collect(int seed, double minX, double minY, double maxX, double maxY, IPointGenerator.PointConsumer2d consumer)` |
| `public` | `void` | `collect0(int seed,
        double minX,
        double minY,
        double maxX,
        double maxY,
        PointConsumer<IPointGenerator.PointConsumer2d> pointConsumer,
        IPointGenerator.PointConsumer2d consumer)` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
