# VoidEventRefSystem

Type: class | Package: com.hypixel.hytale.builtin.portals.systems.voidevent | Extends: RefSystem<EntityStore>

public final class VoidEventRefSystem extends RefSystem<EntityStore>

Reference system reacting to `VoidEvent` entity add/remove. On add, forces music ambience. On remove, clears forced music and stops active void event stage.

## Methods

- public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public Query<EntityStore> getQuery()

Also in this package: Instantiate, StartVoidEventInFragmentSystem, VoidEventStagesSystem, VoidInvasionPortalsSpawnSystem, VoidSpawnerSystems

Complete API:
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()
