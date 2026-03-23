---
title: "EllipsoidCaveNodeShape"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.EllipsoidCaveNodeShape"
api_surface: false
extends: "AbstractCaveNodeShape"
implements:
  - "IWorldBounds"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "shape"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape`

```java
public class EllipsoidCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds
```

Cave node shape defined as an axis-aligned ellipsoid centered at an origin point with independent X, Y, and Z radii. Block replacement tests use the standard ellipsoid equation scaled by the cave type's height radius factor.

## Constructors

```java
public EllipsoidCaveNodeShape(CaveType caveType, @Nonnull Vector3d o, double rx, double ry, double rz)
```

## Inner Classes

### EllipsoidCaveNodeShapeGenerator

```java
public static class EllipsoidCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator
```

Factory creating `EllipsoidCaveNodeShape` instances from randomized X, Y, and Z radius ranges.
