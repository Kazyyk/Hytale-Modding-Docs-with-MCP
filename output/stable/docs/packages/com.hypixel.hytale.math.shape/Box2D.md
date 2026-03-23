---
title: "Box2D"
kind: "class"
package: "com.hypixel.hytale.math.shape"
fqcn: "com.hypixel.hytale.math.shape.Box2D"
api_surface: true
extends: null
implements:
  - "Shape2D"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "shape"
  - "class"
---

**Package:** `com.hypixel.hytale.math.shape`

```java
public class Box2D implements Shape2D
```

A 3D shape implementation used for spatial calculations and collision detection.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `this()` |
| `` | `public double` | `width()` |
| `` | `public double` | `height()` |
| `` | `public boolean` | `isIntersecting(@Nonnull Box2D other)` |
| `@Override public` | `boolean` | `containsPosition(@Nonnull Vector2d origin, @Nonnull Vector2d position)` |
| `@Override public` | `boolean` | `containsPosition(@Nonnull Vector2d origin, double xx, double yy)` |
| `@Override public` | `String` | `toString()` |
