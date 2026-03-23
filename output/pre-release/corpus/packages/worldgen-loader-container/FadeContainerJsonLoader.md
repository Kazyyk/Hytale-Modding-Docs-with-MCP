# FadeContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: JsonLoader

Loads `FadeContainer` zone-border fade configuration from JSON. Controls terrain height blending at zone boundaries by loading fade start/length and terrain start/length parameters.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

- load() | FadeContainer | Returns a `FadeContainer` with fade start, fade length, terrain start, terrain length, and fade heightmap values.
- loadFadeStart() | double | Reads `FadeStart` from JSON, defaults to 0.0.
- loadFadeLength() | double | Reads `FadeLength` from JSON, defaults to 0.0.
- loadTerrainStart() | double | Reads `TerrainStart` from JSON, defaults to 0.0.
- loadTerrainLength() | double | Reads `TerrainLength` from JSON, defaults to 0.0.
- loadFadeHeightmap() | double | Reads `FadeHeightmap` from JSON, defaults to `Double.NEGATIVE_INFINITY`.

## Inner Types

### Constants

*interface*

JSON key constants: `FadeStart`, `FadeLength`, `TerrainStart`, `TerrainLength`, `FadeHeightmap`.

Also in this package: Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CoverContainerEntryJsonLoader, CoverContainerJsonLoader, DefaultEnvironmentContainerEntryLoader, DefaultTintContainerEntryJsonLoader, DynamicLayerEntryJsonLoader, DynamicLayerJsonLoader, EnvironmentContainerEntryJsonLoader, EnvironmentContainerJsonLoader, LayerContainerJsonLoader, LayerEntryJsonLoader, PrefabContainerEntryJsonLoader, PrefabContainerJsonLoader (and 8 more)

Complete API:
  public FadeContainer load()
  protected double loadFadeStart()
  protected double loadFadeLength()
  protected double loadTerrainStart()
  protected double loadTerrainLength()
  protected double loadFadeHeightmap()
