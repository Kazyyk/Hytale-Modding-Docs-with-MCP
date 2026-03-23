# ZonesJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: Loader

Loads all zones for a world generator. Iterates the zone registry from `FileLoadingContext`, loading each zone's `Zone.json` file via `ZoneJsonLoader`, and returns the complete `Zone[]` array.

## Hierarchy

- **Extends:** `Loader`

## Methods

- load() | Zone[] | Iterates the zone file context registry and loads each zone from its `Zone.json` file.

## Inner Types

### Constants

*interface*

Constants: `PATH_ZONES` = `Zones`, `FILE_ZONE_MAIN_FILE` = `Zone.json`.

Also in this package: AssetFileSystem, ChunkGeneratorJsonLoader, Constants, Constants, MaskProviderJsonLoader, PrefabPathCollector, Resource, WorldGenPrefabLoader, WorldGenPrefabSupplier

Complete API:
  public Zone[] load()

Fields:
protected final FileLoadingContext loadingContext
