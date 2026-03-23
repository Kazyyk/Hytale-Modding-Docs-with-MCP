# DensityProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class DensityProp

Prop that places material based on a density field evaluation at each voxel position.

Also in this package: BoxProp, ChainedScanResult, ClusterProp, ColumnProp, Context, OffsetProp, PickedScanResult, PositionListScanResult, PositionScanResult, Prop, QueueProp, QueueScanResult, ScanResult, UnionProp, WeightedProp

Complete API:
  public PositionListScanResult scan(Vector3i position, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  public void place(Prop.Context context)
  private void place(Vector3i position, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  public ContextDependency getContextDependency()
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Vector3i range
private final Density density
private final MaterialProvider<Material> materialProvider
private final Scanner scanner
private final Pattern pattern
private final ContextDependency contextDependency
private final BlockMask placementMask
private final Material defaultMaterial
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
