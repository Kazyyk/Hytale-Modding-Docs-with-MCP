# UniquePrefabContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: JsonLoader

Loads `UniquePrefabContainer` zone-level unique prefab definitions from JSON. Unique prefabs are named, categorized structures placed once per zone using configuration-driven placement rules.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

- load() | UniquePrefabContainer | Returns a `UniquePrefabContainer` with an array of `UniquePrefabGenerator` instances.

## Inner Types

### UniquePrefabGeneratorJsonLoader

*static class*

Loads individual unique prefab generators with name, category, weighted prefab map, and unique placement configuration.

### Constants

*interface*

JSON key constants: `Entries`, `Config`, `Prefab`, `Weights`, `Name`.

Also in this package: Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CoverContainerEntryJsonLoader, CoverContainerJsonLoader, DefaultEnvironmentContainerEntryLoader, DefaultTintContainerEntryJsonLoader, DynamicLayerEntryJsonLoader, DynamicLayerJsonLoader, EnvironmentContainerEntryJsonLoader, EnvironmentContainerJsonLoader, FadeContainerJsonLoader, LayerContainerJsonLoader, LayerEntryJsonLoader, PrefabContainerEntryJsonLoader (and 8 more)

Complete API:
  public UniquePrefabContainer load()

Fields:
public static final UniquePrefabGenerator[] EMPTY_GENERATORS
protected final ZoneFileContext zoneContext
