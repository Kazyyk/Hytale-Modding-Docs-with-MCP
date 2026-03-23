# SpawnBeaconSystems.CheckDespawn

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: EntityTickingSystem<EntityStore>

public static class SpawnBeaconSystems.CheckDespawn extends EntityTickingSystem<EntityStore>

Checks beacon self-despawn timers. If the game time exceeds `despawnSelfAfter`, despawns all spawned NPCs and removes the beacon. Also checks `BeaconSpawnWrapper.shouldDespawn` for environment-driven despawn conditions.

Declared as a static inner class of SpawnBeaconSystems.

Also in this package: ControllerTick, EntityAdded, InitialBeaconDelay, LegacyEntityAdded, LegacySpawnBeaconEntity, LoadTimeDelay, PositionSelectorUpdate, SpawnBeacon, SpawnBeaconSystems, SpawnJobTick

Complete API:
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private void despawnAllSpawns(List<Ref<EntityStore>> spawnedEntities, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final HytaleLogger LOGGER
private final ComponentType<EntityStore,LegacySpawnBeaconEntity> componentType
private final ComponentType<EntityStore,NPCEntity> npcComponentType
private final Query<EntityStore> query
