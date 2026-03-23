---
title: "BlockDiamondUtil"
kind: "class"
package: "com.hypixel.hytale.math.block"
fqcn: "com.hypixel.hytale.math.block.BlockDiamondUtil"
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
public class BlockDiamondUtil
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `float` | `radiusXAdjusted` |
| `` | `float` | `radiusZAdjusted` |
| `` | `float` | `normalizedY` |
| `` | `float` | `currentRadiusX` |
| `` | `float` | `currentRadiusZ` |
| `` | `int` | `maxX` |
| `` | `int` | `maxZ` |
| `` | `float` | `innerRadiusX` |
| `` | `float` | `innerRadiusZ` |
| `` | `boolean` | `inOuter` |
| `` | `boolean` | `inInner` |

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
