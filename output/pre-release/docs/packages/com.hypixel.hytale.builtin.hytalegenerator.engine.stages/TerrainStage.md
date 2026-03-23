---
title: "TerrainStage"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages.TerrainStage"
api_surface: false
extends: null
implements: ["Stage"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "stages"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.stages`

```java
public class TerrainStage implements Stage
```

A [Stage](Stage.md) that generates terrain density and material data. Reads biome and biome-distance buffers as input and writes a `VoxelBuffer<Material>` output. The two-phase process first computes density values per voxel (blending multiple biome densities weighted by distance), then assigns materials per voxel using the biome's `MaterialProvider` with contextual data including depth-into-floor, space-above-floor, and distance-to-biome-edge. Biome blending uses circle-curve area weighting within a configurable interpolation radius.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [TerrainStage.BiomeWeights](TerrainStage.BiomeWeights.md) | class | Weighted biome entries for density blending |
| [TerrainStage.ColumnData](TerrainStage.ColumnData.md) | class | Per-column depth and space metrics |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `double` | `DEFAULT_BACKGROUND_DENSITY` |
| `public static final` | `double` | `ORIGIN_REACH` |
| `public static final` | `double` | `ORIGIN_REACH_HALF` |
| `public static final` | `double` | `QUARTER_PI` |
| `@Nonnull public static final` | `Class<CountedPixelBuffer>` | `biomeBufferClass` |
| `@Nonnull public static final` | `Class<Integer>` | `biomeClass` |
| `@Nonnull public static final` | `Class<SimplePixelBuffer>` | `biomeDistanceBufferClass` |
| `@Nonnull public static final` | `Class<BiomeDistanceStage.BiomeDistanceEntries>` | `biomeDistanceClass` |
| `@Nonnull public static final` | `Class<VoxelBuffer>` | `materialBufferClass` |
| `@Nonnull public static final` | `Class<Material>` | `materialClass` |
| `@Nonnull private final` | `ParametrizedBufferType` | `biomeInputBufferType` |
| `@Nonnull private final` | `ParametrizedBufferType` | `biomeDistanceInputBufferType` |
| `@Nonnull private final` | `ParametrizedBufferType` | `materialOutputBufferType` |
| `@Nonnull private final` | `Bounds3i` | `inputBounds_bufferGrid` |
| `@Nonnull private final` | `String` | `stageName` |
| `private final` | `int` | `maxInterpolationRadius_voxelGrid` |
| `@Nonnull private final` | `MaterialCache` | `materialCache` |
| `@Nonnull private final` | `WorkerIndexer.Data<FloatContainer3d>` | `densityContainers` |
| `@Nonnull private final` | `WorkerIndexer.Data<WorldStructure>` | `worldStructure_workerdata` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TerrainStage(@Nonnull String stageName, @Nonnull ParametrizedBufferType biomeInputBufferType, @Nonnull ParametrizedBufferType biomeDistanceInputBufferType, @Nonnull ParametrizedBufferType materialOutputBufferType, int maxInterpolationRadius_voxelGrid, @Nonnull MaterialCache materialCache, @Nonnull WorkerIndexer workerIndexer, @Nonnull WorkerIndexer.Data<WorldStructure> worldStructure_workerdata)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `run(@Nonnull Stage.Context context)` |
| `@Nonnull @Override public` | `Map<BufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull @Override public` | `List<BufferType>` | `getOutputTypes()` |
| `@Nonnull @Override public` | `String` | `getName()` |
| `private` | `void` | `generateDensity(@Nonnull FloatContainer3d densityBuffer, @Nonnull PixelBufferView<Integer> biomeSpace, @Nonnull PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, @Nonnull Registry<Biome> biomeRegistry)` |
| `private` | `float` | `getOrGenerateDensity(@Nonnull Vector3i position_voxelGrid, @Nonnull FloatContainer3d densityBuffer, @Nonnull PixelBufferView<Integer> biomeSpace, @Nonnull PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, @Nonnull Registry<Biome> biomeRegistry)` |
| `private` | `float` | `generateDensity(@Nonnull Vector3i position_voxelGrid, @Nonnull PixelBufferView<Integer> biomeSpace, @Nonnull PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, @Nonnull Registry<Biome> biomeRegistry)` |
| `private` | `void` | `generateMaterials(@Nonnull PixelBufferView<Integer> biomeSpace, @Nonnull PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, @Nonnull FloatContainer3d densityBuffer, @Nonnull VoxelBufferView<Material> materialSpace, @Nonnull Registry<Biome> biomeRegistry)` |
| `@Nonnull private static` | `TerrainStage.BiomeWeights` | `createWeights(@Nonnull BiomeDistanceStage.BiomeDistanceEntries distances, int biomeIdAtOrigin, double interpolationRange)` |
| `private static` | `double` | `areaUnderCircleCurve(double maxX)` |
| `private static` | `double` | `areaUnderCircleCurve(double minX, double maxX, double circleRadius)` |
