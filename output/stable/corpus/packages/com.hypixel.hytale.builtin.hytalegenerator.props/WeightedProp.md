# WeightedProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class WeightedProp

Prop that randomly selects a child prop from a weighted distribution using seed-based randomization.

Also in this package: BoxProp, ChainedScanResult, ClusterProp, ColumnProp, Context, DensityProp, OffsetProp, PickedScanResult, PositionListScanResult, PositionScanResult, Prop, QueueProp, QueueScanResult, ScanResult, UnionProp

Complete API:
  public ScanResult scan(Vector3i position, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  public void place(Prop.Context context)
  public ContextDependency getContextDependency()
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final WeightedMap<Prop> props
private final ContextDependency contextDependency
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
private final SeedGenerator seedGenerator
