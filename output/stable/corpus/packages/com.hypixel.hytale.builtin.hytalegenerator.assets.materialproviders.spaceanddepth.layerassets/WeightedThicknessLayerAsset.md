# WeightedThicknessLayerAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.layerassets | Extends: LayerAsset

public class WeightedThicknessLayerAsset extends LayerAsset

## Fields

- @Nonnull public static final BuilderCodec<WeightedThicknessLayerAsset> CODEC
- private MaterialProviderAsset materialProviderAsset
- private String seed
- private WeightedThicknessLayerAsset.WeightedThicknessAsset[] possibleThicknessAssets

## Methods

- @Nonnull @Override public SpaceAndDepthMaterialProvider.Layer<Material> build(@Nonnull MaterialProviderAsset.Argument argument)
- @Override public void cleanUp()

## Inner Types

- `WeightedThicknessLayerAsset.WeightedThicknessAsset`

Also in this package: ConstantThicknessLayerAsset, LayerAsset, NoiseThicknessAsset, RangeThicknessAsset, WeightedThicknessAsset

Complete API:
  public SpaceAndDepthMaterialProvider.Layer<Material> build(MaterialProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<WeightedThicknessLayerAsset> CODEC
private MaterialProviderAsset materialProviderAsset
private String seed
private WeightedThicknessLayerAsset.WeightedThicknessAsset[] possibleThicknessAssets
