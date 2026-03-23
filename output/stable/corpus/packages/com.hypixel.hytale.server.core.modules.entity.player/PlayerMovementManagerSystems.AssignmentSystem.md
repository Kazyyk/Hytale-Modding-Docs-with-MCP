# PlayerMovementManagerSystems.AssignmentSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: HolderSystem<EntityStore>

public static class PlayerMovementManagerSystems.AssignmentSystem extends HolderSystem<EntityStore>

An ECS holder system that ensures every player entity has a `MovementManager` component. Queries entities with `PlayerRef` but without `MovementManager`, and adds the component on entity creation.

## Related Types

- PlayerMovementManagerSystems -- parent container class
- PlayerMovementManagerSystems.PostAssignmentSystem -- resets defaults after assignment

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Fields:
private static final ComponentType<EntityStore,MovementManager> MOVEMENT_MANAGER_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
