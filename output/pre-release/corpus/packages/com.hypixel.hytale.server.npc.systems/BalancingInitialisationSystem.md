# BalancingInitialisationSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: HolderSystem<EntityStore>

public class BalancingInitialisationSystem extends HolderSystem<EntityStore>

Sets up NPC entity stats (health) from the role's configuration when an NPC entity is added. Reads the `initialMaxHealth` from the role, computes the difference from the default stat max, and applies a `StaticModifier` with key `"NPC_Max"` to adjust the maximum health. After applying the modifier, the stat value is maximized so the NPC spawns at full health.

## Execution Order

- RoleBuilderSystem | AFTER
- EntityStatsSystems.Setup | AFTER

## Query

Matches entities with both `NPCEntity` and `EntityStatMap` components.

## Lifecycle


@Override
public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)

1. Gets the role from the NPC component.
2. Reads `initialMaxHealth` from the role.
3. Looks up the `"Health"` stat index from `EntityStatType.getAssetMap()`.
4. Creates a `StaticModifier` (ADDITIVE on MAX) with the delta between the role health and the default max.
5. Puts the modifier with key `"NPC_Max"`.
6. Calls `maximizeStatValue` to fill health to the new maximum.


@Override
public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)

No-op.

## Constants

- NPC_MAX_MODIFIER | "NPC_Max" | Modifier key applied to the health stat.
- HEALTH_STAT_INDEX | "Health" | Stat type key used for health lookup.

## Related Types

- RoleBuilderSystem -- constructs the role before this system runs
- RoleSystems -- behavior tick that uses the initialized stats

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem, FilterDamageSystem (and 49 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Fields:
private static final String NPC_MAX_MODIFIER
public static final String HEALTH_STAT_INDEX
private final ComponentType<EntityStore,NPCEntity> npcComponentType
private final ComponentType<EntityStore,EntityStatMap> entityStatMapComponentType
private final Set<Dependency<EntityStore>> dependencies
private final Query<EntityStore> query
