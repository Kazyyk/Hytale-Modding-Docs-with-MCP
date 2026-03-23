# StateEvaluatorSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: EntityTickingSystem<EntityStore>

public class StateEvaluatorSystem extends EntityTickingSystem<EntityStore>

Utility-AI state evaluation system. Periodically scores `StateOption` entries using configured conditions and response curves, then transitions the NPC to the highest-scoring behavioral state. Runs **after** `PreBehaviourSupportTickSystem` and **before** `BehaviourTickSystem`, ensuring the NPC's state is resolved before the instruction tree is evaluated.

## Execution Order

- RoleSystems.PreBehaviourSupportTickSystem | AFTER
- RoleSystems.BehaviourTickSystem | BEFORE

## Constructor


public StateEvaluatorSystem(
    @Nonnull ComponentType<EntityStore, StateEvaluator> stateEvaluatorComponent,
    @Nonnull ComponentType<EntityStore, NPCEntity> npcComponentType
)

## Query

Matches entities with `NPCEntity`, `StateEvaluator`, and `UUIDComponent`.

## Tick Logic


@Override
public void tick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

1. Skips if the role is running transition actions (state transitions take priority).
2. Checks if the evaluator is active and the execution frequency timer has elapsed.
3. Prepares the `EvaluationContext` with minimum utility and predictability settings.
4. Calls `stateEvaluator.evaluate()` to score all options and select the best.
5. If the chosen option differs from the current state, sets the new state via `StateSupport.setState()` and notifies the evaluator of the switch.
6. Resets the evaluation context.

## Parallelism

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Related Types

- RoleSystems -- the behavior pipeline that depends on state evaluation
- PositionCacheSystems -- `initialisePositionCache` sets up the evaluator

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 49 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final HytaleLogger LOGGER
private final ComponentType<EntityStore,StateEvaluator> stateEvaluatorComponent
private final ComponentType<EntityStore,NPCEntity> npcComponentType
private final ComponentType<EntityStore,UUIDComponent> uuidComponentType
private final Set<Dependency<EntityStore>> dependencies
private final Query<EntityStore> query
