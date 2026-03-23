# ClusterPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class ClusterPropAsset extends PropAsset

Places clusters of a delegate prop around the origin point, controlled by cluster size and spacing parameters.

Also in this package: Argument, BoxPropAsset, ColumnBlock, ColumnPropAsset, DensityPropAsset, EntryAsset, ImportedPropAsset, NoPropAsset, OffsetPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset, UnionPropAsset, WeightedPropAsset, WeightedPropAsset

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<ClusterPropAsset> CODEC
private int range
private CurveAsset distanceCurve
private String seed
private ClusterPropAsset.WeightedPropAsset[] weightedPropAssets
private PatternAsset patternAsset
private ScannerAsset scannerAsset
