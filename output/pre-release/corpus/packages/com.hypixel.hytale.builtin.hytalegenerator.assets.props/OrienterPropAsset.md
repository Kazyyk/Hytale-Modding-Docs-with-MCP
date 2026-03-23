# OrienterPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class OrienterPropAsset extends PropAsset

Prop asset that orients a child prop based on terrain slope or surface normal at the placement position.

Also in this package: Argument, BlockAsset, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, CuboidPropAsset, DelimiterAsset, DensityPropAsset, DensitySelectorPropAsset, EmptyPropAsset, EntryAsset, ImportedPropAsset, LocatorPropAsset, ManualPropAsset, MaskPropAsset, OffsetPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset (and 5 more)

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<OrienterPropAsset> CODEC
private PropAsset propAsset
private PatternAsset patternAsset
private ScannerAsset scannerAsset
private OrthogonalRotationAsset[] rotationAssets
private OrienterProp.SelectionMode selectionMode
private String seed
