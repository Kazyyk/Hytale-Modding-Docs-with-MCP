# WeightedThicknessLayer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.layers | Extends: Layer

public class WeightedThicknessLayer<V> extends Layer

## Fields

- private final WeightedMap<Integer> thicknessPool
- private final SeedGenerator seedGenerator
- private final MaterialProvider<V> materialProvider

## Methods

- @Override public int getThicknessAt(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling, double distanceTOBiomeEdge)
- @Override public MaterialProvider<V> getMaterialProvider()

Also in this package: ConstantThicknessLayer, NoiseThickness, RangedThicknessLayer

Complete API:
  public int getThicknessAt(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling, double distanceTOBiomeEdge)
  public MaterialProvider<V> getMaterialProvider()

Fields:
private final WeightedMap<Integer> thicknessPool
private final RngField rngField
private final MaterialProvider<V> materialProvider
