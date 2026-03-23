# ColumnPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class ColumnPropAsset extends PropAsset

Extrudes a column of blocks vertically from the prop origin, using a material provider for block selection.

Also in this package: Argument, BoxPropAsset, ClusterPropAsset, ColumnBlock, DensityPropAsset, EntryAsset, ImportedPropAsset, NoPropAsset, OffsetPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset, UnionPropAsset, WeightedPropAsset, WeightedPropAsset

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<ColumnPropAsset> CODEC
private ColumnPropAsset.ColumnBlock[] columnBlocks
private BlockMaskAsset blockMaskAsset
private DirectionalityAsset directionalityAsset
private ScannerAsset scannerAsset
