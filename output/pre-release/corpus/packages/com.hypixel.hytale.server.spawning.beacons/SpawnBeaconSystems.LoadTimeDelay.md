# SpawnBeaconSystems.LoadTimeDelay

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: EntityTickingSystem<EntityStore>

public static class SpawnBeaconSystems.LoadTimeDelay extends EntityTickingSystem<EntityStore>

Ticks down InitialBeaconDelay components each frame. When the delay expires, removes the component so the beacon can begin spawning. Runs with `RootDependency.lastSet()` ordering.

Declared as a static inner class of SpawnBeaconSystems.

Also in this package: CheckDespawn, ControllerTick, EntityAdded, InitialBeaconDelay, LegacyEntityAdded, LegacySpawnBeaconEntity, PositionSelectorUpdate, SpawnBeacon, SpawnBeaconSystems, SpawnJobTick

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,InitialBeaconDelay> componentType
private final Set<Dependency<EntityStore>> dependencies
