# PrefabPopulator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk.populator

public class PrefabPopulator

Populates a chunk with prefab structures from biome definitions. Operates in several phases:

1. **Collect biomes** -- gathers all biomes that intersect the chunk (including neighboring regions within the maximum zone extent).
2. **Collect prefab candidates** -- for each biome with a `PrefabContainer`, uses the grid generator to find potential prefab positions, validates biome matching, noise density, height conditions, parent block conditions, and unique prefab exclusion ranges.
3. **Resolve conflicts** -- detects overlapping prefab bounding boxes and removes lower-priority candidates.
4. **Generate** -- pastes surviving candidates and any unique prefabs via `PrefabPasteUtil`.

Uses a thread-local `FastRandom` seeded from world seed and biome ID for deterministic placement.

## Methods

- public static void populate(int seed, @Nonnull ChunkGeneratorExecution execution)
- public void run(int seed, @Nonnull ChunkGeneratorExecution execution)

Also in this package: BlockPopulator, Candidate, CavePopulator, LayerPopulator, WaterPopulator

Complete API:
  public static void populate(int seed, ChunkGeneratorExecution execution)
  public void run(int seed, ChunkGeneratorExecution execution)
  private void collectBiomes(int seed, ChunkGeneratorExecution execution)
  private void collectPrefabs(int seed, ChunkGeneratorExecution execution)
  private void generatePrefabs(int seed, ChunkGeneratorExecution execution)
  private void generateUniquePrefabs(int seed, ChunkGeneratorExecution execution)
  private void collectBiome(Biome biome)
  private void collectPrefab(double px, double pz)
  private void collectConflicts()
  private static boolean intersects(int minX1, int minY1, int minZ1, int maxX1, int maxY1, int maxZ1, int minX2, int minY2, int minZ2, int maxX2, int maxY2, int maxZ2)
  private static boolean isWithinUniquePrefabExclusionRange(int x, int z, PrefabPatternGenerator generator, UniquePrefabContainer.UniquePrefabEntry[] uniquePrefabs)
  private static int getHeight(int seed, int x, int z, ChunkGeneratorExecution execution, Biome biome, PrefabPatternGenerator prefabPatternGenerator, Random random)
  private static PrefabRotation generateRotation(int x, int z, Random random, PrefabPatternGenerator patternGenerator)
  private static void generatePrefabAt(int seed, int x, int z, int height, ChunkGeneratorExecution execution, WorldGenPrefabSupplier supplier, BlockMaskCondition configuration, PrefabRotation rotation, ICoordinateRndCondition heightCondition, int environmentId, boolean fitHeightmap, boolean submerge)
  private static boolean isMatchingBiome(Biome biome, ZoneBiomeResult zoneAndBiomeResult)
  private static boolean isMatchingChunkBounds(int x, int z, ChunkGeneratorExecution execution, PrefabRotation rotation, IChunkBounds bounds)
  private static boolean isMatchingChunkBounds(ChunkGeneratorExecution execution, int lowBoundX, int lowBoundZ, int highBoundX, int highBoundZ)
  private static boolean isMatchingHeight(int seed, int x, int z, int y, Random random, PrefabPatternGenerator prefabPatternGenerator)
  private static boolean isMatchingNoiseDensity(int seed, int x, int z, PrefabPatternGenerator prefabPatternGenerator)
  private static boolean isMatchingParentBlock(int seed, int x, int z, int y, Random random, ZoneBiomeResult zoneAndBiomeResult, PrefabContainer.PrefabContainerEntry containerEntry)
  private static BlockFluidEntry getCoverInGroundAt(int seed, int x, int z, int y, Random random, Biome biome)
  private static boolean isMatchingCover(int seed, int x, int z, int y, Random random, CoverContainer.CoverContainerEntry coverContainerEntry)

Fields:
private static final UniquePrefabContainer.UniquePrefabEntry[] EMPTY_UNIQUE_PREFABS
private static final int BIOME_SAMPLE_STEP_SIZE
private int worldSeed
private long prefabSeed
private int minPriority
private Biome biome
private PrefabContainer.PrefabContainerEntry entry
private ChunkGeneratorExecution execution
private UniquePrefabContainer.UniquePrefabEntry[] uniquePrefabs
private final FastRandom random
private final ObjectArrayList<Biome> biomes
private final ObjectArrayList<PrefabPopulator.Candidate> prefabs
private final BitSet conflicts
