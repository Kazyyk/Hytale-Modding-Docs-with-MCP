# OffsetProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class OffsetProp

Wrapper prop that offsets a child prop's placement by a fixed vector.

Also in this package: BoxProp, ChainedScanResult, ClusterProp, ColumnProp, Context, DensityProp, PickedScanResult, PositionListScanResult, PositionScanResult, Prop, QueueProp, QueueScanResult, ScanResult, UnionProp, WeightedProp

Complete API:
  public ScanResult scan(Vector3i position_voxelGrid, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  public void place(Prop.Context context)
  public ContextDependency getContextDependency()
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Vector3i offset_voxelGrid
private final Prop childProp
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
private final ContextDependency contextDependency
