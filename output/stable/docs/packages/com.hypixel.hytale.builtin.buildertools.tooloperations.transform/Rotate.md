---
title: "Rotate"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.tooloperations.transform"
fqcn: "com.hypixel.hytale.builtin.buildertools.tooloperations.transform.Rotate"
api_surface: false
extends: null
implements: ["Transform"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "buildertools"
  - "tooloperations"
  - "transform"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.tooloperations.transform`

```java
public class Rotate implements Transform
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Transform` | `X_90` |
| `public static final` | `Transform` | `X_180` |
| `public static final` | `Transform` | `X_270` |
| `public static final` | `Transform` | `Y_90` |
| `public static final` | `Transform` | `Y_180` |
| `public static final` | `Transform` | `Y_270` |
| `public static final` | `Transform` | `Z_90` |
| `public static final` | `Transform` | `Z_180` |
| `public static final` | `Transform` | `Z_270` |
| `public static final` | `Transform` | `FACING_NORTH` |
| `public static final` | `Transform` | `FACING_EAST` |
| `public static final` | `Transform` | `FACING_SOUTH` |
| `public static final` | `Transform` | `FACING_WEST` |
| `private final` | `Axis` | `axis` |
| `private final` | `int` | `rotations` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `apply(Vector3i vector3i)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `public static` | `Transform` | `forDirection(Vector3i direction, Rotation angle)` |
| `public static` | `Transform` | `forAxisAndAngle(BrushAxis axis, Rotation angle)` |
| `private static` | `Transform` | `selectRotation(Rotation angle, Transform rotate0, Transform rotate90, Transform rotate180, Transform rotate270)` |
