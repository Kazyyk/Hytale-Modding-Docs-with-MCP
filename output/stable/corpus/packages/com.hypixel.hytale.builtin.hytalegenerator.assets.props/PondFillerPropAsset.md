# PondFillerPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class PondFillerPropAsset extends PropAsset

Fills depressions in terrain with a material to create ponds, controlled by depth and fill parameters.

Also in this package: Argument, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, DensityPropAsset, EntryAsset, ImportedPropAsset, NoPropAsset, OffsetPropAsset, PropAsset, QueuePropAsset, UnionPropAsset, WeightedPropAsset, WeightedPropAsset

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<PondFillerPropAsset> CODEC
private Vector3i boundingMin
private Vector3i boundingMax
private MaterialProviderAsset fluidMaterialProviderAsset
private MaterialSetAsset solidSetAsset
private PatternAsset patternAsset
private ScannerAsset scannerAsset
