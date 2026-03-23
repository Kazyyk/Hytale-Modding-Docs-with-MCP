# EnvironmentContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class EnvironmentContainer

Container mapping world coordinates to environment IDs using noise-based weighted maps and coordinate conditions. Has a default entry and an ordered list of conditional entries.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainerEntry, FadeContainer, Layer, LayerContainer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry, UniquePrefabContainer (and 2 more)

Complete API:
  public int getEnvironmentAt(int seed, int x, int z)
  public String toString()

Fields:
protected final EnvironmentContainer.DefaultEnvironmentContainerEntry defaultEntry
protected final EnvironmentContainer.EnvironmentContainerEntry[] entries
