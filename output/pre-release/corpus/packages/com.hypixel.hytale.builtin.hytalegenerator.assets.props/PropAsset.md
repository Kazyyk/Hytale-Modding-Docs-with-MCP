# PropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Implements: Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PropAsset>>

public class PropAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PropAsset>>

Abstract base for all prop assets. Defines the CODEC hierarchy with common fields (Inputs, Condition, Mask) and the `build()` contract that subclasses implement to produce a `Prop` instance.

Known subclasses: BoxPropAsset, ClusterPropAsset, ColumnPropAsset, CuboidPropAsset, DensityPropAsset, DensitySelectorPropAsset, EmptyPropAsset, ImportedPropAsset, LocatorPropAsset, ManualPropAsset, MaskPropAsset, OffsetPropAsset, OrienterPropAsset, PondFillerPropAsset, PrefabPropAsset, QueuePropAsset, RandomRotatorPropAsset, StaticRotatorPropAsset, UnionPropAsset, WeightedPropAsset

Also in this package: Argument, BlockAsset, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, CuboidPropAsset, DelimiterAsset, DensityPropAsset, DensitySelectorPropAsset, EmptyPropAsset, EntryAsset, ImportedPropAsset, LocatorPropAsset, ManualPropAsset, MaskPropAsset, OffsetPropAsset, OrienterPropAsset, PondFillerPropAsset, QueuePropAsset (and 5 more)

Complete API:
  public abstract Prop build(PropAsset.Argument var1)
  public boolean skip()
  public static PropAsset getExportedAsset(String name)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,PropAsset> CODEC
private static final Map<String,PropAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<PropAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private String exportName
