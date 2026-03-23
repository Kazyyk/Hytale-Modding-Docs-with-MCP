# ChunkGenerator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk | Extends: null | Implements: IBenchmarkableWorldGen, ValidatableWorldGen, MetricProvider, IWorldMapProvider

public class ChunkGenerator implements IBenchmarkableWorldGen, ValidatableWorldGen, MetricProvider, IWorldMapProvider

## Fields

- public static final int TINT_INTERPOLATION_RADIUS
- private static final ThreadLocal<ChunkGeneratorResource> THREAD_LOCAL
- public static final int POOL_SIZE
- private final ThreadPoolExecutor executor
- private final WorldGenTimingsCollector timings
- private final ZonePatternProvider zonePatternProvider
- private final ZonePatternGeneratorCache zonePatternGeneratorCache
- private final ChunkGeneratorCache generatorCache
- private final CaveGeneratorCache caveGeneratorCache
- private final PrefabLoadingCache prefabLoadingCache
- private final UniquePrefabCache uniquePrefabCache
- private final ChunkWorldgenBenchmark benchmark
- private final Supplier<GeneratedChunk> generatedChunkSupplier
- private final Path dataFolder
- ArrayList<Transform> list
- Vector3i position
- Vector3d spawnPosition
- Vector3f spawnRotation
- Transform[] array
- Random random
- long start
- GeneratedChunk generatedChunk
- GeneratedBlockChunk blockChunk
- GeneratedBlockStateChunk blockStateChunk
- GeneratedEntityChunk entityChunk
- Holder<ChunkStore>[] sections
- long end
- double time
- double avg
- long time
- ZonePatternGenerator zonePatternGenerator
- ZoneGeneratorResult tempZoneResult
- ZoneGeneratorResult zoneResult
- Biome biome
- double heightThresholdContext
- double heightmapNoise
- FadeContainer fadeContainer
- double factor
- ZoneBiomeResult center
- int radius
- int radius2
- int distance2
- ZoneBiomeResult biomeResult
- InterpolatedBiomeCountList.BiomeCountResult result
- int lowestNonOne
- IntList biomes
- int i
- int id
- int v
- int highestNonZero
- float threshold
- int counter
- InterpolatedBiomeCountList.BiomeCountResult r
- double n
- CoreDataCacheEntry entry
- InterpolatedBiomeCountList biomeCounts
- double heightNoise
- ZoneBiomeResult zoneBiomeResult
- CaveGenerator caveGenerator
- int height
- ArrayList<UniquePrefabContainer.UniquePrefabEntry> entries
- BitSet visited
- Vector2i position
- UniquePrefabContainer.UniquePrefabEntry[] zoneEntries

## Constructors

- public ChunkGenerator(ZonePatternProvider zonePatternProvider, Path dataFolder)

## Methods

- new ChunkWorkerThreadFactory(this, "ChunkGenerator-%d-Worker-%d")
- public ZonePatternProvider getZonePatternProvider()
- public WorldGenTimingsCollector getTimings()
- public IWorldMap getGenerator(World world)
- return new GeneratorChunkWorldMap(this, this.executor)
- public Transform[] getSpawnPoints(int seed)
- public ChunkWorldgenBenchmark getBenchmark()
- public Path getDataFolder()
- public CoreDataCacheEntry getCoreData(int seed, int x, int z)
- public ZonePatternGenerator getZonePatternGenerator(int seed)
- public ZoneBiomeResult getZoneBiomeResultAt(int seed, int x, int z)
- public int getHeight(int seed, int x, int z)
- public void putHeight(int seed, int x, int z, int y)
- public InterpolatedBiomeCountList getInterpolatedBiomeCountAt(int seed, int x, int z)
- public Cave getCave(@Nonnull CaveType caveType, int seed, int x, int z)
- public PrefabLoadingCache getPrefabLoadingCache()
- public UniquePrefabContainer.UniquePrefabEntry[] getUniquePrefabs(int seed)
- public CompletableFuture<GeneratedChunk> generate(int seed, long index, int x, int z, @Nullable LongPredicate stillNeeded)
- new ChunkGeneratorExecution(seed, this, blockChunk, blockStateChunk, entityChunk, sections)
- throw new SkipSentryException(t)
- public void shutdown()
- public ZoneBiomeResult generateZoneBiomeResultAt(int seed, int x, int z)
- public ZoneBiomeResult generateZoneBiomeResultAt(int seed, int x, int z, @Nonnull ZoneBiomeResult result)
- public void generateInterpolatedBiomeCountAt(int seed, int x, int z, @Nonnull InterpolatedBiomeCountList biomeCountList)
- public int generateLowestThresholdDependent(@Nonnull InterpolatedBiomeCountList biomeCounts)
- public int generateHighestThresholdDependent(@Nonnull InterpolatedBiomeCountList biomeCounts)
- public static float generateInterpolatedThreshold(int seed, int x, int z, int y, @Nonnull InterpolatedBiomeCountList biomeCounts)
- public double generateInterpolatedHeightNoise(@Nonnull InterpolatedBiomeCountList biomeCounts)
- public int generateHeight(int seed, int x, int z)
- public int generateHeightBetween(int seed, int x, int z, @Nonnull IHeightThresholdInterpreter interpreter)
- public Cave generateCave(@Nonnull CaveType caveType, int seed, int x, int z)
- public UniquePrefabContainer.UniquePrefabEntry[] generateUniquePrefabs(int seed)
- protected final void onExecutorShutdown()
- public static ChunkGeneratorResource getResource()
- public boolean validate()
- public MetricResults toMetricResults()
- public String toString(boolean timings, boolean zonePatternGenerator)
- public String toString()

## Related Types

- ChunkGeneratorExecution
- ValidationUtil
- ZoneBiomeResult

Known implementors: FallbackGenerator, NStagedChunkGenerator

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
  public boolean validate()
  public MetricResults toMetricResults()
  public String toString(boolean timings, boolean zonePatternGenerator)
  public String toString()

Fields:
public static final int TINT_INTERPOLATION_RADIUS
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
