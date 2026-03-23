---
title: "Quad4d"
kind: "class"
package: "com.hypixel.hytale.math.shape"
fqcn: "com.hypixel.hytale.math.shape.Quad4d"
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
public class Quad4d
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Vector4d` | `a` |
| `private` | `Vector4d` | `b` |
| `private` | `Vector4d` | `c` |
| `private` | `Vector4d` | `d` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `this(points, 0, 1, 2, 3)` |
| `` | `` | `this(points[a], points[b], points[c], points[d])` |
| `` | `public boolean` | `isFullyInsideFrustum()` |
| `` | `public Vector4d` | `getA()` |
| `` | `public Vector4d` | `getB()` |
| `` | `public Vector4d` | `getC()` |
| `` | `public Vector4d` | `getD()` |
| `` | `public Vector4d` | `get(int idx)` |
| `` | `> throw new` | `IllegalArgumentException("Index must be in range of 0 to 3. Given: " + idx)` |
| `` | `public double` | `getMin(int component)` |
| `` | `public double` | `getMax(int component)` |
| `@Nonnull public` | `Quad2d` | `to2d(@Nonnull Quad2d target)` |
| `@Nonnull public` | `Vector4d` | `getCenter()` |
| `@Nonnull public` | `Vector4d` | `getCenter(@Nonnull Vector4d target)` |
| `` | `public void` | `perspectiveTransform()` |
| `@Nonnull public` | `Vector4d` | `getRandom(@Nonnull Random random)` |
| `@Nonnull public` | `Vector4d` | `getRandom(@Nonnull Random random, @Nonnull Vector4d target)` |
| `@Override public` | `String` | `toString()` |
