---
title: "CylinderCaveNodeShape"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.CylinderCaveNodeShape"
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
public class CylinderCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds
```

Cave node shape defined by a cylindrical volume along a direction vector with start radius, end radius, and a middle radius for interpolation. Block replacement is determined by projecting each point onto the cylinder axis and checking distance against the interpolated radius scaled by the cave type's height radius factor.

## Constructors

```java
public CylinderCaveNodeShape(CaveType caveType, @Nonnull Vector3d o, @Nonnull Vector3d v, double radius1, double radius2, double middleRadius)
```

## Instance Methods

```java
public double getRadius1()
```

```java
public double getRadius2()
```

## Inner Classes

### CylinderCaveNodeShapeGenerator

```java
public static class CylinderCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator
```

Factory that creates `CylinderCaveNodeShape` instances from randomized radius, middle radius, and length ranges. Supports inheriting the start radius from the parent node.
