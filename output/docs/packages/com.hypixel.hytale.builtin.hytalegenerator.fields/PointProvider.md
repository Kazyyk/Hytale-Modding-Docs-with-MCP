---
title: "PointProvider"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields.points"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.points.PointProvider"
api_surface: false
extends: ~
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
public interface PointProvider
```

Defines a contract for generating point sets in 1D, 2D, and 3D space, with both integer and double precision variants. Each dimensionality provides two overloads: one that returns a `List` and one that accepts a `Consumer` callback for streaming results without list allocation. Used by position providers in the world generation pipeline to produce candidate placement points.

## Methods

### 3D Integer Points

```java
List<Vector3i> points3i(@Nonnull Vector3i var1, @Nonnull Vector3i var2)
```

Returns a list of 3D integer points within the axis-aligned bounding box defined by `var1` (min) and `var2` (max).

```java
void points3i(@Nonnull Vector3i var1, @Nonnull Vector3i var2, @Nonnull Consumer<Vector3i> var3)
```

Streams 3D integer points within the bounding box to the given consumer.

### 2D Integer Points

```java
List<Vector2i> points2i(@Nonnull Vector2i var1, @Nonnull Vector2i var2)
```

Returns a list of 2D integer points within the axis-aligned bounding rectangle defined by `var1` (min) and `var2` (max).

```java
void points2i(@Nonnull Vector2i var1, @Nonnull Vector2i var2, @Nonnull Consumer<Vector2i> var3)
```

Streams 2D integer points within the bounding rectangle to the given consumer.

### 1D Integer Points

```java
List<Integer> points1i(int var1, int var2)
```

Returns a list of integer points within the range `[var1, var2]`.

```java
void points1i(int var1, int var2, @Nonnull Consumer<Integer> var3)
```

Streams integer points within the range to the given consumer.

### 3D Double Points

```java
List<Vector3d> points3d(@Nonnull Vector3d var1, @Nonnull Vector3d var2)
```

Returns a list of 3D double-precision points within the axis-aligned bounding box defined by `var1` (min) and `var2` (max).

```java
void points3d(@Nonnull Vector3d var1, @Nonnull Vector3d var2, @Nonnull Consumer<Vector3d> var3)
```

Streams 3D double-precision points within the bounding box to the given consumer.

### 2D Double Points

```java
List<Vector2d> points2d(@Nonnull Vector2d var1, @Nonnull Vector2d var2)
```

Returns a list of 2D double-precision points within the axis-aligned bounding rectangle defined by `var1` (min) and `var2` (max).

```java
void points2d(@Nonnull Vector2d var1, @Nonnull Vector2d var2, @Nonnull Consumer<Vector2d> var3)
```

Streams 2D double-precision points within the bounding rectangle to the given consumer.

### 1D Double Points

```java
List<Double> points1d(double var1, double var3)
```

Returns a list of double-precision points within the range `[var1, var3]`.

```java
void points1d(double var1, double var3, @Nonnull Consumer<Double> var5)
```

Streams double-precision points within the range to the given consumer.

## Known Implementations

- [PointField](PointField.md) -- abstract base class that implements the list-returning methods by delegating to consumer-accepting abstract methods
- [JitterPointField](JitterPointField.md) -- concrete implementation using noise-based jitter

## See Also

- [PointField](PointField.md)
- [JitterPointField](JitterPointField.md)
