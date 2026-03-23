# PrefabEditSessionManager

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor

public class PrefabEditSessionManager

Manages the lifecycle of prefab edit sessions. Handles creating editor worlds (flat or void generation), loading prefab files, pasting them into the world, teleporting the player, providing the prefab selector tool, and cleanup on cancellation. Listens to `AddPlayerToWorldEvent` and `PlayerReadyEvent` to manage post-teleport setup. Tracks active sessions, in-progress loads, and which prefab files are currently being edited (to prevent concurrent edits).

## Constants

- NOON_TIME | float | 0.5F | Noon time fraction for editor worlds.
- DEFAULT_NEW_WORLD_ZERO_COORDINATE_BLOCK_NAME | String | "Rock_Stone" | Block used at origin in flat editor worlds.
- DEFAULT_ENVIRONMENT | String | "Zone1_Sunny" | Default environment for editor worlds.
- DEFAULT_CHUNK_ENVIRONMENT | String | "Env_Zone1_Plains" | Default chunk environment.
- PREFAB_EDITING_WORLD_NAME_PREFIX | String | "prefabEditor-" | World name prefix for editor worlds.
- DEFAULT_GRASS_TINT_HEX | String | "#5B9E28" | Default grass tint hex color.

## Key Methods

- isEditingAPrefab(UUID) | boolean | Whether the player has an active edit session.
- getPrefabEditSession(UUID) | PrefabEditSession | Returns the active session for a player.
- getActiveEditSessions() | Map<UUID, PrefabEditSession> | Returns all active sessions.
- loadPrefabAndCreateEditSession(Ref, Player, PrefabEditorCreationSettings, Store, Consumer) | CompletableFuture<Void> | Creates an editor world, loads and pastes prefabs, and teleports the player.
- exitEditSession(Ref, World, PlayerRef, Store) | void | Exits a session, returning the player to their original world.
- cleanupCancelledSession(UUID, String, Consumer) | CompletableFuture<Void> | Cleans up a cancelled loading session.
- updatePathOfLoadedPrefab(Path, Path) | void | Updates tracking when a prefab file is renamed.
- populateActiveEditSession(UUID, PrefabEditSession) | void | Restores a session from deserialization.
- populatePrefabsBeingEdited(Path) | void | Marks a prefab file as being edited.
- scheduleAnchorEntityRecreation(PrefabEditSession) | void | Schedules anchor entity recreation after deserialization.

## See Also

- PrefabEditSession
- PrefabEditorCreationSettings
- PrefabLoadingState

Also in this package: BlockBreakDirtySystem, BlockPlaceDirtySystem, LoadingError, Phase, PrefabAnchor, PrefabDirtySystems, PrefabEditSession, PrefabEditingMetadata, PrefabEditorCreationContext, PrefabEditorCreationSettings, PrefabLoadingState, PrefabMarkerProvider, PrefabSelectionInteraction, Tri

