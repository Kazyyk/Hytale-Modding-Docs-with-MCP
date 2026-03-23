# DownwardSpaceMaterialProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders | Extends: MaterialProviderAsset

public class DownwardSpaceMaterialProviderAsset extends MaterialProviderAsset

Applies a delegate material provider only within a configured space measured downward from an air pocket.

Also in this package: Argument, ConstantMaterialProviderAsset, DelimiterAsset, DelimiterAsset, DownwardDepthMaterialProviderAsset, FieldFunctionMaterialProviderAsset, ImportedMaterialProviderAsset, MaterialProviderAsset, QueueMaterialProviderAsset, SimpleHorizontalMaterialProviderAsset, SolidityMaterialProviderAsset, StripeAsset, StripedMaterialProviderAsset, TerrainDensityMaterialProviderAsset, UpwardDepthMaterialProviderAsset, UpwardSpaceMaterialProviderAsset, WeightedMaterialAsset, WeightedMaterialProviderAsset

Complete API:
  public MaterialProvider<Material> build(MaterialProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<DownwardSpaceMaterialProviderAsset> CODEC
private int space
private MaterialProviderAsset materialProviderAsset
