# EnvironmentContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: JsonLoader

Loads `EnvironmentContainer` definitions from JSON. Handles default environment entries and arrays of noise-conditioned environment entries. Maps environment name strings to integer indices via `Environment.getAssetMap()`.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

- load() | EnvironmentContainer | Parses JSON and returns an `EnvironmentContainer` with default and conditional entries.
- loadDefault() | EnvironmentContainer.DefaultEnvironmentContainerEntry | Loads the default environment entry from a `Default` key or the root element.
- loadEntries() | EnvironmentContainer.EnvironmentContainerEntry[] | Loads the `Entries` array of conditional environment entries.

## Inner Types

### EnvironmentContainerEntryJsonLoader

*static class*

Inner loader for individual entries. Loads weighted environment ID mappings, value noise, and noise mask conditions.

### DefaultEnvironmentContainerEntryLoader

*static class*

Extends `EnvironmentContainerEntryJsonLoader` to handle default entries with fallback to environment index 0.

### Constants

*interface*

JSON key constants: `Default`, `Entries`, `Names`, `Weights`, `Noise`, `NoiseMask`.

Also in this package: Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CoverContainerEntryJsonLoader, CoverContainerJsonLoader, DefaultEnvironmentContainerEntryLoader, DefaultTintContainerEntryJsonLoader, DynamicLayerEntryJsonLoader, DynamicLayerJsonLoader, EnvironmentContainerEntryJsonLoader, FadeContainerJsonLoader, LayerContainerJsonLoader, LayerEntryJsonLoader, PrefabContainerEntryJsonLoader, PrefabContainerJsonLoader (and 8 more)

Complete API:
  public EnvironmentContainer load()
  protected EnvironmentContainer.DefaultEnvironmentContainerEntry loadDefault()
  protected EnvironmentContainer.EnvironmentContainerEntry[] loadEntries()
