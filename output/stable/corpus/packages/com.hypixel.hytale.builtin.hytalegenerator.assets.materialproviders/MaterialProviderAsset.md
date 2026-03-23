# MaterialProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders | Implements: Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, MaterialProviderAsset>>

public class MaterialProviderAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, MaterialProviderAsset>>

Abstract base for all material provider assets. Defines the CODEC hierarchy, skip/export functionality, and the `build()` contract that subclasses implement to produce a `MaterialProvider<Material>`.

Known subclasses: ConstantMaterialProviderAsset, DownwardDepthMaterialProviderAsset, DownwardSpaceMaterialProviderAsset, FieldFunctionMaterialProviderAsset, ImportedMaterialProviderAsset, QueueMaterialProviderAsset, SimpleHorizontalMaterialProviderAsset, SolidityMaterialProviderAsset, SpaceAndDepthMaterialProviderAsset, StripedMaterialProviderAsset, TerrainDensityMaterialProviderAsset, UpwardDepthMaterialProviderAsset, UpwardSpaceMaterialProviderAsset, WeightedMaterialProviderAsset

Also in this package: Argument, ConstantMaterialProviderAsset, DelimiterAsset, DelimiterAsset, DownwardDepthMaterialProviderAsset, DownwardSpaceMaterialProviderAsset, FieldFunctionMaterialProviderAsset, ImportedMaterialProviderAsset, QueueMaterialProviderAsset, SimpleHorizontalMaterialProviderAsset, SolidityMaterialProviderAsset, StripeAsset, StripedMaterialProviderAsset, TerrainDensityMaterialProviderAsset, UpwardDepthMaterialProviderAsset, UpwardSpaceMaterialProviderAsset, WeightedMaterialAsset, WeightedMaterialProviderAsset

Complete API:
  public abstract MaterialProvider<Material> build(MaterialProviderAsset.Argument var1)
  public boolean skip()
  public static MaterialProviderAsset getExportedAsset(String name)
  public String getId()
  public static MaterialProviderAsset.Argument argumentFrom(DensityAsset.Argument argument, MaterialCache materialCache)
  public static MaterialProviderAsset.Argument argumentFrom(PropAsset.Argument argument)
  public void cleanUp()

Fields:
private static final MaterialProviderAsset[] EMPTY_INPUTS
public static final AssetCodecMapCodec<String,MaterialProviderAsset> CODEC
private static final Map<String,MaterialProviderAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<MaterialProviderAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private String exportName
