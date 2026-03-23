# WeightedMaterialProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders | Extends: MaterialProviderAsset

public class WeightedMaterialProviderAsset extends MaterialProviderAsset

Selects a material provider randomly from a weighted list, with an optional skip chance and seed for deterministic randomness.

Also in this package: Argument, ConstantMaterialProviderAsset, DelimiterAsset, DelimiterAsset, DownwardDepthMaterialProviderAsset, DownwardSpaceMaterialProviderAsset, FieldFunctionMaterialProviderAsset, ImportedMaterialProviderAsset, MaterialProviderAsset, QueueMaterialProviderAsset, SimpleHorizontalMaterialProviderAsset, SolidityMaterialProviderAsset, StripeAsset, StripedMaterialProviderAsset, TerrainDensityMaterialProviderAsset, UpwardDepthMaterialProviderAsset, UpwardSpaceMaterialProviderAsset, WeightedMaterialAsset

Complete API:
  public MaterialProvider<Material> build(MaterialProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<WeightedMaterialProviderAsset> CODEC
private WeightedMaterialProviderAsset.WeightedMaterialAsset[] weighedMapEntries
private double skipChance
private String seed
