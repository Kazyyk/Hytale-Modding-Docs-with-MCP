---
title: "CoordinateRotator"
kind: "class"
package: "com.hypixel.hytale.procedurallib.random"
fqcn: "com.hypixel.hytale.procedurallib.random.CoordinateRotator"
api_surface: false
extends: null
implements: ["ICoordinateRandomizer"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedurallib"
  - "random"
---

**Package:** `com.hypixel.hytale.procedurallib.random`

```java
public class CoordinateRotator implements ICoordinateRandomizer
```

Implements `ICoordinateRandomizer` to provide CoordinateRotator functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `CoordinateRotator` | `NONE` | `new CoordinateRotator(0.0, 0.0)` |
| `public static final` | `int` | `X0` | `0` |
| `public static final` | `int` | `Y0` | `1` |
| `public static final` | `int` | `Z0` | `2` |
| `public static final` | `int` | `X1` | `3` |
| `public static final` | `int` | `Y1` | `4` |
| `public static final` | `int` | `Z1` | `5` |
| `public static final` | `int` | `X2` | `6` |
| `public static final` | `int` | `Y2` | `7` |
| `public static final` | `int` | `Z2` | `8` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `double` | `pitch` |
| `protected final` | `double` | `yaw` |
| `@Nonnull protected final` | `double[]` | `matrix` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `CoordinateRotator(double pitch, double yaw)` |
| `public` | `double` | `rotateX(double x, double y)` |
| `public` | `double` | `rotateY(double x, double y)` |
| `public` | `double` | `rotateX(double x, double y, double z)` |
| `public` | `double` | `rotateY(double x, double y, double z)` |
| `public` | `double` | `rotateZ(double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleX(int seed, double x, double y)` |
| `@Override public` | `double` | `randomDoubleY(int seed, double x, double y)` |
| `@Override public` | `double` | `randomDoubleX(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleY(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleZ(int seed, double x, double y, double z)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `public static` | `double[]` | `createRotationMatrix(double pitch, double yaw)` |
| `private static` | `double` | `dot(double x1, double y1, double z1, double x2, double y2, double z2)` |
