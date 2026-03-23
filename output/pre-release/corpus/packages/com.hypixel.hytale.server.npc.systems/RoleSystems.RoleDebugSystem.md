# RoleSystems.RoleDebugSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: com.hypixel.hytale.server.npc.systems.SteppableTickingSystem

public static class RoleDebugSystem extends SteppableTickingSystem

Inner class of `RoleSystems`. Renders debug visualizations for NPC roles including sensor ranges (discs/sectors), leash position tethers, path waypoints, and marked target arrows. Uses `DebugUtils` to draw shapes, spheres, lines, and arrows in the world.

## Constructors

- RoleDebugSystem(@Nonnull ComponentType<EntityStore, NPCEntity> npcComponentType, @Nonnull Set<Dependency<EntityStore>> dependencies)

## Methods

- public Set<Dependency<EntityStore>> getDependencies()
- public boolean isParallel(int archetypeChunkSize, int taskCount)
- public Query<EntityStore> getQuery()
- public void steppedTick(float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 49 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public Query<EntityStore> getQuery()
  public void steppedTick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private static void renderMarkedTargetArrows(Role role, int index, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer)
  private static void renderSensorVisualization(DebugSupport debugSupport, Ref<EntityStore> npcRef, TransformComponent transformComponent, BoundingBox boundingBoxComponent, World world, CommandBuffer<EntityStore> commandBuffer)
  private static void renderLeashPositionVisualization(NPCEntity npcComponent, Ref<EntityStore> npcRef, TransformComponent transformComponent, BoundingBox boundingBoxComponent, World world)
  private static void addChainRing(World world, double x, double y, double z, double outerRadius, double innerRadius, double yawAngle, double pitchAngle, Vector3f color)
  private static void renderPathVisualization(DebugSupport debugSupport, TransformComponent transformComponent, BoundingBox boundingBoxComponent, World world)

Fields:
private static final float DEBUG_SHAPE_TIME
private static final float SENSOR_VIS_OPACITY
private static final double FULL_CIRCLE_EPSILON
private static final float LEASH_SPHERE_RADIUS
private static final float LEASH_RING_OUTER_RADIUS
private static final float LEASH_RING_INNER_RADIUS
private static final float NPC_RING_THICKNESS
private static final float NPC_RING_OFFSET
private static final float LEASH_LINE_THICKNESS
private static final double PATH_WAYPOINT_SPHERE_SIZE
private static final double PATH_CURRENT_TARGET_SPHERE_SIZE
private static final double PATH_END_NODE_SPHERE_SIZE
private static final double PATH_SPHERE_Y_OFFSET
private static final double PATH_LINE_THICKNESS
private static final double PATH_NPC_LINE_THICKNESS
private final ComponentType<EntityStore,NPCEntity> npcComponentType
private final Set<Dependency<EntityStore>> dependencies
