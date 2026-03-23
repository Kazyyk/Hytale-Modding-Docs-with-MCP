# RangeThicknessAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.layerassets | Extends: LayerAsset

public class RangeThicknessAsset extends LayerAsset

## Fields

- @Nonnull public static final BuilderCodec<RangeThicknessAsset> CODEC
- private MaterialProviderAsset materialProviderAsset
- private String seed
- private int rangeMin
- private int rangeMax

## Methods

- @Nonnull @Override public SpaceAndDepthMaterialProvider.Layer<Material> build(@Nonnull MaterialProviderAsset.Argument argument)
- @Override public void cleanUp()

Also in this package: ConstantThicknessLayerAsset, LayerAsset, NoiseThicknessAsset, WeightedThicknessAsset, WeightedThicknessLayerAsset

Complete API:
  public SpaceAndDepthMaterialProvider.Layer<Material> build(MaterialProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<RangeThicknessAsset> CODEC
private MaterialProviderAsset materialProviderAsset
private String seed
private int rangeMin
private int rangeMax
