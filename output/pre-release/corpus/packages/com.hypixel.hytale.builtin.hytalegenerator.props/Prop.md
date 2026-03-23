# Prop

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class Prop

Abstract base class for all world generator props. Defines the scan/place lifecycle and bounds calculation interface.

Known subclasses: BoxProp, ClusterProp, ColumnProp, CuboidProp, DensityProp, DensityProp, DensitySelectorProp, EmptyProp, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PondFillerProp, PondFillerProp, PrefabProp, PrefabProp, QueueProp, StaticRotatorProp, UnionProp, WeightedProp

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public abstract boolean generate(Prop.Context var1)
  public abstract Bounds3i getReadBounds_voxelGrid()
  public abstract Bounds3i getWriteBounds_voxelGrid()
