# QueueProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class QueueProp

Prop that executes a list of child props in sequence at the same position.

Also in this package: BoxProp, ChainedScanResult, ClusterProp, ColumnProp, Context, DensityProp, OffsetProp, PickedScanResult, PositionListScanResult, PositionScanResult, Prop, QueueScanResult, ScanResult, UnionProp, WeightedProp

Complete API:
  public ScanResult scan(Vector3i position, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  public void place(Prop.Context context)
  public ContextDependency getContextDependency()
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final List<Prop> props
private final ContextDependency contextDependency
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
