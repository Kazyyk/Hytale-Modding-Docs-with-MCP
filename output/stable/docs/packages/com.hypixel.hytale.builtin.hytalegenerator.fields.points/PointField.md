---
title: "PointField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields.points"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.points.PointField"
api_surface: false
extends: null
implements: ["PointProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "fields"
  - "points"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields.points`

```java
public abstract class PointField implements PointProvider
```

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
| `@Nonnull @Override public` | `List<Vector3i>` | `points3i(Vector3i min, Vector3i max)` |
| `@Nonnull @Override public` | `List<Vector2i>` | `points2i(Vector2i min, Vector2i max)` |
| `@Nonnull @Override public` | `List<Integer>` | `points1i(int min, int max)` |
| `@Nonnull @Override public` | `List<Vector3d>` | `points3d(Vector3d min, Vector3d max)` |
| `@Nonnull @Override public` | `List<Vector2d>` | `points2d(Vector2d min, Vector2d max)` |
| `@Nonnull @Override public` | `List<Double>` | `points1d(double min, double max)` |
| `public` | `PointField` | `setScale(double scaleX, double scaleY, double scaleZ, double scaleW)` |
| `@Nonnull public` | `PointField` | `setScale(double scale)` |
