# ClusterPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class ClusterPropAsset extends PropAsset

Places clusters of a delegate prop around the origin point, controlled by cluster size and spacing parameters.

Also in this package: Argument, BlockAsset, BoxPropAsset, ColumnBlock, ColumnPropAsset, CuboidPropAsset, DelimiterAsset, DensityPropAsset, DensitySelectorPropAsset, EmptyPropAsset, EntryAsset, ImportedPropAsset, LocatorPropAsset, ManualPropAsset, MaskPropAsset, OffsetPropAsset, OrienterPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset (and 5 more)

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<ClusterPropAsset> CODEC
private int range
private CurveAsset distanceCurve
private String seed
private ClusterPropAsset.WeightedEntryAsset[] weightedEntryAssets
private PatternAsset patternAsset
private ScannerAsset scannerAsset
