# PrefabProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated.prefab | Extends: Prop

public class PrefabProp extends Prop

Deprecated prefab placement prop. Places prefab structures into the voxel world with support for rotation via directionality, material masking, terrain molding, entity placement, and recursive child prefabs. This type is deprecated.

Also in this package: MoldingDirection, PrefabMoldingConfiguration, PrefabPropUtil

Complete API:
  private Bounds3i getWriteBounds_voxelGrid(IPrefabBuffer prefabAccess)
  public boolean generate(Prop.Context context)
  public ScanResult scan_deprecated(Vector3i position, VoxelSpace<Material> materialSpace)
  public void place_deprecated(Prop.Context context, ScanResult scanResult)
  private IPrefabBuffer pickPrefab(Random rand)
  private void place(RotatedPosition position, VoxelSpace<Material> materialSpace, EntityFunnel entityBuffer)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final WeightedMap<List<IPrefabBuffer>> prefabPool
private final Scanner scanner
private final MaterialCache materialCache
private final RngField rngField
private final BlockMask materialMask
private final Directionality directionality
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
private final List<PrefabProp> childProps
private final List<RotatedPosition> childPositions
private final Function<String,List<IPrefabBuffer>> childPrefabLoader
private final Scanner moldingScanner
private final Pattern moldingPattern
private final MoldingDirection moldingDirection
private final boolean moldChildren
private final int prefabId
private boolean loadEntities
