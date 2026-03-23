# PrefabContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class PrefabContainer

Container for prefab placement during world generation. Each entry links a weighted set of prefab suppliers to a pattern generator and environment ID. Tracks the maximum prefab size across all entries.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, FadeContainer, Layer, LayerContainer, LayerEntry, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry, UniquePrefabContainer (and 2 more)

Complete API:
  public PrefabContainer.PrefabContainerEntry[] getEntries()
  public int getMaxSize()
  public String toString()
  private static int getMaxSize(PrefabContainer.PrefabContainerEntry[] entries)

Fields:
private final PrefabContainer.PrefabContainerEntry[] entries
private final int maxSize
