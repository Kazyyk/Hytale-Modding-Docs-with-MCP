# PlayerChunkTrackerSystems.UpdateSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public static class PlayerChunkTrackerSystems.UpdateSystem extends EntityTickingSystem<EntityStore>

An ECS ticking system that calls `ChunkTracker.tick()` each frame for entities with `ChunkTracker`, `Player`, `PlayerRef`, and `TransformComponent`. Runs single-threaded (`isParallel` returns `false`).

## Related Types

- PlayerChunkTrackerSystems -- parent container class
- ChunkTracker -- component ticked by this system

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final ComponentType<EntityStore,ChunkTracker> CHUNK_TRACKER_COMPONENT_TYPE
private static final ComponentType<EntityStore,Player> PLAYER_COMPONENT_TYPE
private static final ComponentType<EntityStore,PlayerRef> PLAYER_REF_COMPONENT_TYPE
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
