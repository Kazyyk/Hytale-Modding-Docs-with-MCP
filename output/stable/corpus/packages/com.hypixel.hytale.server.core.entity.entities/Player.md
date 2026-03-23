# Player

Type: class | Package: com.hypixel.hytale.server.core.entity.entities

public class Player

Core ECS component for player entities. Manages game mode, inventory, hotbar, window manager, camera, HUD, movement, permissions, interaction chains, and entity lifecycle operations.

Also in this package: BlockEntity, ProjectileComponent

Complete API:
  public static ComponentType<EntityStore,Player> getComponentType()
  public void copyFrom(Player oldPlayerComponent)
  public void init(UUID uuid, PlayerRef playerRef)
  public void setNetworkId(int id)
  protected Inventory createDefaultInventory()
  public Inventory setInventory(Inventory inventory)
  public boolean remove()
  public void moveTo(Ref<EntityStore> ref, double locX, double locY, double locZ, ComponentAccessor<EntityStore> componentAccessor)
  public PlayerConfigData getPlayerConfigData()
  public void markNeedsSave()
  public void unloadFromWorld()
  public void applyMovementStates(Ref<EntityStore> ref, SavedMovementStates savedMovementStates, MovementStates movementStates, ComponentAccessor<EntityStore> componentAccessor)
  public void startClientReadyTimeout()
  public void handleClientReady(boolean forced)
  public void sendInventory()
  public CompletableFuture<Void> saveConfig(World world, Holder<EntityStore> holder)
  public PacketHandler getPlayerConnection()
  public WorldMapTracker getWorldMapTracker()
  public WindowManager getWindowManager()
  public PageManager getPageManager()
  public HudManager getHudManager()
  public HotbarManager getHotbarManager()
  public boolean isFirstSpawn()
  public void setFirstSpawn(boolean firstSpawn)
  public void resetManagers(Holder<EntityStore> holder)
  public void notifyPickupItem(Ref<EntityStore> ref, ItemStack itemStack, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isOverrideBlockPlacementRestrictions()
  public void setOverrideBlockPlacementRestrictions(Ref<EntityStore> ref, boolean overrideBlockPlacementRestrictions, ComponentAccessor<EntityStore> componentAccessor)
  public void sendMessage(Message message)
  public boolean hasPermission(String id)
  public boolean hasPermission(String id, boolean def)
  public void addLocationChange(Ref<EntityStore> ref, double deltaX, double deltaY, double deltaZ, ComponentAccessor<EntityStore> componentAccessor)
  public void configTriggerBlockProcessing(boolean triggers, boolean blockDamage, CollisionResultComponent collisionResultComponent)
  public void resetVelocity(Velocity velocity)
  public void processVelocitySample(double dt, Vector3d position, Velocity velocity)
  public static CompletableFuture<Transform> getRespawnPosition(Ref<EntityStore> ref, String worldName, ComponentAccessor<EntityStore> componentAccessor)
  private static CompletableFuture<Transform> tryUseSpawnPoint(World world, List<PlayerRespawnPointData> sortedRespawnPoints, int index, Ref<EntityStore> ref, Player playerComponent, Box boundingBox)
  private static Vector3d ensureNoCollisionAtRespawnPosition(PlayerRespawnPointData playerRespawnPointData, Box playerHitbox, World world)
  public boolean hasSpawnProtection()
  public boolean isWaitingForClientReady()
  public boolean isHiddenFromLivingEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public void setClientViewRadius(int clientViewRadius)
  public int getClientViewRadius()
  public int getViewRadius()
  public boolean canDecreaseItemStackDurability(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public boolean canApplyItemStackPenalties(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public ItemStackSlotTransaction updateItemStackDurability(Ref<EntityStore> ref, ItemStack itemStack, ItemContainer container, int slotId, double durabilityChange, ComponentAccessor<EntityStore> componentAccessor)
  public MetricResults toMetricResults()
  public void setLastSpawnTimeNanos(long lastSpawnTimeNanos)
  public long getSinceLastSpawnNanos()
  public PlayerRef getPlayerRef()
  public int getMountEntityId()
  public void setMountEntityId(int mountEntityId)
  public GameMode getGameMode()
  public static void setGameMode(Ref<EntityStore> playerRef, GameMode gameMode, ComponentAccessor<EntityStore> componentAccessor)
  public static void initGameMode(Ref<EntityStore> playerRef, ComponentAccessor<EntityStore> componentAccessor)
  private static void setGameModeInternal(Ref<EntityStore> playerRef, GameMode gameMode, MovementManager movementManager, ComponentAccessor<EntityStore> componentAccessor)
  private static void runOnSwitchToGameMode(Ref<EntityStore> ref, GameMode gameMode)
  public ItemStackTransaction giveItem(ItemStack stack, Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public int hashCode()
  public boolean equals(Object o)
  public String toString()
  public String getDisplayName()

Fields:
public static final MetricsRegistry<Player> METRICS_REGISTRY
public static final KeyedCodec<PlayerConfigData> PLAYER_CONFIG_DATA
public static final BuilderCodec<Player> CODEC
public static final int DEFAULT_VIEW_RADIUS_CHUNKS
public static final long RESPAWN_INVULNERABILITY_TIME_NANOS
public static final long MAX_TELEPORT_INVULNERABILITY_MILLIS
private PlayerRef playerRef
private PlayerConfigData data
private final WorldMapTracker worldMapTracker
private final WindowManager windowManager
private final PageManager pageManager
private final HudManager hudManager
private HotbarManager hotbarManager
private GameMode gameMode
private int clientViewRadius
protected long lastSpawnTimeNanos
private static final int MAX_VELOCITY_SAMPLE_COUNT
private static final int VELOCITY_SAMPLE_LENGTH
private static final double[][] velocitySampleWeights
private final double[] velocitySamples
private int velocitySampleCount
private int velocitySampleIndex
private boolean overrideBlockPlacementRestrictions
private final AtomicInteger readyId
private final AtomicReference<ScheduledFuture<?>> waitingForClientReady
public boolean executeTriggers
public boolean executeBlockDamage
private boolean firstSpawn
private int mountEntityId
