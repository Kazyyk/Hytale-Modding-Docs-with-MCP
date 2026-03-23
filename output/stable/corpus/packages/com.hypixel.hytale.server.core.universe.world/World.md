# World

Type: class | Package: com.hypixel.hytale.server.core.universe.world | Extends: TickingThread | Implements: Executor, ExecutorMetricsRegistry.ExecutorMetric, ChunkAccessor, IWorldChunks, IMessageReceiver

public class World extends TickingThread implements Executor, ExecutorMetricsRegistry.ExecutorMetric, ChunkAccessor<WorldChunk>, IWorldChunks, IMessageReceiver

Central class representing a game world. Runs on its own `TickingThread`, owns a `ChunkStore` and `EntityStore`, manages player connections, chunk lighting, world map, event dispatching, and world lifecycle (start, tick, pause, save, shutdown). Worlds are named and persisted to a save directory with a `WorldConfig`. Client features (health bars, combat text, armor visibility) are configured at construction time from gameplay config.

## Constants

- SAVE_INTERVAL | float | 10.0F | World save interval in seconds.
- DEFAULT | String | "default" | Default world name.

## Key Fields

- name | String | World name (thread name is `"WorldThread - " + name`).
- savePath | Path | Directory for persistent world data.
- worldConfig | WorldConfig | Configuration including seed, spawn, world gen, game mode, etc.
- chunkStore | ChunkStore | Chunk-level ECS storage manager.
- entityStore | EntityStore | Entity-level ECS storage manager.
- chunkLighting | ChunkLightingManager | Manages chunk light propagation.
- worldMapManager | WorldMapManager | Manages world map images and markers.
- eventRegistry | EventRegistry | World-scoped event bus.
- notificationHandler | WorldNotificationHandler | Sends block change notifications to players.
- players | Map<UUID, PlayerRef> | Connected players indexed by UUID.
- features | Map<ClientFeature, Boolean> | Client feature toggles.
- taskQueue | Deque<Runnable> | Thread-safe queue for tasks to execute on the world thread.

## Key Methods

- getName() | String | Returns the world name.
- getWorldConfig() | WorldConfig | Returns the world configuration.
- getEntityStore() | EntityStore | Returns the entity store.
- getChunkStore() | ChunkStore | Returns the chunk store.
- getPlayerRefs() | Collection<PlayerRef> | Returns an unmodifiable view of connected player refs.
- getWorldMapManager() | WorldMapManager | Returns the world map manager.
- getNotificationHandler() | WorldNotificationHandler | Returns the block notification handler.
- getEventRegistry() | EventRegistry | Returns the world event registry.
- execute(Runnable) | void | Submits a task to the world thread queue.

## See Also

- WorldConfig
- WorldNotificationHandler
- WorldMapTracker
- WorldProvider

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, ParticleUtil, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SoundUtil, SpawnUtil, ValidationOption, WorldConfig, WorldConfigProvider, WorldMapTracker, WorldNotificationHandler, WorldProvider, ZoneDiscoveryInfo

