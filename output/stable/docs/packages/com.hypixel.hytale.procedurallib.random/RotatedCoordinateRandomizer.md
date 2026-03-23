---
title: "RotatedCoordinateRandomizer"
kind: "class"
package: "com.hypixel.hytale.procedurallib.random"
fqcn: "com.hypixel.hytale.procedurallib.random.RotatedCoordinateRandomizer"
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
public class RotatedCoordinateRandomizer implements ICoordinateRandomizer
```

Implements `ICoordinateRandomizer` to provide RotatedCoordinateRandomizer functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `ICoordinateRandomizer` | `randomizer` |
| `protected final` | `CoordinateRotator` | `rotation` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `RotatedCoordinateRandomizer(ICoordinateRandomizer randomizer, CoordinateRotator rotation)` |
| `@Override public` | `double` | `randomDoubleX(int seed, double x, double y)` |
| `@Override public` | `double` | `randomDoubleY(int seed, double x, double y)` |
| `@Override public` | `double` | `randomDoubleX(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleY(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleZ(int seed, double x, double y, double z)` |
| `@Nonnull @Override public` | `String` | `toString()` |
