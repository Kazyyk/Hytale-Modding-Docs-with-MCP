---
title: "DirectionViewProvider"
kind: "class"
package: "com.hypixel.hytale.math.hitdetection.view"
fqcn: "com.hypixel.hytale.math.hitdetection.view.DirectionViewProvider"
api_surface: false
extends: null
implements: ["MatrixProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "hitdetection"
  - "view"
  - "class"
---

**Package:** `com.hypixel.hytale.math.hitdetection.view`

```java
public class DirectionViewProvider implements MatrixProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<DirectionViewProvider>` | `CODEC` |
| `public static final` | `Vector3d` | `DEFAULT_UP` |
| `protected final` | `Matrix4d` | `matrix` |
| `protected final` | `Vector3d` | `position` |
| `protected final` | `Vector3d` | `direction` |
| `protected final` | `Vector3d` | `up` |
| `protected` | `double` | `yaw` |
| `protected` | `double` | `pitch` |
| `protected` | `double` | `yawOffset` |
| `protected` | `double` | `pitchOffset` |
| `protected` | `boolean` | `invalid` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Vector3d` | `getPosition()` |
| `@Nonnull public` | `DirectionViewProvider` | `setPosition(Vector3d vec)` |
| `@Nonnull public` | `DirectionViewProvider` | `setPosition(Vector3d vec, double offsetX, double offsetY, double offsetZ)` |
| `@Nonnull public` | `DirectionViewProvider` | `setPosition(double x, double y, double z)` |
| `@Nonnull public` | `DirectionViewProvider` | `setPosition(double x, double y, double z, double offsetX, double offsetY, double offsetZ)` |
| `public` | `Vector3d` | `getDirection()` |
| `@Nonnull public` | `DirectionViewProvider` | `setDirection(Vector3d vec)` |
| `@Nonnull public` | `DirectionViewProvider` | `setDirection(double yaw, double pitch)` |
| `@Nonnull public` | `DirectionViewProvider` | `setDirection(double x, double y, double z)` |
| `@Nonnull public` | `DirectionViewProvider` | `setUp(double x, double y, double z)` |
| `@Override public` | `Matrix4d` | `getMatrix()` |
| `@Nonnull @Override public` | `String` | `toString()` |
