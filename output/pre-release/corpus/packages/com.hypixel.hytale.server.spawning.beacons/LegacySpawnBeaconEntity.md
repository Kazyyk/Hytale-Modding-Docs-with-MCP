# LegacySpawnBeaconEntity

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: Entity

public class LegacySpawnBeaconEntity extends Entity

The legacy spawn beacon entity component. An invisible, non-collidable entity that manages NPC spawning via a `BeaconSpawnController`. Hidden from players not in Creative mode. Tracks spawn configuration, next spawn timing (supporting both real-time and game-time modes), self-despawn timer, spawn attempt counter, and an optional objective UUID.

Provides static helper methods for managing spawn timers (`prepareNextSpawnTimer`, `clearDespawnTimer`, `setToDespawnAfter`) and a factory method (`create`/`createHolder`) that assembles the full entity holder with transform, UUID, model, display name, nameplate, and optional spawn suppression components.

## Key Methods

- @Nullable public static ComponentType<EntityStore, LegacySpawnBeaconEntity> getComponentType()
- public String getSpawnConfigId()
- public BeaconSpawnController getSpawnController()
- public void setSpawnController(@Nonnull BeaconSpawnController spawnController)
- public Instant getNextSpawnAfter()
- public boolean isNextSpawnAfterRealtime()
- @Nullable public Instant getDespawnSelfAfter()
- public BeaconSpawnWrapper getSpawnWrapper()
- public void setSpawnWrapper(BeaconSpawnWrapper spawnWrapper)
- public int getSpawnAttempts()
- public void setSpawnAttempts(int spawnAttempts)
- public int getLastPlayerCount()
- public void setLastPlayerCount(int lastPlayerCount)
- @Nullable public UUID getObjectiveUUID()
- public void setObjectiveUUID(@Nullable UUID objectiveUUID)
- public void notifyFailedSpawn()
- public void notifySpawn(@Nonnull Player target, @Nonnull Ref<EntityStore> spawnedEntity, @Nonnull Store<EntityStore> store)
- public static void prepareNextSpawnTimer(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void clearDespawnTimer(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void setToDespawnAfter(@Nonnull Ref<EntityStore> ref, @Nullable Duration duration, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public boolean prepareSpawnContext(@Nonnull Vector3d playerPosition, int spawnsThisRound, int roleIndex, @Nonnull SpawningContext spawningContext, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- @Nonnull public static Pair<Ref<EntityStore>, LegacySpawnBeaconEntity> create(@Nonnull BeaconSpawnWrapper spawnWrapper, @Nonnull Vector3d position, @Nonnull Vector3f rotation, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static Holder<EntityStore> createHolder(@Nonnull BeaconSpawnWrapper spawnWrapper, @Nonnull Vector3d position, @Nonnull Vector3f rotation)

Also in this package: CheckDespawn, ControllerTick, EntityAdded, InitialBeaconDelay, LegacyEntityAdded, LoadTimeDelay, PositionSelectorUpdate, SpawnBeacon, SpawnBeaconSystems, SpawnJobTick

Complete API:
  public static ComponentType<EntityStore,LegacySpawnBeaconEntity> getComponentType()
  public String getSpawnConfigId()
  public BeaconSpawnController getSpawnController()
  public void setSpawnController(BeaconSpawnController spawnController)
  public Instant getNextSpawnAfter()
  public boolean isNextSpawnAfterRealtime()
  public Instant getDespawnSelfAfter()
  public void setSpawnAttempts(int spawnAttempts)
  public BeaconSpawnWrapper getSpawnWrapper()
  public void setSpawnWrapper(BeaconSpawnWrapper spawnWrapper)
  public int getSpawnAttempts()
  public int getLastPlayerCount()
  public void setLastPlayerCount(int lastPlayerCount)
  private void setSpawnConfiguration(BeaconSpawnWrapper spawn)
  private void setSpawnConfigId(String spawnConfigId)
  public UUID getObjectiveUUID()
  public void setObjectiveUUID(UUID objectiveUUID)
  public boolean isHiddenFromLivingEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isCollidable()
  public void moveTo(Ref<EntityStore> ref, double locX, double locY, double locZ, ComponentAccessor<EntityStore> componentAccessor)
  public void notifyFailedSpawn()
  public void notifySpawn(Player target, Ref<EntityStore> spawnedEntity, Store<EntityStore> store)
  public static void prepareNextSpawnTimer(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public static void clearDespawnTimer(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public static void setToDespawnAfter(Ref<EntityStore> ref, Duration duration, ComponentAccessor<EntityStore> componentAccessor)
  public void markNPCUnspawnable(int roleIndex)
  public boolean prepareSpawnContext(Vector3d playerPosition, int spawnsThisRound, int roleIndex, SpawningContext spawningContext, CommandBuffer<EntityStore> commandBuffer)
  private void processSpawn(Ref<EntityStore> ref, Player target, Store<EntityStore> store)
  public static Pair<Ref<EntityStore>,LegacySpawnBeaconEntity> create(BeaconSpawnWrapper spawnWrapper, Vector3d position, Vector3f rotation, ComponentAccessor<EntityStore> componentAccessor)
  public static Holder<EntityStore> createHolder(BeaconSpawnWrapper spawnWrapper, Vector3d position, Vector3f rotation)
  public String toString()

Fields:
public static final BuilderCodec<LegacySpawnBeaconEntity> CODEC
private BeaconSpawnController spawnController
protected UUID objectiveUUID
private BeaconSpawnWrapper spawnWrapper
private String spawnConfigId
private Instant nextSpawnAfter
private boolean nextSpawnAfterRealtime
private Instant despawnSelfAfter
private int spawnAttempts
private int lastPlayerCount
