# SpawnBeaconSystems.EntityAdded

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: RefSystem<EntityStore>

public static class SpawnBeaconSystems.EntityAdded extends RefSystem<EntityStore>

Handles SpawnBeacon entity initialization. On add, resolves the spawn configuration from `BeaconNPCSpawn` asset map, creates a `FloodFillPositionSelector`, and ensures a `PrefabCopyableComponent`. Removes the entity if the config is missing.

Declared as a static inner class of SpawnBeaconSystems.

Also in this package: CheckDespawn, ControllerTick, InitialBeaconDelay, LegacyEntityAdded, LegacySpawnBeaconEntity, LoadTimeDelay, PositionSelectorUpdate, SpawnBeacon, SpawnBeaconSystems, SpawnJobTick

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,SpawnBeacon> componentType
