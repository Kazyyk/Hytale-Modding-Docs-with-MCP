# PlayerSavingSystems.TickingSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore> | Implements: RunWhenPausedSystem<EntityStore>

public static class PlayerSavingSystems.TickingSystem extends EntityTickingSystem<EntityStore> implements RunWhenPausedSystem<EntityStore>

An ECS ticking system that periodically saves player data every 10 seconds (when saving is enabled for the world). Compares current position, rotation, and inventory state against last saved values. Only saves when a change is detected. Implements `RunWhenPausedSystem` so saves continue during game pause.

Queries entities with `Player`, `TransformComponent`, and `HeadRotation`.

## Related Types

- PlayerSavingSystems -- parent container class
- PlayerSavingSystems.SaveDataResource -- timer resource

Known subclasses: ArchetypeTickingSystem, BehaviourTickSystem, ChunkUnloadingSystem, DelayedSystem, LocalSpawnControllerSystem, NewSpawnStartTickingSystem, RemovalSystem, RoleChangeSystem, SpatialSystem, Ticking, Ticking, Ticking, TimeSystem, UpdateWorldSlumberSystem, WorldSpawningSystem

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ResourceType<EntityStore,PlayerSavingSystems.SaveDataResource> dataResourceType
private final ComponentType<EntityStore,Player> playerComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final ComponentType<EntityStore,HeadRotation> headRotationComponentType
private final Query<EntityStore> query
