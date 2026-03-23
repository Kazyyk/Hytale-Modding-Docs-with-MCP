---
title: "SimplexNoiseField.Builder"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.noise.SimplexNoiseField$Builder"
api_surface: false
extends: null
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
public static class Builder
```

Fluent builder for constructing [SimplexNoiseField](SimplexNoiseField.md) instances with configurable seed, octave count, frequency/amplitude multipliers, and per-axis scale.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `long` | `seed` |
| `private` | `double` | `octaveAmplitudeMultiplier` |
| `private` | `double` | `octaveFrequencyMultiplier` |
| `private` | `int` | `numberOfOctaves` |
| `private` | `double` | `scaleX` |
| `private` | `double` | `scaleY` |
| `private` | `double` | `scaleZ` |
| `private` | `double` | `scaleW` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SimplexNoiseField` | `build()` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withScale(double s)` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withScale(double x, double y, double z, double w)` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withNumberOfOctaves(int n)` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withFrequencyMultiplier(double f)` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withAmplitudeMultiplier(double a)` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withSeed(long s)` |
