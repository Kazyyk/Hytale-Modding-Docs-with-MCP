# ColumnProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class ColumnProp

Prop that places vertical columns with configurable height, material, and directionality.

Also in this package: BoxProp, ChainedScanResult, ClusterProp, Context, DensityProp, OffsetProp, PickedScanResult, PositionListScanResult, PositionScanResult, Prop, QueueProp, QueueScanResult, ScanResult, UnionProp, WeightedProp

Complete API:
  public ScanResult scan(Vector3i position, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  public void place(Prop.Context context)
  private void place(RotatedPosition position, VoxelSpace<Material> materialSpace)
  public ContextDependency getContextDependency()
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final int[] yPositions
private final Material[] blocks0
private final Material[] blocks90
private final Material[] blocks180
private final Material[] blocks270
private final BlockMask blockMask
private final Scanner scanner
private final ContextDependency contextDependency
private final Directionality directionality
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
