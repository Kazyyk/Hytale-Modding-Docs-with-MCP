---
title: "com.hypixel.hytale.procedurallib.logic"
kind: "package"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "worldgen"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

Noise function implementations for the procedural generation library. Provides concrete `NoiseFunction` implementations covering Perlin, Simplex, Value, Cell/Voronoi, Grid, Mesh, Branch, and Point noise types, along with shared utilities (`GeneralNoise`, `ResultBuffer`, `DoubleArray`) and a lookup-table class (`CellularNoise`).

## Types

| Type | Kind | Description |
|---|---|---|
| [BranchNoise](BranchNoise.md) | class | Branching cell noise combining parent and line distance functions. |
| [CellNoise](CellNoise.md) | class | Voronoi/cellular noise with configurable cell function modes. |
| [CellularNoise](CellularNoise.md) | class | Static lookup table of 256 pre-computed 2D cell offset vectors. |
| [ConstantNoise](ConstantNoise.md) | class | Noise function that always returns a fixed value. |
| [DistanceNoise](DistanceNoise.md) | class | Abstract noise computing two-nearest-cell distance combinations. |
| [DoubleArray](DoubleArray.md) | class | Container for `Double2` and `Double3` immutable coordinate tuples. |
| [GeneralNoise](GeneralNoise.md) | class | Shared hashing, gradient, interpolation, and math utilities for noise functions. |
| [GridNoise](GridNoise.md) | class | Grid-line noise producing distance-to-nearest-grid-edge values. |
| [HexMeshNoise](HexMeshNoise.md) | class | Hexagonal mesh noise connecting cell centers on a hex grid. |
| [MeshNoise](MeshNoise.md) | class | Rectangular mesh noise connecting Voronoi cell centers to neighbors. |
| [OldSimplexNoise](OldSimplexNoise.md) | class | OpenSimplex-style noise implementation (2D and 3D). |
| [PerlinNoise](PerlinNoise.md) | class | Classic Perlin gradient noise with configurable interpolation. |
| [PointNoise](PointNoise.md) | class | Radial distance noise from a fixed point with inner/outer radius falloff. |
| [ResultBuffer](ResultBuffer.md) | class | Thread-local result buffers for nearest-cell searches in 2D and 3D. |
| [SimplexNoise](SimplexNoise.md) | class | Simplex gradient noise (2D and 3D) with singleton instance. |
| [ValueNoise](ValueNoise.md) | class | Value noise using hash-based random values with configurable interpolation. |
