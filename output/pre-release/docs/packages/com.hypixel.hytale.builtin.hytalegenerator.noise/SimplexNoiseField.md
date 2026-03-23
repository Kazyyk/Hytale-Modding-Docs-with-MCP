---
title: "SimplexNoiseField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.noise.SimplexNoiseField"
api_surface: false
extends: "NoiseField"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "noise"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.noise`

```java
public class SimplexNoiseField extends NoiseField
```

Octave-layered simplex noise field. Combines multiple octaves of [Simplex](Simplex.md) noise with configurable frequency and amplitude multipliers. Each octave uses a random offset derived from the seed. The final value is normalized so the output range is independent of octave count.

## Inner Types

| Type | Kind |
|---|---|
| [SimplexNoiseField.Builder](SimplexNoiseField.Builder.md) | class |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `long` | `seed` |
| `@Nonnull private final` | `double[]` | `offsetX` |
| `@Nonnull private final` | `double[]` | `offsetY` |
| `@Nonnull private final` | `double[]` | `offsetZ` |
| `@Nonnull private final` | `double[]` | `offsetW` |
| `private final` | `int` | `numberOfOctaves` |
| `@Nonnull private final` | `double[]` | `octaveFrequency` |
| `@Nonnull private final` | `double[]` | `octaveAmplitude` |
| `private final` | `double` | `normalizer` |

## Constructors

| Signature |
|---|
| `SimplexNoiseField(long seed, double octaveAmplitudeMultiplier, double octaveFrequencyMultiplier, int numberOfOctaves)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `SimplexNoiseField.Builder` | `builder()` |
| `@Override public` | `double` | `valueAt(double x, double y, double z, double w)` |
| `@Override public` | `double` | `valueAt(double x, double y, double z)` |
| `@Override public` | `double` | `valueAt(double x, double y)` |
| `@Override public` | `double` | `valueAt(double x)` |
| `public` | `long` | `getSeed()` |
