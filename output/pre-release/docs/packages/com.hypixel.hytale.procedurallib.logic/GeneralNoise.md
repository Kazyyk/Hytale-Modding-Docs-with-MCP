---
title: "GeneralNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.GeneralNoise"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "utility"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public final class GeneralNoise
```

Shared utility class for noise functions. Provides hash primes, gradient tables, fast floor/ceil, linear interpolation, 2D/3D hashing, gradient coordinate evaluation, value clamping, and the `InterpolationFunction` interface with `InterpolationMode` enum (LINEAR, HERMITE, QUINTIC). This class cannot be instantiated.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `X_PRIME` | `1619` |
| `public static final` | `int` | `Y_PRIME` | `31337` |
| `public static final` | `int` | `Z_PRIME` | `6971` |

## Static Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `int` | `fastFloor(double f)` |
| `public static` | `int` | `fastCeil(double f)` |
| `public static` | `double` | `lerp(double a, double b, double t)` |
| `public static` | `int` | `hash2D(int seed, int x, int y)` |
| `public static` | `int` | `hash3D(int seed, int x, int y, int z)` |
| `public static` | `double` | `gradCoord2D(int seed, int x, int y, double xd, double yd)` |
| `public static` | `double` | `gradCoord3D(int seed, int x, int y, int z, double xd, double yd, double zd)` |
| `public static` | `double` | `limit(double val)` |

## Inner Types

### InterpolationFunction (interface)

```java
@FunctionalInterface
public interface InterpolationFunction
```

| Return Type | Signature |
|---|---|
| `double` | `interpolate(double var1)` |

### InterpolationMode (enum)

```java
public static enum InterpolationMode
```

| Constant | Description |
|---|---|
| `LINEAR` | Identity function: `t`. |
| `HERMITE` | Hermite smoothstep: `t*t*(3 - 2*t)`. |
| `QUINTIC` | Quintic smoothstep: `t*t*t*(t*(t*6 - 15) + 10)`. |

| Modifier | Type | Name |
|---|---|---|
| `public final` | `GeneralNoise.InterpolationFunction` | `function` |

| Return Type | Signature |
|---|---|
| `GeneralNoise.InterpolationFunction` | `getFunction()` |
