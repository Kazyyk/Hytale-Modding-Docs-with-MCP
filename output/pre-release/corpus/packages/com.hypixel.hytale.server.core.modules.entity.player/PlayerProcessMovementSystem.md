# PlayerProcessMovementSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public class PlayerProcessMovementSystem extends EntityTickingSystem<EntityStore>

An ECS ticking system that processes player movement and block collision each tick. Validates position offsets, checks for movement jumps (resets velocity in Adventure mode if offset exceeds 10 blocks), runs collision detection against the world, processes velocity sampling, identifies the block the player is standing on and inside, and triggers block collision interaction chains (e.g., damage blocks).

Queries entities with `Player`, `PlayerRef`, `TransformComponent`, `BoundingBox`, `Velocity`, `CollisionResultComponent`, and `PositionDataComponent`. Runs single-threaded.

## Related Types

- PlayerSystems.ProcessPlayerInput -- processes input before movement

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,Player> playerComponentType
private final ComponentType<EntityStore,BoundingBox> boundingBoxComponentType
private final ComponentType<EntityStore,Velocity> velocityComponentType
private final ComponentType<EntityStore,CollisionResultComponent> collisionResultComponentType
private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final ComponentType<EntityStore,PositionDataComponent> positionDataComponentType
private final Query<EntityStore> query
