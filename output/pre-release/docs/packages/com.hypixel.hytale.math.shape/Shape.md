---
title: "Shape"
kind: "interface"
package: "com.hypixel.hytale.math.shape"
fqcn: "com.hypixel.hytale.math.shape.Shape"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "shape"
  - "interface"
---

**Package:** `com.hypixel.hytale.math.shape`

```java
public interface Shape
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `default Box` | `getBox(@Nonnull Vector3d position)` |
| `` | `Box` | `getBox(double var1, double var3, double var5)` |
| `` | `default boolean` | `containsPosition(@Nonnull Vector3d origin, @Nonnull Vector3d position)` |
| `` | `default boolean` | `containsPosition(@Nonnull Vector3d position)` |
| `` | `boolean` | `containsPosition(double var1, double var3, double var5)` |
| `` | `void` | `expand(double var1)` |
| `` | `default boolean` | `forEachBlock(@Nonnull Vector3d origin, TriIntPredicate consumer)` |
| `` | `default boolean` | `forEachBlock(@Nonnull Vector3d origin, double epsilon, TriIntPredicate consumer)` |
| `` | `default boolean` | `forEachBlock(double x, double y, double z, TriIntPredicate consumer)` |
| `` | `boolean` | `forEachBlock(double var1, double var3, double var5, double var7, TriIntPredicate var9)` |
| `` | `default <T> boolean` | `forEachBlock(@Nonnull Vector3d origin, T t, TriIntObjPredicate<T> consumer)` |
| `` | `default <T> boolean` | `forEachBlock(@Nonnull Vector3d origin, double epsilon, T t, TriIntObjPredicate<T> consumer)` |
| `` | `default <T> boolean` | `forEachBlock(double x, double y, double z, T t, TriIntObjPredicate<T> consumer)` |
| `` | `<T> boolean` | `forEachBlock(double var1, double var3, double var5, double var7, T var9, TriIntObjPredicate<T> var10)` |