Complete API:
  private void onPlayerReady(PlayerReadyEvent event)
  private static void givePrefabSelectorTool(Ref<EntityStore> ref, Player playerComponent, PlayerRef playerRef, ComponentAccessor<EntityStore> componentAccessor)
  public void onPlayerAddedToWorld(AddPlayerToWorldEvent event)
  public void updatePathOfLoadedPrefab(Path oldPath, Path newPath)
  public boolean isEditingAPrefab(UUID playerUUID)
  public PrefabEditSession getPrefabEditSession(UUID playerUUID)
  public Map<UUID,PrefabEditSession> getActiveEditSessions()
  void populateActiveEditSession(UUID playerUuid, PrefabEditSession editSession)
  void populatePrefabsBeingEdited(Path prefabPath)
  void scheduleAnchorEntityRecreation(PrefabEditSession editSession)
  public boolean hasInProgressLoading(UUID playerUuid)
  public void cancelLoading(UUID playerUuid)
  public boolean isLoadingCancelled(UUID playerUuid)
  public void clearLoadingState(UUID playerUuid)
  public CompletableFuture<Void> createEditSessionForNewPrefab(Ref<EntityStore> ref, Player editor, PrefabEditorCreationSettings settings, ComponentAccessor<EntityStore> componentAccessor)
  public CompletableFuture<Void> loadPrefabAndCreateEditSession(Ref<EntityStore> ref, Player editor, PrefabEditorCreationSettings settings, ComponentAccessor<EntityStore> componentAccessor)
  public CompletableFuture<Void> loadPrefabAndCreateEditSession(Ref<EntityStore> ref, Player editor, PrefabEditorCreationSettings settings, ComponentAccessor<EntityStore> componentAccessor, Consumer<PrefabLoadingState> progressCallback)
  private void notifyProgress(Consumer<PrefabLoadingState> progressCallback, PrefabLoadingState loadingState)
  private CompletableFuture<Void> createEditSession(Ref<EntityStore> ref, PrefabEditorCreationContext context, boolean createNewPrefab, ComponentAccessor<EntityStore> componentAccessor)
  private CompletableFuture<Void> createEditSession(Ref<EntityStore> ref, PrefabEditorCreationContext context, boolean createNewPrefab, ComponentAccessor<EntityStore> componentAccessor, PrefabLoadingState loadingState, Consumer<PrefabLoadingState> progressCallback)
  private CompletableFuture<World> getWorldCreatingFuture(PrefabEditorCreationContext context, WorldConfig config)
  private String getWorldName(PrefabEditorCreationContext context)
  private String getWeatherFromEnvironment(String environmentId)
  private Path getSavePath(PrefabEditorCreationContext context)
  private void applyWorldGenWorldConfig(PrefabEditorCreationContext context, int yLevelToPastePrefabsAt, WorldConfig worldConfig)
  private CompletableFuture<World> getPrefabCreatingCompletableFuture(PrefabEditorCreationContext context, PrefabEditSession editSession, WorldConfig worldConfig)
  private CompletableFuture<World> getPrefabLoadingCompletableFuture(PrefabEditorCreationContext context, PrefabEditSession editSession, WorldConfig worldConfig, PrefabLoadingState loadingState, Consumer<PrefabLoadingState> progressCallback, UUID playerUuid)
  private int[] calculateRowGroups(PrefabEditorCreationContext context, int prefabCount)
  private int getAmountOfBlocksBelowPrefab(int prefabHeight, int desiredYLevel)
  public boolean isInEditWorld(PlayerRef playerRef, Store<EntityStore> store)
  public CompletableFuture<Void> sendToEditWorld(Ref<EntityStore> ref, World world, PlayerRef playerRef)
  public CompletableFuture<Void> exitEditSession(Ref<EntityStore> ref, World world, PlayerRef playerRef, ComponentAccessor<EntityStore> componentAccessor)
  public CompletableFuture<Void> cleanupCancelledSession(UUID playerUuid, String worldName, Consumer<PrefabLoadingState> progressCallback)
  public CompletableFuture<Void> cleanupCancelledSession(UUID playerUuid, String worldName)
  private CompletableFuture<IPrefabBuffer> getPrefabBuffer(CommandSender sender, Path path)

Fields:
private static final HytaleLogger LOGGER
private static final Message MESSAGE_COMMANDS_PREFAB_EDIT_SESSION_MANAGER_EXISTING_EDIT_SESSION
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_SOMETHING_WENT_WRONG
public static final float NOON_TIME
public static final String DEFAULT_NEW_WORLD_ZERO_COORDINATE_BLOCK_NAME
public static final String DEFAULT_ENVIRONMENT
private static final String PREFAB_SELECTOR_TOOL_ID
public static final String DEFAULT_CHUNK_ENVIRONMENT
public static final String PREFAB_EDITING_WORLD_NAME_PREFIX
public static final Color DEFAULT_TINT
private static final long PROGRESS_UPDATE_INTERVAL_NANOS
public static final String DEFAULT_GRASS_TINT_HEX
private final Map<UUID,PrefabEditSession> activeEditSessions
private final HashSet<Path> prefabsBeingEdited
private final Map<UUID,UUID> inProgressTeleportations
private final HashSet<UUID> inProgressLoading
private final HashSet<UUID> cancelledLoading
