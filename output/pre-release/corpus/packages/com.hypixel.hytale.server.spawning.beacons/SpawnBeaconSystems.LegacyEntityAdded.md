# SpawnBeaconSystems.LegacyEntityAdded

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: RefSystem<EntityStore>

public static class SpawnBeaconSystems.LegacyEntityAdded extends RefSystem<EntityStore>

Handles LegacySpawnBeaconEntity entity initialization. On add, resolves the spawn wrapper, creates a `BeaconSpawnController`, initializes a `FloodFillPositionSelector`, computes initial scaled max spawns, and adds an InitialBeaconDelay on load. Removes the entity if the config is missing.

Declared as a static inner class of SpawnBeaconSystems.

Also in this package: CheckDespawn, ControllerTick, EntityAdded, InitialBeaconDelay, LegacySpawnBeaconEntity, LoadTimeDelay, PositionSelectorUpdate, SpawnBeacon, SpawnBeaconSystems, SpawnJobTick

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,LegacySpawnBeaconEntity> componentType
