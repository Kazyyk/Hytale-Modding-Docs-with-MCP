# AvoidanceSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: com.hypixel.hytale.server.npc.systems.SteppableTickingSystem

public class AvoidanceSystem extends SteppableTickingSystem

ECS ticking system that applies avoidance and separation steering to NPCs. Runs after `RoleSystems.BehaviourTickSystem`. For each NPC, blends avoidance and separation forces into the body steering vector, and optionally renders debug visualizations for avoidance, separation, orientation hints, and pre/post-blend steering.

## Constructors

- AvoidanceSystem(@Nonnull ComponentType<EntityStore, NPCEntity> componentType)

## Methods

- public Set<Dependency<EntityStore>> getDependencies()
- public boolean isParallel(int archetypeChunkSize, int taskCount)
- public Query<EntityStore> getQuery()
- public void steppedTick(float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem, FilterDamageSystem (and 49 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public Query<EntityStore> getQuery()
  public void steppedTick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,NPCEntity> componentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
