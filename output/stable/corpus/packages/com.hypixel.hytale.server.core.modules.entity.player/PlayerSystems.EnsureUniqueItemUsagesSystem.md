# PlayerSystems.EnsureUniqueItemUsagesSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: HolderSystem<EntityStore>

public static class PlayerSystems.EnsureUniqueItemUsagesSystem extends HolderSystem<EntityStore>

An ECS holder system that ensures every player entity has a `UniqueItemUsagesComponent`. Queries entities with `PlayerRef` but without `UniqueItemUsagesComponent`.

## Related Types

- PlayerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
