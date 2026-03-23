---
title: "BlockCubeUtil"
kind: "class"
package: "com.hypixel.hytale.math.block"
fqcn: "com.hypixel.hytale.math.block.BlockCubeUtil"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "block"
  - "class"
---

**Package:** `com.hypixel.hytale.math.block`

```java
public class BlockCubeUtil
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `int` | `radiusY` |
| `` | `int` | `innerMinX` |
| `` | `int` | `innerMaxX` |
| `` | `int` | `innerMinZ` |
| `` | `int` | `innerMaxZ` |
| `` | `int` | `innerMinY` |
| `` | `int` | `innerMaxY` |
| `` | `Vector3i` | `min` |
| `` | `Vector3i` | `max` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `<T> boolean` | `forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `public static <T> boolean` | `forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(originX, originY, originZ, radiusX, height, radiusZ, thickness, false, t, consumer)` |
| `` | `public static <T> boolean` | `forEachBlock(int originX,
        int originY,
        int originZ,
        int radiusX,
        int height,
        int radiusZ,
        int thickness,
        boolean capped,
        T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(originX, originY, originZ, radiusX, height, radiusZ, thickness, capped, capped, false, t, consumer)` |
| `` | `public static <T> boolean` | `forEachBlock(int originX,
        int originY,
        int originZ,
        int radiusX,
        int height,
        int radiusZ,
        int thickness,
        boolean cappedTop,
        boolean cappedBottom,
        boolean hollow,
        T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(originX, originY, originZ, radiusX, height, radiusZ, t, consumer)` |
| `` | `public static <T> boolean` | `forEachBlock(@Nonnull Vector3i pointOne, @Nonnull Vector3i pointTwo, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `public static <T> boolean` | `forEachBlock(@Nonnull Vector3i pointOne,
        @Nonnull Vector3i pointTwo,
        int thickness,
        boolean cappedTop,
        boolean cappedBottom,
        boolean hollow,
        T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(pointOne, pointTwo, t, consumer)` |
