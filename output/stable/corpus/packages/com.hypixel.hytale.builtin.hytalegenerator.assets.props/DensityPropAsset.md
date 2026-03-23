# DensityPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class DensityPropAsset extends PropAsset

Places props based on a density field, only generating in positions where the density exceeds a threshold.

Also in this package: Argument, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, EntryAsset, ImportedPropAsset, NoPropAsset, OffsetPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset, UnionPropAsset, WeightedPropAsset, WeightedPropAsset

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<DensityPropAsset> CODEC
private Vector3i range
private BlockMaskAsset placementMaskAsset
private PatternAsset patternAsset
private ScannerAsset scannerAsset
private MaterialProviderAsset materialProviderAsset
private DensityAsset densityAsset
