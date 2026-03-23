# CoverContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: JsonLoader

Loads `CoverContainer` biome cover definitions from JSON. Parses cover block types, weights, offsets, noise masks, height thresholds, parent block filters, and on-water flags from the JSON configuration.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

- load() | CoverContainer | Parses the JSON element and returns a fully constructed `CoverContainer` with all cover entries.

## Inner Types

### CoverContainerEntryJsonLoader

*static class*

Inner loader for individual cover container entries. Loads block type arrays, weighted maps, density, noise masks, height conditions, parent masks, and on-water settings.

### Constants

*interface*

JSON key constants: `Type`, `Weight`, `Density`, `NoiseMask`, `HeightThreshold`, `Offset`, `Parent`, `OnWater`.

Also in this package: Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CoverContainerEntryJsonLoader, DefaultEnvironmentContainerEntryLoader, DefaultTintContainerEntryJsonLoader, DynamicLayerEntryJsonLoader, DynamicLayerJsonLoader, EnvironmentContainerEntryJsonLoader, EnvironmentContainerJsonLoader, FadeContainerJsonLoader, LayerContainerJsonLoader, LayerEntryJsonLoader, PrefabContainerEntryJsonLoader, PrefabContainerJsonLoader (and 8 more)

Complete API:
  public CoverContainer load()

Fields:
protected final BiomeFileContext biomeContext
