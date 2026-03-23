---
title: "Axis"
kind: "enum"
package: "com.hypixel.hytale.math"
fqcn: "com.hypixel.hytale.math.Axis"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "math"
---

**Package:** `com.hypixel.hytale.math`

```java
public enum Axis
```

Represents the three spatial axes (X, Y, Z). Each constant carries a unit direction vector and provides rotation and flip operations for both integer and double 3D vectors. Rotations are performed in 90-degree increments.

## Enum Constants

| Constant | Direction | Description |
|---|---|---|
| `X` | (1, 0, 0) | The X axis. |
| `Y` | (0, 1, 0) | The Y axis. |
| `Z` | (0, 0, 1) | The Z axis. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getDirection()` | `Vector3i` | Returns a clone of the unit direction vector for this axis. |
| `rotate(@Nonnull Vector3i vector, int angle)` | `void` | Rotates an integer vector around this axis by the given angle in degrees (must be a multiple of 90). |
| `rotate(@Nonnull Vector3d vector, int angle)` | `void` | Rotates a double vector around this axis by the given angle in degrees. |
| `rotate(@Nonnull Vector3i vector)` | `void` | Rotates an integer vector 90 degrees around this axis. |
| `rotate(@Nonnull Vector3d vector)` | `void` | Rotates a double vector 90 degrees around this axis. |
| `flip(@Nonnull Vector3i vector)` | `void` | Negates the component of the integer vector along this axis. |
| `flip(@Nonnull Vector3d vector)` | `void` | Negates the component of the double vector along this axis. |
| `flipRotation(@Nonnull Vector3f rotation)` | `void` | Flips the rotation angle (yaw/pitch) corresponding to this axis. |
