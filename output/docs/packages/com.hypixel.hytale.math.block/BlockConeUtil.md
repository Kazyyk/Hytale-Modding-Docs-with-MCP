---
title: "BlockConeUtil"
kind: "class"
package: "com.hypixel.hytale.math.block"
fqcn: "com.hypixel.hytale.math.block.BlockConeUtil"
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
public class BlockConeUtil
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `float` | `radiusXAdjusted` |
| `` | `float` | `radiusZAdjusted` |
| `` | `double` | `rf` |
| `` | `double` | `dx` |
| `` | `int` | `maxX` |
| `` | `int` | `minX` |
| `` | `double` | `qx` |
| `` | `double` | `dz` |
| `` | `int` | `maxZ` |
| `` | `int` | `minZ` |
| `` | `boolean` | `cap` |
| `` | `double` | `dxInvSqr` |
| `` | `double` | `innerDx` |
| `` | `double` | `innerDxInvSqr` |
| `` | `double` | `innerMaxZ` |
| `` | `double` | `innerMinZ` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `<T> void` | `forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `throw new` | `IllegalArgumentException(String.valueOf(radiusX)` |
| `` | `throw new` | `IllegalArgumentException(String.valueOf(height)` |
| `` | `throw new` | `IllegalArgumentException(String.valueOf(radiusZ)` |
| `` | `public static <T> void` | `forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `public static <T> void` | `forEachBlock(int originX,
        int originY,
        int originZ,
        int radiusX,
        int height,
        int radiusZ,
        int thickness,
        boolean capped,
        T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `public static <T> void` | `forEachBlockInverted(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `public static <T> void` | `forEachBlockInverted(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `public static <T> void` | `forEachBlockInverted(int originX,
        int originY,
        int originZ,
        int radiusX,
        int height,
        int radiusZ,
        int thickness,
        boolean capped,
        T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
