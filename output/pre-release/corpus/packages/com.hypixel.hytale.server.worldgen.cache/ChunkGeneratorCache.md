# ChunkGeneratorCache

Type: class | Package: com.hypixel.hytale.server.worldgen.cache

public class ChunkGeneratorCache

Primary cache for chunk generation core data. Stores `ZoneBiomeResult`, interpolated biome counts, height values, and height noise. Provides lazy computation of biome counts and heights on cache hits.

Also in this package: BiomeCountFunction, BiomeCountResult, CaveFunction, CaveGeneratorCache, CoordinateCache, CoordinateKey, CoreDataCacheEntry, ExtendedCoordinateCache, ExtendedCoordinateKey, ExtendedCoordinateObjectFunction, ExtendedCoordinateRemovalListener, HeightFunction, HeightNoiseFunction, InterpolatedBiomeCountList, UniquePrefabCache, UniquePrefabFunction, ZoneBiomeResultFunction

Complete API:
  public CoreDataCacheEntry get(int seed, int x, int z)
  public ZoneBiomeResult getZoneBiomeResult(int seed, int x, int z)
  public InterpolatedBiomeCountList getBiomeCountResult(int seed, int x, int z)
  public void putHeight(int seed, int x, int z, int height)
  public int getHeight(int seed, int x, int z)
  public void ensureBiomeCountList(int seed, int x, int z, CoreDataCacheEntry entry)
  public void ensureHeight(int seed, int x, int z, CoreDataCacheEntry entry)
  public void ensureHeightNoise(int seed, int x, int z, CoreDataCacheEntry entry)
  protected final CoordinateCache.CoordinateKey computeKey(CoordinateCache.CoordinateKey key)
  protected final CoreDataCacheEntry computeValue(CoordinateCache.CoordinateKey key)
  protected final void destroyEntry(CoordinateCache.CoordinateKey key, CoreDataCacheEntry value)
  protected static CoordinateCache.CoordinateKey localKey()

Fields:
private static final int CONCURRENCY_LEVEL
private final ChunkGeneratorCache.ZoneBiomeResultFunction zoneBiomeResultFunction
private final ChunkGeneratorCache.BiomeCountFunction biomeCountFunction
private final ChunkGeneratorCache.HeightFunction heightFunction
private final ChunkGeneratorCache.HeightNoiseFunction heightNoiseFunction
private final ObjectPool<CoordinateCache.CoordinateKey> keyPool
private final ConcurrentSizedTimeoutCache<CoordinateCache.CoordinateKey,CoreDataCacheEntry> cache
