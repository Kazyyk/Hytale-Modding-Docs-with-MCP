# PlayerSystems.ProcessPlayerInput

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public static class PlayerSystems.ProcessPlayerInput extends EntityTickingSystem<EntityStore>

An ECS ticking system that drains the PlayerInput queue and applies each input update to the entity. Queries entities with `Player`, `PlayerInput`, and `TransformComponent`.

## Related Types

- PlayerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final Query<EntityStore> query
