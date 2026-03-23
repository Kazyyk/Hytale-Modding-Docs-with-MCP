# BiomeDistanceStage.BiomeDistanceCounter

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.stages

private static class BiomeDistanceStage.BiomeDistanceCounter

Accumulates the closest distance to each biome during the BiomeDistanceStage scan. Maintains a list of BiomeDistanceStage.BiomeDistanceEntry objects and a cached last-accessed entry for fast repeated lookups of the same biome.

## Fields

- @Nonnull final List<BiomeDistanceStage.BiomeDistanceEntry> entries
- @Nullable BiomeDistanceStage.BiomeDistanceEntry cachedEntry

## Methods

- boolean isCloserThanCounted(int biomeId, double distance_voxelGrid)
- void accountFor(int biomeId, double distance_voxelGrid)

Also in this package: BiomeDistanceEntries, BiomeDistanceEntry, BiomeDistanceStage, BiomeStage, BiomeWeights, ColumnData, Context, Entry, EnvironmentStage, PropStage, Stage, TerrainStage, TintStage

Complete API:
  boolean isCloserThanCounted(int biomeId, double distance_voxelGrid)
  void accountFor(int biomeId, double distance_voxelGrid)

Fields:
final List<BiomeDistanceStage.BiomeDistanceEntry> entries
BiomeDistanceStage.BiomeDistanceEntry cachedEntry
