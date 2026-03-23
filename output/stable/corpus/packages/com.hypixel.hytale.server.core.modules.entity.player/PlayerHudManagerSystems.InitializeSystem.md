# PlayerHudManagerSystems.InitializeSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class PlayerHudManagerSystems.InitializeSystem extends RefSystem<EntityStore>

An ECS ref system that sends the initial HUD component visibility state to the player's client when the entity is added to the store. Queries entities with both `PlayerRef` and `Player` components. Calls `HudManager.sendVisibleHudComponents()` on the player's packet handler.

## Related Types

- PlayerHudManagerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final ComponentType<EntityStore,PlayerRef> PLAYER_REF_COMPONENT_TYPE
private static final ComponentType<EntityStore,Player> PLAYER_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
