# WorldGenPlugin

Type: class | Package: com.hypixel.hytale.builtin.worldgen | Extends: JavaPlugin

public class WorldGenPlugin extends JavaPlugin

## Fields

- private static final String VERSIONS_DIR_NAME
- private static final String MANIFEST_FILENAME
- private static WorldGenPlugin instance

## Constructors

- public WorldGenPlugin(@Nonnull JavaPluginInit init)

## Methods

- public static WorldGenPlugin get()
- @Override protected void setup()
- private static List<WorldGenPlugin.Version> loadVersionPacks(@Nonnull AssetModule assets)
- private static void validateVersion(@Nonnull WorldGenPlugin.Version version, @Nonnull List<WorldGenPlugin.Version> versions)
- @Nullable private static String getWorldConfigName(@Nonnull Path packPath, @Nonnull Path assetPath)
- @Nullable private static PluginManifest loadManifest(@Nonnull Path manifestPath)
- public static Path getVersionsPath()

## Inner Types

- `WorldGenPlugin.Version`

Also in this package: Version

Complete API:
  public static WorldGenPlugin get()
  protected void setup()
  private static List<WorldGenPlugin.Version> loadVersionPacks(AssetModule assets)
  private static void validateVersion(WorldGenPlugin.Version version, List<WorldGenPlugin.Version> versions)
  private static String getWorldConfigName(Path packPath, Path assetPath)
  private static PluginManifest loadManifest(Path manifestPath)
  public static Path getVersionsPath()

Fields:
private static final String VERSIONS_DIR_NAME
private static final String MANIFEST_FILENAME
private static WorldGenPlugin instance
