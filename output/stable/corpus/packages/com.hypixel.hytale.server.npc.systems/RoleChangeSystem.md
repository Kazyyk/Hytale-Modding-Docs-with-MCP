# RoleChangeSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: TickingSystem<EntityStore>

public class RoleChangeSystem extends TickingSystem<EntityStore>

Processes queued runtime role changes for NPC entities. When an NPC's role needs to change (triggered by `ActionRole`), the request is queued in the `RoleChangeQueue` resource. This system drains the queue each tick, performing the role swap by removing the entity, stripping role-specific components, updating the role name/index, and re-adding the entity to trigger RoleBuilderSystem.

## Execution Order

- NewSpawnStartTickingSystem | AFTER

## Static Methods


public static void requestRoleChange(
    @Nonnull Ref<EntityStore> ref,
    @Nonnull Role role,
    int roleIndex,
    boolean changeAppearance,
    @Nonnull Store<EntityStore> store
)


public static void requestRoleChange(
    @Nonnull Ref<EntityStore> ref,
    @Nonnull Role role,
    int roleIndex,
    boolean changeAppearance,
    @Nullable String state,
    @Nullable String subState,
    @Nonnull ComponentAccessor<EntityStore> store
)

Queues a role change request. Marks `role.setRoleChangeRequested()` to prevent further ticking of the old role.

## Tick Logic


@Override
public void tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)

Drains the queue. For each valid request:
1. Removes the entity from the store with `RemoveReason.UNLOAD`.
2. Nulls the role, removes all role-specific components (`BeaconSupport`, event supports, `Timers`, `StateEvaluator`, `ValueStore`, `Repulsion`).
3. Updates role name and index.
4. Re-adds the entity with `AddReason.LOAD` (triggering `RoleBuilderSystem`).
5. If `changeAppearance` is set, applies the new role's appearance.
6. If a target state is specified, sets the new role's state.

## Inner Types

### RoleChangeSystem.RoleChangeQueue


public static class RoleChangeQueue implements Resource<EntityStore>

ECS resource holding a `Deque<RoleChangeRequest>` of pending role change operations.

### RoleChangeSystem.RoleChangeRequest


private static class RoleChangeRequest

Data class holding: `reference` (Ref), `roleIndex` (int), `changeAppearance` (boolean), `state` (String, nullable), `subState` (String, nullable).

## Related Types

- RoleBuilderSystem -- rebuilds the role after the change
- NewSpawnStartTickingSystem -- runs before this system

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 48 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  public static void requestRoleChange(Ref<EntityStore> ref, Role role, int roleIndex, boolean changeAppearance, Store<EntityStore> store)
  public static void requestRoleChange(Ref<EntityStore> ref, Role role, int roleIndex, boolean changeAppearance, String state, String subState, ComponentAccessor<EntityStore> store)

Fields:
private static final HytaleLogger LOGGER
private final ResourceType<EntityStore,RoleChangeSystem.RoleChangeQueue> roleChangeQueueResourceType
private final ComponentType<EntityStore,BeaconSupport> beaconSupportComponentType
private final ComponentType<EntityStore,PlayerBlockEventSupport> playerBlockEventSupportComponentType
private final ComponentType<EntityStore,NPCBlockEventSupport> npcBlockEventSupportComponentType
private final ComponentType<EntityStore,PlayerEntityEventSupport> playerEntityEventSupportComponentType
private final ComponentType<EntityStore,NPCEntityEventSupport> npcEntityEventSupportComponentType
private final ComponentType<EntityStore,Timers> timersComponentType
private final ComponentType<EntityStore,StateEvaluator> stateEvaluatorComponentType
private final ComponentType<EntityStore,ValueStore> valueStoreComponentType
private final Set<Dependency<EntityStore>> dependencies
