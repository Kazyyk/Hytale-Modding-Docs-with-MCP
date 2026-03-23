# PlayerSystems.KillFeedDecedentEventSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityEventSystem<EntityStore, KillFeedEvent.DecedentMessage>

public static class PlayerSystems.KillFeedDecedentEventSystem extends EntityEventSystem<EntityStore, KillFeedEvent.DecedentMessage>

An ECS event system that handles `KillFeedEvent.DecedentMessage` events for player entities. Provides the player's display name (from `DisplayNameComponent` or falling back to `PlayerRef.getUsername()`) as the victim name in kill feed messages.

## Related Types

- PlayerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation (and 35 more)

Complete API:
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, KillFeedEvent.DecedentMessage event)
  public Query<EntityStore> getQuery()

Fields:
private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
