# TintContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class TintContainer

Maps world coordinates to tint color values during generation. Contains a default entry and a list of conditional entries. Evaluates entries in order; the first matching entry's noise-driven weighted map determines the tint color.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, FadeContainer, Layer, LayerContainer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainerEntry, UniquePrefabContainer (and 2 more)

Complete API:
  public int getTintColorAt(int seed, int x, int z)
  public String toString()

Fields:
public static final ListPool<TintContainer.TintContainerEntry> ENTRY_POOL
private final TintContainer.DefaultTintContainerEntry defaultEntry
private final List<TintContainer.TintContainerEntry> entries
