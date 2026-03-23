# SpawnBeaconSystems.ControllerTick

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: SpawnControllerSystem<NPCBeaconSpawnJob, BeaconSpawnController>

public static class SpawnBeaconSystems.ControllerTick extends SpawnControllerSystem<NPCBeaconSpawnJob, BeaconSpawnController>

The main spawn controller tick system for legacy beacons. Validates spawned entities (despawning idle/out-of-range NPCs), collects players in the beacon radius with Y-range filtering, scales max total and concurrent spawns using response curves, sorts players by threat, and generates spawn jobs. Depends on `PlayerSpatialSystem` and `PositionSelectorUpdate`.

Declared as a static inner class of SpawnBeaconSystems.

Also in this package: CheckDespawn, EntityAdded, InitialBeaconDelay, LegacyEntityAdded, LegacySpawnBeaconEntity, LoadTimeDelay, PositionSelectorUpdate, SpawnBeacon, SpawnBeaconSystems, SpawnJobTick

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private static boolean isReadyToRespawn(LegacySpawnBeaconEntity spawnBeacon, WorldTimeResource worldTimeResource)
  protected void prepareSpawnJobGeneration(BeaconSpawnController spawnController, ComponentAccessor<EntityStore> componentAccessor)
  protected void createRandomSpawnJobs(BeaconSpawnController spawnController, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final ThreadLocal<List<NPCEntity>> THREAD_LOCAL_VALIDATED_ENTITIES
private final ComponentType<EntityStore,LegacySpawnBeaconEntity> componentType
private final ComponentType<EntityStore,FloodFillPositionSelector> floodFillPositionSelectorComponentType
private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
private final ComponentType<EntityStore,NPCEntity> npcComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final ComponentType<EntityStore,DeathComponent> deathComponentComponentType
private final ComponentType<EntityStore,UUIDComponent> uuidComponentType
private final ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> playerSpatialResource
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
