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
