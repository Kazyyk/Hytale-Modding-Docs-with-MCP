# SpawnBeaconSystems.PositionSelectorUpdate

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: EntityTickingSystem<EntityStore>

public static class SpawnBeaconSystems.PositionSelectorUpdate extends EntityTickingSystem<EntityStore>

Rebuilds `FloodFillPositionSelector` position caches when flagged for rebuild. Uses the beacon's transform position and a `FloodFillEntryPoolProviderSimple` resource. Runs after `CheckDespawn`.

Declared as a static inner class of SpawnBeaconSystems.

Also in this package: CheckDespawn, ControllerTick, EntityAdded, InitialBeaconDelay, LegacyEntityAdded, LegacySpawnBeaconEntity, LoadTimeDelay, SpawnBeacon, SpawnBeaconSystems, SpawnJobTick

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,FloodFillPositionSelector> componentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final ResourceType<EntityStore,FloodFillEntryPoolProviderSimple> floodFillEntryPoolProviderSimpleResourceType
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
