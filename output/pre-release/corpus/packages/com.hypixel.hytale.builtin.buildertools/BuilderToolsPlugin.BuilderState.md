# BuilderToolsPlugin.BuilderState

Type: class | Package: com.hypixel.hytale.builtin.buildertools

public static class BuilderState

Per-player state for the builder tools system. Each connected player with builder tool permissions gets a `BuilderState` that manages their block selection, clipboard, undo/redo history, task queue, global mask, and prefab browsing state. Stored in a `ConcurrentHashMap<UUID, BuilderState>` within BuilderToolsPlugin.

## State Management

Builder states are created when a player first uses builder tools and retained after disconnect for a configurable duration (`toolExpireTime`). On reconnection, the existing state is re-attached (`retain()`), preserving the player's selection, clipboard, and history.

## Fields

- player | Player | Current player entity reference.
- playerRef | PlayerRef | Current player ref for packet sending.
- userData | BuilderToolsUserData | Player's builder tools preferences.
- selection | BlockSelection | Current clipboard/selection data.
- globalMask | BlockMask | Global mask applied to all operations.
- undo | ObjectArrayFIFOQueue<ActionEntry> | Undo history queue.
- redo | ObjectArrayFIFOQueue<ActionEntry> | Redo history queue.
- tasks | ObjectArrayFIFOQueue<QueuedTask> | Pending async operation queue.
- taskFuture | CompletableFuture<Void> | Current task execution future.
- random | Random | Per-player random (seed: `26061984`).
- activePrefabPath | UUID | Currently active prefab path UUID.
- prefabListRoot | Path | Root path for prefab browser.
- prefabListPath | Path | Current path in prefab browser.
- prefabListSearchQuery | String | Search query in prefab browser.
- timestamp | long | Nanotime of state release for cleanup.

## Task Queue

All editing operations are executed asynchronously via a task queue to ensure sequential execution on the world thread.

### addToQueue


public <T extends Throwable> void addToQueue(
    @Nonnull ThrowableTriConsumer<Ref<EntityStore>, BuilderToolsPlugin.BuilderState, ComponentAccessor<EntityStore>, T> task
)

Enqueues a task for execution. If no task is currently running, starts execution immediately via `CompletableFuture.runAsync()` on the player's world executor. Protected by a `StampedLock`.

## Undo/Redo

Undo and redo are FIFO queues of ActionEntry objects, each pairing an Action type with snapshot data. Protected by a `StampedLock`.

### undo

Restores the most recent action entry, moves its inverse to the redo queue, and sends a notification to the player.

### redo

Restores the most recent redo entry, moves its inverse to the undo queue, and sends a notification.

### pushHistory

Adds an action entry to the undo queue and clears the redo queue. Enforces the `historyCount` limit by removing the oldest entry when full.

## Editing Operations

The `BuilderState` provides methods for all editing operations, each creating appropriate snapshots and pushing to undo history:

- **Selection:** `pos1()`, `pos2()`, `select()`, `update()`, `expand()`, `contract()`, `shift()`, `deselect()`
- **Block operations:** `set()`, `fill()`, `replace()`, `clear()`, `walls()`, `hollow()`, `layer()`, `submerge()`
- **Clipboard:** `copyOrCut()`, `paste()`, `rotate()`, `rotateArbitrary()`, `flip()`, `move()`, `stack()`
- **Brush tools:** `edit()` (brush use), `editLine()`, `extendFace()`
- **Transforms:** `transformThenPasteClipboard()`, `transformSelectionPoints()`
- **Environment:** `tint()`, `environment()`
- **Scripted brushes:** `placeBrushConfig()`, `flood()`
- **Smooth:** `smooth()` using a 3x3x3 weighted kernel

## Metrics

Exports metrics via `STATE_METRICS_REGISTRY`:
- UUID, Username, ActivePrefabPath, Selection, TaskFuture, TaskCount, UndoCount, RedoCount

## Inner Types

- BlocksSampleData -- sample data for block majority calculations
- SmoothSampleData -- sample data for smooth operations

## Related Types

- BuilderToolsPlugin -- enclosing class and singleton owner
- BuilderToolsPlugin.ActionEntry -- undo/redo entries
- BuilderToolsPlugin.QueuedTask -- task wrapper
- PrototypePlayerBuilderToolSettings -- companion per-player settings
- EditOperation -- block change tracking for brush operations
- BuilderToolsUserData -- user preferences (selection history)

