# BiomeMaskJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.biome | Extends: JsonLoader<SeedStringResource, IIntCondition>

public class BiomeMaskJsonLoader extends JsonLoader<SeedStringResource, IIntCondition>

Loads a biome mask condition from JSON. Biome masks define which biome IDs are included or excluded, producing an `IIntCondition` that tests whether a given biome ID passes the mask. Supports cached file-based masks via `FileMaskCache`.

Also in this package: BiomeInterpolationJsonLoader, BiomeJsonLoader, BiomePatternGeneratorJsonLoader, BiomePatternGeneratorSizeModifierProvider, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CustomBiomeGeneratorJsonLoader, CustomBiomeJsonLoader, ISizeModifierProvider, LoadedPointGeneratorDistanceFunction, TileBiomeJsonLoader

Complete API:
  public IIntCondition load()
  protected IIntCondition loadMask()
  protected void parseRule(String rule, IntConditionBuilder builder)
  protected JsonElement loadFileConstructor(String filePath)
  private static boolean collectBiomes(FileContext.Registry<BiomeFileContext> registry, String biomeName, IntConditionBuilder builder)
  private static ZoneFileContext parseZone(String rule, int marker, ZoneFileContext context)
  private static BiomeFileContext.Type parseBiomeType(String rule, int marker)
  private static String parseBiomeName(String rule, int zoneMarker, int typeMarker)
  private static String getDisplayName(BiomeFileContext.Type type)

Fields:
private final ZoneFileContext zoneContext
private String fileName
