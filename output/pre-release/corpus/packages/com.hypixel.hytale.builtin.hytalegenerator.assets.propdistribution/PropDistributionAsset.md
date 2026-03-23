# PropDistributionAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.propdistribution | Implements: Cleanable, JsonAssetWithMap>

public abstract class PropDistributionAsset implements Cleanable, JsonAssetWithMap>

Abstract base asset class for world generator prop distributions. Defines the codec dispatch hierarchy for all prop distribution types.

Known subclasses: AssignedPropDistributionAsset, ConstantPropDistributionAsset, ImportedPropDistributionAsset, NoPropDistributionAsset, PositionsPropDistributionAsset, UnionPropDistributionAsset

Also in this package: Argument, AssignedPropDistributionAsset, ConstantPropDistributionAsset, ImportedPropDistributionAsset, NoPropDistributionAsset, PositionsPropDistributionAsset, UnionPropDistributionAsset

Complete API:
  public abstract PropDistribution build(PropDistributionAsset.Argument var1)
  public static PropDistributionAsset getFallbackAsset()
  public boolean isSkipped()
  public static PropDistributionAsset getExportedAsset(String name)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,PropDistributionAsset> CODEC
private static final Map<String,PropDistributionAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<PropDistributionAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private String exportName
