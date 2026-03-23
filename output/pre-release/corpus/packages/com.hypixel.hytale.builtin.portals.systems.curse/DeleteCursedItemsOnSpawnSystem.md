# DeleteCursedItemsOnSpawnSystem

Type: class | Package: com.hypixel.hytale.builtin.portals.systems.curse | Extends: RefSystem

public class DeleteCursedItemsOnSpawnSystem extends RefSystem

## Methods

- @Override public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- @Override public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- @Nullable @Override public Query<EntityStore> getQuery()

Also in this package: CurseItemDropsSystem, DiedInPortalSystem

Complete API:
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()
