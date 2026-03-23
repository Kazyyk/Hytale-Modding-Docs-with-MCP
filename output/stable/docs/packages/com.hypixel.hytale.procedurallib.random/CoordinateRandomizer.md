---
title: "CoordinateRandomizer"
kind: "class"
package: "com.hypixel.hytale.procedurallib.random"
fqcn: "com.hypixel.hytale.procedurallib.random.CoordinateRandomizer"
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
public class CoordinateRandomizer implements ICoordinateRandomizer
```

Implements `ICoordinateRandomizer` to provide CoordinateRandomizer functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `ICoordinateRandomizer` | `EMPTY_RANDOMIZER` | `new CoordinateRandomizer.EmptyCoordinateRandomizer()` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `CoordinateRandomizer.AmplitudeNoiseProperty[]` | `xNoise` |
| `protected final` | `CoordinateRandomizer.AmplitudeNoiseProperty[]` | `yNoise` |
| `protected final` | `CoordinateRandomizer.AmplitudeNoiseProperty[]` | `zNoise` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `CoordinateRandomizer(CoordinateRandomizer.AmplitudeNoiseProperty[] xNoise,
        CoordinateRandomizer.AmplitudeNoiseProperty[] yNoise,
        CoordinateRandomizer.AmplitudeNoiseProperty[] zNoise)` |
| `public` | `CoordinateRandomizer.AmplitudeNoiseProperty[]` | `getXNoise()` |
| `public` | `CoordinateRandomizer.AmplitudeNoiseProperty[]` | `getYNoise()` |
| `public` | `CoordinateRandomizer.AmplitudeNoiseProperty[]` | `getZNoise()` |
| `@Override public` | `double` | `randomDoubleX(int seed, double x, double y)` |
| `@Override public` | `double` | `randomDoubleY(int seed, double x, double y)` |
| `@Override public` | `double` | `randomDoubleX(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleY(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleZ(int seed, double x, double y, double z)` |
| `@Nonnull @Override public` | `String` | `toString()` |
