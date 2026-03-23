---
title: "Triangle2d"
kind: "class"
package: "com.hypixel.hytale.math.shape"
fqcn: "com.hypixel.hytale.math.shape.Triangle2d"
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
public class Triangle2d
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Vector2d` | `a` |
| `private` | `Vector2d` | `b` |
| `private` | `Vector2d` | `c` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `this(points, 0, 1, 2)` |
| `` | `` | `this(points[a], points[b], points[c])` |
| `` | `public Vector2d` | `getA()` |
| `` | `public void` | `setA(Vector2d a)` |
| `` | `public Vector2d` | `getB()` |
| `` | `public void` | `setB(Vector2d b)` |
| `` | `public Vector2d` | `getC()` |
| `` | `public void` | `setC(Vector2d c)` |
| `` | `public double` | `getMinX()` |
| `` | `public double` | `getMinY()` |
| `` | `public double` | `getMaxX()` |
| `` | `public double` | `getMaxY()` |
| `@Nonnull public` | `Vector2d` | `getRandom(@Nonnull Random random)` |
| `@Nonnull public` | `Vector2d` | `getRandom(@Nonnull Random random, @Nonnull Vector2d vec)` |
