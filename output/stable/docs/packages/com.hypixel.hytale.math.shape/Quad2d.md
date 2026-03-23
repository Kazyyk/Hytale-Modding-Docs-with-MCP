---
title: "Quad2d"
kind: "class"
package: "com.hypixel.hytale.math.shape"
fqcn: "com.hypixel.hytale.math.shape.Quad2d"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "shape"
  - "class"
---

**Package:** `com.hypixel.hytale.math.shape`

```java
public class Quad2d
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Vector2d` | `a` |
| `private` | `Vector2d` | `b` |
| `private` | `Vector2d` | `c` |
| `private` | `Vector2d` | `d` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `this(points, 0, 1, 2, 3)` |
| `` | `` | `this(points[a], points[b], points[c], points[d])` |
| `` | `public Vector2d` | `getA()` |
| `` | `public Vector2d` | `getB()` |
| `` | `public Vector2d` | `getC()` |
| `` | `public Vector2d` | `getD()` |
| `` | `public double` | `getMinX()` |
| `` | `public double` | `getMinY()` |
| `` | `public double` | `getMaxX()` |
| `` | `public double` | `getMaxY()` |
| `@Nonnull public` | `Vector2d` | `getCenter()` |
| `@Nonnull public` | `Vector2d` | `getCenter(@Nonnull Vector2d target)` |
| `@Nonnull public` | `Vector2d` | `getRandom(@Nonnull Random random)` |
| `@Nonnull public` | `Vector2d` | `getRandom(@Nonnull Random random, @Nonnull Vector2d vec)` |
| `@Override public` | `String` | `toString()` |
