# BoxPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class BoxPropAsset extends PropAsset

Places a filled box of blocks at the prop origin. Configurable range (dimensions), material, pattern, and scanner.

Also in this package: Argument, BlockAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, CuboidPropAsset, DelimiterAsset, DensityPropAsset, DensitySelectorPropAsset, EmptyPropAsset, EntryAsset, ImportedPropAsset, LocatorPropAsset, ManualPropAsset, MaskPropAsset, OffsetPropAsset, OrienterPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset (and 5 more)

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<BoxPropAsset> CODEC
private Vector3i range
private MaterialAsset materialAsset
private PatternAsset patternAsset
private ScannerAsset scannerAsset
