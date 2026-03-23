# FailedSpawnSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: RefSystem<EntityStore>

public class FailedSpawnSystem extends RefSystem<EntityStore>

Immediately removes entities that have a `FailedSpawnComponent`. This component is added by RoleBuilderSystem when role construction fails (missing model asset, non-spawnable role, etc.).

## Query

Matches entities with the `FailedSpawnComponent`.

## Lifecycle


@Override
public void onEntityAdded(
    @Nonnull Ref<EntityStore> ref,
    @Nonnull AddReason reason,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

Immediately issues `commandBuffer.removeEntity(ref, RemoveReason.REMOVE)`.


@Override
public void onEntityRemove(
    @Nonnull Ref<EntityStore> ref,
    @Nonnull RemoveReason reason,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

No-op.

## Related Types

- RoleBuilderSystem -- adds `FailedSpawnComponent` on construction failure

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FilterDamageSystem (and 48 more)

Complete API:
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()
