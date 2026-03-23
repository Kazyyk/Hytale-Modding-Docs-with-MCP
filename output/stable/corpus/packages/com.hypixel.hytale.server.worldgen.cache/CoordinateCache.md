# CoordinateCache

Type: class | Package: com.hypixel.hytale.server.worldgen.cache

public class CoordinateCache

Abstract base for seed+coordinate-keyed caches. Uses `SizedTimeoutCache` with object pooling for keys. Subclasses implement `compute()` for cache miss loading and `onRemoval()` for cleanup.

Also in this package: BiomeCountFunction, BiomeCountResult, CaveFunction, CaveGeneratorCache, ChunkGeneratorCache, CoordinateKey, CoreDataCacheEntry, ExtendedCoordinateCache, ExtendedCoordinateKey, ExtendedCoordinateObjectFunction, ExtendedCoordinateRemovalListener, HeightFunction, HeightNoiseFunction, InterpolatedBiomeCountList, UniquePrefabCache, UniquePrefabFunction, ZoneBiomeResultFunction

Complete API:
  public T get(int seed, int x, int y)
  protected abstract CoordinateCache.CoordinateKey localKey()
  protected abstract T compute(int var1, int var2, int var3)
  protected abstract void onRemoval(T var1)

Fields:
private final SizedTimeoutCache<CoordinateCache.CoordinateKey,T> cache
private final ObjectPool<CoordinateCache.CoordinateKey> vectorPool
