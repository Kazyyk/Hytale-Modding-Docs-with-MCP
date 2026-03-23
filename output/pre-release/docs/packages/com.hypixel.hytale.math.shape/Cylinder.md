---
title: "Cylinder"
kind: "class"
package: "com.hypixel.hytale.math.shape"
fqcn: "com.hypixel.hytale.math.shape.Cylinder"
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
public class Cylinder implements Shape
```

A 3D shape implementation used for spatial calculations and collision detection.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public` | `double` | `height` |
| `public` | `double` | `radiusX` |
| `public` | `double` | `radiusZ` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public double` | `getRadiusX()` |
| `` | `public double` | `getRadiusZ()` |
| `` | `public double` | `getHeight()` |
| `@Override public` | `boolean` | `containsPosition(double x, double y, double z)` |
| `@Override public` | `boolean` | `forEachBlock(double x, double y, double z, double epsilon, @Nonnull TriIntPredicate consumer)` |
| `@Override public` | `<T> boolean` | `forEachBlock(double x, double y, double z, double epsilon, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `@Override public` | `void` | `expand(double radius)` |
| `@Override public` | `Box` | `getBox(double x, double y, double z)` |
| `@Override public` | `String` | `toString()` |
