# NPCPreTickSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: SteppableTickingSystem

public class NPCPreTickSystem extends SteppableTickingSystem

Runs at the beginning of the NPC tick pipeline. Stores the tick-start position (used later by ComputeVelocitySystem), and manages the NPC despawn lifecycle including despawn timers, despawn animations, and despawn checks.

## Execution Order

- DeathSystems.CorpseRemoval | BEFORE

## Constructor


public NPCPreTickSystem(@Nonnull ComponentType<EntityStore, NPCEntity> npcComponentType)

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

1. Stores the current position as the tick-start position via `npcComponent.storeTickStartPosition(position)`.
2. **Despawn animation phase:** If playing a despawn animation, ticks the animation timer. On expiry, removes the entity.
3. **Despawn timer phase:** If despawning, ticks the despawn timer. On expiry, checks for a "Despawn" animation. If present, transitions to the animation phase. Otherwise, removes the entity immediately.
4. **Despawn check phase:** Every 30 seconds (`DEFAULT_DESPAWN_CHECK_DELAY`), queries `SpawningPlugin.shouldNPCDespawn()`. If the NPC should despawn and is not in a busy state, initiates the despawn timer.

## Constants

- DEFAULT_DESPAWN_CHECK_DELAY | 30.0F | Seconds between despawn eligibility checks.

## Parallelism

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Related Types

- ComputeVelocitySystem -- uses the tick-start position stored by this system
- SpawnReferenceSystems -- spawn marker/beacon despawn logic

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 48 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public Query<EntityStore> getQuery()
  public void steppedTick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final float DEFAULT_DESPAWN_CHECK_DELAY
private final ComponentType<EntityStore,NPCEntity> npcComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final ComponentType<EntityStore,ModelComponent> modelComponentType
private final Set<Dependency<EntityStore>> dependencies
private final Query<EntityStore> query
