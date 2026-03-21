---
title: "OriginShape"
kind: "class"
package: "com.hypixel.hytale.math.shape"
fqcn: "com.hypixel.hytale.math.shape.OriginShape"
api_surface: false
extends: "Shape>"
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
public class OriginShape<S extends Shape> implements Shape
```

A 3D shape implementation used for spatial calculations and collision detection.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public` | `S` | `shape` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public Vector3d` | `getOrigin()` |
| `` | `public S` | `getShape()` |
| `@Override public` | `Box` | `getBox(double x, double y, double z)` |
| `@Override public` | `boolean` | `containsPosition(double x, double y, double z)` |
| `@Override public` | `void` | `expand(double radius)` |
| `@Override public` | `boolean` | `forEachBlock(double x, double y, double z, double epsilon, TriIntPredicate consumer)` |
| `@Override public` | `<T> boolean` | `forEachBlock(double x, double y, double z, double epsilon, T t, TriIntObjPredicate<T> consumer)` |
| `@Override public` | `String` | `toString()` |
