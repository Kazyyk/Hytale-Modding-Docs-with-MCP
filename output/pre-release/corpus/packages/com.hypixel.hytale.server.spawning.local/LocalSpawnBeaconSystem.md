# LocalSpawnBeaconSystem

Type: class | Package: com.hypixel.hytale.server.spawning.local | Extends: RefSystem<EntityStore>

public class LocalSpawnBeaconSystem extends RefSystem<EntityStore>

Reference system that triggers forced rerun of local spawn controllers when a local spawn beacon entity is removed.

## Methods

- public void onEntityAdded(Ref<EntityStore> reference, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public void onEntityRemove(Ref<EntityStore> reference, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public Query<EntityStore> getQuery()
