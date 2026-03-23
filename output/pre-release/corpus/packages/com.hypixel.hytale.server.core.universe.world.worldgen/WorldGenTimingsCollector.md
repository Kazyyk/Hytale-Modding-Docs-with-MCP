# WorldGenTimingsCollector

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen

public class WorldGenTimingsCollector

Collects and reports timing metrics for world generation phases: zone/biome resolution, preparation, block generation, cave generation, and prefab generation. Uses atomic counters for thread safety. Skips warmup period (first 100 chunks).

Also in this package: EntityWrapperEntry, GeneratedBlockChunk, GeneratedBlockStateChunk, GeneratedChunk, GeneratedChunkSection, GeneratedEntityChunk, IBenchmarkableWorldGen, IWorldGen, IWorldGenBenchmark, ValidatableWorldGen, WorldGenLoadException

Complete API:
  public double reportChunk(long nanos)
  public double reportZoneBiomeResult(long nanos)
  public double reportPrepare(long nanos)
  public double reportBlocksGeneration(long nanos)
  public double reportCaveGeneration(long nanos)
  public double reportPrefabGeneration(long nanos)
  public double getWarmupValue()
  public double zoneBiomeResult()
  public double prepare()
  public double blocksGeneration()
  public double caveGeneration()
  public double prefabGeneration()
  public long getChunkCounter()
  public double getChunkTime()
  public int getQueueLength()
  public int getGeneratingCount()
  public String toString()
  protected double get(int index)
  protected double addAndGet(int index, long nanos)
  protected static double getAvgSeconds(long nanos, long count)

Fields:
public static final MetricsRegistry<WorldGenTimingsCollector> METRICS_REGISTRY
private static final double NANOS_TO_SECONDS
private static final int WARMUP
private static final double WARMUP_VALUE
private static final int CHUNKS
private static final int ZONE_BIOME_RESULT
private static final int PREPARE
private static final int BLOCKS
private static final int CAVES
private static final int PREFABS
private final AtomicLong chunkCounter
private final AtomicLongArray times
private final AtomicLongArray counts
private final ThreadPoolExecutor threadPoolExecutor
