# UpwardSpaceMaterialProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders | Extends: MaterialProviderAsset

public class UpwardSpaceMaterialProviderAsset extends MaterialProviderAsset

Applies a delegate material provider only within a configured space measured upward from an air pocket.

Also in this package: Argument, ConstantMaterialProviderAsset, DelimiterAsset, DelimiterAsset, DownwardDepthMaterialProviderAsset, DownwardSpaceMaterialProviderAsset, FieldFunctionMaterialProviderAsset, ImportedMaterialProviderAsset, MaterialProviderAsset, QueueMaterialProviderAsset, SimpleHorizontalMaterialProviderAsset, SolidityMaterialProviderAsset, StripeAsset, StripedMaterialProviderAsset, TerrainDensityMaterialProviderAsset, UpwardDepthMaterialProviderAsset, WeightedMaterialAsset, WeightedMaterialProviderAsset

Complete API:
  public MaterialProvider<Material> build(MaterialProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<UpwardSpaceMaterialProviderAsset> CODEC
private int space
private MaterialProviderAsset materialProviderAsset
