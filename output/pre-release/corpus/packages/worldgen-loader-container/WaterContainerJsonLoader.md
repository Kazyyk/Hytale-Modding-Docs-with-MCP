# WaterContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: JsonLoader

Loads `WaterContainer` biome water/fluid placement definitions from JSON. Supports legacy `Block`/`Fluid` shorthand and structured `Entries` arrays with min/max height ranges, noise, and noise mask conditions.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

- load() | WaterContainer | Returns a `WaterContainer`. Handles three JSON formats: `Block` key (block-based fluid), `Fluid` key (fluid-based), or `Entries` array.
- loadEntries() | WaterContainer.Entry[] | Loads the structured `Entries` array of water container entries.

## Inner Types

### WaterContainerEntryJsonLoader

*static class*

Loads individual water entries with fluid/block type, min/max height suppliers, and noise mask conditions.

### Constants

*interface*

JSON key constants: `Entries`, `Block`, `Fluid`, `Min`, `MinNoise`, `Max`, `MaxNoise`, `NoiseMask`.

Also in this package: Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CoverContainerEntryJsonLoader, CoverContainerJsonLoader, DefaultEnvironmentContainerEntryLoader, DefaultTintContainerEntryJsonLoader, DynamicLayerEntryJsonLoader, DynamicLayerJsonLoader, EnvironmentContainerEntryJsonLoader, EnvironmentContainerJsonLoader, FadeContainerJsonLoader, LayerContainerJsonLoader, LayerEntryJsonLoader, PrefabContainerEntryJsonLoader (and 8 more)

Complete API:
  public WaterContainer load()

Fields:
private final BiomeFileContext biomeContext
