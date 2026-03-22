---
title: "Calculator"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.math.Calculator"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "framework"
  - "math"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.framework.math`

```java
public class Calculator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `double` | `max` |
| `` | `double` | `min` |
| `` | `int` | `max` |
| `` | `int` | `min` |
| `` | `double` | `floor` |
| `` | `double` | `ceil` |
| `` | `int` | `floor` |
| `` | `int` | `ceil` |
| `` | `double` | `weight` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `int` | `toIntFloored(double d)` |
| `` | `public static boolean` | `perfectDiv(int x, int divisor)` |
| `` | `public static double` | `max(@Nonnull double... n)` |
| `` | `throw new` | `IllegalArgumentException("array can't be empty")` |
| `` | `public static double` | `min(@Nonnull double... n)` |
| `` | `public static int` | `max(@Nonnull int... n)` |
| `` | `public static int` | `min(@Nonnull int... n)` |
| `` | `public static int` | `limit(int value, int floor, int ceil)` |
| `` | `throw new` | `IllegalArgumentException("floor must be smaller than ceil")` |
| `` | `public static double` | `limit(double value, double floor, double ceil)` |
| `` | `public static double` | `distance(double x1, double y1, double z1, double x2, double y2, double z2)` |
| `` | `public static double` | `distance(@Nonnull Vector3d a, @Nonnull Vector3d b)` |
| `` | `public static double` | `distance(double x1, double y1, double x2, double y2)` |
| `` | `public static boolean` | `isDivisibleBy(int number, int divisor)` |
| `` | `public static double` | `clamp(double wallA, double value, double wallB)` |
| `` | `public static int` | `clamp(int wallA, int value, int wallB)` |
| `` | `public static int` | `toNearestInt(double input)` |
| `` | `public static double` | `smoothMin(double range, double a, double b)` |
| `` | `throw new` | `IllegalArgumentException("negative range")` |
| `` | `public static double` | `smoothMax(double range, double a, double b)` |
| `` | `public static int` | `wrap(int value, int max)` |
| `` | `public static int` | `floor(int value, int gridSize)` |
| `` | `public static int` | `ceil(int value, int gridSize)` |

## Related Types

- [Interpolation](Interpolation.md)
