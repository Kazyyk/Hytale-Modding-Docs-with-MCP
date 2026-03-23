# ExtendedCoordinateCache

Type: class | Package: com.hypixel.hytale.server.worldgen.cache

public class ExtendedCoordinateCache

Extended coordinate cache adding a generic key parameter `K` in addition to seed and coordinates. Used by `CaveGeneratorCache` for cave-type-specific caching.

Known subclasses: CaveGeneratorCache

Also in this package: BiomeCountFunction, BiomeCountResult, CaveFunction, CaveGeneratorCache, ChunkGeneratorCache, CoordinateCache, CoordinateKey, CoreDataCacheEntry, ExtendedCoordinateKey, ExtendedCoordinateObjectFunction, ExtendedCoordinateRemovalListener, HeightFunction, HeightNoiseFunction, InterpolatedBiomeCountList, UniquePrefabCache, UniquePrefabFunction, ZoneBiomeResultFunction

Complete API:
  public T get(K k, int seed, int x, int y)
  protected abstract ExtendedCoordinateCache.ExtendedCoordinateKey<K> localKey()

Fields:
private final SizedTimeoutCache<ExtendedCoordinateCache.ExtendedCoordinateKey<K>,T> cache
private final ExtendedCoordinateCache.ExtendedCoordinateObjectFunction<K,T> loader
private final ObjectPool<ExtendedCoordinateCache.ExtendedCoordinateKey<K>> vectorPool
