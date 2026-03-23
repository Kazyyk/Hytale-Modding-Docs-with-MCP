# UnionPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class UnionPropAsset extends PropAsset

Combines multiple props into a union, placing all of them at the prop origin.

Also in this package: Argument, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, DensityPropAsset, EntryAsset, ImportedPropAsset, NoPropAsset, OffsetPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset, WeightedPropAsset, WeightedPropAsset

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<UnionPropAsset> CODEC
private PropAsset[] propAssets
