# SteppableTickingSystem

Type: abstract class | Package: com.hypixel.hytale.server.npc.systems | Extends: EntityTickingSystem<EntityStore>

public abstract class SteppableTickingSystem extends EntityTickingSystem<EntityStore>

Abstract base class for NPC ECS systems that respect the `Frozen` component for debug stepping. When an NPC entity has a `Frozen` component (or the world's `isAllNPCFrozen()` flag is set), the system skips the entity unless a `StepComponent` is present, in which case it ticks for a single step using the step's configured tick length.

Most NPC systems extend this class rather than `EntityTickingSystem` directly, ensuring that frozen NPCs only advance when explicitly stepped by the debug tools.

## Tick Flow


@Override
public void tick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

Checks the `Frozen` component and world freeze flag. If the entity is not frozen, delegates to `steppedTick` with the frame delta time. If frozen, looks for a `StepComponent` and uses its tick length. If frozen with no step component, returns without ticking.

## Abstract Method


public abstract void steppedTick(
    float var1,
    int var2,
    @Nonnull ArchetypeChunk<EntityStore> var3,
    @Nonnull Store<EntityStore> var4,
    @Nonnull CommandBuffer<EntityStore> var5
)

Called with the resolved tick length (either the frame `dt` or the step component's tick length). Subclasses implement their per-entity tick logic here.

## Fields

- stepComponentType | ComponentType<EntityStore, StepComponent> | Component type for debug step.
- frozenComponentType | ComponentType<EntityStore, Frozen> | Component type for frozen state.

## Related Types

- StepCleanupSystem -- removes `StepComponent` at end of frame
- AvoidanceSystem, SteeringSystem, ComputeVelocitySystem, MovementStatesSystem -- concrete subclasses

Known subclasses: AvoidanceSystem, ComputeVelocitySystem, MessageSupportSystem, MovementStatesSystem, NPCPreTickSystem, PostBehaviourSupportTickSystem, PreBehaviourSupportTickSystem, RoleDebugSystem, SteeringSystem, TimerSystem, UpdateSystem

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 48 more)

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public abstract void steppedTick(float var1, int var2, ArchetypeChunk<EntityStore> var3, Store<EntityStore> var4, CommandBuffer<EntityStore> var5)

Fields:
private final ComponentType<EntityStore,StepComponent> stepComponentType
private final ComponentType<EntityStore,Frozen> frozenComponentType
