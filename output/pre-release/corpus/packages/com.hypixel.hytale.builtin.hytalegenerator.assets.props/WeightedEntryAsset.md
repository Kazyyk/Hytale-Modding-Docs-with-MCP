# WeightedEntryAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Implements: Cleanable, JsonAssetWithMap>

public static class WeightedEntryAsset implements Cleanable, JsonAssetWithMap>

Inner class of `ClusterPropAsset` pairing a prop asset reference with a numeric weight for weighted random cluster generation.

Also in this package: Argument, BlockAsset, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, CuboidPropAsset, DelimiterAsset, DensityPropAsset, DensitySelectorPropAsset, EmptyPropAsset, EntryAsset, ImportedPropAsset, LocatorPropAsset, ManualPropAsset, MaskPropAsset, OffsetPropAsset, OrienterPropAsset, PondFillerPropAsset, PropAsset (and 5 more)

Complete API:
  public String getId()
  public void cleanUp()

Fields:
public static final AssetBuilderCodec<String,ClusterPropAsset.WeightedEntryAsset> CODEC
private String id
private AssetExtraInfo.Data data
private double weight
private PropAsset propAsset
