# BoxProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class BoxProp

Prop that places a filled box of material at scanned positions.

Also in this package: ChainedScanResult, ClusterProp, ColumnProp, Context, DensityProp, OffsetProp, PickedScanResult, PositionListScanResult, PositionScanResult, Prop, QueueProp, QueueScanResult, ScanResult, UnionProp, WeightedProp

Complete API:
  public PositionListScanResult scan(Vector3i position, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  public void place(Prop.Context context)
  private void place(Vector3i position, VoxelSpace<Material> materialSpace)
  public ContextDependency getContextDependency()
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Vector3i range
private final Material material
private final Scanner scanner
private final Pattern pattern
private final ContextDependency contextDependency
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
private final Bounds3i boxBounds_voxelGrid
