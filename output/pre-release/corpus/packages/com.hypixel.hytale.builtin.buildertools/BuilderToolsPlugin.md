# BuilderToolsPlugin

Type: class | Package: com.hypixel.hytale.builtin.buildertools | Extends: JavaPlugin | Implements: SelectionProvider, MetricProvider

public class BuilderToolsPlugin extends JavaPlugin implements SelectionProvider, MetricProvider

The main plugin class for the built-in builder tools module, providing WorldEdit-like block editing, prefab editing, scripted brushes, OBJ/image import, and clipboard/undo-redo infrastructure for creative-mode world building. Extends `JavaPlugin` and acts as the entry point for all builder tool functionality. Accessible as a singleton via `BuilderToolsPlugin.get()`.

## Singleton Access


public static BuilderToolsPlugin get()

Returns the singleton instance, set during construction.

## Constructor


public BuilderToolsPlugin(@Nonnull JavaPluginInit init)

Sets the singleton instance and configures the logger to `Level.FINE`.

## Constants


public static final String EDITOR_BLOCK = "Editor_Block"


public static final String EDITOR_BLOCK_PREFAB_AIR = "Editor_Empty"


public static final String EDITOR_BLOCK_PREFAB_ANCHOR = "Editor_Anchor"

Special editor block type identifiers used during editing operations.

## Lifecycle

### setup

Registers all builder tool infrastructure:

- **Packet handler:** BuilderToolsPacketHandler via `ServerManager.registerSubPacketHandlers()`
- **Events:** `PlayerConnectEvent`, `PlayerDisconnectEvent`, `AddWorldEvent` (for prefab world map markers)
- **ECS Systems:** BuilderToolsSystems.EnsureBuilderTools, BuilderToolsUserDataSystem, PrefabPasteEventSystem, `PrefabDirtySystems.BlockBreakDirtySystem`, `PrefabDirtySystems.BlockPlaceDirtySystem`
- **Components:** BuilderToolsUserData (ID: `"BuilderTools"`), `PrefabAnchor` (ID: `"PrefabAnchor"`)
- **Resources:** `PrefabEditSession` (ID: `"PrefabEditSession"`)
- **Asset stores:** `PrefabEditorCreationSettings`, `ScriptedBrushAsset`
- **Interactions:** `PrefabSelectionInteraction`, `PrefabSetAnchorInteraction`, `PickupItemInteraction`
- **Selection provider:** Registers itself with `SelectionManager`
- **Tool arg types:** Bool, String, Int, Float, Block, Mask, BrushShape, BrushOrigin, Option
- **Scripted brush operations:** 50+ operations registered via `registerBrushOperations()`
- **Commands:** 38 commands including selection, editing, clipboard, history, prefab, import, and brush configuration commands

### start

Loads configuration values (`historyCount`, `toolExpireTime`) and starts the periodic builder state cleanup task if `toolExpireTimeNanos > 0`.

### shutdown

Cancels the cleanup task if running.

## Configuration

Uses a BuilderToolsConfig loaded from `"BuilderToolsModule"` config ID with fields:

- historyCount | int | 50 | Number of undo/redo entries per player.
- toolExpireTime | long | 3600 | Seconds to retain builder state after player disconnect. 0 = immediate cleanup.

## Per-Player Builder State

Each player gets a BuilderState instance stored in a `ConcurrentHashMap<UUID, BuilderState>`. States are created on player connect and released (but not removed) on disconnect. Released states are cleaned up by a periodic task after `toolExpireTime` seconds.

### getState


@Nonnull
public static BuilderToolsPlugin.BuilderState getState(@Nonnull Player player, @Nonnull PlayerRef playerRef)

Returns the builder state for the player, creating one if needed.

### addToQueue


public static <T extends Throwable> void addToQueue(
    @Nonnull Player player,
    @Nonnull PlayerRef playerRef,
    @Nonnull ThrowableTriConsumer<Ref<EntityStore>, BuilderToolsPlugin.BuilderState, ComponentAccessor<EntityStore>, T> task
)

Queues an asynchronous task on the player's builder state for execution on the world thread.

## Accessors


@Nonnull
public BlockColorIndex getBlockColorIndex()

Returns the BlockColorIndex for color-based block lookup.


public ResourceType<EntityStore, PrefabEditSession> getPrefabEditSessionResourceType()

Returns the registered `ResourceType` for `PrefabEditSession`.


public ComponentType<EntityStore, BuilderToolsUserData> getUserDataComponentType()

Returns the registered `ComponentType` for BuilderToolsUserData.

## World Map Invalidation


public static void invalidateWorldMapForSelection(@Nonnull BlockSelection selection, @Nonnull World world)

Invalidates world map images for all chunks overlapping the given selection bounds.


static void invalidateWorldMapForBounds(@Nonnull Vector3i min, @Nonnull Vector3i max, @Nonnull World world)

Invalidates world map images for all chunks in the min/max bounding box.

## Inner Types

- Action -- enum of undo/redo action types
- ActionEntry -- pairs an action with its snapshots for undo/redo
- BuilderState -- per-player selection, clipboard, undo/redo, and task queue state
- BuilderToolsConfig -- plugin configuration
- CachedAccessor -- thread-local cached chunk section accessor
- PrefabPasteEventSystem -- ECS system handling prefab paste events
- QueuedTask -- wrapper for queued async operations

## Related Types

- BuilderToolsPacketHandler -- handles all client-server packets
- BuilderToolsSystems -- ECS systems container
- BuilderToolsUserData -- per-player component for selection history setting
- EditOperation -- tracks before/after state for brush operations
- CopyCutSettings -- bitflags for copy/cut operations
- PrototypePlayerBuilderToolSettings -- per-player brush and transform settings

