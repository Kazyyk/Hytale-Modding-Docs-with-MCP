# LayerContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: com.hypixel.hytale.procedurallib.json.JsonLoader

public class LayerContainerJsonLoader extends JsonLoader<SeedStringResource, LayerContainer>

JSON loader that parses layer container configuration for a biome. Loads the default filling block, static layers (with min/max Y ranges), and dynamic layers (with noise-driven offsets). Supports modify events via `ModifyEvents.BiomeStaticLayers`.

Also in this package: Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CoverContainerEntryJsonLoader, CoverContainerJsonLoader, DefaultEnvironmentContainerEntryLoader, DefaultTintContainerEntryJsonLoader, DynamicLayerEntryJsonLoader, DynamicLayerJsonLoader, EnvironmentContainerEntryJsonLoader, EnvironmentContainerJsonLoader, FadeContainerJsonLoader, LayerEntryJsonLoader, PrefabContainerEntryJsonLoader, PrefabContainerJsonLoader (and 8 more)

Complete API:
  public LayerContainer load()
  protected int loadDefault()
  protected int loadDefaultEnvironment()
  protected LayerContainer.StaticLayer[] loadStaticLayers()
  protected LayerContainer.DynamicLayer[] loadDynamicLayers()

Fields:
protected final BiomeFileContext biomeContext
