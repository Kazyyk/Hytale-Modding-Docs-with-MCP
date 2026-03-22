---
title: "SimplexNoiseField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.noise.SimplexNoiseField"
api_surface: false
extends: "NoiseField"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
  - "fields"
  - "noise"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields.noise`

```java
public class SimplexNoiseField extends NoiseField
```

Extends `NoiseField`.

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
| `` | `throw new` | `IllegalArgumentException("octaves can't be smaller than 1")` |
| `@Nonnull public static` | `SimplexNoiseField.Builder` | `builder()` |
| `@Override public` | `double` | `valueAt(double x, double y, double z, double w)` |
| `@Override public` | `double` | `valueAt(double x, double y, double z)` |
| `@Override public` | `double` | `valueAt(double x, double y)` |
| `@Override public` | `double` | `valueAt(double x)` |
| `` | `public long` | `getSeed()` |
| `` | `private` | `Builder()` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withScale(double s)` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withScale(double x, double y, double z, double w)` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withNumberOfOctaves(int n)` |
| `` | `throw new` | `IllegalArgumentException("invalid number")` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withFrequencyMultiplier(double f)` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withAmplitudeMultiplier(double a)` |
| `@Nonnull public` | `SimplexNoiseField.Builder` | `withSeed(long s)` |
