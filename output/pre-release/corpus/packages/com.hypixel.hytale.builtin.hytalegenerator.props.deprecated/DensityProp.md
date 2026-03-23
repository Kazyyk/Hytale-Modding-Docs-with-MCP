# DensityProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated | Extends: Prop

public class DensityProp extends Prop

Deprecated prop that uses a density field to determine material placement with depth/ceiling awareness. This type is deprecated.

Also in this package: BoxProp, ClusterProp, ColumnProp, PositionListScanResult, PositionScanResult, ScanResult

Complete API:
  public boolean generate(Prop.Context context)
  public PositionListScanResult scan_deprecated(Vector3i position, VoxelSpace<Material> materialSpace)
  public void place_deprecated(Prop.Context context, PositionListScanResult scanResult)
  private void place(Vector3i position, VoxelSpace<Material> materialSpace)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Vector3i range
private final Density density
private final MaterialProvider<Material> materialProvider
private final Scanner scanner
private final Pattern pattern
private final BlockMask placementMask
private final Material defaultMaterial
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
