---
title: "OrthogonalProjectionProvider"
kind: "class"
package: "com.hypixel.hytale.math.hitdetection.projection"
fqcn: "com.hypixel.hytale.math.hitdetection.projection.OrthogonalProjectionProvider"
api_surface: false
extends: null
implements: ["MatrixProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "hitdetection"
  - "projection"
  - "class"
---

**Package:** `com.hypixel.hytale.math.hitdetection.projection`

```java
public class OrthogonalProjectionProvider implements MatrixProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<OrthogonalProjectionProvider>` | `CODEC` |
| `protected final` | `Matrix4d` | `matrix` |
| `protected final` | `Matrix4d` | `rotMatrix` |
| `protected` | `boolean` | `invalid` |
| `protected` | `double` | `left` |
| `protected` | `double` | `right` |
| `protected` | `double` | `bottom` |
| `protected` | `double` | `top` |
| `protected` | `double` | `near` |
| `protected` | `double` | `far` |
| `protected` | `double` | `yaw` |
| `protected` | `double` | `pitch` |
| `protected` | `double` | `roll` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `OrthogonalProjectionProvider` | `setLeft(double left)` |
| `@Nonnull public` | `OrthogonalProjectionProvider` | `setRight(double right)` |
| `@Nonnull public` | `OrthogonalProjectionProvider` | `setBottom(double bottom)` |
| `@Nonnull public` | `OrthogonalProjectionProvider` | `setTop(double top)` |
| `@Nonnull public` | `OrthogonalProjectionProvider` | `setNear(double near)` |
| `@Nonnull public` | `OrthogonalProjectionProvider` | `setFar(double far)` |
| `public` | `double` | `getRange()` |
| `@Nonnull public` | `OrthogonalProjectionProvider` | `setRotation(double yaw, double pitch, double roll)` |
| `@Override public` | `Matrix4d` | `getMatrix()` |
| `@Nonnull @Override public` | `String` | `toString()` |
