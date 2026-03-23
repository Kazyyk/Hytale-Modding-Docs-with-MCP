---
title: "DistortedPointGenerator"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic.point"
fqcn: "com.hypixel.hytale.procedurallib.logic.point.DistortedPointGenerator"
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
public class DistortedPointGenerator implements IPointGenerator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `IPointGenerator` | `pointGenerator` |
| `protected final` | `ICoordinateRandomizer` | `coordinateRandomizer` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `DistortedPointGenerator(IPointGenerator pointGenerator, ICoordinateRandomizer coordinateRandomizer)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `ResultBuffer.ResultBuffer2d` | `nearest2D(int seed, double x, double y)` |
| `@Override public` | `ResultBuffer.ResultBuffer3d` | `nearest3D(int seed, double x, double y, double z)` |
| `@Override public` | `ResultBuffer.ResultBuffer2d` | `transition2D(int seed, double x, double y)` |
| `@Override public` | `ResultBuffer.ResultBuffer3d` | `transition3D(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `getInterval()` |
| `@Override public` | `void` | `collect(int seed, double minX, double minY, double maxX, double maxY, IPointGenerator.PointConsumer2d consumer)` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
