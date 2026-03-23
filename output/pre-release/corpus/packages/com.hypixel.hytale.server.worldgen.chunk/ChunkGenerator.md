# ChunkGenerator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk | Implements: com.hypixel.hytale.server.core.universe.world.worldgen.IBenchmarkableWorldGen, com.hypixel.hytale.server.core.universe.world.worldgen.ValidatableWorldGen, com.hypixel.hytale.metrics.MetricProvider, com.hypixel.hytale.server.core.universe.world.worldmap.provider.IWorldMapProvider

public class ChunkGenerator implements IBenchmarkableWorldGen, ValidatableWorldGen, MetricProvider, IWorldMapProvider

Main chunk generation orchestrator. Manages a thread pool, caches for zone/biome results, interpolated biome counts, heights, caves, and unique prefabs. Generates chunks asynchronously by creating `ChunkGeneratorExecution` instances. Computes spawn points from unique prefabs.

Known implementors: FallbackGenerator, StagedChunkGenerator

Also in this package: BlockPriorityChunk, BlockPriorityModifier, ChunkGeneratorExecution, HeightThresholdInterpolator, MaskProvider, ValidationUtil, ZoneBiomeResult

Complete API:
  public ZonePatternProvider getZonePatternProvider()
  public WorldGenTimingsCollector getTimings()
  public IWorldMap getGenerator(World world)
  public Transform[] getSpawnPoints(int seed)
  public ChunkWorldgenBenchmark getBenchmark()
  public Path getDataFolder()
  public CoreDataCacheEntry getCoreData(int seed, int x, int z)
  public ZonePatternGenerator getZonePatternGenerator(int seed)
  public ZoneBiomeResult getZoneBiomeResultAt(int seed, int x, int z)
  public int getHeight(int seed, int x, int z)
  public void putHeight(int seed, int x, int z, int y)
  public InterpolatedBiomeCountList getInterpolatedBiomeCountAt(int seed, int x, int z)
  public Cave getCave(CaveType caveType, int seed, int x, int z)
  public PrefabLoadingCache getPrefabLoadingCache()
  public UniquePrefabContainer.UniquePrefabEntry[] getUniquePrefabs(int seed)
  public CompletableFuture<GeneratedChunk> generate(int seed, long index, int x, int z, LongPredicate stillNeeded)
  public void shutdown()
  public ZoneBiomeResult generateZoneBiomeResultAt(int seed, int x, int z)
  public ZoneBiomeResult generateZoneBiomeResultAt(int seed, int x, int z, ZoneBiomeResult result)
  public void generateInterpolatedBiomeCountAt(int seed, int x, int z, InterpolatedBiomeCountList biomeCountList)
  public int generateLowestThresholdDependent(InterpolatedBiomeCountList biomeCounts)
  public int generateHighestThresholdDependent(InterpolatedBiomeCountList biomeCounts)
  public static float generateInterpolatedThreshold(int seed, int x, int z, int y, InterpolatedBiomeCountList biomeCounts)
  public double generateInterpolatedHeightNoise(InterpolatedBiomeCountList biomeCounts)
  public int generateHeight(int seed, int x, int z)
  public int generateHeightBetween(int seed, int x, int z, IHeightThresholdInterpreter interpreter)
  public Cave generateCave(CaveType caveType, int seed, int x, int z)
  public UniquePrefabContainer.UniquePrefabEntry[] generateUniquePrefabs(int seed)
  protected final void onExecutorShutdown()
  public static ChunkGeneratorResource getResource()
  public boolean isChunkOutsideGeneratableArea(int x, int z)
  public boolean validate()
  public MetricResults toMetricResults()
  public String toString(boolean timings, boolean zonePatternGenerator)
  public String toString()
  private static int getLargestFeatureChunkExtents(ZonePatternProvider zonePatternProvider, int padding)

Fields:
public static final int TINT_INTERPOLATION_RADIUS
private static final int CHUNK_BOUNDS_PADDING
private static final CompletableFuture<GeneratedChunk> NO_CHUNK
private static final ThreadLocal<ChunkGeneratorResource> THREAD_LOCAL
public static final int POOL_SIZE
private final ThreadPoolExecutor executor
private final WorldGenTimingsCollector timings
private final ZonePatternProvider zonePatternProvider
private final ZonePatternGeneratorCache zonePatternGeneratorCache
private final ChunkGeneratorCache generatorCache
private final CaveGeneratorCache caveGeneratorCache
private final PrefabLoadingCache prefabLoadingCache
private final UniquePrefabCache uniquePrefabCache
private final ChunkWorldgenBenchmark benchmark
private final Supplier<GeneratedChunk> generatedChunkSupplier
private final Path dataFolder
private final int minChunkCoord
private final int maxChunkCoord
