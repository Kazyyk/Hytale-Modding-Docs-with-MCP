# InterpolatedBiomeCountList

Type: class | Package: com.hypixel.hytale.server.worldgen.cache

public class InterpolatedBiomeCountList

Accumulates biome sample counts and height data for biome interpolation. Tracks a center biome and surrounding biomes within interpolation radius, averaging height noise across samples.

Also in this package: BiomeCountFunction, BiomeCountResult, CaveFunction, CaveGeneratorCache, ChunkGeneratorCache, CoordinateCache, CoordinateKey, CoreDataCacheEntry, ExtendedCoordinateCache, ExtendedCoordinateKey, ExtendedCoordinateObjectFunction, ExtendedCoordinateRemovalListener, HeightFunction, HeightNoiseFunction, UniquePrefabCache, UniquePrefabFunction, ZoneBiomeResultFunction

Complete API:
  public InterpolatedBiomeCountList.BiomeCountResult get(Biome biome)
  public InterpolatedBiomeCountList.BiomeCountResult get(int index)
  public void setCenter(ZoneBiomeResult result)
  public void add(ZoneBiomeResult result, int distance2)
  public IntList getBiomeIds()
  public String toString()

Fields:
private final Int2ObjectMap<InterpolatedBiomeCountList.BiomeCountResult> results
private final IntList biomeIds
private Biome center
