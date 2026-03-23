# PondFillerProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.filler | Extends: Prop

public class PondFillerProp extends Prop

Concrete implementation extending `Prop`.

## Fields

- TRAVERSED | int | Static final int field.
- LEAKS | int | Static final int field.
- SOLID | int | Static final int field.
- STACKED | int | Static final int field.
- boundingMin | Vector3i | final Vector3i field.
- boundingMax | Vector3i | final Vector3i field.
- filledMaterialProvider | MaterialProvider<Material> | final MaterialProvider<Material> field.
- solidSet | MaterialSet | final MaterialSet field.
- scanner | Scanner | final Scanner field.
- pattern | Pattern | final Pattern field.
- contextDependency | ContextDependency | final ContextDependency field.
- readBounds_voxelGrid | Bounds3i | final Bounds3i field.
- writeBounds_voxelGrid | Bounds3i | final Bounds3i field.

## Methods

- scan(@Nonnull Vector3i position, @Nonnull VoxelSpace<Material> materialSpace, @Nonnull WorkerIndexer.Id id) | FillerPropScanResult | public method.
- renderFluidBlocks(@Nonnull Vector3i origin, @Nonnull VoxelSpace<Material> materialSpace) | List<Vector3i> | private method.
- place(@Nonnull Prop.Context context) | void | public method.
- getContextDependency() | ContextDependency | public method.
- getReadBounds_voxelGrid() | Bounds3i | public method.
- getWriteBounds_voxelGrid() | Bounds3i | public method.
- isTraversed(int maskValue) | boolean | static private method.
- isLeaks(int maskValue) | boolean | static private method.
- isSolid(int maskValue) | boolean | static private method.
- isStacked(int maskValue) | boolean | static private method.

Also in this package: FillerPropScanResult

Complete API:
  public FillerPropScanResult scan(Vector3i position, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  private List<Vector3i> renderFluidBlocks(Vector3i origin, VoxelSpace<Material> materialSpace)
  public void place(Prop.Context context)
  public ContextDependency getContextDependency()
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
private final MaterialProvider<Material> filledMaterialProvider
private final MaterialSet solidSet
private final Scanner scanner
private final Pattern pattern
private final ContextDependency contextDependency
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
