---
title: "PointField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.noise.pointprovider"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.noise.pointprovider.PointField"
api_surface: false
extends: null
implements:
  - "PointProvider"
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "noise"
  - "pointprovider"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.noise.pointprovider`

```java
public abstract class PointField implements PointProvider
```

Abstract base implementation of [PointProvider](PointProvider.md) that provides list-returning convenience methods. Each list-returning method delegates to the corresponding consumer-accepting abstract method, collecting results into an `ArrayList`. Also provides configurable per-axis scale factors.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `double` | `scaleX` |
| `protected` | `double` | `scaleY` |
| `protected` | `double` | `scaleZ` |
| `protected` | `double` | `scaleW` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `List<Vector3i>` | `points3i(@Nonnull Vector3i min, @Nonnull Vector3i max)` |
| `@Nonnull @Override public` | `List<Vector2i>` | `points2i(@Nonnull Vector2i min, @Nonnull Vector2i max)` |
| `@Nonnull @Override public` | `List<Integer>` | `points1i(int min, int max)` |
| `@Nonnull @Override public` | `List<Vector3d>` | `points3d(@Nonnull Vector3d min, @Nonnull Vector3d max)` |
| `@Nonnull @Override public` | `List<Vector2d>` | `points2d(@Nonnull Vector2d min, @Nonnull Vector2d max)` |
| `@Nonnull @Override public` | `List<Double>` | `points1d(double min, double max)` |
| `public` | `PointField` | `setScale(double scaleX, double scaleY, double scaleZ, double scaleW)` |
| `@Nonnull public` | `PointField` | `setScale(double scale)` |
