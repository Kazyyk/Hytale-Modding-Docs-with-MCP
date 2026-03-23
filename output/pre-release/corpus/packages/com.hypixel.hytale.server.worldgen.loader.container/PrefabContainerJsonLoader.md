# PrefabContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: com.hypixel.hytale.procedurallib.json.JsonLoader

public class PrefabContainerJsonLoader extends JsonLoader<SeedStringResource, PrefabContainer>

JSON loader that parses prefab container configuration for a biome. Each entry maps weighted prefab suppliers to a pattern generator and environment ID.

Also in this package: Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CoverContainerEntryJsonLoader, CoverContainerJsonLoader, DefaultEnvironmentContainerEntryLoader, DefaultTintContainerEntryJsonLoader, DynamicLayerEntryJsonLoader, DynamicLayerJsonLoader, EnvironmentContainerEntryJsonLoader, EnvironmentContainerJsonLoader, FadeContainerJsonLoader, LayerContainerJsonLoader, LayerEntryJsonLoader, PrefabContainerEntryJsonLoader (and 8 more)

Complete API:
  public PrefabContainer load()
  protected PrefabContainer.PrefabContainerEntry[] loadEntries()

Fields:
protected final BiomeFileContext biomeContext
protected final FileLoadingContext fileContext
