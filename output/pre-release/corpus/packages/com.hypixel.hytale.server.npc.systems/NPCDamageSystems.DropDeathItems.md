# NPCDamageSystems.DropDeathItems

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: com.hypixel.hytale.component.system.tick.EntityTickingSystem

public static class DropDeathItems extends EntityTickingSystem<EntityStore>

Inner class of `NPCDamageSystems`. Ticking system that handles item drops on NPC death. Runs after `DeathSystems.TickCorpseRemoval` and before `DeathSystems.CorpseRemoval`. When an NPC dies with `ItemsLossMode.ALL`, drops inventory items and items from the configured drop list as item entities.

## Methods

- public Query<EntityStore> getQuery()
- public Set<Dependency<EntityStore>> getDependencies()
- public void tick(float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, EntityViewSystem, FailedSpawnSystem, FilterDamageSystem (and 49 more)

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final Query<EntityStore> QUERY
private static final Set<Dependency<EntityStore>> DEPENDENCIES
