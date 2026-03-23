# OffsetPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class OffsetPropAsset extends PropAsset

Wraps a delegate prop with a spatial offset, shifting its placement position.

Also in this package: Argument, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, DensityPropAsset, EntryAsset, ImportedPropAsset, NoPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset, UnionPropAsset, WeightedPropAsset, WeightedPropAsset

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<OffsetPropAsset> CODEC
private Vector3i offset_voxelGrid
private PropAsset propAsset
