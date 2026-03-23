# LayerContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class LayerContainer

Container for terrain layer generation. Defines a filling block, static layers (fixed height ranges), and dynamic layers (noise-offset height ranges). Each layer has conditional entries with block arrays.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, FadeContainer, Layer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry, UniquePrefabContainer (and 2 more)

Complete API:
  public BlockFluidEntry getFilling()
  public int getFillingEnvironment()
  public LayerContainer.StaticLayer[] getStaticLayers()
  public LayerContainer.DynamicLayer[] getDynamicLayers()
  public BlockFluidEntry getTopBlockAt(int seed, int x, int z)
  public String toString()

Fields:
protected final BlockFluidEntry filling
protected final int fillingEnvironment
protected final LayerContainer.StaticLayer[] staticLayers
protected final LayerContainer.DynamicLayer[] dynamicLayers
