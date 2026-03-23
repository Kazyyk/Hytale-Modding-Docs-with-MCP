---
title: "SimplexNoiseField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.noise.SimplexNoiseField"
api_surface: false
extends: "NoiseField"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "worldgen"
  - "noise"
  - "procedural"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields.noise`

```java
public class SimplexNoiseField extends NoiseField
```

Octave-based simplex noise field used for terrain and feature generation. Evaluates multiple octaves of [Simplex](Simplex.md) noise with configurable amplitude persistence and frequency lacunarity, then normalizes the result by the sum of all octave amplitudes. Each octave uses a random per-axis offset (0--256) derived from the seed for decorrelation between octaves.

Supports 1D through 4D evaluation. All input coordinates are divided by the inherited scale factors before octave summation.

## Constructors

```java
public SimplexNoiseField(long seed, double octaveAmplitudeMultiplier, double octaveFrequencyMultiplier, int numberOfOctaves)
```

Creates a simplex noise field with the given parameters.

- `seed` -- used to initialize a `Random` for per-octave offset generation.
- `octaveAmplitudeMultiplier` -- each successive octave's amplitude is multiplied by this value (persistence). Standard value: `0.5`.
- `octaveFrequencyMultiplier` -- each successive octave's frequency is multiplied by this value (lacunarity). Standard value: `2.0`.
- `numberOfOctaves` -- total number of octaves to sum. Must be >= 1; throws `IllegalArgumentException` otherwise.

The normalizer is computed as `1.0 / maxAmplitude` where `maxAmplitude` is the sum of all octave amplitudes.

## Static Methods

```java
@Nonnull
public static SimplexNoiseField.Builder builder()
```

Returns a new [Builder](#builder) instance for fluent construction.

## Methods

```java
public double valueAt(double x, double y, double z, double w)
```

Evaluates 4D octave simplex noise. Coordinates are divided by `scaleX`, `scaleY`, `scaleZ`, `scaleW` respectively, then each octave adds `Simplex.noise(...)` weighted by its amplitude. The result is multiplied by the normalizer.

```java
public double valueAt(double x, double y, double z)
```

Evaluates 3D octave simplex noise. Same octave summation as the 4D variant, using the 3D `Simplex.noise()` overload.

```java
public double valueAt(double x, double y)
```

Evaluates 2D octave simplex noise. Coordinates are divided by `scaleX` and `scaleY`.

```java
public double valueAt(double x)
```

Evaluates 1D octave simplex noise. The X coordinate is divided by `scaleX`, and the Y input to `Simplex.noise()` is fixed at `0.0`.

```java
public long getSeed()
```

Returns the seed used to initialize this noise field.

## Fields

| Field | Type | Visibility | Description |
|---|---|---|---|
| `seed` | `long` | `private final` | The seed used for octave offset generation. |
| `offsetX` | `double[]` | `private final` | Per-octave random X offsets. |
| `offsetY` | `double[]` | `private final` | Per-octave random Y offsets. |
| `offsetZ` | `double[]` | `private final` | Per-octave random Z offsets. |
| `offsetW` | `double[]` | `private final` | Per-octave random W offsets. |
| `numberOfOctaves` | `int` | `private final` | Number of octaves to evaluate. |
| `octaveFrequency` | `double[]` | `private final` | Precomputed frequency for each octave. |
| `octaveAmplitude` | `double[]` | `private final` | Precomputed amplitude for each octave. |
| `normalizer` | `double` | `private final` | `1.0 / sum(amplitudes)` -- used to normalize output to approximately [-1, 1]. |

## Inner Classes

### Builder

```java
public static class Builder
```

Fluent builder for constructing `SimplexNoiseField` instances with sensible defaults.

#### Default Values

| Parameter | Default |
|---|---|
| `seed` | `1L` |
| `octaveAmplitudeMultiplier` | `0.5` |
| `octaveFrequencyMultiplier` | `2.0` |
| `numberOfOctaves` | `4` |
| `scaleX/Y/Z/W` | `0.0` |

#### Builder Methods

```java
@Nonnull
public SimplexNoiseField build()
```

Builds a `SimplexNoiseField` with the configured parameters and applies the scale settings.

```java
@Nonnull
public SimplexNoiseField.Builder withScale(double s)
```

Sets all four scale axes to the same value.

```java
@Nonnull
public SimplexNoiseField.Builder withScale(double x, double y, double z, double w)
```

Sets independent scale values for each axis.

```java
@Nonnull
public SimplexNoiseField.Builder withNumberOfOctaves(int n)
```

Sets the number of octaves. Must be >= 1; throws `IllegalArgumentException` otherwise.

```java
@Nonnull
public SimplexNoiseField.Builder withFrequencyMultiplier(double f)
```

Sets the frequency multiplier (lacunarity) applied between octaves.

```java
@Nonnull
public SimplexNoiseField.Builder withAmplitudeMultiplier(double a)
```

Sets the amplitude multiplier (persistence) applied between octaves.

```java
@Nonnull
public SimplexNoiseField.Builder withSeed(long s)
```

Sets the seed for octave offset generation.

## See Also

- [NoiseField](NoiseField.md) -- abstract base class
- [Simplex](Simplex.md) -- underlying simplex noise implementation
- [CellNoiseField](CellNoiseField.md) -- alternative noise field using cellular noise
