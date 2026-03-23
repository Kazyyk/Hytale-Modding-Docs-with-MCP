# ToolOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.tooloperations | Implements: TriIntObjPredicate

public abstract class ToolOperation implements TriIntObjPredicate<Void>

Abstract base class in the `tooloperations` package.

## Constants

- protected static final int RANDOM_MAX
- @Nonnull public static final Map<String, OperationFactory> OPERATIONS
- @Nonnull public static final Map<UUID, PrototypePlayerBuilderToolSettings> PROTOTYPE_TOOL_SETTINGS
- public static final double MAX_DISTANCE
- public static final int DEFAULT_BRUSH_SPACING

## Methods

- @Nonnull public static PrototypePlayerBuilderToolSettings getOrCreatePrototypeSettings(UUID playerUuid)
- @Nonnull public static List<Vector3i> calculateInterpolatedPositions(@Nullable Vector3i lastPosition, @Nonnull Vector3i currentPosition, int brushWidth, int brushHeight, int brushSpacing)
- @Nonnull public Vector3i getPosition()
- return new Vector3i(this.x, this.y, this.z)
- public int getBrushWidth()
- public int getBrushHeight()
- public int getBrushSpacing()
- public int getBrushDensity()
- public void executeAsBrushConfig(@Nonnull PrototypePlayerBuilderToolSettings prototypePlayerBuilderToolSettings,
        @Nonnull BuilderToolOnUseInteraction packet,
        ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `private BlockPattern` | `getPattern(@Nonnull BuilderToolOnUseInteraction packet, @Nonnull BrushData.Values brush)` |
| `@Nullable public` | `Vector3i` | `getTargetBlockAvoidingPaint(@Nonnull Ref<EntityStore> ref,
        double maxDistance,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor,
        float raycastOriginX,
        float raycastOriginY,
        float raycastOriginZ,
        float raycastDirectionX,
        float raycastDirectionY,
        float raycastDirectionZ)` |
| `@Nonnull public` | `EditOperation` | `getEditOperation()` |
| `` | `public final boolean` | `test(int x, int y, int z, Void aVoid)` |
| `` | `abstract boolean` | `execute0(int var1, int var2, int var3)` |
| `` | `public void` | `execute(ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `` | `executeShapeOperation(this.x, this.y, this.z, this, this.shape, this.shapeRange, this.shapeHeight, this.shapeThickness, this.capped)` |
| `` | `public void` | `executeAt(int posX, int posY, int posZ, ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `` | `executeShapeOperation(posX, posY, posZ, this, this.shape, this.shapeRange, this.shapeHeight, this.shapeThickness, this.capped)` |
| `` | `public static void` | `executeShapeOperation(int x,
        int y,
        int z,
        @Nonnull TriIntObjPredicate<Void> operation,
        @Nonnull BrushShape shape,
        int shapeRange,
        int shapeHeight,
        int shapeThickness,
        boolean capped)` |
| `@Nonnull private static` | `Vector3i` | `getOffsets(int width, int height, boolean originRotation, BrushOrigin origin, @Nonnull Transform transform, @Nonnull Vector3i vector, boolean applyBottomOriginFix)` |
| `` | `private static Transform` | `getTransform(@Nonnull Ref<EntityStore> ref, @Nonnull BrushData.Values brushData, @Nonnull Vector3i vector, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `private static Transform` | `getRotation(@Nonnull Ref<EntityStore> ref, @Nonnull BrushData.Values brushData, @Nonnull Vector3i vector, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `private static Transform` | `getMirror(@Nonnull Ref<EntityStore> ref, @Nonnull BrushData.Values brushData, @Nonnull Vector3i vector, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `throw new` | `IllegalStateException("No builder tool active on player")` |
| `` | `throw new` | `Exception("No tool found matching id " + toolType)` |
| `@Nullable public static` | `BlockMask` | `combineMasks(@Nullable BrushData.Values brush, @Nullable BlockMask globalMask)` |

Known subclasses: FloodOperation, LaserPointerOperation, LayersOperation, NoiseOperation, PaintOperation, ScatterOperation, SculptOperation, SmoothOperation, SmootherOperation, TintOperation

Also in this package: FloodOperation, LaserPointerOperation, LayersOperation, NoiseOperation, OperationFactory, PaintOperation, ScatterOperation, SculptOperation, SmoothOperation, SmootherOperation, TintOperation

Complete API:
  public static PrototypePlayerBuilderToolSettings getOrCreatePrototypeSettings(UUID playerUuid)
  public static List<Vector3i> calculateInterpolatedPositions(Vector3i lastPosition, Vector3i currentPosition, int brushWidth, int brushHeight, int brushSpacing)
  public Vector3i getPosition()
  public int getBrushWidth()
  public int getBrushHeight()
  public int getBrushSpacing()
  public int getBrushDensity()
  public void executeAsBrushConfig(PrototypePlayerBuilderToolSettings prototypePlayerBuilderToolSettings, BuilderToolOnUseInteraction packet, ComponentAccessor<EntityStore> componentAccessor)
  private BlockPattern getPattern(BuilderToolOnUseInteraction packet, BrushData.Values brush)
  public Vector3i getTargetBlockAvoidingPaint(Ref<EntityStore> ref, double maxDistance, ComponentAccessor<EntityStore> componentAccessor, float raycastOriginX, float raycastOriginY, float raycastOriginZ, float raycastDirectionX, float raycastDirectionY, float raycastDirectionZ)
  public EditOperation getEditOperation()
  public final boolean test(int x, int y, int z, Void aVoid)
  abstract boolean execute0(int var1, int var2, int var3)
  public void execute(ComponentAccessor<EntityStore> componentAccessor)
  public void executeAt(int posX, int posY, int posZ, ComponentAccessor<EntityStore> componentAccessor)
  public static void executeShapeOperation(int x, int y, int z, TriIntObjPredicate<Void> operation, BrushShape shape, int shapeRange, int shapeHeight, int shapeThickness, boolean capped)
  private static Vector3i getOffsets(int width, int height, boolean originRotation, BrushOrigin origin, Transform transform, Vector3i vector, boolean applyBottomOriginFix)
  private static Transform getTransform(Ref<EntityStore> ref, BrushData.Values brushData, Vector3i vector, ComponentAccessor<EntityStore> componentAccessor)
  private static Transform getRotation(Ref<EntityStore> ref, BrushData.Values brushData, Vector3i vector, ComponentAccessor<EntityStore> componentAccessor)
  private static Transform getMirror(Ref<EntityStore> ref, BrushData.Values brushData, Vector3i vector, ComponentAccessor<EntityStore> componentAccessor)
  public static ToolOperation fromPacket(Ref<EntityStore> ref, Player player, BuilderToolOnUseInteraction packet, ComponentAccessor<EntityStore> componentAccessor)
  public static BlockMask combineMasks(BrushData.Values brush, BlockMask globalMask)

Fields:
protected static final int RANDOM_MAX
public static final Map<String,OperationFactory> OPERATIONS
public static final Map<UUID,PrototypePlayerBuilderToolSettings> PROTOTYPE_TOOL_SETTINGS
public static final double MAX_DISTANCE
public static final int DEFAULT_BRUSH_SPACING
protected final int x
protected final int y
protected final int z
protected final InteractionType interactionType
protected final int shapeRange
protected final int shapeHeight
protected final int shapeThickness
protected final boolean capped
protected final int originOffsetX
protected final int originOffsetY
protected final int originOffsetZ
protected final BrushShape shape
protected final BlockPattern pattern
protected final EditOperation edit
protected final BuilderTool.ArgData args
protected final Random random
protected final Player player
protected final Ref<EntityStore> playerRef
protected final BuilderToolsPlugin.BuilderState builderState
private final Transform transform
private final Vector3i vector
private final BlockMask mask
