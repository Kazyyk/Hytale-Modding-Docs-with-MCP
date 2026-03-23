# NewSpawnStartTickingSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: TickingSystem<EntityStore>

public class NewSpawnStartTickingSystem extends TickingSystem<EntityStore>

Removes the `NonTicking` component from newly spawned NPC entities, enabling them to participate in the tick pipeline. Newly spawned NPCs are initially marked as non-ticking to prevent them from being processed before full initialization completes.

## Execution Order

- StepCleanupSystem | AFTER

## Static Method


public static void queueNewSpawn(@Nonnull Ref<EntityStore> reference, @Nonnull Store<EntityStore> store)

Adds the `NonTicking` component to the entity and enqueues it in the `QueueResource` for processing in the next tick.

## Tick Logic


@Override
public void tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)

Iterates through the queue resource. For each valid reference, removes the `NonTicking` component. Clears the queue after processing.

## Inner Types

### NewSpawnStartTickingSystem.QueueResource


public static class QueueResource implements Resource<EntityStore>

ECS resource that holds a queue of references to newly spawned entities awaiting activation. Backed by `ObjectArrayList<Ref<EntityStore>>`.


@Nonnull
public static ResourceType<EntityStore, NewSpawnStartTickingSystem.QueueResource> getResourceType()

Returns the resource type from `NPCPlugin`.

## Related Types

- RoleBuilderSystem -- calls `queueNewSpawn` during role construction
- StepCleanupSystem -- runs before this system

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 49 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  public static void queueNewSpawn(Ref<EntityStore> reference, Store<EntityStore> store)

Fields:
private final ResourceType<EntityStore,NewSpawnStartTickingSystem.QueueResource> queueResourceType
private final ComponentType<EntityStore,NonTicking<EntityStore>> nonTickingComponentType
private final Set<Dependency<EntityStore>> dependencies
