# BiomeInterpolationJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.biome | Extends: JsonLoader<SeedStringResource, BiomeInterpolation>

public class BiomeInterpolationJsonLoader extends JsonLoader<SeedStringResource, BiomeInterpolation>

Loads biome interpolation settings from JSON, configuring how terrain height blends between adjacent biomes including per-biome interpolation override mappings.

Also in this package: BiomeJsonLoader, BiomeMaskJsonLoader, BiomePatternGeneratorJsonLoader, BiomePatternGeneratorSizeModifierProvider, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CustomBiomeGeneratorJsonLoader, CustomBiomeJsonLoader, ISizeModifierProvider, LoadedPointGeneratorDistanceFunction, TileBiomeJsonLoader

Complete API:
  public BiomeInterpolation load()
  protected int loadDefaultRadius()
  protected Int2IntMap loadBiomeRadii(int maxRadius)
  protected void loadBiomeEntry(JsonElement entry, int defaultRadius, Int2IntMap biomeRadii)
  protected IIntCondition loadBiomeMask(JsonObject entry)
  protected static int loadBiomeRadius(JsonObject entry, int maxRadius)
  protected static void addBiomes(IIntCondition mask, int radius, Int2IntMap biomeRadii)

Fields:
protected final ZoneFileContext zoneFileContext
