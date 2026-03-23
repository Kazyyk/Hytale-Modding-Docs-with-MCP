# ColumnProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated | Extends: Prop

public class ColumnProp extends Prop

Deprecated prop that places a column of blocks at scanner-matched positions with rotation support via directionality. This type is deprecated.

Also in this package: BoxProp, ClusterProp, DensityProp, PositionListScanResult, PositionScanResult, ScanResult

Complete API:
  public boolean generate(Prop.Context context)
  public RotatedPositionsScanResult scan_deprecated(Vector3i position, VoxelSpace<Material> materialSpace)
  public void place_deprecated(Prop.Context context, RotatedPositionsScanResult scanResult)
  private void place(RotatedPosition position, VoxelSpace<Material> materialSpace)
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
private final Directionality directionality
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
