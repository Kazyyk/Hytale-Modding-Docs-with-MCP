# PondFillerPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class PondFillerPropAsset extends PropAsset

Fills depressions in terrain with a material to create ponds, controlled by depth and fill parameters.

Also in this package: Argument, BlockAsset, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, CuboidPropAsset, DelimiterAsset, DensityPropAsset, DensitySelectorPropAsset, EmptyPropAsset, EntryAsset, ImportedPropAsset, LocatorPropAsset, ManualPropAsset, MaskPropAsset, OffsetPropAsset, OrienterPropAsset, PropAsset, QueuePropAsset (and 5 more)

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<PondFillerPropAsset> CODEC
private IntegerBounds3dAsset boundsAsset
private MaterialProviderAsset fluidMaterialProviderAsset
private MaterialSetAsset solidSetAsset
private static final PatternAsset DEFAULT_PATTERN_ASSET
private static final ScannerAsset DEFAULT_SCANNER_ASSET
private static final Vector3i DEFAULT_MIN_ASSET
private static final Vector3i DEFAULT_MAX_ASSET
private Vector3i boundingMin
private Vector3i boundingMax
private PatternAsset patternAsset
private ScannerAsset scannerAsset
