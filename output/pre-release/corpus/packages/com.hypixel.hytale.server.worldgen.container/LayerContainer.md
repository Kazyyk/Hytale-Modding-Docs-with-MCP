# LayerContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class LayerContainer

Defines terrain layer composition for a biome: a filling block, static layers (with fixed Y ranges), and dynamic layers (with noise-driven offsets). Each layer contains noise-driven block arrays and map conditions controlling when they apply.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, FadeContainer, Layer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry, UniquePrefabContainer (and 2 more)

Complete API:
  public BlockFluidEntry getFilling()
  public int getFillingEnvironment()
  public LayerContainer.StaticLayer[] getStaticLayers()
  public LayerContainer.DynamicLayer[] getDynamicLayers()
  public BlockFluidEntry getTopBlockAt(int seed, int x, int z)
  public String toString()

Fields:
public static final ListPool<LayerContainer.StaticLayer> STATIC_POOL
public static final ListPool<LayerContainer.DynamicLayer> DYNAMIC_POOL
protected final BlockFluidEntry filling
protected final int fillingEnvironment
protected final LayerContainer.StaticLayer[] staticLayers
protected final LayerContainer.DynamicLayer[] dynamicLayers
