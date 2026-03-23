---
title: "AbstractDistortedExtrusion"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape.distorted"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.distorted.AbstractDistortedExtrusion"
api_surface: false
extends: "AbstractDistortedShape"
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
public abstract class AbstractDistortedExtrusion extends AbstractDistortedShape
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `GeneralNoise.InterpolationFunction` | `interpolation` |
| `` | `double` | `width` |
| `` | `double` | `dist2` |
| `` | `double` | `width2` |
| `` | `double` | `height` |
| `` | `double` | `alpha` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `AbstractDistortedExtrusion(@Nonnull Vector3d o, @Nonnull Vector3d v, double width, double height, GeneralNoise.InterpolationFunction interpolation)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `protected abstract double` | `getDistanceSq(double var1, double var3, double var5)` |
| `` | `protected abstract double` | `getHeightComponent(double var1, double var3, double var5)` |
| `public` | `double` | `getHeightAtProjection(int seed, double x, double z, double t, double centerY, @Nonnull CaveType caveType, @Nonnull ShapeDistortion distortion)` |

## Related Types

- [AbstractDistortedShape](AbstractDistortedShape.md)
- [DistortedShape](DistortedShape.md)
- [ShapeDistortion](ShapeDistortion.md)
