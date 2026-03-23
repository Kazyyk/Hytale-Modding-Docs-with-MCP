# RoleBuilderSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: HolderSystem<EntityStore>

public class RoleBuilderSystem extends HolderSystem<EntityStore>

Constructs `Role` objects from builder configurations when an NPC entity is added to the store. This is the primary role initialization system, responsible for resolving the role name/index, invoking the builder pipeline, setting up the model, display name, interactions, beacon support, event support, timers, state evaluators, value stores, and visual effects.

## Execution Order

- EntityStatsSystems.Setup | AFTER
- PhysicsValuesAddSystem | AFTER

## Query

Matches entities with `NPCEntity` and `TransformComponent`.

## Entity Add Logic


@Override
public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)

If the NPC does not already have a role:
1. Resolves the role index from the role name if needed.
2. Validates the role is spawnable (non-abstract).
3. Creates a `BuilderSupport` and invokes `NPCPlugin.buildRole()`.
4. Sets the role on the NPC component.
5. Adds `Invulnerable` component if the role is invulnerable.
6. Sets the `DisplayNameComponent` to the role's translation key.
7. Configures `Interactions` (Use NPC, death interaction).
8. Adds `BeaconSupport` if beacon slot mappings exist.
9. Adds `PlayerBlockEventSupport` and `NPCBlockEventSupport` if block event support is configured.
10. Adds `PlayerEntityEventSupport` and `NPCEntityEventSupport` if entity event support is configured.
11. Adds `Timers` component if timers are allocated.
12. Adds `StateEvaluator` component if utility AI is configured.
13. Adds `ValueStore` component if value store builder exists.
14. Ensures `EffectControllerComponent` and `ActiveAnimationComponent`.
15. For spawned or prefab entities, sets up the model and calls `role.spawned()`.
16. Applies spawn effects if the builder implements `SpawnEffect`.

On failure, calls the internal `fail()` method which strips all components and adds `FailedSpawnComponent`.

## Related Types

- BalancingInitialisationSystem -- stat initialization after role building
- FailedSpawnSystem -- handles failed role construction
- RoleChangeSystem -- handles runtime role changes
- RoleSystems -- behavior tick pipeline

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 48 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
  private void fail(Holder<EntityStore> holder)

Fields:
private final ComponentType<EntityStore,NPCEntity> npcComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final ComponentType<EntityStore,ModelComponent> modelComponentType
private final ComponentType<EntityStore,PersistentModel> persistentModelComponentType
private final Set<Dependency<EntityStore>> dependencies
private final Query<EntityStore> query
