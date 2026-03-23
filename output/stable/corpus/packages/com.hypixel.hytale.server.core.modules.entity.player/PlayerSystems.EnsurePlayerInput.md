# PlayerSystems.EnsurePlayerInput

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: HolderSystem<EntityStore>

public static class PlayerSystems.EnsurePlayerInput extends HolderSystem<EntityStore>

An ECS holder system that ensures every player entity has a PlayerInput component. Adds the component on entity add and removes it on entity removal.

## Related Types

- PlayerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
