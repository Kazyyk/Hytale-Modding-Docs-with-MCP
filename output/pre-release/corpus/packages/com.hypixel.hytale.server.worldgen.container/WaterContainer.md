# WaterContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class WaterContainer

Defines water body placement for a biome. Contains entries each specifying a block, fluid, min/max height suppliers, and a mask condition. Provides `getMaxHeight` to find the highest water level at given coordinates.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, FadeContainer, Layer, LayerContainer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry (and 2 more)

Complete API:
  public static boolean isValidWaterHeight(int height)
  public boolean hasEntries()
  public WaterContainer.Entry[] getEntries()
  public int getMaxHeight(int seed, int x, int z)

Fields:
public static final ListPool<WaterContainer.Entry> ENTRY_POOL
public static final int NO_WATER_AT_COORDINATED
private final WaterContainer.Entry[] entries
