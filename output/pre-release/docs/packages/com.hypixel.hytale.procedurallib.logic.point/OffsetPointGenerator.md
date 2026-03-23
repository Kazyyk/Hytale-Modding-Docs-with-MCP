---
title: "OffsetPointGenerator"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic.point"
fqcn: "com.hypixel.hytale.procedurallib.logic.point.OffsetPointGenerator"
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
public class OffsetPointGenerator implements IPointGenerator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `IPointGenerator` | `generator` |
| `private final` | `double` | `offsetX` |
| `private final` | `double` | `offsetY` |
| `private final` | `double` | `offsetZ` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `OffsetPointGenerator(IPointGenerator generator, double offsetX, double offsetY, double offsetZ)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getOffsetX()` |
| `public` | `double` | `getOffsetY()` |
| `public` | `double` | `getOffsetZ()` |
| `@Override public` | `ResultBuffer.ResultBuffer2d` | `nearest2D(int seed, double x, double y)` |
| `@Override public` | `ResultBuffer.ResultBuffer3d` | `nearest3D(int seed, double x, double y, double z)` |
| `@Override public` | `ResultBuffer.ResultBuffer2d` | `transition2D(int seed, double x, double y)` |
| `@Override public` | `ResultBuffer.ResultBuffer3d` | `transition3D(int seed, double x, double y, double z)` |
| `@Override public` | `void` | `collect(int seed, double minX, double minY, double maxX, double maxY, @Nonnull IPointGenerator.PointConsumer2d consumer)` |
| `@Override public` | `double` | `getInterval()` |
