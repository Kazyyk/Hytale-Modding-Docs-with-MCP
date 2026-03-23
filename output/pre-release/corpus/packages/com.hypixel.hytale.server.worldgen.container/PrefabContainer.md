# PrefabContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class PrefabContainer

Holds an array of prefab entries for a biome. Each entry contains a weighted map of `WorldGenPrefabSupplier` instances, a `PrefabPatternGenerator` controlling placement density and positioning, and an environment ID.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, FadeContainer, Layer, LayerContainer, LayerEntry, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry, UniquePrefabContainer (and 2 more)

Complete API:
  public PrefabContainer.PrefabContainerEntry[] getEntries()
  public int getMaxSize()
  public String toString()
  private static int getMaxSize(PrefabContainer.PrefabContainerEntry[] entries)

Fields:
public static final ListPool<PrefabContainer.PrefabContainerEntry> ENTRY_POOL
private final PrefabContainer.PrefabContainerEntry[] entries
private final int maxSize
