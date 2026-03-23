# SpawnMarkerEntity

Type: class | Package: com.hypixel.hytale.server.spawning.spawnmarkers | Implements: Component<EntityStore>

public class SpawnMarkerEntity implements Component<EntityStore>

ECS component for spawn marker entities. Tracks the marker's spawn state including the referenced `SpawnMarker` asset, respawn timer, NPC references, flock data, suppression state, and deactivation behavior. Handles the full spawn lifecycle: validation, position testing, NPC creation, flock integration, and failure handling with automatic removal after 5 consecutive failures.

## Key Constants

- SPAWN_LOST_TIMEOUT | double | 35.0 | Seconds before a lost spawn connection triggers respawn.
- MAX_FAILED_SPAWNS | int | 5 | Consecutive failures before the marker entity is removed.

## Methods

- getComponentType() | ComponentType<EntityStore, SpawnMarkerEntity> | Returns the registered component type from `SpawningPlugin`.
- getCachedMarker() | SpawnMarker | Returns the cached asset reference.
- setCachedMarker(SpawnMarker) | void | Sets the cached asset reference.
- getSpawnCount() | int | Number of currently spawned NPCs.
- setSpawnCount(int) | void | Sets the spawn count.
- tickRespawnTimer(float dt) | boolean | Decrements the realtime respawn counter, returning `true` when it reaches zero.
- spawnNPC(Ref, SpawnMarker, Store) | boolean | Attempts to spawn an NPC from the marker's weighted configurations. Performs role validation, exclusion radius checks, position testing, and flock spawning.
- trigger(Ref, Store) | boolean | Manually triggers a spawn for manual-trigger markers when spawn count is zero.
- suppress(UUID) | void | Adds a suppressor UUID to prevent spawning.
- releaseSuppression(UUID) | void | Removes a suppressor.
- getStoredFlock() | StoredFlock | Returns stored flock data for deactivation/reactivation.
- getNpcReferences() | InvalidatablePersistentRef[] | Returns persistent references to spawned NPCs.
- isManualTrigger() | boolean | Whether this marker requires manual triggering.

## Serialized Fields (CODEC)

`SpawnMarker` (String), `RespawnTime` (double), `SpawnCount` (int), `GameTimeRespawn` (Duration), `SpawnAfter` (Instant), `NPCReferences` (InvalidatablePersistentRef[]), `PersistedFlock` (StoredFlock), `SpawnPosition` (Vector3d)

Also in this package: AddedFromWorldGen, CacheMarker, EnsureNetworkSendable, EntityAdded, EntityAddedFromExternal, FailReason, LegacyEntityMigration, SpawnMarkerSystems, Ticking

Complete API:
  public static ComponentType<EntityStore,SpawnMarkerEntity> getComponentType()
  public SpawnMarker getCachedMarker()
  public void setCachedMarker(SpawnMarker marker)
  public int getSpawnCount()
  public void setSpawnCount(int spawnCount)
  public void setRespawnCounter(double respawnCounter)
  public void setSpawnAfter(Instant spawnAfter)
  public Instant getSpawnAfter()
  public void setGameTimeRespawn(Duration gameTimeRespawn)
  public Duration pollGameTimeRespawn()
  public boolean tickRespawnTimer(float dt)
  public Set<UUID> getSuppressedBy()
  public void setStoredFlock(StoredFlock storedFlock)
  public StoredFlock getStoredFlock()
  public double getTimeToDeactivation()
  public void setTimeToDeactivation(double timeToDeactivation)
  public boolean tickTimeToDeactivation(float dt)
  public boolean tickSpawnLostTimeout(float dt)
  public Vector3d getSpawnPosition()
  public InvalidatablePersistentRef[] getNpcReferences()
  public void setNpcReferences(InvalidatablePersistentRef[] npcReferences)
  public List<Pair<Ref<EntityStore>,NPCEntity>> getTempStorageList()
  public void setTempStorageList(List<Pair<Ref<EntityStore>,NPCEntity>> tempStorageList)
  public boolean isDespawnStarted()
  public void setDespawnStarted(boolean despawnStarted)
  public void refreshTimeout()
  public boolean spawnNPC(Ref<EntityStore> ref, SpawnMarker marker, Store<EntityStore> store)
  private void fail(Ref<EntityStore> self, UUID uuid, String role, Vector3d position, Store<EntityStore> store, SpawnMarkerEntity.FailReason reason)
  public void setSpawnMarker(SpawnMarker marker)
  public int decrementAndGetSpawnCount()
  public String getSpawnMarkerId()
  public boolean isManualTrigger()
  public boolean trigger(Ref<EntityStore> markerRef, Store<EntityStore> store)
  public void suppress(UUID suppressor)
  public void releaseSuppression(UUID suppressor)
  public void clearAllSuppressions()
  public Component<EntityStore> clone()
  public Component<EntityStore> cloneSerializable()
  public String toString()
  public static Model getModel(SpawnMarker marker)

Fields:
private static final double SPAWN_LOST_TIMEOUT
private static final InvalidatablePersistentRef[] EMPTY_REFERENCES
public static final ArrayCodec<InvalidatablePersistentRef> NPC_REFERENCES_CODEC
public static final BuilderCodec<SpawnMarkerEntity> CODEC
private static final int MAX_FAILED_SPAWNS
private String spawnMarkerId
private SpawnMarker cachedMarker
private double respawnCounter
private Duration gameTimeRespawn
private Instant spawnAfter
private int spawnCount
private Set<UUID> suppressedBy
private int failedSpawns
private final SpawningContext context
private final Vector3d spawnPosition
private InvalidatablePersistentRef[] npcReferences
private StoredFlock storedFlock
private List<Pair<Ref<EntityStore>,NPCEntity>> tempStorageList
private double timeToDeactivation
private boolean despawnStarted
private double spawnLostTimeoutCounter
