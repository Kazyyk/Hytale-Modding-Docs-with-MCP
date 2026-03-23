---
title: "MeshNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.MeshNoise"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.procedurallib.NoiseFunction"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "mesh"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public class MeshNoise implements NoiseFunction
```

Rectangular mesh noise that draws line segments between adjacent Voronoi cell centers on a regular grid. Uses density conditions to selectively enable cells, and jitter parameters to offset cell centers. Only supports 2D evaluation; the 3D overload throws `UnsupportedOperationException`.

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Vector2i[]` | `ADJACENT_CELLS` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `IIntCondition` | `density` |
| `private final` | `double` | `thickness` |
| `private final` | `double` | `jitterX` |
| `private final` | `double` | `jitterY` |

## Constructor

```java
public MeshNoise(IIntCondition density, double thickness, double jitterX, double jitterY)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z)` |
