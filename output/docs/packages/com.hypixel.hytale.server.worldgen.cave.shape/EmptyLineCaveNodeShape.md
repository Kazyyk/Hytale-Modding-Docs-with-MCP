---
title: "EmptyLineCaveNodeShape"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.EmptyLineCaveNodeShape"
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
public class EmptyLineCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds
```

Invisible cave node shape that defines a line segment without carving any blocks. Used as a connector between cave nodes to provide anchor points for child node attachment. `shouldReplace` always returns false; `hasGeometry` returns false. All bounds return 0.

## Constructors

```java
public EmptyLineCaveNodeShape(Vector3d o, Vector3d v)
```

## Inner Classes

### EmptyLineCaveNodeShapeGenerator

```java
public static class EmptyLineCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator
```

Factory creating `EmptyLineCaveNodeShape` instances from a randomized length range.
