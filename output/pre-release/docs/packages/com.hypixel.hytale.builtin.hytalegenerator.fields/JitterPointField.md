---
title: "JitterPointField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields.points"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.points.JitterPointField"
api_surface: false
extends: "PointField"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "worldgen"
  - "noise"
  - "procedural"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields.points`

```java
public class JitterPointField extends PointField
```

Generates jittered grid points using `FastNoiseLite.pointFor()` for Voronoi-like point distributions. For each grid cell within the query region, exactly one jittered point is produced. Points that fall outside the query bounds are filtered out via `VectorUtil.isInside()`.

The scale controls cell size: larger scale values produce more widely spaced points. Used by `Mesh2DPositionProvider` and `Mesh3DPositionProvider` in the world generation pipeline for prop and feature placement positions.

## Constructor

```java
public JitterPointField(int seed, double jitter)
```

Creates a jittered point field with the given seed and jitter amount.

- `seed` -- deterministic seed for noise-based point jitter.
- `jitter` -- the amount of randomization applied to each grid point. A jitter of `0.0` would produce a regular grid; larger values produce more random displacement.

The internal scale vectors are initialized to `(1.0, 1.0, 1.0)` for both 3D and 2D.

## Methods

### Scale Configuration

```java
@Override
public PointField setScale(double scaleX, double scaleY, double scaleZ, double scaleW)
```

Overrides the base `setScale` to precompute inverse scale vectors (`scaleDown3d`, `scaleDown2d`) and forward scale vectors (`scaleUp3d`, `scaleUp2d`). The 2D scale uses `scaleX` for the X axis and `scaleZ` for the Y axis (mapping 3D XZ-plane to 2D). Calls `super.setScale()` to store the raw scale values.

### 3D Point Generation

```java
@Override
public void points3d(@Nonnull Vector3d min, @Nonnull Vector3d max, @Nonnull Consumer<Vector3d> pointsOut)
```

Generates jittered 3D points within the bounding box `[min, max]`. The query bounds are scaled down to cell space, rounded to integer cell coordinates, and then each cell is queried via `FastNoiseLite.pointFor(seed, jitter, x, y, z)`. Resulting points are scaled back up and filtered to the query bounds.

```java
@Override
public void points3i(@Nonnull Vector3i min, @Nonnull Vector3i max, @Nonnull Consumer<Vector3i> pointsOut)
```

Delegates to `points3d` after converting integer bounds to doubles, then converts output points back to `Vector3i`.

### 2D Point Generation

```java
@Override
public void points2d(@Nonnull Vector2d min, @Nonnull Vector2d max, @Nonnull Consumer<Vector2d> pointsOut)
```

Generates jittered 2D points within the bounding rectangle `[min, max]`. Same cell-space logic as the 3D variant but operating in 2D. Uses `FastNoiseLite.pointFor(seed, jitter, x, z)`.

```java
@Override
public void points2i(@Nonnull Vector2i min, @Nonnull Vector2i max, @Nonnull Consumer<Vector2i> pointsOut)
```

Delegates to `points2d` after converting integer bounds to doubles, then converts output points back to `Vector2i`.

### 1D Point Generation

```java
@Override
public void points1d(double min, double max, @Nonnull Consumer<Double> pointsOut)
```

Generates jittered 1D points within the range `[min, max]`. Iterates from `min - scaleX` to `max + scaleX` in steps of `scaleX`, querying `FastNoiseLite.pointFor(seed, jitter, x)` for each step. Points within the query range are passed to the consumer.

```java
@Override
public void points1i(int min, int max, @Nonnull Consumer<Integer> pointsOut)
```

Delegates to `points1d`, rounding output values via `FastNoiseLite.fastRound()`.

## Fields

| Field | Type | Visibility | Description |
|---|---|---|---|
| `noise` | `FastNoiseLite` | `private final` | The noise generator used for `pointFor()` calls. |
| `seed` | `int` | `private final` | The seed for deterministic jitter. |
| `jitter` | `double` | `private final` | The jitter amount controlling point displacement. |
| `scaleDown3d` | `Vector3d` | `private final` | Precomputed `1/scale` for 3D coordinate transformation. |
| `scaleUp3d` | `Vector3d` | `private final` | Precomputed scale for converting cell points back to world space. |
| `scaleDown2d` | `Vector2d` | `private final` | Precomputed `1/scale` for 2D coordinate transformation. |
| `scaleUp2d` | `Vector2d` | `private final` | Precomputed scale for converting 2D cell points back to world space. |

## See Also

- [PointField](PointField.md) -- abstract base class
- [PointProvider](PointProvider.md) -- interface contract
- `FastNoiseLite` -- provides the `pointFor()` method used for jitter computation
