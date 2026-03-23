# PlayerSystems.BlockPausedMovementSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: RunWhenPausedSystem<EntityStore>, QuerySystem<EntityStore>

public static class PlayerSystems.BlockPausedMovementSystem implements RunWhenPausedSystem<EntityStore>, QuerySystem<EntityStore>

An ECS system that blocks player movement input while the game is paused. When a paused player sends movement that differs from their current position or head rotation by more than 0.01, teleports them back to their current position. Clears the input queue each tick.

## Related Types

- PlayerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation (and 35 more)

Complete API:
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  private static void onTick(ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()

Fields:
private final Query<EntityStore> query
