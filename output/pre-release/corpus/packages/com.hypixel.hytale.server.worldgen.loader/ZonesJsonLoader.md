# ZonesJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: null

public class ZonesJsonLoader extends Loader<SeedStringResource, Zone[]>

## Fields

- protected final FileLoadingContext loadingContext
- FileContext.Registry<ZoneFileContext> zoneRegistry
- int index
- Zone[] zones
- ZoneFileContext zoneContext
- JsonObject zoneJson
- Zone zone
- String PATH_ZONES
- String FILE_ZONE_MAIN_FILE
- String ERROR_LOADING_ZONE

## Constructors

- public ZonesJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, FileLoadingContext loadingContext)

## Methods

- public Zone[] load()
- throw new Error(String.format("Error while loading zone \"%s\" for world generator from file.", zoneContext.getPath()

## Inner Types

- `ZonesJsonLoader.Constants`

Also in this package: AssetFileSystem, ChunkGeneratorJsonLoader, Constants, Constants, MaskProviderJsonLoader, PrefabPathCollector, Resource, WorldGenPrefabLoader, WorldGenPrefabSupplier

Complete API:
  public Zone[] load()

Fields:
protected final FileLoadingContext loadingContext
