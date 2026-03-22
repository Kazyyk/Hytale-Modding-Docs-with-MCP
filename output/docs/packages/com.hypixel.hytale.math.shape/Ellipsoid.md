---
title: "Ellipsoid"
kind: "class"
package: "com.hypixel.hytale.math.shape"
fqcn: "com.hypixel.hytale.math.shape.Ellipsoid"
api_surface: false
extends: null
implements:
  - "Shape"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "shape"
  - "class"
---

**Package:** `com.hypixel.hytale.math.shape`

```java
public class Ellipsoid implements Shape
```

A 3D shape implementation used for spatial calculations and collision detection.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public` | `double` | `radiusX` |
| `public` | `double` | `radiusY` |
| `public` | `double` | `radiusZ` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `this(radius, radius, radius)` |
| `@Override public` | `Box` | `getBox(double x, double y, double z)` |
| `@Override public` | `boolean` | `containsPosition(double x, double y, double z)` |
| `@Override public` | `void` | `expand(double radius)` |
| `@Override public` | `boolean` | `forEachBlock(double x, double y, double z, double epsilon, @Nonnull TriIntPredicate consumer)` |
| `@Override public` | `<T> boolean` | `forEachBlock(double x, double y, double z, double epsilon, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `@Override public` | `String` | `toString()` |
