# CoverContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class CoverContainer

Holds an array of cover container entries for placing surface cover blocks (e.g. grass, flowers) during world generation. Each entry specifies weighted block choices, a map condition, height condition, parent block condition, cover density, and whether placement is allowed on water.

Also in this package: CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, FadeContainer, Layer, LayerContainer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry, UniquePrefabContainer (and 2 more)

Complete API:
  public CoverContainer.CoverContainerEntry[] getEntries()

Fields:
public static final ListPool<CoverContainer.CoverContainerEntry> ENTY_POOL
protected final CoverContainer.CoverContainerEntry[] entries
