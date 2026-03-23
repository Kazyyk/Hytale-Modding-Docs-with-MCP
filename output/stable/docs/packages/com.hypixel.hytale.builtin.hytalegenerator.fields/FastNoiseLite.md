---
title: "FastNoiseLite"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.FastNoiseLite"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "worldgen"
  - "noise"
  - "procedural"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields`

```java
public class FastNoiseLite
```

Comprehensive noise generation library (~3895 lines) providing multiple noise algorithms, fractal layering, cellular (Voronoi) noise, and domain warping. This is the foundational noise engine used throughout Hytale's world generation system, consumed by [CellNoiseField](CellNoiseField.md) for cellular noise, [JitterPointField](JitterPointField.md) for jittered point generation, and other generator subsystems.

The implementation is based on the FastNoiseLite open-source library, adapted with Hytale-specific extensions including `pointFor()` methods for cell-based point generation and `Codec` integration for serialization of enum types.

## Constructors

```java
public FastNoiseLite()
```

Creates a FastNoiseLite instance with default settings (seed: 1337, frequency: 0.01, noise type: OpenSimplex2).

```java
public FastNoiseLite(int seed)
```

Creates a FastNoiseLite instance with the given seed, otherwise using default settings.

## Configuration Methods

### Seed and Frequency

```java
public void setSeed(int seed)
```

Sets the seed for all noise types.

```java
public void setFrequency(float frequency)
```

Sets the base frequency for noise evaluation. Default: `0.01`.

### Noise Type

```java
public void setNoiseType(FastNoiseLite.NoiseType noiseType)
```

Sets the primary noise algorithm. Also updates the internal 3D transform type. See [NoiseType](#noisetype) enum.

### 3D Rotation

```java
public void SetRotationType3D(FastNoiseLite.RotationType3D rotationType3D)
```

Sets the 3D rotation type for improved noise isotropy in specific planes. Updates both noise and warp transform types. See [RotationType3D](#rotationtype3d) enum.

### Fractal Configuration

```java
public void setFractalType(FastNoiseLite.FractalType fractalType)
```

Sets the fractal layering algorithm. See [FractalType](#fractaltype) enum.

```java
public void setFractalOctaves(int octaves)
```

Sets the number of fractal octaves. Also recalculates the fractal bounding value.

```java
public void SetFractalLacunarity(float lacunarity)
```

Sets the frequency multiplier between octaves. Default: `2.0`.

```java
public void SetFractalGain(float gain)
```

Sets the amplitude multiplier between octaves. Default: `0.5`. Also recalculates the fractal bounding value.

```java
public void SetFractalWeightedStrength(float weightedStrength)
```

Sets the weighted strength for fractal noise. Default: `0.0`.

```java
public void SetFractalPingPongStrength(float pingPongStrength)
```

Sets the strength of the ping-pong fractal effect. Default: `2.0`.

### Cellular Noise Configuration

```java
public void setCellularDistanceFunction(FastNoiseLite.CellularDistanceFunction cellularDistanceFunction)
```

Sets the distance function used for cellular noise evaluation. See [CellularDistanceFunction](#cellulardistancefunction) enum.

```java
public void setCellularReturnType(FastNoiseLite.CellularReturnType cellularReturnType)
```

Sets what value cellular noise returns. See [CellularReturnType](#cellularreturntype) enum.

```java
public void setCellularJitter(float cellularJitter)
```

Sets the cellular jitter modifier controlling cell point randomization. Default: `1.0`.

### Domain Warp Configuration

```java
public void setDomainWarpType(FastNoiseLite.DomainWarpType domainWarpType)
```

Sets the domain warp algorithm type. Also updates the warp transform type. See [DomainWarpType](#domainwarptype) enum.

```java
public void setDomainWarpAmp(float domainWarpAmp)
```

Sets the amplitude of domain warping. Default: `1.0`.

```java
public void setDomainWarpFreq(float domainWarpFreq)
```

Sets the frequency of the domain warp noise. Default: `1.0`.

## Noise Evaluation Methods

```java
public float getNoise(double x, double y)
```

Evaluates 2D noise at the given coordinates. Applies frequency scaling, then coordinate transformation based on the noise type (OpenSimplex2/OpenSimplex2S apply a skewing transform), then dispatches to the configured fractal type (FBm, Ridged, PingPong, or single-sample).

```java
public float getNoise(double x, double y, double z)
```

Evaluates 3D noise at the given coordinates. Applies frequency scaling, then the configured 3D coordinate transform (ImproveXYPlanes, ImproveXZPlanes, or DefaultOpenSimplex2), then dispatches to the configured fractal type.

## Domain Warp Methods

```java
public void DomainWarp(@Nonnull FastNoiseLite.Vector2 coord)
```

Applies domain warping to a 2D coordinate in-place. The warp algorithm depends on the fractal type: `DomainWarpProgressive`, `DomainWarpIndependent`, or single-pass warp.

```java
public void DomainWarp(@Nonnull FastNoiseLite.Vector3 coord)
```

Applies domain warping to a 3D coordinate in-place. Same fractal dispatch as the 2D variant.

## Point Generation Methods

These methods are Hytale-specific extensions used by [JitterPointField](JitterPointField.md) for generating jittered cell points.

```java
@Nonnull
public Vector3d pointFor(int seed, double jitter, double x, double y, double z)
```

Generates a deterministic jittered 3D point for the cell containing `(x, y, z)`. The input coordinates are rounded to integer cell coordinates, hashed, and used to look up a random offset vector from the internal `randVecs3D` table, scaled by `jitter`.

```java
@Nonnull
public Vector2d pointFor(int seed, double jitter, double x, double y)
```

Generates a deterministic jittered 2D point for the cell containing `(x, y)`. Uses the same hash-and-lookup approach as the 3D variant.

```java
public double pointFor(int seed, double jitter, double x)
```

Generates a deterministic jittered 1D point for the cell containing `x`. Hashes with `yPrimed = 0`.

## Utility Methods

```java
public static int fastRound(double f)
```

Rounds a double to the nearest integer using a branchless approach: `f >= 0 ? (int)(f + 0.5) : (int)(f - 0.5)`. Used by [JitterPointField](JitterPointField.md) for cell coordinate calculation.

## Instance Fields

| Field | Type | Default | Description |
|---|---|---|---|
| `mSeed` | `int` | `1337` | Noise seed. |
| `mFrequency` | `float` | `0.01F` | Base frequency applied to all input coordinates. |
| `mNoiseType` | `NoiseType` | `OpenSimplex2` | Active noise algorithm. |
| `mRotationType3D` | `RotationType3D` | `None` | 3D rotation improvement mode. |
| `mFractalType` | `FractalType` | `None` | Active fractal layering algorithm. |
| `mOctaves` | `int` | `3` | Number of fractal octaves. |
| `mLacunarity` | `float` | `2.0F` | Frequency multiplier per octave. |
| `mGain` | `float` | `0.5F` | Amplitude multiplier per octave. |
| `mWeightedStrength` | `float` | `0.0F` | Weighted strength for fractal variants. |
| `mPingPongStrength` | `float` | `2.0F` | Ping-pong fractal strength. |
| `mFractalBounding` | `float` | `0.5714286F` | Precomputed fractal bounding normalization factor. |
| `mCellularDistanceFunction` | `CellularDistanceFunction` | `EuclideanSq` | Distance metric for cellular noise. |
| `mCellularReturnType` | `CellularReturnType` | `Distance` | Return value mode for cellular noise. |
| `mCellularJitterModifier` | `float` | `1.0F` | Jitter modifier for cellular noise points. |
| `mDomainWarpType` | `DomainWarpType` | `OpenSimplex2` | Domain warp algorithm. |
| `mDomainWarpAmp` | `float` | `1.0F` | Domain warp amplitude. |
| `mDomainWarpFreq` | `float` | `1.0F` | Domain warp frequency. |

All instance fields have `private` visibility.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `Gradients2D` | `float[]` | Precomputed 2D gradient vectors (512 floats, 256 pairs). |
| `RandVecs2D` | `float[]` | Random 2D vectors for domain warping. |
| `Gradients3D` | `float[]` | Precomputed 3D gradient vectors. |
| `randVecs3D` | `float[]` | Random 3D vectors used by `pointFor()` and cellular noise. |
| `primeX` | `int` | Hash prime for X axis: `501125321`. |
| `primeY` | `int` | Hash prime for Y axis: `1136930381`. |
| `primeZ` | `int` | Hash prime for Z axis: `1720413743`. |

All static fields have `private static final` visibility.

## Enums

### NoiseType

```java
public static enum NoiseType
```

| Constant | Description |
|---|---|
| `OpenSimplex2` | OpenSimplex2 noise -- smooth, isotropic gradient noise. Default. |
| `OpenSimplex2S` | OpenSimplex2S variant -- smoother but slightly slower. |
| `Cellular` | Cellular (Voronoi) noise based on cell distance functions. |
| `Perlin` | Classic Perlin gradient noise. |
| `ValueCubic` | Value noise with cubic interpolation. |
| `Value` | Value noise with linear interpolation. |

### FractalType

```java
public static enum FractalType
```

| Constant | Description |
|---|---|
| `None` | No fractal layering -- single noise evaluation. Default. |
| `FBm` | Fractional Brownian motion -- standard octave summation. |
| `Ridged` | Ridged multifractal -- absolute value creates ridge features. |
| `PingPong` | Ping-pong fractal -- values bounce between 0 and ping-pong strength. |
| `DomainWarpProgressive` | Progressive domain warp -- each octave warps the next. |
| `DomainWarpIndependent` | Independent domain warp -- each octave warps independently. |

### CellularDistanceFunction

```java
public static enum CellularDistanceFunction
```

| Constant | Description |
|---|---|
| `Euclidean` | Standard Euclidean (straight-line) distance. |
| `EuclideanSq` | Squared Euclidean distance (avoids square root). Default. |
| `Manhattan` | Manhattan (taxicab) distance. |
| `Hybrid` | Hybrid of Euclidean and Manhattan distance. |

### CellularReturnType

```java
public static enum CellularReturnType
```

| Constant | Description |
|---|---|
| `CellValue` | Hash-based value of the nearest cell. |
| `Distance` | Distance to the nearest cell point. Default. |
| `Distance2` | Distance to the second-nearest cell point. |
| `Distance2Add` | Sum of nearest and second-nearest distances. |
| `Distance2Sub` | Difference of nearest and second-nearest distances. |
| `Distance2Mul` | Product of nearest and second-nearest distances. |
| `Distance2Div` | Quotient of nearest and second-nearest distances. |

This enum includes a `Codec` field for serialization:

```java
@Nonnull
public static final Codec<FastNoiseLite.CellularReturnType> CODEC = new EnumCodec<>(FastNoiseLite.CellularReturnType.class);
```

### DomainWarpType

```java
public static enum DomainWarpType
```

| Constant | Description |
|---|---|
| `OpenSimplex2` | OpenSimplex2-based domain warping. Default. |
| `OpenSimplex2Reduced` | Reduced (faster) OpenSimplex2 domain warping. |
| `BasicGrid` | Simple grid-based domain warping. |

### RotationType3D

```java
public static enum RotationType3D
```

| Constant | Description |
|---|---|
| `None` | No rotation optimization. Default. |
| `ImproveXYPlanes` | Rotates noise to reduce artifacts in XY planes. |
| `ImproveXZPlanes` | Rotates noise to reduce artifacts in XZ planes. |

### TransformType3D (private)

```java
private static enum TransformType3D
```

Internal enum controlling the 3D coordinate transformation applied before noise evaluation.

| Constant | Description |
|---|---|
| `None` | No transform. |
| `ImproveXYPlanes` | XY-plane improvement transform. |
| `ImproveXZPlanes` | XZ-plane improvement transform. |
| `DefaultOpenSimplex2` | Default OpenSimplex2 rotation. |

## Inner Classes

### Vector2

```java
public static class Vector2
```

Mutable 2D vector used for domain warp input/output.

| Field | Type | Description |
|---|---|---|
| `x` | `double` | X component. |
| `y` | `double` | Y component. |

```java
public Vector2(double x, double y)
```

### Vector3

```java
public static class Vector3
```

Mutable 3D vector used for domain warp input/output.

| Field | Type | Description |
|---|---|---|
| `x` | `double` | X component. |
| `y` | `double` | Y component. |
| `z` | `double` | Z component. |

```java
public Vector3(double x, double y, double z)
```

## Internal Algorithms

The class implements the following noise algorithms internally (all via `private` methods):

- **Single noise evaluation** (`GenNoiseSingle`) -- dispatches to the algorithm selected by `NoiseType`.
- **FBm fractal** (`GenFractalFBm`) -- sums octaves with decreasing amplitude, uses weighted strength blending.
- **Ridged fractal** (`GenFractalRidged`) -- sums absolute-value octaves for ridge-like features.
- **PingPong fractal** (`GenFractalPingPong`) -- applies ping-pong folding to octave values.
- **Cellular noise** (`SingleCellular`) -- evaluates Voronoi cell distances in 2D/3D.
- **Domain warp** (`DomainWarpSingle`, `DomainWarpFractalProgressive`, `DomainWarpFractalIndependent`) -- applies coordinate distortion.

Utility functions include `FastMin`, `FastMax`, `FastAbs`, `FastSqrt`, `FastFloor`, `Lerp`, `InterpHermite`, `InterpQuintic`, `CubicLerp`, `PingPong`, hashing (`hash`), value coordinate lookup (`ValCoord`), and gradient coordinate lookup (`GradCoord`).

## See Also

- [CellNoiseField](CellNoiseField.md) -- wraps this class for cellular noise as a `NoiseField`
- [JitterPointField](JitterPointField.md) -- uses `pointFor()` for jittered point generation
- [NoiseField](NoiseField.md) -- abstract noise evaluation interface
