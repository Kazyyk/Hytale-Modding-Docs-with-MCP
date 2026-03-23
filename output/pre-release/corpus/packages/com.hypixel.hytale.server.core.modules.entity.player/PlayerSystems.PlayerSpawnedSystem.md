# PlayerSystems.PlayerSpawnedSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class PlayerSystems.PlayerSpawnedSystem extends RefSystem<EntityStore>

An ECS ref system that sends the player's initial entity state to themselves when added to the store. Calls the deprecated `sendPlayerSelf()` method which constructs a comprehensive `EntityUpdates` packet including model, skin, equipment, transform, effects, stats, nameplate, and component flags.

## Related Types

- PlayerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public static void sendPlayerSelf(Ref<EntityStore> viewerRef, Store<EntityStore> store)
