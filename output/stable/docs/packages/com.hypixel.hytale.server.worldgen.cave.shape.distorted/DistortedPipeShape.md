---
title: "DistortedPipeShape"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape.distorted"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.distorted.DistortedPipeShape"
api_surface: false
extends: "DistortedCylinderShape"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "cave"
  - "shape"
  - "distorted"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape.distorted`

```java
public class DistortedPipeShape extends DistortedCylinderShape
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `double` | `compensation` |
| `` | `double` | `fade` |
| `` | `double` | `compensation` |
| `` | `double` | `scale` |
| `` | `double` | `maxWidth` |
| `` | `double` | `maxHeight` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `DistortedPipeShape(@Nonnull Vector3d o,
        @Nonnull Vector3d v,
        double startWidth,
        double startHeight,
        double midWidth,
        double midHeight,
        double endWidth,
        double endHeight,
        double maxWidth,
        double maxHeight,
        double compensation,
        GeneralNoise.InterpolationFunction interpolation)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getWidthAt(double t)` |
| `` | `return` | `getCompensatedDim(t, this.startWidth, this.midWidth, this.endWidth, this.compensation, this.interpolation)` |
| `public` | `double` | `getHeightAt(double t)` |
| `` | `return` | `getCompensatedDim(t, this.startHeight, this.midHeight, this.endHeight, this.compensation, this.interpolation)` |
| `public` | `boolean` | `isValidProjection(double t)` |
| `public` | `String` | `toString()` |
| `` | `protected static double` | `getCompensatedDim(double t, double startDim, double midDim, double endDim, double compensation, @Nonnull GeneralNoise.InterpolationFunction interpolation)` |
| `` | `public DistortedShape` | `create(@Nonnull Vector3d origin,
            @Nonnull Vector3d direction,
            double length,
            double startWidth,
            double startHeight,
            double midWidth,
            double midHeight,
            double endWidth,
            double endHeight,
            GeneralNoise.InterpolationFunction interpolation)` |

## Inner Types

- `DistortedPipeShape.Factory`

## Related Types

- [DistortedCylinderShape](DistortedCylinderShape.md)
- [DistortedShape](DistortedShape.md)
