# EnvironmentContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class EnvironmentContainer

Maps world coordinates to environment IDs during generation. Contains a default entry and an array of conditional entries. Evaluates entries in order; the first matching entry's noise-driven weighted map determines the environment ID.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainerEntry, FadeContainer, Layer, LayerContainer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry, UniquePrefabContainer (and 2 more)

Complete API:
  public int getEnvironmentAt(int seed, int x, int z)
  public String toString()

Fields:
public static final ListPool<EnvironmentContainer.EnvironmentContainerEntry> ENTRY_POOL
protected final EnvironmentContainer.DefaultEnvironmentContainerEntry defaultEntry
protected final EnvironmentContainer.EnvironmentContainerEntry[] entries
