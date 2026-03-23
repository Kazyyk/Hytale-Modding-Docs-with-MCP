# SpawnBeaconSystems.SpawnJobTick

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: SpawnJobSystem<NPCBeaconSpawnJob, BeaconSpawnController>

public static class SpawnBeaconSystems.SpawnJobTick extends SpawnJobSystem<NPCBeaconSpawnJob, BeaconSpawnController>

Executes pending NPC beacon spawn jobs. Picks spawn positions using `FloodFillPositionSelector`, spawns NPCs via `NPCPlugin`, creates flocks, and notifies the beacon on success. Handles failure by incrementing spawn attempts and preparing the next spawn timer after 5 failures. Runs after `ControllerTick`.

Declared as a static inner class of SpawnBeaconSystems.

Also in this package: CheckDespawn, ControllerTick, EntityAdded, InitialBeaconDelay, LegacyEntityAdded, LegacySpawnBeaconEntity, LoadTimeDelay, PositionSelectorUpdate, SpawnBeacon, SpawnBeaconSystems

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  protected void onStartRun(NPCBeaconSpawnJob spawnJob)
  protected void onEndProbing(BeaconSpawnController spawnController, NPCBeaconSpawnJob spawnJob, SpawnJobSystem.Result result, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean pickSpawnPosition(BeaconSpawnController spawnController, NPCBeaconSpawnJob spawnJob, CommandBuffer<EntityStore> commandBuffer)
  protected SpawnJobSystem.Result trySpawn(BeaconSpawnController spawnController, NPCBeaconSpawnJob spawnJob, CommandBuffer<EntityStore> commandBuffer)
  protected SpawnJobSystem.Result spawn(World world, BeaconSpawnController spawnController, NPCBeaconSpawnJob spawnJob, CommandBuffer<EntityStore> commandBuffer)
  private void onSpawn(Ref<EntityStore> npcReference, BeaconSpawnController spawnController, NPCBeaconSpawnJob spawnJob, Store<EntityStore> store)
  private static void postSpawn(NPCEntity entity, Ref<EntityStore> ref, int roleIndex, boolean spawnFrozen, Store<EntityStore> store)

Fields:
private static final HytaleLogger LOGGER
private final ComponentType<EntityStore,LegacySpawnBeaconEntity> componentType
private final ComponentType<EntityStore,Player> playerComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
