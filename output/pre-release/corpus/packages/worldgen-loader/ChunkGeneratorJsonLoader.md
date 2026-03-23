# ChunkGeneratorJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: Loader

Top-level loader that constructs a `ChunkGenerator` from `World.json`. Orchestrates the full loading sequence: reads world JSON, resolves override data folders, opens the `AssetFileSystem`, loads the mask provider (image or climate), loads the prefab store, loads zone pattern generator, creates the file loading context, loads all zones, and assembles the final `ChunkGenerator`.

## Hierarchy

- **Extends:** `Loader`

## Methods

- load() | ChunkGenerator | Loads World.json, sets up the asset file system, loads mask/zones/prefabs, and returns the constructed `ChunkGenerator`.
- loadOverrideDataFolderPath(JsonObject, Path) | Path | Resolves an optional `OverrideDataFolder` relative to the data folder.
- loadWorldJson(Path) | JsonObject | Reads and parses the World.json file.
- loadWorldSize(JsonObject) | Vector2i | Reads `Width` and `Height` from World.json.
- loadWorldOffset(JsonObject) | Vector2i | Reads `OffsetX` and `OffsetY` from World.json.
- loadMaskProvider(JsonObject, Vector2i, Vector2i) | MaskProvider | Loads the zone mask from image files or climate JSON, with weighted mask selection.
- loadPrefabStore(JsonObject) | PrefabStoreRoot | Reads the `PrefabStore` enum value, defaulting to `DEFAULT`.
- loadZonePatternGenerator(MaskProvider) | ZonePatternProviderJsonLoader | Loads Zones.json and creates the zone pattern provider loader.

## Inner Types

### Constants

*interface*

JSON key constants: `Width`, `Height`, `OffsetX`, `OffsetY`, `Randomizer`, `Masks`, `PrefabStore`, `OverrideDataFolder`, `World.json`, `Zones.json`, `Mask.json`, `Mask.png`.

Also in this package: AssetFileSystem, Constants, Constants, MaskProviderJsonLoader, PrefabPathCollector, Resource, WorldGenPrefabLoader, WorldGenPrefabSupplier, ZonesJsonLoader

Complete API:
  public ChunkGenerator load()
  private Path loadOverrideDataFolderPath(JsonObject worldJson, Path dataFolder)
  protected JsonObject loadWorldJson(Path file)
  protected Vector2i loadWorldSize(JsonObject worldJson)
  protected Vector2i loadWorldOffset(JsonObject worldJson)
  protected MaskProvider loadMaskProvider(JsonObject worldJson, Vector2i worldSize, Vector2i worldOffset)
  protected PrefabStoreRoot loadPrefabStore(JsonObject worldJson)
  protected ZonePatternProviderJsonLoader loadZonePatternGenerator(MaskProvider maskProvider)
  protected static void logAssetPacks(List<AssetPack> packs)

Fields:
private final WorldGenConfig config
