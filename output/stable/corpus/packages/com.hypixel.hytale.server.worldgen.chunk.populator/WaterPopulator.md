# WaterPopulator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk.populator

public class WaterPopulator

Populates a chunk with water and fluid blocks. For each column, resolves the biome's `WaterContainer` entries and fills the specified Y range with the configured block and fluid IDs. Only overwrites blocks with priority lower than 4 or those marked with the submerge flag. Non-solid blocks (as determined by `FluidTicker.isSolid`) receive the fluid ID.

## Methods

- public static void populate(int seed, @Nonnull ChunkGeneratorExecution execution)

Also in this package: BlockPopulator, Candidate, CavePopulator, LayerPopulator, PrefabPopulator

Complete API:
  public static void populate(int seed, ChunkGeneratorExecution execution)
  private static void submergeColumn(int seed, int cx, int cz, ChunkGeneratorExecution execution)
  private static void submergeBlock(int cx, int y, int cz, int blockId, int fluidId, ChunkGeneratorExecution execution)
