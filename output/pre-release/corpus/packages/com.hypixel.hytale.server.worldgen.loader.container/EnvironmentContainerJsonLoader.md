# EnvironmentContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: com.hypixel.hytale.procedurallib.json.JsonLoader

public class EnvironmentContainerJsonLoader extends JsonLoader<SeedStringResource, EnvironmentContainer>

JSON loader that parses environment container configuration for a biome. Loads a default entry and an array of conditional entries, each mapping environment names and weights to environment IDs via `Environment.getAssetMap()`. Supports modify events via `ModifyEvents.BiomeEnvironments`.

Also in this package: Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CoverContainerEntryJsonLoader, CoverContainerJsonLoader, DefaultEnvironmentContainerEntryLoader, DefaultTintContainerEntryJsonLoader, DynamicLayerEntryJsonLoader, DynamicLayerJsonLoader, EnvironmentContainerEntryJsonLoader, FadeContainerJsonLoader, LayerContainerJsonLoader, LayerEntryJsonLoader, PrefabContainerEntryJsonLoader, PrefabContainerJsonLoader (and 8 more)

Complete API:
  public EnvironmentContainer load()
  protected EnvironmentContainer.DefaultEnvironmentContainerEntry loadDefault()
  protected EnvironmentContainer.EnvironmentContainerEntry[] loadEntries()

Fields:
protected final BiomeFileContext biomeContext
