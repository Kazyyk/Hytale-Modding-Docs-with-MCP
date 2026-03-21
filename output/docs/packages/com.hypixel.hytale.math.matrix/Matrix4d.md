---
title: "Matrix4d"
kind: "class"
package: "com.hypixel.hytale.math.matrix"
fqcn: "com.hypixel.hytale.math.matrix.Matrix4d"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "math"
  - "matrix"
  - "class"
---

**Package:** `com.hypixel.hytale.math.matrix`

```java
public class Matrix4d
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `M00` |
| `public static final` | `int` | `M10` |
| `public static final` | `int` | `M20` |
| `public static final` | `int` | `M30` |
| `public static final` | `int` | `M01` |
| `public static final` | `int` | `M11` |
| `public static final` | `int` | `M21` |
| `public static final` | `int` | `M31` |
| `public static final` | `int` | `M02` |
| `public static final` | `int` | `M12` |
| `public static final` | `int` | `M22` |
| `public static final` | `int` | `M32` |
| `public static final` | `int` | `M03` |
| `public static final` | `int` | `M13` |
| `public static final` | `int` | `M23` |
| `public static final` | `int` | `M33` |
| `public static final` | `int` | `COLUMNS` |
| `public static final` | `int` | `ROWS` |
| `public static final` | `int` | `FIELDS` |
| `private final` | `double[]` | `m` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Matrix4d()` |
| `public` | `Matrix4d(@Nonnull Matrix4d other)` |
| `public` | `Matrix4d(double[] m)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `get(int idx)` |
| `public` | `double` | `get(int col, int row)` |
| `@Nonnull public` | `Matrix4d` | `set(int idx, double val)` |
| `@Nonnull public` | `Matrix4d` | `set(int col, int row, double val)` |
| `@Nonnull public` | `Matrix4d` | `add(int idx, double val)` |
| `@Nonnull public` | `Matrix4d` | `add(int col, int row, double val)` |
| `@Nonnull public` | `Matrix4d` | `identity()` |
| `@Nonnull public` | `Matrix4d` | `assign(@Nonnull Matrix4d other)` |
| `@Nonnull public` | `Matrix4d` | `assign(double m00,
        double m10,
        double m20,
        double m30,
        double m01,
        double m11,
        double m21,
        double m31,
        double m02,
        double m12,
        double m22,
        double m32,
        double m03,
        double m13,
        double m23,
        double m33)` |
| `@Nonnull public` | `Matrix4d` | `translate(@Nonnull Vector3d vec)` |
| `@Nonnull public` | `Matrix4d` | `translate(double x, double y, double z)` |
| `@Nonnull public` | `Matrix4d` | `scale(double x, double y, double z)` |
| `@Nonnull public` | `Vector3d` | `multiplyPosition(@Nonnull Vector3d vec)` |
| `@Nonnull public` | `Vector3d` | `multiplyPosition(@Nonnull Vector3d vec, @Nonnull Vector3d result)` |
| `@Nonnull public` | `Vector3d` | `multiplyDirection(@Nonnull Vector3d vec)` |
| `@Nonnull public` | `Vector4d` | `multiply(@Nonnull Vector4d vec)` |
| `@Nonnull public` | `Vector4d` | `multiply(@Nonnull Vector4d vec, @Nonnull Vector4d result)` |
| `@Nonnull public` | `Matrix4d` | `multiply(@Nonnull Matrix4d other)` |
| `public` | `boolean` | `invert()` |
| `@Nonnull public` | `Matrix4d` | `projectionOrtho(double left, double right, double bottom, double top, double near, double far)` |
| `@Nonnull public` | `Matrix4d` | `projectionFrustum(double left, double right, double bottom, double top, double near, double far)` |
| `@Nonnull public` | `Matrix4d` | `projectionCone(double fov, double aspect, double near, double far)` |
| `@Nonnull public` | `Matrix4d` | `viewTarget(double eyeX, double eyeY, double eyeZ, double centerX, double centerY, double centerZ, double upX, double upY, double upZ)` |
| `@Nonnull public` | `Matrix4d` | `viewDirection(double eyeX, double eyeY, double eyeZ, double dirX, double dirY, double dirZ, double upX, double upY, double upZ)` |
| `@Nonnull public` | `Matrix4d` | `rotateAxis(double a, double x, double y, double z, @Nonnull Matrix4d tmp)` |
| `@Nonnull public` | `Matrix4d` | `setRotateAxis(double a, double x, double y, double z)` |
| `@Nonnull public` | `Matrix4d` | `rotateEuler(double x, double y, double z, @Nonnull Matrix4d tmp)` |
| `@Nonnull public` | `Matrix4d` | `setRotateEuler(double x, double y, double z)` |
| `public` | `double[]` | `getData()` |
| `public` | `float[]` | `asFloatData()` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `public static` | `int` | `idx(int col, int row)` |
