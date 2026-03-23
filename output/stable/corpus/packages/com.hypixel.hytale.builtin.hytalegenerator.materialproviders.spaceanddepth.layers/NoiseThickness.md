# NoiseThickness

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.layers | Extends: Layer

public class NoiseThickness<V> extends Layer

## Fields

- private final Density density
- private final MaterialProvider<V> materialProvider
- private final Density.Context rDensityContext

## Methods

- @Override public int getThicknessAt(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling, double distanceToBiomeEdge)
- @Nullable @Override public MaterialProvider<V> getMaterialProvider()

Also in this package: ConstantThicknessLayer, RangedThicknessLayer, WeightedThicknessLayer

Complete API:
  public int getThicknessAt(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling, double distanceToBiomeEdge)
  public MaterialProvider<V> getMaterialProvider()

Fields:
private final Density density
private final MaterialProvider<V> materialProvider
private final Density.Context rDensityContext