Also in this package: Action, ActionEntry, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderState, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsSystems, BuilderToolsUserData, BuilderToolsUserDataSystem, CachedAccessor, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)

Complete API:
  public static BuilderToolsPlugin get()
  public BlockColorIndex getBlockColorIndex()
  public static void invalidateWorldMapForSelection(BlockSelection selection, World world)
  static void invalidateWorldMapForBounds(Vector3i min, Vector3i max, World world)
  public static BuilderToolsPlugin.BuilderState getState(Player player, PlayerRef playerRef)
  public static void addToQueue(Player player, PlayerRef playerRef, ThrowableTriConsumer<Ref<EntityStore>,BuilderToolsPlugin.BuilderState,ComponentAccessor<EntityStore>,T> task)
  public static AssetPack resolveTargetPack(String explicitPackName, Player playerComponent, CommandContext context)
  public static AssetPack resolveTargetPack(String explicitPackName, Path prefabPath, Player playerComponent, CommandContext context)
  protected void setup()
  private void registerBrushOperations()
  public ResourceType<EntityStore,PrefabEditSession> getPrefabEditSessionResourceType()
  protected void start()
  protected void shutdown()
  private void cleanup()
  public void setToolHistorySize(int size)
  private void onPlayerConnect(PlayerConnectEvent event)
  private void onPlayerDisconnect(PlayerDisconnectEvent event)
  private void onPlayerReady(PlayerReadyEvent event)
  public void onToolArgUpdate(PlayerRef playerRef, Player player, BuilderToolArgUpdate packet)
  public BuilderToolsPlugin.BuilderState getBuilderState(Player player, PlayerRef playerRef)
  public BuilderToolsPlugin.BuilderState clearBuilderState(UUID uuid)
  private void retainBuilderState(Player player, PlayerRef playerRef)
  private void releaseBuilderState(UUID uuid)
  public ComponentType<EntityStore,BuilderToolsUserData> getUserDataComponentType()
  public static void sendFeedback(Message message, CommandSender feedback, NotificationStyle notificationStyle, ComponentAccessor<EntityStore> componentAccessor)
  public static void sendFeedback(String key, int total, CommandSender feedback, ComponentAccessor<EntityStore> componentAccessor)
  public static void sendFeedback(String key, int total, int num, CommandSender feedback, ComponentAccessor<EntityStore> componentAccessor)
  public void computeSelectionCopy(Ref<EntityStore> ref, Player player, ThrowableConsumer<BlockSelection,T> task, ComponentAccessor<EntityStore> componentAccessor)
  public MetricResults toMetricResults()
  public ComponentType<EntityStore,PrefabAnchor> getPrefabAnchorComponentType()
  public PrefabEditSessionManager getPrefabEditSessionManager()
  public static Holder<ChunkStore> createBlockComponent(WorldChunk chunk, int x, int y, int z, int newId, int oldId, Holder<ChunkStore> oldHolder, boolean copy)
  public static void forEachCopyableInSelection(World world, int minX, int minY, int minZ, int width, int height, int depth, Consumer<Ref<EntityStore>> action)
  private static void internalForEachCopyableInSelection(World world, int minX, int minY, int minZ, int encompassingWidth, int encompassingHeight, int encompassingDepth, Consumer<Ref<EntityStore>> action)
  private static int getNonEmptyNeighbourBlock(ChunkAccessor accessor, int x, int y, int z)
  public UUID getNewPathIdOnPrefabPasted(UUID id, String name, int prefabId)
  public static boolean onPasteStart(int prefabId, ComponentAccessor<EntityStore> componentAccessor)
  public void onPasteEnd(int prefabId, ComponentAccessor<EntityStore> componentAccessor)
  public Int2ObjectConcurrentHashMap<ConcurrentHashMap<UUID,UUID>> getPastedPrefabPathUUIDMap()

Fields:
public static final String EDITOR_BLOCK
public static final String EDITOR_BLOCK_PREFAB_AIR
public static final String EDITOR_BLOCK_PREFAB_ANCHOR
protected static final float SPHERE_SIZE
static final int MAX_CLIPBOARD_BLOCK_COUNT
static final double CLIPBOARD_PRE_LIMIT_FACTOR
private static final FeedbackConsumer FEEDBACK_CONSUMER
private static final MetricsRegistry<BuilderToolsPlugin> PLUGIN_METRICS_REGISTRY
private static final long RETAIN_BUILDER_STATE_TIMESTAMP
private static final long MIN_CLEANUP_INTERVAL_NANOS
private final Map<UUID,BuilderToolsPlugin.BuilderState> builderStates
private PrefabEditSessionManager prefabEditSessionManager
private final BlockColorIndex blockColorIndex
private static BuilderToolsPlugin instance
private int historyCount
private long toolExpireTimeNanos
private ScheduledFuture<?> cleanupTask
private ComponentType<EntityStore,BuilderToolsUserData> userDataComponentType
private ComponentType<EntityStore,PrefabAnchor> prefabAnchorComponentType
private final Int2ObjectConcurrentHashMap<ConcurrentHashMap<UUID,UUID>> pastedPrefabPathUUIDMap
private final Int2ObjectConcurrentHashMap<ConcurrentHashMap<String,UUID>> pastedPrefabPathNameToUUIDMap
private static final float SMOOTHING_KERNEL_TOTAL
private static final int[] SMOOTHING_KERNEL
private final Config<BuilderToolsPlugin.BuilderToolsConfig> config
private static final Message MESSAGE_PACK_NOT_FOUND
private static final Message MESSAGE_PACK_IMMUTABLE
private ResourceType<EntityStore,PrefabEditSession> prefabEditSessionResourceType
