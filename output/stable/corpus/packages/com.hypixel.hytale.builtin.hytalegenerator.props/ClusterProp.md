# ClusterProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class ClusterProp

Prop that places clusters of weighted child props using density and seed-based randomization.

Also in this package: BoxProp, ChainedScanResult, ColumnProp, Context, DensityProp, OffsetProp, PickedScanResult, PositionListScanResult, PositionScanResult, Prop, QueueProp, QueueScanResult, ScanResult, UnionProp, WeightedProp

Complete API:
  public PositionListScanResult scan(Vector3i position, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  public void place(Prop.Context context)
  private void place(Vector3i position, VoxelSpace<Material> materialSpace, EntityContainer entityBuffer, WorkerIndexer.Id id, double distanceFromBiomeEdge)
  public ContextDependency getContextDependency()
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Double2DoubleFunction weightCurve
private final SeedGenerator seedGenerator
private final WeightedMap<Prop> propWeightedMap
private final int range
private final ContextDependency contextDependency
private final Pattern pattern
private final Scanner scanner
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
