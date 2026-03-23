---
title: "Triangle4d"
kind: "class"
package: "com.hypixel.hytale.math.shape"
fqcn: "com.hypixel.hytale.math.shape.Triangle4d"
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
public class Triangle4d
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Vector4d` | `a` |
| `private` | `Vector4d` | `b` |
| `private` | `Vector4d` | `c` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `this(points, 0, 1, 2)` |
| `` | `` | `this(points[a], points[b], points[c])` |
| `` | `public Vector4d` | `getA()` |
| `` | `public Vector4d` | `getB()` |
| `` | `public Vector4d` | `getC()` |
| `` | `public double` | `getMin(int component)` |
| `` | `public double` | `getMax(int component)` |
| `@Nonnull public` | `Vector4d` | `getRandom(@Nonnull Random random)` |
| `@Nonnull public` | `Vector4d` | `getRandom(@Nonnull Random random, @Nonnull Vector4d vec)` |
| `@Nonnull public` | `Triangle2d` | `to2d(@Nonnull Triangle2d target)` |
| `@Override public` | `String` | `toString()` |
