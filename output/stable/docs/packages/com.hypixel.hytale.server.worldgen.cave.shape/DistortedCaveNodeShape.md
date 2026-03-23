---
title: "DistortedCaveNodeShape"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.DistortedCaveNodeShape"
api_surface: false
extends: ~
implements:
  - "CaveNodeShape"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "shape"
  - "distortion"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape`

```java
public class DistortedCaveNodeShape implements CaveNodeShape
```

Cave node shape that wraps a `DistortedShape` with a `ShapeDistortion` to produce noise-modulated cave profiles. The distortion independently scales the floor and ceiling heights, creating organic, non-uniform cave cross-sections. Provides its own `populateChunk` implementation that pre-computes floor and ceiling per-column for efficiency.

## Constructors

```java
public DistortedCaveNodeShape(CaveType caveType, DistortedShape shape, ShapeDistortion distortion)
```

## Instance Methods

```java
public DistortedShape getShape()
```

## Inner Classes

### DistortedCaveNodeShapeGenerator

```java
public static class DistortedCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator
```

Factory creating `DistortedCaveNodeShape` instances with configurable width, height, mid-width, mid-height, and length ranges plus a noise distortion profile. Supports parent radius inheritance and custom interpolation functions.
