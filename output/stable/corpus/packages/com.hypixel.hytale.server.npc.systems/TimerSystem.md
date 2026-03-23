# TimerSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: SteppableTickingSystem

public class TimerSystem extends SteppableTickingSystem

Ticks all `Tickable` timers stored in the `Timers` ECS component. Each timer receives the frame delta time.

## Constructor


public TimerSystem(
    @Nonnull ComponentType<EntityStore, Timers> timersComponentType,
    @Nonnull Set<Dependency<EntityStore>> dependencies
)

## Query

Matches entities with the `Timers` component.

## Tick Logic


@Override
public void steppedTick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

Iterates `timersComponent.getTimers()` and calls `timer.tick(dt)` on each.

## Parallelism

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Related Types

- RoleBuilderSystem -- allocates timers during role construction
- SteppableTickingSystem -- base class
