---
title: "FastNoiseLite"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.noise.FastNoiseLite"
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
public class FastNoiseLite
```

Comprehensive noise generation library supporting multiple noise algorithms (OpenSimplex2, Perlin, Cellular, Value, ValueCubic), fractal layering (FBm, Ridged, PingPong), and domain warping. This is Hytale's adaptation of the open-source FastNoiseLite library.

## Inner Types

| Type | Kind |
|---|---|
| [FastNoiseLite.CellularDistanceFunction](FastNoiseLite.CellularDistanceFunction.md) | enum |
| [FastNoiseLite.CellularReturnType](FastNoiseLite.CellularReturnType.md) | enum |
| [FastNoiseLite.DomainWarpType](FastNoiseLite.DomainWarpType.md) | enum |
| [FastNoiseLite.FractalType](FastNoiseLite.FractalType.md) | enum |
| [FastNoiseLite.NoiseType](FastNoiseLite.NoiseType.md) | enum |
| [FastNoiseLite.RotationType3D](FastNoiseLite.RotationType3D.md) | enum |
| [FastNoiseLite.TransformType3D](FastNoiseLite.TransformType3D.md) | enum |
| [FastNoiseLite.Vector2](FastNoiseLite.Vector2.md) | class |
| [FastNoiseLite.Vector3](FastNoiseLite.Vector3.md) | class |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `mSeed` |
| `private` | `float` | `mFrequency` |
| `private` | `FastNoiseLite.NoiseType` | `mNoiseType` |
| `private` | `FastNoiseLite.RotationType3D` | `mRotationType3D` |
| `@Nonnull private` | `FastNoiseLite.TransformType3D` | `mTransformType3D` |
| `private` | `FastNoiseLite.FractalType` | `mFractalType` |
| `private` | `int` | `mOctaves` |
| `private` | `float` | `mLacunarity` |
| `private` | `float` | `mGain` |
| `private` | `float` | `mWeightedStrength` |
| `private` | `float` | `mPingPongStrength` |
| `private` | `float` | `mFractalBounding` |
| `private` | `FastNoiseLite.CellularDistanceFunction` | `mCellularDistanceFunction` |
| `private` | `FastNoiseLite.CellularReturnType` | `mCellularReturnType` |
| `private` | `float` | `mCellularJitterModifier` |
| `private` | `FastNoiseLite.DomainWarpType` | `mDomainWarpType` |
| `@Nonnull private` | `FastNoiseLite.TransformType3D` | `mWarpTransformType3D` |
| `private` | `float` | `mDomainWarpAmp` |
| `private` | `float` | `mDomainWarpFreq` |

## Constructors

| Signature |
|---|
| `FastNoiseLite()` |
| `FastNoiseLite(int seed)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `setSeed(int seed)` |
| `public` | `void` | `setFrequency(float frequency)` |
| `public` | `void` | `setNoiseType(FastNoiseLite.NoiseType noiseType)` |
| `public` | `void` | `SetRotationType3D(FastNoiseLite.RotationType3D rotationType3D)` |
| `public` | `void` | `setFractalType(FastNoiseLite.FractalType fractalType)` |
| `public` | `void` | `setFractalOctaves(int octaves)` |
| `public` | `void` | `SetFractalLacunarity(float lacunarity)` |
| `public` | `void` | `SetFractalGain(float gain)` |
| `public` | `void` | `SetFractalWeightedStrength(float weightedStrength)` |
| `public` | `void` | `SetFractalPingPongStrength(float pingPongStrength)` |
| `public` | `void` | `setCellularDistanceFunction(FastNoiseLite.CellularDistanceFunction cellularDistanceFunction)` |
| `public` | `void` | `setCellularReturnType(FastNoiseLite.CellularReturnType cellularReturnType)` |
| `public` | `void` | `setCellularJitter(float cellularJitter)` |
| `public` | `void` | `setDomainWarpType(FastNoiseLite.DomainWarpType domainWarpType)` |
| `public` | `void` | `setDomainWarpAmp(float domainWarpAmp)` |
| `public` | `void` | `setDomainWarpFreq(float domainWarpFreq)` |
| `public` | `float` | `getNoise(double x, double y)` |
| `public` | `float` | `getNoise(double x, double y, double z)` |
| `public` | `void` | `DomainWarp(@Nonnull FastNoiseLite.Vector2 coord)` |
| `public` | `void` | `DomainWarp(@Nonnull FastNoiseLite.Vector3 coord)` |
| `public static` | `int` | `fastRound(double f)` |
| `public` | `Vector3d` | `pointFor(int seed, double jitter, double x, double y, double z)` |
| `@Nonnull public` | `Vector2d` | `pointFor(int seed, double jitter, double x, double y)` |
| `public` | `double` | `pointFor(int seed, double jitter, double x)` |
| `public` | `float` | `SingleCellular(int seed, double x, double y)` |
| `public` | `void` | `DomainWarpSingle(@Nonnull FastNoiseLite.Vector3 coord)` |
| `public` | `void` | `DomainWarpFractalProgressive(@Nonnull FastNoiseLite.Vector2 coord)` |
| `public` | `void` | `DomainWarpFractalProgressive(@Nonnull FastNoiseLite.Vector3 coord)` |
