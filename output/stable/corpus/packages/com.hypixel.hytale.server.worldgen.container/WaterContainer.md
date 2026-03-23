# WaterContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class WaterContainer

Container for water body generation. Defines entries with block/fluid IDs, min/max height suppliers, and coordinate mask conditions. Provides `getMaxHeight()` to determine the highest water level at a position.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, FadeContainer, Layer, LayerContainer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry (and 2 more)

Complete API:
  public static boolean isValidWaterHeight(int height)
  public boolean hasEntries()
  public WaterContainer.Entry[] getEntries()
  public int getMaxHeight(int seed, int x, int z)

Fields:
public static final int NO_WATER_AT_COORDINATED
private final WaterContainer.Entry[] entries
