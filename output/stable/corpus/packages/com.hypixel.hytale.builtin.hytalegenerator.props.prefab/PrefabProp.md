# PrefabProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.prefab | Extends: Prop

public class PrefabProp extends Prop

Extends `Prop` to provide PrefabProp functionality.

## Fields

- @Nonnull private final WeightedMap<List<PrefabBuffer>> prefabPool
- @Nonnull private final Scanner scanner
- private ContextDependency contextDependency
- @Nonnull private final MaterialCache materialCache
- @Nonnull private final SeedGenerator seedGenerator
- @Nonnull private final BlockMask materialMask
- @Nonnull private final Directionality directionality
- @Nonnull private final Bounds3i readBounds_voxelGrid
- @Nonnull private final Bounds3i writeBounds_voxelGrid
- @Nonnull private final Bounds3i prefabBounds_voxelGrid
- @Nonnull private final List<PrefabProp> childProps
- @Nonnull private final List<RotatedPosition> childPositions
- @Nonnull private final Function<String, List<PrefabBuffer>> childPrefabLoader
- private final Scanner moldingScanner
- private final Pattern moldingPattern
- private final MoldingDirection moldingDirection
- private final boolean moldChildren
- private final int prefabId
- private boolean loadEntities

## Methods

- public PrefabProp(@Nonnull WeightedMap<List<PrefabBuffer>> prefabPool,
        @Nonnull Scanner scanner,
        @Nonnull Directionality directionality,
        @Nonnull MaterialCache materialCache,
        @Nonnull BlockMask materialMask,
        @Nonnull PrefabMoldingConfiguration prefabMoldingConfiguration,
        @Nullable Function<String, List<PrefabBuffer>> childPrefabLoader,
        @Nonnull SeedBox seedBox,
        boolean loadEntities)` |
| `@Nonnull private` | `Vector3i` | `getWriteRange(@Nonnull PrefabBuffer.PrefabBufferAccessor prefabAccess)` |
| `@Nonnull @Override public` | `ScanResult` | `scan(@Nonnull Vector3i position, @Nonnull VoxelSpace<Material> materialSpace, @Nonnull WorkerIndexer.Id id)` |
| `@Override public` | `void` | `place(@Nonnull Prop.Context context)` |
| `private` | `PrefabBuffer` | `pickPrefab(@Nonnull Random rand)` |
| `private` | `void` | `place(@Nonnull RotatedPosition position, @Nonnull VoxelSpace<Material> materialSpace, @Nonnull EntityContainer entityBuffer, @Nonnull WorkerIndexer.Id id)` |
| `@Override public` | `ContextDependency` | `getContextDependency()` |
| `@Override public` | `Bounds3i` | `getReadBounds_voxelGrid()` |
| `@Nonnull @Override public` | `Bounds3i` | `getWriteBounds_voxelGrid()` |

Also in this package: MoldingDirection, PrefabMoldingConfiguration, PropPrefabUtil

Complete API:
  private Vector3i getWriteRange(PrefabBuffer.PrefabBufferAccessor prefabAccess)
  public ScanResult scan(Vector3i position, VoxelSpace<Material> materialSpace, WorkerIndexer.Id id)
  public void place(Prop.Context context)
  private PrefabBuffer pickPrefab(Random rand)
  private void place(RotatedPosition position, VoxelSpace<Material> materialSpace, EntityContainer entityBuffer, WorkerIndexer.Id id)
  public ContextDependency getContextDependency()
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final WeightedMap<List<PrefabBuffer>> prefabPool
private final Scanner scanner
private ContextDependency contextDependency
private final MaterialCache materialCache
private final SeedGenerator seedGenerator
private final BlockMask materialMask
private final Directionality directionality
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
private final Bounds3i prefabBounds_voxelGrid
private final List<PrefabProp> childProps
private final List<RotatedPosition> childPositions
private final Function<String,List<PrefabBuffer>> childPrefabLoader
private final Scanner moldingScanner
private final Pattern moldingPattern
private final MoldingDirection moldingDirection
private final boolean moldChildren
private final int prefabId
private boolean loadEntities
