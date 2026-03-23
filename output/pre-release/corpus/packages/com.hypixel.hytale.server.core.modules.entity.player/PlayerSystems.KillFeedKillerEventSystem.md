# PlayerSystems.KillFeedKillerEventSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityEventSystem<EntityStore, KillFeedEvent.KillerMessage>

public static class PlayerSystems.KillFeedKillerEventSystem extends EntityEventSystem<EntityStore, KillFeedEvent.KillerMessage>

An ECS event system that handles `KillFeedEvent.KillerMessage` events for player entities. Provides the player's display name as the killer name in kill feed messages.

## Related Types

- PlayerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem, PlayerAddedSystem (and 33 more)

Complete API:
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, KillFeedEvent.KillerMessage event)
  public Query<EntityStore> getQuery()

Fields:
private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
