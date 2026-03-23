# UniquePrefabCache

Type: class | Package: com.hypixel.hytale.server.worldgen.cache

public class UniquePrefabCache

Cache for unique prefab entry arrays, keyed by world seed. Used to ensure unique prefab structures are not duplicated during generation.

Also in this package: BiomeCountFunction, BiomeCountResult, CaveFunction, CaveGeneratorCache, ChunkGeneratorCache, CoordinateCache, CoordinateKey, CoreDataCacheEntry, ExtendedCoordinateCache, ExtendedCoordinateKey, ExtendedCoordinateObjectFunction, ExtendedCoordinateRemovalListener, HeightFunction, HeightNoiseFunction, InterpolatedBiomeCountList, UniquePrefabFunction, ZoneBiomeResultFunction

Complete API:
  public UniquePrefabContainer.UniquePrefabEntry[] get(int seed)

Fields:
protected final SizedTimeoutCache<Integer,UniquePrefabContainer.UniquePrefabEntry[]> cache
