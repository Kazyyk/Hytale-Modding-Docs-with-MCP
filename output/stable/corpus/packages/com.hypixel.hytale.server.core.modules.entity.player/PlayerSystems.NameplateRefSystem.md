# PlayerSystems.NameplateRefSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class PlayerSystems.NameplateRefSystem extends RefSystem<EntityStore>

An ECS ref system that creates a `Nameplate` component from the `DisplayNameComponent` when a player entity with both `Player` and `DisplayNameComponent` is added, if no nameplate already exists.

## Related Types

- PlayerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
