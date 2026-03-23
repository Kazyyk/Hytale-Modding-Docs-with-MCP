---
title: "AbstractDistortedShape"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape.distorted"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.distorted.AbstractDistortedShape"
api_surface: false
extends: "null"
implements: ["DistortedShape"]
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
public abstract class AbstractDistortedShape implements DistortedShape
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `double` | `PITCH_MIN` |
| `private static final` | `double` | `PITCH_MAX` |
| `private final` | `int` | `lowBoundX` |
| `private final` | `int` | `lowBoundY` |
| `private final` | `int` | `lowBoundZ` |
| `private final` | `int` | `highBoundX` |
| `private final` | `int` | `highBoundY` |
| `private final` | `int` | `highBoundZ` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `AbstractDistortedShape(@Nonnull Vector3d o, double radiusX, double radiusY, double radiusZ)` |
| `public` | `AbstractDistortedShape(@Nonnull Vector3d o, @Nonnull Vector3d v, double width, double height)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getLowBoundX()` |
| `public` | `int` | `getLowBoundZ()` |
| `public` | `int` | `getHighBoundX()` |
| `public` | `int` | `getHighBoundZ()` |
| `public` | `int` | `getLowBoundY()` |
| `public` | `int` | `getHighBoundY()` |
| `` | `public static double` | `clampPitch(double pitch)` |

## Related Types

- [DistortedShape](DistortedShape.md)
