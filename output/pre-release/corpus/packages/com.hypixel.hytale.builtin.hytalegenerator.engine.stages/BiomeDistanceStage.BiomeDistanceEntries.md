# BiomeDistanceStage.BiomeDistanceEntries

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.stages

public static class BiomeDistanceStage.BiomeDistanceEntries

Container holding a list of BiomeDistanceStage.BiomeDistanceEntry records for a single voxel column. Provides `distanceToClosestOtherBiome` to find the nearest biome boundary distance excluding a specified biome.

## Fields

- @Nonnull public final List<BiomeDistanceStage.BiomeDistanceEntry> entries

## Constructors

- public BiomeDistanceEntries(@Nonnull List<BiomeDistanceStage.BiomeDistanceEntry> entries)

## Methods

- public double distanceToClosestOtherBiome(int thisBiomeId)

Also in this package: BiomeDistanceCounter, BiomeDistanceEntry, BiomeDistanceStage, BiomeStage, BiomeWeights, ColumnData, Context, Entry, EnvironmentStage, PropStage, Stage, TerrainStage, TintStage

Complete API:
  public double distanceToClosestOtherBiome(int thisBiomeId)

Fields:
public final List<BiomeDistanceStage.BiomeDistanceEntry> entries
