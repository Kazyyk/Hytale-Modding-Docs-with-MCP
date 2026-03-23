# MessageSupportSystem

Type: abstract class | Package: com.hypixel.hytale.server.npc.systems | Extends: SteppableTickingSystem

public abstract class MessageSupportSystem<T extends MessageSupport> extends SteppableTickingSystem

Abstract base for systems that tick NPC message support components. Iterates over each `NPCMessage` slot in the `MessageSupport` component, advancing the age of activated non-infinite messages and deactivating them when they expire.

## Constructor


public MessageSupportSystem(
    @Nonnull ComponentType<EntityStore, T> messageSupportComponentType,
    @Nonnull Set<Dependency<EntityStore>> dependencies
)

## Tick Logic


@Override
public void steppedTick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

For each message slot: if activated and not infinite, ticks the age. If the age exceeds the message lifetime, deactivates the slot.

## Parallelism

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Inner Systems

Five concrete subclasses handle different message support component types:

### MessageSupportSystem.BeaconSystem


public static class BeaconSystem extends MessageSupportSystem<BeaconSupport>

Ticks beacon message slots for inter-NPC beacon communication.

### MessageSupportSystem.NPCBlockEventSystem


public static class NPCBlockEventSystem extends MessageSupportSystem<NPCBlockEventSupport>

Ticks block event messages from NPC sources.

### MessageSupportSystem.NPCEntityEventSystem


public static class NPCEntityEventSystem extends MessageSupportSystem<NPCEntityEventSupport>

Ticks entity event messages from NPC sources.

### MessageSupportSystem.PlayerBlockEventSystem


public static class PlayerBlockEventSystem extends MessageSupportSystem<PlayerBlockEventSupport>

Ticks block event messages from player sources.

### MessageSupportSystem.PlayerEntityEventSystem


public static class PlayerEntityEventSystem extends MessageSupportSystem<PlayerEntityEventSupport>

Ticks entity event messages from player sources.

## Related Types

- RoleBuilderSystem -- adds the message support components during role construction
- BlackboardSystems -- blackboard views that generate the events these systems tick
