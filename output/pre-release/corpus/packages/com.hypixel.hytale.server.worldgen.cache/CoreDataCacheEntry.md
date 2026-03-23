# CoreDataCacheEntry

Type: class | Package: com.hypixel.hytale.server.worldgen.cache | Implements: Function<CoreDataCacheEntry, CoreDataCacheEntry>

public class CoreDataCacheEntry implements Function<CoreDataCacheEntry, CoreDataCacheEntry>

Mutable cache entry holding zone biome result, interpolated biome count list, height, and height noise values. Uses sentinel values (-1, NEGATIVE_INFINITY) to indicate uncomputed fields.

Also in this package: BiomeCountFunction, BiomeCountResult, CaveFunction, CaveGeneratorCache, ChunkGeneratorCache, CoordinateCache, CoordinateKey, ExtendedCoordinateCache, ExtendedCoordinateKey, ExtendedCoordinateObjectFunction, ExtendedCoordinateRemovalListener, HeightFunction, HeightNoiseFunction, InterpolatedBiomeCountList, UniquePrefabCache, UniquePrefabFunction, ZoneBiomeResultFunction

Complete API:
  public CoreDataCacheEntry apply(CoreDataCacheEntry coreDataCacheEntry)

Fields:
public static final int NO_HEIGHT
public static final double NO_HEIGHT_NOISE
public final ZoneBiomeResult zoneBiomeResult
public volatile InterpolatedBiomeCountList biomeCountList
public volatile int height
public volatile double heightNoise
