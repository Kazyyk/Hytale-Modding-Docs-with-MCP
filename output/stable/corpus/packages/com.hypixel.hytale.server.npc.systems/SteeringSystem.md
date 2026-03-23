# SteeringSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: SteppableTickingSystem

public class SteeringSystem extends SteppableTickingSystem

Applies the computed steering vectors (body and head) to the NPC's active motion controller. Runs **after** AvoidanceSystem and **after** `KnockbackSystems.ApplyKnockback`, and **before** `TransformSystems.EntityTrackerUpdate`.

## Execution Order

- AvoidanceSystem | AFTER
- KnockbackSystems.ApplyKnockback | AFTER
- TransformSystems.EntityTrackerUpdate | BEFORE

## Constructor


public SteeringSystem(@Nonnull ComponentType<EntityStore, NPCEntity> npcEntityComponent)

## Query

Matches entities with `NPCEntity` and `TransformComponent`.

## Tick Logic


@Override
public void steppedTick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

Delegates to `role.getActiveMotionController().steer(ref, role, bodySteering, headSteering, dt, commandBuffer)`.

When debug motion steering is enabled, logs detailed velocity and heading information. On `IllegalStateException` or `IllegalArgumentException`, removes the entity.

## Parallelism

Returns `false` -- this system does not run in parallel.

## Related Types

- AvoidanceSystem -- computes avoidance/separation forces before steering
- RoleSystems -- `PostBehaviourSupportTickSystem` runs after steering

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 48 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public Query<EntityStore> getQuery()
  public void steppedTick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,NPCEntity> npcEntityComponent
private final Set<Dependency<EntityStore>> dependencies
private final Query<EntityStore> query
