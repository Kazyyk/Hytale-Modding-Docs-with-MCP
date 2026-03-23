# TerrainStage.ColumnData

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.stages

private class TerrainStage.ColumnData

Computes per-voxel depth and space metrics for a single (x, z) column during material generation in TerrainStage. Scans from top to bottom to compute `depthIntoFloor` (consecutive solid voxels from surface) and `spaceAboveFloor`, then from bottom to top for `depthIntoCeiling` and `spaceBelowCeiling`. These metrics feed into the `MaterialProvider.Context` for material selection.

## Fields

- int worldX
- int worldZ
- MaterialProvider<Material> materialProvider
- int topExclusive
- int bottom
- int arrayLength
- int[] depthIntoFloor
- int[] spaceBelowCeiling
- int[] depthIntoCeiling
- int[] spaceAboveFloor
- int top
- FloatContainer3d densityBuffer

## Constructors

- ColumnData(int bottom, int topExclusive, @Nonnull FloatContainer3d densityBuffer)

## Methods

- void resolve(int worldX, int worldZ, @Nonnull MaterialProvider<Material> materialProvider)

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeDistanceStage, BiomeStage, BiomeWeights, Context, Entry, EnvironmentStage, PropStage, Stage, TerrainStage, TintStage

Complete API:
  void resolve(int worldX, int worldZ, MaterialProvider<Material> materialProvider)

Fields:
int worldX
int worldZ
MaterialProvider<Material> materialProvider
int topExclusive
int bottom
int arrayLength
int[] depthIntoFloor
int[] spaceBelowCeiling
int[] depthIntoCeiling
int[] spaceAboveFloor
int top
FloatContainer3d densityBuffer
