# Prop

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class Prop

Abstract base class for all world generator props. Defines the scan/place lifecycle and bounds calculation interface.

Known subclasses: BoxProp, ClusterProp, ColumnProp, DensityProp, OffsetProp, PondFillerProp, PrefabProp, QueueProp, UnionProp, WeightedProp

Also in this package: BoxProp, ChainedScanResult, ClusterProp, ColumnProp, Context, DensityProp, OffsetProp, PickedScanResult, PositionListScanResult, PositionScanResult, QueueProp, QueueScanResult, ScanResult, UnionProp, WeightedProp

Complete API:
  public abstract ScanResult scan(Vector3i var1, VoxelSpace<Material> var2, WorkerIndexer.Id var3)
  public abstract void place(Prop.Context var1)
  public abstract ContextDependency getContextDependency()
  public abstract Bounds3i getReadBounds_voxelGrid()
  public abstract Bounds3i getWriteBounds_voxelGrid()
  public static Prop noProp()
