# LocalSpawnSetupSystem

Type: class | Package: com.hypixel.hytale.server.spawning.local | Extends: RefSystem<EntityStore>

public class LocalSpawnSetupSystem extends RefSystem<EntityStore>

Reference system that ensures player entities receive a `LocalSpawnController` component when added to the world.

## Methods

- public void onEntityAdded(Ref<EntityStore> reference, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public void onEntityRemove(Ref<EntityStore> reference, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public Query<EntityStore> getQuery()

Also in this package: LocalSpawnBeacon, LocalSpawnBeaconSystem, LocalSpawnController, LocalSpawnControllerSystem, LocalSpawnForceTriggerSystem, LocalSpawnState

Complete API:
  public void onEntityAdded(Ref<EntityStore> reference, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> reference, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()

Fields:
private final ComponentType<EntityStore,Player> componentType
