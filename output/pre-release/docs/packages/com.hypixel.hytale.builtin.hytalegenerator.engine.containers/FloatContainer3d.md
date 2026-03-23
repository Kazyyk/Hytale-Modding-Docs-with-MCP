---
title: "FloatContainer3d"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.containers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.containers.FloatContainer3d"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "containers"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.containers`

```java
public class FloatContainer3d
```

A bounded 3D container of float values backed by a flat array. Returns a configurable out-of-bounds value for positions outside the container's bounds. Used by `TerrainStage` to store computed density values during terrain generation. Supports repositioning the bounds via `moveMinTo` without reallocating the backing array.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Bounds3i` | `bounds_voxelGrid` |
| `@Nonnull private final` | `Vector3i` | `size_voxelGrid` |
| `@Nonnull private final` | `float[]` | `data` |
| `private final` | `float` | `outOfBoundsValue` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `FloatContainer3d(@Nonnull Bounds3i bounds_voxelGrid, float outOfBoundsValue)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float` | `get(@Nonnull Vector3i position_voxelGrid)` |
| `@Nonnull public` | `Bounds3i` | `getBounds_voxelGrid()` |
| `public` | `void` | `set(@Nonnull Vector3i position_voxelGrid, float value)` |
| `public` | `void` | `moveMinTo(@Nonnull Vector3i min_voxelGrid)` |
