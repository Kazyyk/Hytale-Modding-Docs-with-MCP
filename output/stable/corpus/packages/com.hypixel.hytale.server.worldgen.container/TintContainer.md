# TintContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class TintContainer

Container for biome tint color generation. Maps coordinates to tint colors using noise-weighted color mappings with coordinate conditions. Has a default entry and conditional entries.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, FadeContainer, Layer, LayerContainer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainerEntry, UniquePrefabContainer (and 2 more)

Complete API:
  public int getTintColorAt(int seed, int x, int z)
  public String toString()

Fields:
private final TintContainer.DefaultTintContainerEntry defaultEntry
private final List<TintContainer.TintContainerEntry> entries
