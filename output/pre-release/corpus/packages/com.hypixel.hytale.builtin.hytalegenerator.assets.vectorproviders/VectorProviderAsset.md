# VectorProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.vectorproviders

public abstract class VectorProviderAsset

Abstract base for world generator vector provider assets.

Known subclasses: CacheVectorProviderAsset, ConstantVectorProviderAsset, DensityGradientVectorProviderAsset, ExportedVectorProviderAsset, ImportedVectorProviderAsset

Also in this package: Argument, CacheVectorProviderAsset, ConstantVectorProviderAsset, DensityGradientVectorProviderAsset, Exported, ExportedVectorProviderAsset, ImportedVectorProviderAsset

Complete API:
  public abstract VectorProvider build(VectorProviderAsset.Argument var1)
  public boolean isSkipped()
  public static VectorProviderAsset.Exported getExportedAsset(String name)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,VectorProviderAsset> CODEC
private static final Map<String,VectorProviderAsset.Exported> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<VectorProviderAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
protected boolean skip
protected String exportName
