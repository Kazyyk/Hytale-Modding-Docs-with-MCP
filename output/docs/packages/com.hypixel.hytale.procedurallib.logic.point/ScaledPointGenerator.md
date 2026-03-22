---
title: "ScaledPointGenerator"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic.point"
fqcn: "com.hypixel.hytale.procedurallib.logic.point.ScaledPointGenerator"
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
public class ScaledPointGenerator implements IPointGenerator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `PointGenerator` | `pointGenerator` |
| `protected final` | `double` | `scale` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ScaledPointGenerator(PointGenerator pointGenerator, double scale)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `ResultBuffer.ResultBuffer2d` | `nearest2D(int seed, double x, double y)` |
| `@Nonnull @Override public` | `ResultBuffer.ResultBuffer3d` | `nearest3D(int seed, double x, double y, double z)` |
| `@Nonnull @Override public` | `ResultBuffer.ResultBuffer2d` | `transition2D(int seed, double x, double y)` |
| `@Nonnull @Override public` | `ResultBuffer.ResultBuffer3d` | `transition3D(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `getInterval()` |
| `@Override public` | `void` | `collect(int seed, double minX, double minY, double maxX, double maxY, IPointGenerator.PointConsumer2d consumer)` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
