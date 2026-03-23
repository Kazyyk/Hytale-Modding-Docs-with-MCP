# PlayerSystems.PlayerAddedSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class PlayerSystems.PlayerAddedSystem extends RefSystem<EntityStore>

An ECS ref system that performs full player initialization when a player entity joins a world. Sets display name, records spawn time, initializes game mode, sends inventory and active slot packets, sends creative sound set, handles pending death (shows respawn screen), spawns particle effects, and flushes packets. Depends on `PlayerSpawnedSystem`. On removal, closes all open windows.

## Related Types

- PlayerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final Message MESSAGE_SERVER_GENERAL_KILLED_BY_UNKNOWN
private final Set<Dependency<EntityStore>> dependencies
private final Query<EntityStore> query
