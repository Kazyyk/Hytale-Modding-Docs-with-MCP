# CavePopulator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk.populator

public class CavePopulator

Populates a chunk with cave structures. For each zone that has a cave generator, collects entry points from each `CaveType`'s point generator within the chunk's extended bounds (including the maximum cave size buffer). For qualifying entry points that pass biome matching and height threshold checks, generates cave nodes and pastes cave prefabs using `PrefabPasteUtil`.

Uses `CaveBlockPriorityModifier` for cave node carving and standard priority for prefab placement.

## Methods

- public static void populate(int seed, @Nonnull ChunkGeneratorExecution execution)

Also in this package: BlockPopulator, Candidate, LayerPopulator, PrefabPopulator, WaterPopulator

Complete API:
  public static void populate(int seed, ChunkGeneratorExecution execution)
  private static void run(int seed, double dx, double dz, ChunkGeneratorExecution execution, Zone zone, CaveType caveType)
  private static void populate(int seed, ChunkGeneratorExecution execution, Cave cave)
  private static void populateCaveNode(int seed, ChunkGeneratorExecution execution, Cave cave, CaveNode caveNode, Random random)
  private static void populatePrefab(int seed, int environment, ChunkGeneratorExecution execution, Cave cave, CaveNode node, CavePrefab prefab)
  private static void generatePrefabAt(int seed, int x, int z, int y, int environment, ChunkGeneratorExecution execution, Cave cave, CaveNode node, BlockMaskCondition configuration, WorldGenPrefabSupplier supplier, PrefabRotation rotation)
  private static boolean isMatchingHeightThreshold(int seed, int x, int z, ChunkGenerator chunkGenerator, CaveType caveType)
