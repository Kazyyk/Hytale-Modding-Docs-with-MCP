---
title: "CoordinateOriginRotator"
kind: "class"
package: "com.hypixel.hytale.procedurallib.random"
fqcn: "com.hypixel.hytale.procedurallib.random.CoordinateOriginRotator"
api_surface: false
extends: "CoordinateRotator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedurallib"
  - "random"
---

**Package:** `com.hypixel.hytale.procedurallib.random`

```java
public class CoordinateOriginRotator extends CoordinateRotator
```

Extends `CoordinateRotator` to provide CoordinateOriginRotator functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `double` | `originX` |
| `private final` | `double` | `originY` |
| `private final` | `double` | `originZ` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `CoordinateOriginRotator(double pitch, double yaw, double originX, double originY, double originZ)` |
| `@Override public` | `double` | `randomDoubleX(int seed, double x, double y)` |
| `@Override public` | `double` | `randomDoubleY(int seed, double x, double y)` |
| `@Override public` | `double` | `randomDoubleX(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleY(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleZ(int seed, double x, double y, double z)` |
| `@Nonnull @Override public` | `String` | `toString()` |
