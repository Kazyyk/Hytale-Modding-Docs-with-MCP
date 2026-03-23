---
title: "com.hypixel.hytale.builtin.hytalegenerator.fields"
kind: "package"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "worldgen"
  - "noise"
  - "procedural"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields`

Low-level noise generation and point field abstractions used throughout the Hytale world generator. This package provides the mathematical foundations for terrain shaping, biome boundaries, feature placement, and procedural variation. It spans three sub-packages organized by function.

## Noise Library

| Type | Kind | Description |
|---|---|---|
| `FastNoiseLite` | class | Comprehensive noise library (~3895 lines) supporting multiple noise algorithms (OpenSimplex2, Cellular, Perlin, Value), fractal layering (FBm, Ridged, PingPong), domain warping, and jittered point generation. |

## Noise Fields (`fields.noise`)

Abstract noise evaluation with scale-aware coordinate transformation and octave-based fractal summation.

| Type | Kind | Description |
|---|---|---|
| [NoiseField](NoiseField.md) | abstract class | Abstract base for 1D--4D noise evaluation with per-axis scale factors. |
| [SimplexNoiseField](SimplexNoiseField.md) | class | Octave-based simplex noise with configurable persistence, lacunarity, and builder pattern. |
| [CellNoiseField](CellNoiseField.md) | class | Cellular (Voronoi) noise backed by FastNoiseLite with optional domain warping. |
| [Simplex](Simplex.md) | class | Package-private pure simplex noise implementation providing static 2D/3D/4D evaluation. |

## Point Fields (`fields.points`)

Procedural point generation for feature and prop placement.

| Type | Kind | Description |
|---|---|---|
| [PointProvider](PointProvider.md) | interface | Contract for generating point sets in 1D--3D with integer and double precision. |
| [PointField](PointField.md) | abstract class | Abstract base implementing PointProvider with scale configuration and list-returning convenience methods. |
| [JitterPointField](JitterPointField.md) | class | Jittered grid point generator using FastNoiseLite for Voronoi-like placement distributions. |

## Type Hierarchy

```
FastNoiseLite
    +-- NoiseType, FractalType, CellularDistanceFunction,
        CellularReturnType, DomainWarpType, RotationType3D (enums)
    +-- Vector2, Vector3 (inner classes)

NoiseField (abstract)
    +-- SimplexNoiseField
    +-- CellNoiseField

PointProvider (interface)
    +-- PointField (abstract)
        +-- JitterPointField
```

## Dependency Graph

- `SimplexNoiseField` delegates per-octave evaluation to `Simplex`
- `CellNoiseField` wraps a `FastNoiseLite` instance configured for cellular noise
- `JitterPointField` uses `FastNoiseLite.pointFor()` for cell-based point jitter
- `JitterPointField` uses `FastNoiseLite.fastRound()` for integer point conversion
