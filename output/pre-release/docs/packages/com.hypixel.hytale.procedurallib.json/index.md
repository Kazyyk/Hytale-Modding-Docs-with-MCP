---
title: "com.hypixel.hytale.procedurallib.json"
package: "com.hypixel.hytale.procedurallib.json"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "procedural-generation"
  - "noise"
  - "json-loader"
  - "package-index"
---

**Package:** `com.hypixel.hytale.procedurallib.json`

JSON loading framework for the procedural generation system. Provides a hierarchy of loader classes that read JSON configuration files to construct noise functions, noise properties, cell evaluators, point generators, and mathematical conditions. The loaders use seed-based deterministic generation throughout, enabling reproducible world generation. None of the types in this package are part of the public API surface.

## Core Types

| Type | Kind | Description |
|---|---|---|
| [Loader](Loader.md) | class | Abstract base for all resource loaders. |
| [SeedResource](SeedResource.md) | interface | Interface for seed-based result buffer access. |
| [SeedString](SeedString.md) | class | Seed value wrapper with deterministic hashing. |
| [SeedResourcePointGenerator](SeedResourcePointGenerator.md) | class | Point generator delegating buffers to a SeedResource. |
| [JsonResourceLoader](JsonResourceLoader.md) | class | AssetLoader implementation for JSON parsing. |
| [NoiseTypeJson](NoiseTypeJson.md) | enum | Enum mapping noise type names to loader classes. |
| [JsonLoader](JsonLoader.md) | class | Abstract base for JSON resource loaders with typed accessors. |
| [NoiseFunctionJsonLoader](NoiseFunctionJsonLoader.md) | class | Dispatcher that routes to noise-type-specific loaders. |

## Noise Function Loaders

| Type | Kind | Noise Type |
|---|---|---|
| [CellNoiseJsonLoader](CellNoiseJsonLoader.md) | class | CELLNOISE |
| [ConstantNoiseJsonLoader](ConstantNoiseJsonLoader.md) | class | CONSTANTNOISE |
| [DistanceNoiseJsonLoader](DistanceNoiseJsonLoader.md) | class | DISTANCENOISE |
| [PerlinNoiseJsonLoader](PerlinNoiseJsonLoader.md) | class | PERLINNOISE |
| [SimplexNoiseJsonLoader](SimplexNoiseJsonLoader.md) | class | SIMPLEXNOISE |
| [OldSimplexNoiseJsonLoader](OldSimplexNoiseJsonLoader.md) | class | OLDSIMPLEXNOISE |
| [ValueNoiseJsonLoader](ValueNoiseJsonLoader.md) | class | VALUENOISE |
| [MeshNoiseJsonLoader](MeshNoiseJsonLoader.md) | class | MESHNOISE |
| [GridNoiseJsonLoader](GridNoiseJsonLoader.md) | class | GRIDNOISE |
| [BranchNoiseJsonLoader](BranchNoiseJsonLoader.md) | class | BRANCHNOISE |
| [PointNoiseJsonLoader](PointNoiseJsonLoader.md) | class | POINTNOISE |

## Noise Property Loaders

| Type | Kind | Description |
|---|---|---|
| [NoisePropertyJsonLoader](NoisePropertyJsonLoader.md) | class | Central loader supporting 14 composition types and fractal noise. |
| [BlendNoisePropertyJsonLoader](BlendNoisePropertyJsonLoader.md) | class | Blends multiple noises using threshold-based alpha selection. |
| [CurveNoisePropertyJsonLoader](CurveNoisePropertyJsonLoader.md) | class | Applies power curve transform to noise output. |
| [GradientNoisePropertyJsonLoader](GradientNoisePropertyJsonLoader.md) | class | Computes gradient magnitude/direction from noise. |

## Cell & Point Loaders

| Type | Kind | Description |
|---|---|---|
| [AbstractCellJitterJsonLoader](AbstractCellJitterJsonLoader.md) | class | Abstract base for loaders with cell jitter configuration. |
| [CellDistanceFunctionJsonLoader](CellDistanceFunctionJsonLoader.md) | class | Loads SQUARE/HEX cell distance functions. |
| [CellBorderDistanceFunctionJsonLoader](CellBorderDistanceFunctionJsonLoader.md) | class | Wraps distance functions with border evaluation. |
| [PointEvaluatorJsonLoader](PointEvaluatorJsonLoader.md) | class | Loads point evaluator with distance, jitter, and density settings. |
| [PointGeneratorJsonLoader](PointGeneratorJsonLoader.md) | class | Loads point generators with optional transforms. |

## Utility Loaders

| Type | Kind | Description |
|---|---|---|
| [CoordinateRandomizerJsonLoader](CoordinateRandomizerJsonLoader.md) | class | Loads coordinate distortion randomizers. |
| [CoordinateRotatorJsonLoader](CoordinateRotatorJsonLoader.md) | class | Loads pitch/yaw rotation transforms. |
| [DoubleConditionJsonLoader](DoubleConditionJsonLoader.md) | class | Loads boolean conditions from double values. |
| [DoubleRangeJsonLoader](DoubleRangeJsonLoader.md) | class | Loads min/max double ranges with transforms. |
| [DoubleThresholdJsonLoader](DoubleThresholdJsonLoader.md) | class | Loads single or multiple threshold conditions. |
| [FloatRangeJsonLoader](FloatRangeJsonLoader.md) | class | Loads min/max float ranges with transforms. |
| [HeightThresholdInterpreterJsonLoader](HeightThresholdInterpreterJsonLoader.md) | class | Dispatches to basic or noise height interpreters. |
| [BasicHeightThresholdInterpreterJsonLoader](BasicHeightThresholdInterpreterJsonLoader.md) | class | Loads position/value array height interpreters. |
| [NoiseHeightThresholdInterpreterJsonLoader](NoiseHeightThresholdInterpreterJsonLoader.md) | class | Loads noise-driven height interpreters. |
| [NoiseMaskConditionJsonLoader](NoiseMaskConditionJsonLoader.md) | class | Loads noise-based coordinate mask conditions. |
