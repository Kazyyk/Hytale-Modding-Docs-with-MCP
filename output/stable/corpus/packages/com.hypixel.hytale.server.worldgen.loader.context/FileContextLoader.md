# FileContextLoader

Type: interface | Package: com.hypixel.hytale.server.worldgen.loader.context

public class FileContextLoader

## Fields

- private static final Comparator<AssetPath> ZONES_ORDER
- private static final Comparator<AssetPath> BIOME_ORDER
- private static final UnaryOperator<AssetPath> DISABLED_FILE
- private static final Predicate<AssetPath> ZONE_FILE_MATCHER
- private static final Predicate<AssetPath> BIOME_FILE_MATCHER
- private final Path dataFolder
- private final Set<String> zoneRequirement

## Methods

- @Nonnull public FileLoadingContext load()
- protected static void loadPrefabCategories(@Nonnull Path folder, @Nonnull FileLoadingContext context)
- @Nonnull protected static ZoneFileContext loadZoneContext(String name, @Nonnull Path folder, @Nonnull FileLoadingContext context)
- @Nonnull protected static AssetPath getDisabledFilePath(@Nonnull AssetPath path)
- protected static boolean isValidZoneFile(@Nonnull AssetPath path)
- protected static boolean isValidBiomeFile(@Nonnull AssetPath path)
- protected static void validateZones(@Nonnull FileLoadingContext context, @Nonnull Set<String> zoneRequirement)
- @Nonnull private static String parseName(@Nonnull AssetPath path, @Nonnull BiomeFileContext.Type type)
- public FileContextLoader(Path dataFolder, Set<String> zoneRequirement)

## Inner Types

- `FileContextLoader.Constants`
