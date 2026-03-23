# ConstantThicknessLayer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.layers | Extends: Layer

public class ConstantThicknessLayer<V> extends Layer

## Fields

- private final int thickness
- private final MaterialProvider<V> materialProvider

## Methods

- @Override public int getThicknessAt(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling, double distanceTOBiomeEdge)
- @Nullable @Override public MaterialProvider<V> getMaterialProvider()

Also in this package: NoiseThickness, RangedThicknessLayer, WeightedThicknessLayer

Complete API:
  public int getThicknessAt(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling, double distanceTOBiomeEdge)
  public MaterialProvider<V> getMaterialProvider()

Fields:
private final int thickness
private final MaterialProvider<V> materialProvider
