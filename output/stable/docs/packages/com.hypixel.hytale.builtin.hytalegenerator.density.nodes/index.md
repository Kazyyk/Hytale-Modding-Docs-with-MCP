---
title: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes"
kind: "package"
package: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "density"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.density.nodes`

Density function node implementations for the procedural world generation system. Each node extends `Density` and implements a `process(Context)` method that computes a scalar density value at a 3D position. Nodes compose into trees representing mathematical operations (arithmetic, noise, shapes, transforms, combinators).

## Types

| Type | Kind | Description |
|---|---|---|

| [AbsDensity](AbsDensity.md) | class | Returns the absolute value of its input density. |
| [AmplitudeConstantDensity](AmplitudeConstantDensity.md) | class | Multiplies input density by a constant amplitude. |
| [AmplitudeDensity](AmplitudeDensity.md) | class | Multiplies input density by a height-dependent amplitude function. |
| [AnchorDensity](AnchorDensity.md) | class | Transforms input coordinates relative to a buffer anchor point. |
| [AngleDensity](AngleDensity.md) | class | Computes angular distance between a position and a vector provider direction. |
| [AxisDensity](AxisDensity.md) | class | Computes distance from a given axis with a configurable distance curve. |
| [BaseHeightDensity](BaseHeightDensity.md) | class | Returns a density value derived from the terrain base height. |
| [CacheDensity](CacheDensity.md) | class | Caches the result of its input density to avoid redundant computation. |
| [CeilingDensity](CeilingDensity.md) | class | Applies ceiling (rounding up) to the input density value. |
| [CellWallDistanceDensity](CellWallDistanceDensity.md) | class | Computes distance to the nearest cell wall in cellular noise. |
| [ClampDensity](ClampDensity.md) | class | Clamps the input density between minimum and maximum bounds. |
| [ConstantValueDensity](ConstantValueDensity.md) | class | Returns a fixed constant density value regardless of position. |
| [CubeDensity](CubeDensity.md) | class | Evaluates a cube-shaped signed distance field. |
| [CurveMapperDensity](CurveMapperDensity.md) | class | Remaps input density through a piecewise curve function. |
| [CylinderDensity](CylinderDensity.md) | class | Evaluates a cylinder-shaped signed distance field. |
| [DistanceDensity](DistanceDensity.md) | class | Computes Euclidean distance from a point defined by a vector provider. |
| [DistanceToBiomeEdgeDensity](DistanceToBiomeEdgeDensity.md) | class | Returns normalized distance to the nearest biome boundary. |
| [FastGradientWarpDensity](FastGradientWarpDensity.md) | class | Applies fast gradient domain warping to input coordinates. |
| [FloorDensity](FloorDensity.md) | class | Applies floor (rounding down) to the input density value. |
| [FunctionDensity](FunctionDensity.md) | class | Evaluates a height-dependent mathematical function as density. |
| [GradientDensity](GradientDensity.md) | class | Produces a linear gradient along a specified direction. |
| [GradientWarpDensity](GradientWarpDensity.md) | class | Applies gradient-based domain warping using noise. |
| [InverterDensity](InverterDensity.md) | class | Negates the input density value. |
| [MaxDensity](MaxDensity.md) | class | Returns the maximum of two input densities. |
| [MinDensity](MinDensity.md) | class | Returns the minimum of two input densities. |
| [MixDensity](MixDensity.md) | class | Linearly interpolates between two densities using a third as the blend factor. |
| [MultiCacheDensity](MultiCacheDensity.md) | class | Caches results for multiple density inputs in a shared cache. |
| [MultiMixDensity](MultiMixDensity.md) | class | Blends multiple densities using gauge-based segmented interpolation. |
| [MultiplierDensity](MultiplierDensity.md) | class | Multiplies two input densities together. |
| [Noise2dDensity](Noise2dDensity.md) | class | Evaluates 2D noise at the XZ position. |
| [Noise3dDensity](Noise3dDensity.md) | class | Evaluates 3D noise at the full XYZ position. |
| [NormalizerDensity](NormalizerDensity.md) | class | Normalizes input density from a source range to a target range. |
| [OffsetConstantDensity](OffsetConstantDensity.md) | class | Adds a constant offset to the input density. |
| [OffsetDensity](OffsetDensity.md) | class | Adds a height-dependent offset function to the input density. |
| [PlaneDensity](PlaneDensity.md) | class | Evaluates a plane-based signed distance field. |
| [PositionsHorizontalPinchDensity](PositionsHorizontalPinchDensity.md) | class | Warps horizontal coordinates based on a density-driven pinch. |
| [PositionsPinchDensity](PositionsPinchDensity.md) | class | Warps all coordinates based on a density-driven pinch function. |
| [PositionsTwistDensity](PositionsTwistDensity.md) | class | Applies a twist transformation to input coordinates around the Y axis. |
| [PowDensity](PowDensity.md) | class | Raises the input density to a specified power. |
| [RotatorDensity](RotatorDensity.md) | class | Rotates the sampling coordinates by a specified angle around an axis. |
| [ScaleDensity](ScaleDensity.md) | class | Scales input coordinates by constant factors before sampling. |
| [SelectorDensity](SelectorDensity.md) | class | Selects between two densities based on a threshold condition. |
| [ShellDensity](ShellDensity.md) | class | Extracts the shell (surface region) of a density field at a given threshold. |
| [SliderDensity](SliderDensity.md) | class | Applies a sliding transform along the Y axis based on position. |
| [SmoothCeilingDensity](SmoothCeilingDensity.md) | class | Applies a smooth ceiling function using polynomial interpolation. |
| [SmoothClampDensity](SmoothClampDensity.md) | class | Applies smooth clamping between minimum and maximum bounds. |
| [SmoothFloorDensity](SmoothFloorDensity.md) | class | Applies a smooth floor function using polynomial interpolation. |
| [SmoothMaxDensity](SmoothMaxDensity.md) | class | Returns a smooth approximation of the maximum of two densities. |
| [SmoothMinDensity](SmoothMinDensity.md) | class | Returns a smooth approximation of the minimum of two densities. |
| [SqrtDensity](SqrtDensity.md) | class | Returns the square root of the input density value. |
| [SumDensity](SumDensity.md) | class | Returns the sum of two input densities. |
| [SwitchDensity](SwitchDensity.md) | class | Selects between densities based on a discrete switch value. |
| [SwitchStateDensity](SwitchStateDensity.md) | class | Selects a density based on the current generation pipeline state index. |
| [TerrainDensity](TerrainDensity.md) | class | Combines noise layers to produce terrain-shaped density. |
| [VectorWarpDensity](VectorWarpDensity.md) | class | Warps sampling coordinates using a vector provider. |
| [XOverrideDensity](XOverrideDensity.md) | class | Overrides the X coordinate of the sampling position with a constant. |
| [XValueDensity](XValueDensity.md) | class | Returns the X coordinate of the sampling position as density. |
| [YOverrideDensity](YOverrideDensity.md) | class | Overrides the Y coordinate of the sampling position with a constant. |
| [YSampledDensity](YSampledDensity.md) | class | Evaluates the input density at a fixed or computed Y coordinate. |
| [YValueDensity](YValueDensity.md) | class | Returns the Y coordinate of the sampling position as density. |
| [ZOverrideDensity](ZOverrideDensity.md) | class | Overrides the Z coordinate of the sampling position with a constant. |
| [ZValueDensity](ZValueDensity.md) | class | Returns the Z coordinate of the sampling position as density. |
