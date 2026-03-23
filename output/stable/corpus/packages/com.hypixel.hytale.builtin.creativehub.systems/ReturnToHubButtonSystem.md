# ReturnToHubButtonSystem

Type: class | Package: com.hypixel.hytale.builtin.creativehub.systems | Extends: RefSystem

public class ReturnToHubButtonSystem extends RefSystem

## Methods

- @Override public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- @Override public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- @Override public Query<EntityStore> getQuery()
- private Optional<Boolean> getCreativeHubWorldStatus(Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref)

Complete API:
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()
  private Optional<Boolean> getCreativeHubWorldStatus(Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref)
