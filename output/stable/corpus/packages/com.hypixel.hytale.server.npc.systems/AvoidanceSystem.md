# AvoidanceSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: SteppableTickingSystem

public class AvoidanceSystem extends SteppableTickingSystem

Blends entity avoidance and separation steering forces into the NPC's body steering vector. Runs **after** RoleSystems.BehaviourTickSystem in the NPC tick pipeline.

For each NPC with avoidance or separation enabled (via Role configuration), this system adds the target-to-ignore for avoidance from the `MarkedEntitySupport`, then blends avoidance and separation forces into the body steering. When the motion controller reports the NPC is obstructed, avoidance is skipped entirely.

## Execution Order

- RoleSystems.BehaviourTickSystem | AFTER

## Debug Visualization

When debug flags `VisAvoidance` or `VisSeparation` are set on the role's `DebugSupport`, the system renders colored arrows:

- Green (0, 1, 0) | DEBUG_COLOR_STEERING_POST | Post-blend steering vector
- Red (1, 0, 0) | DEBUG_COLOR_STEERING_PRE | Pre-blend steering vector
- White (1, 1, 1) | DEBUG_COLOR_AVOIDANCE | Avoidance steering contribution
- Blue (0, 0, 1) | DEBUG_COLOR_SEPARATION | Separation steering contribution

Debug vectors are scaled by `DEBUG_VECTORS_SCALE` (4.0) and drawn for `DEBUG_VECTORS_TIME` (0.05s). Vectors shorter than `DEBUG_MIN_VECTOR_DRAW_LENGTH_SQUARED` (0.01) are not rendered.

## Constructor


public AvoidanceSystem(@Nonnull ComponentType<EntityStore, NPCEntity> componentType)

## Fields

- componentType | ComponentType<EntityStore, NPCEntity> | NPC entity component type.
- transformComponentType | ComponentType<EntityStore, TransformComponent> | Transform component type.
- query | Query<EntityStore> | Matches entities with both `NPCEntity` and `TransformComponent`.

## Parallelism


@Override
public boolean isParallel(int archetypeChunkSize, int taskCount)

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Related Types

- SteeringSystem -- applies final steering after avoidance
- SteppableTickingSystem -- base class
- RoleSystems -- behavior tick that precedes avoidance

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem, FilterDamageSystem (and 48 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public Query<EntityStore> getQuery()
  public void steppedTick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private static void renderDebugSteeringVector(Vector3d position, Vector3d direction, Vector3f color, World world)
  private static void renderDebugSteeringVectorInverse(Vector3d position, Vector3d direction, Vector3f color, World world)

Fields:
public static final Vector3f DEBUG_COLOR_STEERING_POST
public static final Vector3f DEBUG_COLOR_STEERING_PRE
public static final Vector3f DEBUG_COLOR_AVOIDANCE
public static final Vector3f DEBUG_COLOR_SEPARATION
public static final double DEBUG_MIN_VECTOR_DRAW_LENGTH_SQUARED
public static final double DEBUG_VECTORS_SCALE
public static final float DEBUG_VECTORS_TIME
private final ComponentType<EntityStore,NPCEntity> componentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
