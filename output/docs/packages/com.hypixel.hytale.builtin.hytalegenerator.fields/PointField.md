---
title: "PointField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields.points"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.points.PointField"
api_surface: false
extends: "java.lang.Object"
implements:
  - "PointProvider"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "worldgen"
  - "noise"
  - "procedural"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields.points`

```java
public abstract class PointField implements PointProvider
```

Abstract base class implementing [PointProvider](PointProvider.md). Provides configurable per-axis scale factors and implements all list-returning point methods by delegating to the consumer-accepting abstract methods inherited from the interface. Subclasses only need to implement the consumer-based methods (`points3i`, `points2i`, `points1i`, `points3d`, `points2d`, `points1d` with `Consumer` parameters).

## Fields

| Field | Type | Default | Description |
|---|---|---|---|
| `scaleX` | `double` | `1.0` | Scale factor for the X axis. |
| `scaleY` | `double` | `1.0` | Scale factor for the Y axis. |
| `scaleZ` | `double` | `1.0` | Scale factor for the Z axis. |
| `scaleW` | `double` | `1.0` | Scale factor for the W axis. |

All fields have `protected` visibility.

## Methods

### List-Returning Methods (from PointProvider)

All list-returning methods create an `ArrayList`, pass its `add` method reference as the consumer to the corresponding abstract method, and return the list.

```java
@Nonnull
public List<Vector3i> points3i(@Nonnull Vector3i min, @Nonnull Vector3i max)
```

```java
@Nonnull
public List<Vector2i> points2i(@Nonnull Vector2i min, @Nonnull Vector2i max)
```

```java
@Nonnull
public List<Integer> points1i(int min, int max)
```

```java
@Nonnull
public List<Vector3d> points3d(@Nonnull Vector3d min, @Nonnull Vector3d max)
```

```java
@Nonnull
public List<Vector2d> points2d(@Nonnull Vector2d min, @Nonnull Vector2d max)
```

```java
@Nonnull
public List<Double> points1d(double min, double max)
```

### Scale Configuration

```java
public PointField setScale(double scaleX, double scaleY, double scaleZ, double scaleW)
```

Sets independent scale factors for each axis. Returns `this` for method chaining.

```java
@Nonnull
public PointField setScale(double scale)
```

Sets the same scale factor for all four axes. Delegates to the four-parameter overload. Returns `this` for method chaining.

## Known Subclasses

- [JitterPointField](JitterPointField.md) -- concrete implementation using noise-based jitter for point placement

## See Also

- [PointProvider](PointProvider.md)
- [JitterPointField](JitterPointField.md)
