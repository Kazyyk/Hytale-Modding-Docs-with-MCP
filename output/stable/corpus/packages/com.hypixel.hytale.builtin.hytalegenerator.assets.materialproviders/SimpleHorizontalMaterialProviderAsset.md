# SimpleHorizontalMaterialProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders | Extends: MaterialProviderAsset

public class SimpleHorizontalMaterialProviderAsset extends MaterialProviderAsset

Restricts a delegate material provider to a horizontal band defined by top and bottom Y coordinates, optionally offset by named decimal constants.

Also in this package: Argument, ConstantMaterialProviderAsset, DelimiterAsset, DelimiterAsset, DownwardDepthMaterialProviderAsset, DownwardSpaceMaterialProviderAsset, FieldFunctionMaterialProviderAsset, ImportedMaterialProviderAsset, MaterialProviderAsset, QueueMaterialProviderAsset, SolidityMaterialProviderAsset, StripeAsset, StripedMaterialProviderAsset, TerrainDensityMaterialProviderAsset, UpwardDepthMaterialProviderAsset, UpwardSpaceMaterialProviderAsset, WeightedMaterialAsset, WeightedMaterialProviderAsset

Complete API:
  public MaterialProvider<Material> build(MaterialProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<SimpleHorizontalMaterialProviderAsset> CODEC
private int topY
private int bottomY
private MaterialProviderAsset materialProviderAsset
private String topBaseHeightName
private String bottomBaseHeightName
