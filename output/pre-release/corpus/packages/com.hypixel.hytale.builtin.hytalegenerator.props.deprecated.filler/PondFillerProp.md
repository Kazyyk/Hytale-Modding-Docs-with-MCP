# PondFillerProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated.filler | Extends: Prop

public class PondFillerProp extends Prop

Deprecated version of PondFillerProp that fills enclosed areas with fluid material. Uses flood-fill to detect non-leaking basins. This type is deprecated.

Also in this package: FillerPropScanResult

Complete API:
  public FillerPropScanResult scan_deprecated(Vector3i position, VoxelSpace<Material> materialSpace)
  private List<Vector3i> renderFluidBlocks(Vector3i origin, VoxelSpace<Material> materialSpace)
  public void place_deprecated(Prop.Context context, ScanResult scanResult)
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()
  private static boolean isTraversed(int maskValue)
  private static boolean isLeaks(int maskValue)
  private static boolean isSolid(int maskValue)
  private static boolean isStacked(int maskValue)

Fields:
private static final int TRAVERSED
private static final int LEAKS
private static final int SOLID
private static final int STACKED
private final Vector3i boundingMin
private final Vector3i boundingMax
private final MaterialProvider<Material> fillerMaterialProvider
private final MaterialSet solidSet
private final Scanner scanner
private final Pattern pattern
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