Complete API:
  public CompletableFuture<World> init()
  protected void onStart()
  public void stopIndividualWorld()
  public void stopIndividualWorld(Map<UUID,PlayerRef> players)
  public void validateDeleteOnRemove()
  private void deleteWorldFromDisk()
  protected boolean isIdle()
  protected void tick(float dt)
  protected void onShutdown()
  public void setTps(int tps)
  public static void setTimeDilation(float timeDilationModifier, ComponentAccessor<EntityStore> componentAccessor)
  public String getName()
  public boolean isAlive()
  public WorldConfig getWorldConfig()
  public DeathConfig getDeathConfig()
  public int getDaytimeDurationSeconds()
  public int getNighttimeDurationSeconds()
  public boolean isTicking()
  public void setTicking(boolean ticking)
  public boolean isPaused()
  public void setPaused(boolean paused)
  public long getTick()
  public HytaleLogger getLogger()
  public boolean isCompassUpdating()
  public void setCompassUpdating(boolean compassUpdating)
  public void getBlockBulkRelative(Long2ObjectMap<T> blocks, IntUnaryOperator xConvert, IntUnaryOperator yConvert, IntUnaryOperator zConvert, World.GenericBlockBulkUpdater<T> consumer)
  public WorldChunk loadChunkIfInMemory(long index)
  public WorldChunk getChunkIfInMemory(long index)
  public WorldChunk getChunkIfLoaded(long index)
  public WorldChunk getChunkIfNonTicking(long index)
  public CompletableFuture<WorldChunk> getChunkAsync(long index)
  public CompletableFuture<WorldChunk> getNonTickingChunkAsync(long index)
  public List<Player> getPlayers()
  public Entity getEntity(UUID uuid)
  public Ref<EntityStore> getEntityRef(UUID uuid)
  public int getPlayerCount()
  public Collection<PlayerRef> getPlayerRefs()
  public void trackPlayerRef(PlayerRef playerRef)
  public void untrackPlayerRef(PlayerRef playerRef)
  public T spawnEntity(T entity, Vector3d position, Vector3f rotation)
  public T addEntity(T entity, Vector3d position, Vector3f rotation, AddReason reason)
  public void sendMessage(Message message)
  public void execute(Runnable command)
  public void consumeTaskQueue()
  public ChunkStore getChunkStore()
  public EntityStore getEntityStore()
  public ChunkLightingManager getChunkLighting()
  public WorldMapManager getWorldMapManager()
  public WorldPathConfig getWorldPathConfig()
  public WorldNotificationHandler getNotificationHandler()
  public EventRegistry getEventRegistry()
  public CompletableFuture<PlayerRef> addPlayer(PlayerRef playerRef)
  public CompletableFuture<PlayerRef> addPlayer(PlayerRef playerRef, Transform transform)
  public CompletableFuture<PlayerRef> addPlayer(PlayerRef playerRef, Transform transform, Boolean clearWorldOverride, Boolean fadeInOutOverride)
  private PlayerRef onFinishPlayerJoining(Player playerComponent, PlayerRef playerRefComponent, PacketHandler packetHandler, boolean broadcastJoin)
  private void onSetupPlayerJoining(Holder<EntityStore> holder, Player playerComponent, PlayerRef playerRefComponent, PacketHandler packetHandler, Transform transform, boolean clearWorld, boolean fadeInOut)
  public CompletableFuture<Void> drainPlayersTo(World fallbackTargetWorld, Collection<PlayerRef> players)
  public GameplayConfig getGameplayConfig()
  public Map<ClientFeature,Boolean> getFeatures()
  public boolean isFeatureEnabled(ClientFeature feature)
  public void registerFeature(ClientFeature feature, boolean enabled)
  public void broadcastFeatures()
  public Path getSavePath()
  public void updateEntitySeed(Store<EntityStore> store)
  public void markGCHasRun()
  public boolean consumeGCHasRun()
  public int hashCode()
  public boolean equals(Object o)
  public String toString()
  public void validate(StringBuilder errors, IPrefabBuffer.RawBlockConsumer<Void> blockValidator, EnumSet<ValidationOption> options)

Fields:
public static final float SAVE_INTERVAL
public static final String DEFAULT
public static final ExecutorMetricsRegistry<World> METRICS_REGISTRY
private final HytaleLogger logger
private final String name
private final Path savePath
private final WorldConfig worldConfig
private final ChunkStore chunkStore
private final EntityStore entityStore
private final ChunkLightingManager chunkLighting
private final WorldMapManager worldMapManager
private WorldPathConfig worldPathConfig
private final AtomicBoolean acceptingTasks
private final Deque<Runnable> taskQueue
private final AtomicBoolean alive
private final EventRegistry eventRegistry
private final WorldNotificationHandler notificationHandler
private boolean isTicking
private boolean isPaused
private long tick
private final Random random
private final AtomicInteger entitySeed
private final Map<UUID,PlayerRef> players
private final Collection<PlayerRef> playerRefs
private final Map<ClientFeature,Boolean> features
private volatile boolean gcHasRun
