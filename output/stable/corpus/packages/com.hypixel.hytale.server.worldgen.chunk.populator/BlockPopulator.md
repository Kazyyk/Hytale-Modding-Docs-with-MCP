# BlockPopulator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk.populator

public class BlockPopulator

Populates a chunk with terrain blocks by iterating over each column (32x32), evaluating height thresholds from the interpolator, placing filling blocks from the biome's `LayerContainer`, then applying dynamic/static layers and cover blocks. The `populate` method is the entry point called during world generation.

## Methods

- public static void populate(int seed, @Nonnull ChunkGeneratorExecution execution)

## Inner Classes

- LayerPopulator: Generates static layers (absolute Y ranges) and dynamic layers (relative to surface) for each column.

Also in this package: Candidate, CavePopulator, LayerPopulator, PrefabPopulator, WaterPopulator

Complete API:
  public static void populate(int seed, ChunkGeneratorExecution execution)
  private static void generateBlockColumn(int seed, ChunkGeneratorExecution execution, int cx, int cz, Random random)
  private static void generateCovers(int seed, ChunkGeneratorExecution execution, int cx, int cz, int x, int z, Random random, Biome biome, IntList surfaceBlockList)
  private static boolean isMatchingParentCover(ChunkGeneratorExecution execution, CoverContainer.CoverContainerEntry coverContainerEntry, int cx, int cz, int y, int defaultId, int defaultFluidId)
  private static boolean isMatchingCoverColumn(int seed, CoverContainer.CoverContainerEntry coverContainerEntry, Random random, int x, int z)
  private static boolean isMatchingCoverHeight(int seed, CoverContainer.CoverContainerEntry coverContainerEntry, Random random, int x, int y, int z)
