# PlayerMovementManagerSystems.PostAssignmentSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class PlayerMovementManagerSystems.PostAssignmentSystem extends RefSystem<EntityStore>

An ECS ref system that resets the `MovementManager` to its defaults and sends an update after a player entity with both `MovementManager` and `PlayerRef` is added to the store. Calls `MovementManager.resetDefaultsAndUpdate()`.

## Related Types

- PlayerMovementManagerSystems -- parent container class
- PlayerMovementManagerSystems.AssignmentSystem -- ensures the component exists first

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final ComponentType<EntityStore,MovementManager> MOVEMENT_MANAGER_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
