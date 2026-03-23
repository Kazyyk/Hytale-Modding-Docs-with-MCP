# WeightedPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class WeightedPropAsset extends PropAsset

Selects a prop randomly from a weighted list, with an optional skip chance and seed for deterministic randomness.

Also in this package: Argument, BlockAsset, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, CuboidPropAsset, DelimiterAsset, DensityPropAsset, DensitySelectorPropAsset, EmptyPropAsset, EntryAsset, ImportedPropAsset, LocatorPropAsset, ManualPropAsset, MaskPropAsset, OffsetPropAsset, OrienterPropAsset, PondFillerPropAsset, PropAsset (and 5 more)

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<WeightedPropAsset> CODEC
private WeightedPropAsset.EntryAsset[] entryAssets
private String seed
