# ColumnPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class ColumnPropAsset extends PropAsset

Extrudes a column of blocks vertically from the prop origin, using a material provider for block selection.

Also in this package: Argument, BlockAsset, BoxPropAsset, ClusterPropAsset, ColumnBlock, CuboidPropAsset, DelimiterAsset, DensityPropAsset, DensitySelectorPropAsset, EmptyPropAsset, EntryAsset, ImportedPropAsset, LocatorPropAsset, ManualPropAsset, MaskPropAsset, OffsetPropAsset, OrienterPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset (and 5 more)

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<ColumnPropAsset> CODEC
private ColumnPropAsset.ColumnBlock[] columnBlocks
private BlockMaskAsset blockMaskAsset
private DirectionalityAsset directionalityAsset
private ScannerAsset scannerAsset
