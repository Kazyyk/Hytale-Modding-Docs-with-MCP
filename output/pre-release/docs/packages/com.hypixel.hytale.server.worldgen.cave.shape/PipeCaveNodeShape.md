---
title: "PipeCaveNodeShape"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.PipeCaveNodeShape"
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
public class PipeCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds
```

Cave node shape defined as a tubular pipe along a direction vector with start radius, end radius, and middle radius. Structurally similar to [CylinderCaveNodeShape](CylinderCaveNodeShape.md) but uses a different collision model that tests the perpendicular distance from the axis without the height-radius-factor scaling in the same manner.

## Constructors

```java
public PipeCaveNodeShape(CaveType caveType, @Nonnull Vector3d o, @Nonnull Vector3d v, double radius1, double radius2, double middleRadius)
```

## Instance Methods

```java
public double getRadius2()
```

## Inner Classes

### PipeCaveNodeShapeGenerator

```java
public static class PipeCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator
```

Factory creating `PipeCaveNodeShape` instances from randomized radius, middle radius, and length ranges with optional parent radius inheritance.
