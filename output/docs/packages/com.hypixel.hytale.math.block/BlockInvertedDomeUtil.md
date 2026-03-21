---
title: "BlockInvertedDomeUtil"
kind: "class"
package: "com.hypixel.hytale.math.block"
fqcn: "com.hypixel.hytale.math.block.BlockInvertedDomeUtil"
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
public class BlockInvertedDomeUtil
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `float` | `radiusXAdjusted` |
| `` | `float` | `radiusYAdjusted` |
| `` | `float` | `radiusZAdjusted` |
| `` | `float` | `invRadiusXSqr` |
| `` | `float` | `invRadiusYSqr` |
| `` | `float` | `qx` |
| `` | `double` | `dy` |
| `` | `int` | `maxY` |
| `` | `double` | `dz` |
| `` | `int` | `maxZ` |
| `` | `float` | `innerRadiusXAdjusted` |
| `` | `float` | `innerRadiusYAdjusted` |
| `` | `float` | `innerRadiusZAdjusted` |
| `` | `float` | `invRadiusX2` |
| `` | `float` | `invRadiusY2` |
| `` | `float` | `invRadiusZ2` |
| `` | `float` | `invInnerRadiusX2` |
| `` | `float` | `invInnerRadiusY2` |
| `` | `float` | `invInnerRadiusZ2` |
| `` | `int` | `y` |
| `` | `float` | `qy` |
| `` | `double` | `dx` |
| `` | `int` | `maxX` |
| `` | `float` | `innerQy` |
| `` | `float` | `outerQy` |
| `` | `boolean` | `isAtTop` |
| `` | `int` | `x` |
| `` | `float` | `innerQx` |
| `` | `float` | `outerQx` |
| `` | `int` | `z` |
| `` | `float` | `innerQz` |
| `` | `float` | `outerQz` |
| `` | `break` | `label60` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `<T> boolean` | `forEachBlock(int originX, int originY, int originZ, int radiusX, int radiusY, int radiusZ, @Nullable T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `throw new` | `IllegalArgumentException(String.valueOf(radiusX)` |
| `` | `throw new` | `IllegalArgumentException(String.valueOf(radiusY)` |
| `` | `throw new` | `IllegalArgumentException(String.valueOf(radiusZ)` |
| `` | `public static <T> boolean` | `forEachBlock(int originX,
        int originY,
        int originZ,
        int radiusX,
        int radiusY,
        int radiusZ,
        int thickness,
        boolean capped,
        @Nullable T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(originX, originY, originZ, radiusX, radiusY, radiusZ, t, consumer)` |
| `` | `private static <T> boolean` | `test(int originX, int originY, int originZ, int x, int y, int z, T context, @Nonnull TriIntObjPredicate<T> consumer)` |
