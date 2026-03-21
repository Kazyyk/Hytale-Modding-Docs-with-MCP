---
title: "CaveNodeShapeEnum"
kind: "enum"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.CaveNodeShapeEnum"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "shape"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape`

```java
public enum CaveNodeShapeEnum
```

Enumeration of available cave node shape types: `PIPE`, `CYLINDER`, `PREFAB`, `EMPTY_LINE`, `ELLIPSOID`, `DISTORTED`.

## Values

- `PIPE` -- Tubular shape with start/end radii along a direction vector.
- `CYLINDER` -- Similar to pipe but with circular cross-section collision testing.
- `PREFAB` -- Shape defined by a placed prefab structure.
- `EMPTY_LINE` -- Invisible connector line with no block carving.
- `ELLIPSOID` -- Axis-aligned ellipsoidal chamber.
- `DISTORTED` -- Pipe-like shape with noise-based height/width distortion.

## Inner Interfaces

### CaveNodeShapeGenerator

```java
public interface CaveNodeShapeGenerator
```

Factory interface that generates a [CaveNodeShape](CaveNodeShape.md) instance from randomized parameters, parent node context, and orientation.

```java
CaveNodeShape generateCaveNodeShape(Random var1, CaveType var2, CaveNode var3, CaveNodeType.CaveNodeChildEntry var4, Vector3d var5, float var6, float var7)
```
