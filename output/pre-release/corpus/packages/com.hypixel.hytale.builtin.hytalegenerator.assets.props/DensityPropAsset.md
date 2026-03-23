# DensityPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class DensityPropAsset extends PropAsset

Places props based on a density field, only generating in positions where the density exceeds a threshold.

Also in this package: Argument, BlockAsset, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, CuboidPropAsset, DelimiterAsset, DensitySelectorPropAsset, EmptyPropAsset, EntryAsset, ImportedPropAsset, LocatorPropAsset, ManualPropAsset, MaskPropAsset, OffsetPropAsset, OrienterPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset (and 5 more)

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<DensityPropAsset> CODEC
private DensityAsset densityAsset
private MaterialProviderAsset materialProviderAsset
private IntegerBounds3dAsset boundsAsset
private static final PatternAsset DEFAULT_PATTERN_ASSET
private static final ScannerAsset DEFAULT_SCANNER_ASSET
private static final BlockMaskAsset DEFAULT_MASK_ASSET
private static final Vector3i DEFAULT_RANGE_ASSET
private Vector3i range
private BlockMaskAsset placementMaskAsset
private PatternAsset patternAsset
private ScannerAsset scannerAsset