Also in this package: Action, ActionEntry, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsPlugin, BuilderToolsSystems, BuilderToolsUserData, BuilderToolsUserDataSystem, CachedAccessor, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)

Complete API:
  private void release()
  private void retain(Player player, PlayerRef playerRef)
  public void addToQueue(ThrowableTriConsumer<Ref<EntityStore>,BuilderToolsPlugin.BuilderState,ComponentAccessor<EntityStore>,T> task)
  public void computeSelectionCopy(ThrowableConsumer<BlockSelection,T> task)
  public void runTask()
  public int getTaskCount()
  public int getUndoCount()
  public int getRedoCount()
  public String getDisplayName()
  public BuilderToolsUserData getUserData()
  public CompletableFuture<Void> getTaskFuture()
  public BlockSelection getSelection()
  public BlockMask getGlobalMask()
  public Random getRandom()
  public void setSelection(BlockSelection selection)
  public void setSkipNextPreviewRebuild(boolean skip)
  public void sendSelectionToClient()
  private void sendErrorFeedback(Ref<EntityStore> ref, Message message, ComponentAccessor<EntityStore> componentAccessor)
  private void sendFeedback(Ref<EntityStore> ref, Message message, String sound, ComponentAccessor<EntityStore> componentAccessor)
  private void sendFeedback(Ref<EntityStore> ref, Message message, String sound, NotificationStyle notificationStyle, ComponentAccessor<EntityStore> componentAccessor)
  private void sendFeedback(Message message, ComponentAccessor<EntityStore> componentAccessor)
  private void sendFeedback(Message message, NotificationStyle notificationStyle, ComponentAccessor<EntityStore> componentAccessor)
  private void sendFeedback(String key, int total, ComponentAccessor<EntityStore> componentAccessor)
  private void sendFeedback(String key, int total, int num, ComponentAccessor<EntityStore> componentAccessor)
  public void setActivePrefabPath(UUID path)
  public UUID getActivePrefabPath()
  public Path getPrefabListRoot()
  public void setPrefabListRoot(Path prefabListRoot)
  public Path getPrefabListPath()
  public void setPrefabListPath(Path prefabListPath)
  public String getPrefabListSearchQuery()
  public void setPrefabListSearchQuery(String prefabListSearchQuery)
  public int edit(Ref<EntityStore> ref, BuilderToolOnUseInteraction packet, ComponentAccessor<EntityStore> componentAccessor)
  public void placeBrushConfig(Ref<EntityStore> ref, long startTime, BrushConfigEditStore brushConfigEditStore, ComponentAccessor<EntityStore> componentAccessor)
  public void flood(EditOperation editOperation, int x, int y, int z, int shapeWidth, int shapeHeight, BlockPattern pattern, int targetBlockId)
  private boolean isFloodPossible(ChunkAccessor accessor, long blockPosition, Vector3i min, Vector3i max, int blockId, int targetBlockId)
  public boolean isAsideAir(ChunkAccessor accessor, int x, int y, int z)
  public boolean isAsideBlock(ChunkAccessor accessor, int x, int y, int z)
  public BuilderToolsPlugin.BuilderState.BlocksSampleData getBlocksSampleData(ChunkAccessor accessor, int x, int y, int z, int radius)
  public BuilderToolsPlugin.BuilderState.SmoothSampleData getBlocksSmoothData(ChunkAccessor accessor, int x, int y, int z)
  public void editLine(int x1, int y1, int z1, int x2, int y2, int z2, BlockPattern material, int lineWidth, int lineHeight, int wallThickness, BrushShape shape, BrushOrigin origin, int spacing, int density, BlockMask mask, ComponentAccessor<EntityStore> componentAccessor)
  private Predicate<Vector3i> createShapePredicate(BrushShape shape, float halfWidth, float halfHeight, float innerHalfWidth, float innerHalfHeight, boolean hollow)
  public void extendFace(int x, int y, int z, int normalX, int normalY, int normalZ, int extrudeDepth, int radiusAllowed, int blockId, Vector3i min, Vector3i max, ComponentAccessor<EntityStore> componentAccessor)
  private void extendFaceFindBlocks(LocalCachedChunkAccessor accessor, BlockSelection before, BlockSelection after, int normalX, int normalY, int normalZ, int extrudeDepth, int blockId, Vector3i min, Vector3i max, Vector3i surfaceMin, Vector3i surfaceMax)
  public void update(int xMin, int yMin, int zMin, int xMax, int yMax, int zMax)
  public void tint(Ref<EntityStore> ref, int color, ComponentAccessor<EntityStore> componentAccessor)
  public void environment(Ref<EntityStore> ref, int environmentId, ComponentAccessor<EntityStore> componentAccessor)
  public int copyOrCut(Ref<EntityStore> ref, int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, int settings, ComponentAccessor<EntityStore> componentAccessor)
  public int copyOrCut(Ref<EntityStore> ref, int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, int settings, Vector3i playerAnchor, ComponentAccessor<EntityStore> componentAccessor)
  public int copyOrCut(Ref<EntityStore> ref, int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, int settings, Vector3i playerAnchor, Set<Ref<EntityStore>> skipEntityRemoveSnapshotFor, ComponentAccessor<EntityStore> componentAccessor)
  public int clear(int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, ComponentAccessor<EntityStore> componentAccessor)
  private static Vector3f rotateByEulerMatrix(Vector3f v, RotationTuple t)
  public static RotationTuple transformRotation(RotationTuple prevRot, Quaterniond rotation)
  private void transformEntityRotation(Vector3f rotation, Quaterniond deltaQuat)
  public void transformThenPasteClipboard(BlockChange[] blockChanges, PrototypePlayerBuilderToolSettings.FluidChange[] fluidChanges, PrototypePlayerBuilderToolSettings.EntityChange[] entityChanges, Quaterniond rotation, Vector3i translationOffset, Vector3f rotationOrigin, Vector3i initialPastePoint, boolean keepEmptyBlocks, PrototypePlayerBuilderToolSettings prototypeSettings, ComponentAccessor<EntityStore> componentAccessor)
  public void transformSelectionPoints(Quaterniond rotation, Vector3i translationOffset, Vector3f rotationOrigin)
  public Vector3i transformBlockLocation(Vector3i blockLocation, Quaterniond rotation, Vector3i translationOffset, Vector3f rotationOrigin)
  public void layer(int x, int y, int z, List<Pair<Integer,String>> layers, int depth, Vector3i direction, WorldChunk chunk, BlockSelection before, BlockSelection after)
  public void layer(List<Pair<Integer,String>> layers, Vector3i direction, ComponentAccessor<EntityStore> componentAccessor)
  private boolean attemptSetLayer(int x, int y, int z, int depth, List<Pair<Integer,String>> layers, WorldChunk chunk, BlockSelection before, BlockSelection after)
  public int paste(Ref<EntityStore> ref, int x, int y, int z, ComponentAccessor<EntityStore> componentAccessor)
  public int paste(Ref<EntityStore> ref, int x, int y, int z, boolean technicalPaste, ComponentAccessor<EntityStore> componentAccessor)
  private BlockSelection convertEmptyBlocksToEditorEmpty(BlockSelection original)
  private BlockSelection convertEditorEmptyToAir(BlockSelection original)
  public void rotate(Ref<EntityStore> ref, Axis axis, int angle, ComponentAccessor<EntityStore> componentAccessor)
  public void resetClipboardRotation(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void rotateArbitrary(Ref<EntityStore> ref, float yaw, float pitch, float roll, ComponentAccessor<EntityStore> componentAccessor)
  public void flip(Ref<EntityStore> ref, Axis axis, ComponentAccessor<EntityStore> componentAccessor)
  public void hollow(Ref<EntityStore> ref, int blockId, int thickness, boolean setTop, boolean setBottom, ComponentAccessor<EntityStore> componentAccessor)
  public void walls(Ref<EntityStore> ref, BlockPattern pattern, int thickness, boolean cappedTop, boolean cappedBottom, ComponentAccessor<EntityStore> componentAccessor)
  public void set(BlockPattern pattern, ComponentAccessor<EntityStore> componentAccessor)
  public void fill(BlockPattern pattern, ComponentAccessor<EntityStore> componentAccessor)
  public void replace(Ref<EntityStore> ref, Material from, Material to, ComponentAccessor<EntityStore> componentAccessor)
  private void clearFillerBlocksIfNeeded(int baseX, int baseY, int baseZ, int oldBlockId, int rotationIndex, LocalCachedChunkAccessor accessor, BlockSelection before, BlockSelection after)
  private void replaceMultiBlockStructure(int baseX, int baseY, int baseZ, int oldBlockId, int newBlockId, int rotationIndex, LocalCachedChunkAccessor accessor, BlockSelection before, BlockSelection after)
  public void replace(Ref<EntityStore> ref, BlockMask fromMask, BlockPattern toPattern, ComponentAccessor<EntityStore> componentAccessor)
  public int replace(Ref<EntityStore> ref, Int2IntFunction function, ComponentAccessor<EntityStore> componentAccessor)
  public void move(Ref<EntityStore> ref, Vector3i direction, boolean empty, boolean entities, ComponentAccessor<EntityStore> componentAccessor)
  public void shift(Ref<EntityStore> ref, Vector3i direction, ComponentAccessor<EntityStore> componentAccessor)
  public void pos1(Vector3i pos1, ComponentAccessor<EntityStore> componentAccessor)
  public void pos2(Vector3i pos2, ComponentAccessor<EntityStore> componentAccessor)
  public void select(Vector3i pos1, Vector3i pos2, String reason, ComponentAccessor<EntityStore> componentAccessor)
  public void deselect(ComponentAccessor<EntityStore> componentAccessor)
  public void stack(Ref<EntityStore> ref, Vector3i direction, int count, boolean empty, int spacing, ComponentAccessor<EntityStore> componentAccessor)
  public void expand(Ref<EntityStore> ref, Vector3i direction, ComponentAccessor<EntityStore> componentAccessor)
  public void contract(Ref<EntityStore> ref, Vector3i direction, ComponentAccessor<EntityStore> componentAccessor)
  public void repairFillers(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public List<BuilderToolsPlugin.ActionEntry> undo(Ref<EntityStore> ref, int count, ComponentAccessor<EntityStore> componentAccessor)
  public List<BuilderToolsPlugin.ActionEntry> redo(Ref<EntityStore> ref, int count, ComponentAccessor<EntityStore> componentAccessor)
  public void save(Ref<EntityStore> ref, String name, boolean relativize, boolean overwrite, boolean clearSupport, AssetPack targetPack, ComponentAccessor<EntityStore> componentAccessor)
  public void saveFromSelection(Ref<EntityStore> ref, String name, boolean relativize, boolean overwrite, boolean includeEntities, boolean includeEmpty, Vector3i playerAnchor, boolean clearSupport, AssetPack targetPack, ComponentAccessor<EntityStore> componentAccessor)
  public void load(String name, BlockSelection serverPrefab, ComponentAccessor<EntityStore> componentAccessor)
  public void clearHistory(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void setGlobalMask(BlockMask mask, ComponentAccessor<EntityStore> componentAccessor)
  private void sendUpdate()
  public void sendArea()
  private void pushHistory(BuilderToolsPlugin.Action action, SelectionSnapshot<?> snapshot)
  private void pushHistory(BuilderToolsPlugin.Action action, List<SelectionSnapshot<?>> snapshots)
  private void handleBrushUndoGrouping(BlockSelection before, List<Ref<EntityStore>> spawnedRefs, List<EntityTransformSnapshot> movedSnapshots, int undoGroupSize, boolean isHoldDown)
  private void mergeBeforeSnapshotPreservingOriginal(BlockSelection newBefore)
  private void commitPendingUndoGroup()
  private void markPrefabsDirtyFromSnapshots(List<SelectionSnapshot<?>> snapshots)
  private BuilderToolsPlugin.ActionEntry historyAction(Ref<EntityStore> ref, ObjectArrayFIFOQueue<BuilderToolsPlugin.ActionEntry> from, ObjectArrayFIFOQueue<BuilderToolsPlugin.ActionEntry> to, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final MetricsRegistry<BuilderToolsPlugin.BuilderState> STATE_METRICS_REGISTRY
private Player player
private PlayerRef playerRef
private final BuilderToolsUserData userData
private final StampedLock undoLock
private final ObjectArrayFIFOQueue<BuilderToolsPlugin.ActionEntry> undo
private final ObjectArrayFIFOQueue<BuilderToolsPlugin.ActionEntry> redo
private final StampedLock taskLock
private final ObjectArrayFIFOQueue<BuilderToolsPlugin.QueuedTask> tasks
private volatile CompletableFuture<Void> taskFuture
private volatile long timestamp
private BlockSelection selection
private boolean skipNextPreviewRebuild
private BlockSelection preRotationSnapshot
private BlockMask globalMask
private Random random
private UUID activePrefabPath
private Path prefabListRoot
private Path prefabListPath
private String prefabListSearchQuery
private BlockSelection pendingUndoSnapshot
private List<EntityAddSnapshot> pendingEntitySnapshots
private List<EntityTransformSnapshot> pendingEntityTransformSnapshots
private int executionCountInGroup
