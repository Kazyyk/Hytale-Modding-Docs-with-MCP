# ComputeVelocitySystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: SteppableTickingSystem

public class ComputeVelocitySystem extends SteppableTickingSystem

Computes the NPC's velocity from the position delta between tick start (stored by NPCPreTickSystem) and the current position. The velocity is written to the `Velocity` component as `(currentPosition - oldPosition) / dt`.

## Constructor


public ComputeVelocitySystem(
    @Nonnull ComponentType<EntityStore, NPCEntity> npcEntityComponentType,
    @Nonnull ComponentType<EntityStore, Velocity> velocityComponentType,
    @Nonnull Set<Dependency<EntityStore>> dependencies
)

## Query

Matches entities with `NPCEntity`, `TransformComponent`, and `Velocity` components.

## Tick Logic


@Override
public void steppedTick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

Reads the current position from `TransformComponent` and the old (tick-start) position from `NPCEntity.getOldPosition()`, then sets the velocity to `(current - old) / dt` on all three axes.

## Parallelism

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Related Types

- NPCPreTickSystem -- stores tick start position used by this system
- MovementStatesSystem -- runs after this to update movement state flags
- SteppableTickingSystem -- base class

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem, FilterDamageSystem (and 49 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void steppedTick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()

Fields:
private final ComponentType<EntityStore,NPCEntity> npcEntityComponentType
private final ComponentType<EntityStore,Velocity> velocityComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final Set<Dependency<EntityStore>> dependencies
private final Query<EntityStore> query
