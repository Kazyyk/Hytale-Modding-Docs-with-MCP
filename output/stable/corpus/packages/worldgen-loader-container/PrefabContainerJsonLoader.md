# PrefabContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: JsonLoader

Loads `PrefabContainer` biome prefab placement definitions from JSON. Each entry associates a weighted prefab map with a pattern generator and optional environment override.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

- load() | PrefabContainer | Returns a `PrefabContainer` with all prefab entries.
- loadEntries() | PrefabContainer.PrefabContainerEntry[] | Loads the `Entries` array of prefab container entries.

## Inner Types

### PrefabContainerEntryJsonLoader

*static class*

Loads individual prefab entries with weighted prefab maps, pattern generators, and environment overrides.

### Constants

*interface*

JSON key constants: `Entries`, `Prefab`, `Weight`, `Pattern`, `Environment`.

Also in this package: Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CoverContainerEntryJsonLoader, CoverContainerJsonLoader, DefaultEnvironmentContainerEntryLoader, DefaultTintContainerEntryJsonLoader, DynamicLayerEntryJsonLoader, DynamicLayerJsonLoader, EnvironmentContainerEntryJsonLoader, EnvironmentContainerJsonLoader, FadeContainerJsonLoader, LayerContainerJsonLoader, LayerEntryJsonLoader, PrefabContainerEntryJsonLoader (and 8 more)

Complete API:
  public PrefabContainer load()
  protected PrefabContainer.PrefabContainerEntry[] loadEntries()

Fields:
private final FileLoadingContext context
