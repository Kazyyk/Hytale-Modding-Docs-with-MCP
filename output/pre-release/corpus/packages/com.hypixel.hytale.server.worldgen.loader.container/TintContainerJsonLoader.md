# TintContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: com.hypixel.hytale.procedurallib.json.JsonLoader

public class TintContainerJsonLoader extends JsonLoader<SeedStringResource, TintContainer>

JSON loader that parses tint container configuration for a biome. Loads a default entry and conditional entries mapping color names/weights to tint color IDs.

Also in this package: Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CoverContainerEntryJsonLoader, CoverContainerJsonLoader, DefaultEnvironmentContainerEntryLoader, DefaultTintContainerEntryJsonLoader, DynamicLayerEntryJsonLoader, DynamicLayerJsonLoader, EnvironmentContainerEntryJsonLoader, EnvironmentContainerJsonLoader, FadeContainerJsonLoader, LayerContainerJsonLoader, LayerEntryJsonLoader, PrefabContainerEntryJsonLoader (and 8 more)

Complete API:
  public TintContainer load()
  protected TintContainer.DefaultTintContainerEntry loadDefault()
  protected List<TintContainer.TintContainerEntry> loadEntries()

Fields:
private final BiomeFileContext biomeContext
