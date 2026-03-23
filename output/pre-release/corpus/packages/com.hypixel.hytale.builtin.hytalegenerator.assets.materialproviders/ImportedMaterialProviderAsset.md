# ImportedMaterialProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders | Extends: MaterialProviderAsset

public class ImportedMaterialProviderAsset extends MaterialProviderAsset

References a material provider exported by another asset via its name. Resolves the export at build time using `MaterialProviderAsset.getExportedAsset()`.

Also in this package: Argument, ConstantMaterialProviderAsset, DelimiterAsset, DelimiterAsset, DownwardDepthMaterialProviderAsset, DownwardSpaceMaterialProviderAsset, FieldFunctionMaterialProviderAsset, MaterialProviderAsset, QueueMaterialProviderAsset, SimpleHorizontalMaterialProviderAsset, SolidityMaterialProviderAsset, StripeAsset, StripedMaterialProviderAsset, TerrainDensityMaterialProviderAsset, UpwardDepthMaterialProviderAsset, UpwardSpaceMaterialProviderAsset, WeightedMaterialAsset, WeightedMaterialProviderAsset

Complete API:
  public MaterialProvider<Material> build(MaterialProviderAsset.Argument argument)

Fields:
public static final BuilderCodec<ImportedMaterialProviderAsset> CODEC
private String name
