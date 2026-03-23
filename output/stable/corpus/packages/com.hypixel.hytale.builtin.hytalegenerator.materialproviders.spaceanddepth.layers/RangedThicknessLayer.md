# RangedThicknessLayer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.layers | Extends: Layer

public class RangedThicknessLayer<V> extends Layer

## Fields

- private final int min
- private final int max
- private final int delta
- private final SeedGenerator seedGenerator
- private final MaterialProvider<V> materialProvider

## Methods

- @Override public int getThicknessAt(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling, double distanceTOBiomeEdge)
- @Override public MaterialProvider<V> getMaterialProvider()

Also in this package: ConstantThicknessLayer, NoiseThickness, WeightedThicknessLayer

Complete API:
  public int getThicknessAt(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling, double distanceTOBiomeEdge)
  public MaterialProvider<V> getMaterialProvider()

Fields:
private final int min
private final int max
private final int delta
private final SeedGenerator seedGenerator
private final MaterialProvider<V> materialProvider
