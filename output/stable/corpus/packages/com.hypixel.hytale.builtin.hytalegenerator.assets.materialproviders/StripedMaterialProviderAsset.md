# StripedMaterialProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders | Extends: MaterialProviderAsset

public class StripedMaterialProviderAsset extends MaterialProviderAsset

Applies a material provider within horizontal stripe bands defined by top and bottom Y values.

Also in this package: Argument, ConstantMaterialProviderAsset, DelimiterAsset, DelimiterAsset, DownwardDepthMaterialProviderAsset, DownwardSpaceMaterialProviderAsset, FieldFunctionMaterialProviderAsset, ImportedMaterialProviderAsset, MaterialProviderAsset, QueueMaterialProviderAsset, SimpleHorizontalMaterialProviderAsset, SolidityMaterialProviderAsset, StripeAsset, TerrainDensityMaterialProviderAsset, UpwardDepthMaterialProviderAsset, UpwardSpaceMaterialProviderAsset, WeightedMaterialAsset, WeightedMaterialProviderAsset

Complete API:
  public MaterialProvider<Material> build(MaterialProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<StripedMaterialProviderAsset> CODEC
private StripedMaterialProviderAsset.StripeAsset[] stripeAssets
private MaterialProviderAsset materialProviderAsset
