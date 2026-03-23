# ConstantThicknessLayerAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.layerassets | Extends: LayerAsset

public class ConstantThicknessLayerAsset extends LayerAsset

## Fields

- @Nonnull public static final BuilderCodec<ConstantThicknessLayerAsset> CODEC
- private int thickness
- private MaterialProviderAsset materialProviderAsset

## Methods

- @Nonnull @Override public SpaceAndDepthMaterialProvider.Layer<Material> build(@Nonnull MaterialProviderAsset.Argument argument)
- @Override public void cleanUp()

Also in this package: LayerAsset, NoiseThicknessAsset, RangeThicknessAsset, WeightedThicknessAsset, WeightedThicknessLayerAsset

Complete API:
  public SpaceAndDepthMaterialProvider.Layer<Material> build(MaterialProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<ConstantThicknessLayerAsset> CODEC
private int thickness
private MaterialProviderAsset materialProviderAsset
