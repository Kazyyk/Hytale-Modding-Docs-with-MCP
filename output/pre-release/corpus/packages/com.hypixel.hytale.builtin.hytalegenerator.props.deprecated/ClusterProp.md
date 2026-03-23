# ClusterProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated | Extends: Prop

public class ClusterProp extends Prop

Deprecated prop that places weighted random props in a radial cluster pattern around scanner-matched positions. This type is deprecated.

Also in this package: BoxProp, ColumnProp, DensityProp, PositionListScanResult, PositionScanResult, ScanResult

Complete API:
  public boolean generate(Prop.Context context)
  public PositionListScanResult scan_deprecated(Vector3i position, VoxelSpace<Material> materialSpace)
  public void place_deprecated(Prop.Context context, PositionListScanResult scanResult)
  private boolean isColumnBounded(Prop prop)
  private void place(Vector3i position, VoxelSpace<Material> materialReadSpace, VoxelSpace<Material> materialWriteSpace, EntityFunnel entityBuffer, double distanceFromBiomeEdge)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Double2DoubleFunction weightCurve
private final RngField rngField
private final WeightedMap<Prop> propWeightedMap
private final int range
private final Pattern pattern
private final Scanner scanner
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
private final Prop.Context rChildContext
