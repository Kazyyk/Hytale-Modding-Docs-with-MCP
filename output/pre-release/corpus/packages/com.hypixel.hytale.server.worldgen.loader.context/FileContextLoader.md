# FileContextLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.context

public class FileContextLoader

Loads the full world generation file context hierarchy. Scans the `Zones` directory for valid zone folders (containing `Zone.json`), filters by required zone names, creates `ZoneFileContext` instances, discovers biome files by type, and loads prefab categories from `PrefabCategories.json`.

Also in this package: BiomeFileContext, CaveFileContext, Constants, Constants, Constants, Constants, FileContext, FileLoadingContext, Registry, RootContext, Type, ZoneFileContext

Complete API:
  public FileLoadingContext load()
  protected static void loadPrefabCategories(Path folder, FileLoadingContext context)
  protected static ZoneFileContext loadZoneContext(String name, Path folder, FileLoadingContext context)
  protected static AssetPath getDisabledFilePath(AssetPath path)
  protected static boolean isValidZoneFile(AssetPath path)
  protected static boolean isValidBiomeFile(AssetPath path)
  protected static void validateZones(FileLoadingContext context, Set<String> zoneRequirement)
  private static String parseName(AssetPath path, BiomeFileContext.Type type)

Fields:
private static final Comparator<AssetPath> ZONES_ORDER
private static final Comparator<AssetPath> BIOME_ORDER
private static final UnaryOperator<AssetPath> DISABLED_FILE
private static final Predicate<AssetPath> ZONE_FILE_MATCHER
private static final Predicate<AssetPath> BIOME_FILE_MATCHER
private final String name
private final Path dataFolder
private final Set<String> zoneRequirement
