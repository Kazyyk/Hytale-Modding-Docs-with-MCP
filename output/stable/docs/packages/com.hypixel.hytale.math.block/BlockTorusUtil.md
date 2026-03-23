---
title: "BlockTorusUtil"
kind: "class"
package: "com.hypixel.hytale.math.block"
fqcn: "com.hypixel.hytale.math.block.BlockTorusUtil"
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
public class BlockTorusUtil
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `int` | `majorRadius` |
| `` | `int` | `sizeXZ` |
| `` | `float` | `minorRadiusAdjusted` |
| `` | `double` | `distFromCenter` |
| `` | `double` | `distFromRing` |
| `` | `double` | `distFromTube` |
| `` | `float` | `innerMinorRadius` |
| `` | `boolean` | `inOuter` |
| `` | `boolean` | `inInner` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `<T> boolean` | `forEachBlock(int originX, int originY, int originZ, int outerRadius, int minorRadius, @Nullable T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `throw new` | `IllegalArgumentException(String.valueOf(outerRadius)` |
| `` | `throw new` | `IllegalArgumentException(String.valueOf(minorRadius)` |
| `` | `public static <T> boolean` | `forEachBlock(int originX,
        int originY,
        int originZ,
        int outerRadius,
        int minorRadius,
        int thickness,
        boolean capped,
        @Nullable T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(originX, originY, originZ, outerRadius, minorRadius, t, consumer)` |
