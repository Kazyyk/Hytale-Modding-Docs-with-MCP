# StepCleanupSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: EntityTickingSystem<EntityStore>

public class StepCleanupSystem extends EntityTickingSystem<EntityStore>

Removes `StepComponent` from all entities at the end of the frame. This ensures that debug single-step commands only advance frozen NPCs for one tick. Uses `RootDependency.lastSet()` to guarantee it runs after all other systems.

## Execution Order

Runs last in the frame via `RootDependency.lastSet()`.

## Constructor


public StepCleanupSystem(@Nonnull ComponentType<EntityStore, StepComponent> stepComponentType)

## Query

Matches entities with the `StepComponent`.

## Tick Logic


@Override
public void tick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

Removes the `StepComponent` from the entity.

## Related Types

- SteppableTickingSystem -- base class that checks for `StepComponent`
- NewSpawnStartTickingSystem -- runs after this system
