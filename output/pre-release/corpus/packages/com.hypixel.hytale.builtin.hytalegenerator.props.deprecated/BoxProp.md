# BoxProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated | Extends: Prop

public class BoxProp extends Prop

Deprecated prop that places a box of uniform material around scanner-matched positions. This type is deprecated.

Also in this package: ClusterProp, ColumnProp, DensityProp, PositionListScanResult, PositionScanResult, ScanResult

Complete API:
  public boolean generate(Prop.Context context)
  public PositionListScanResult scan_deprecated(Vector3i position, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  public void place_deprecated(Prop.Context context, PositionListScanResult scanResult)
  private void place(Vector3i position, VoxelSpace<Material> materialSpace)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Vector3i range
private final Material material
private final Scanner scanner
private final Pattern pattern
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
