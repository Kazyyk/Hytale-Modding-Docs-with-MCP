# MovementStatesSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: SteppableTickingSystem

public class MovementStatesSystem extends SteppableTickingSystem

Updates NPC movement state flags based on the computed velocity. Runs **after** ComputeVelocitySystem. Delegates to `Role.updateMovementState()` which sets flags like walking, running, idle, etc. based on the velocity vector and the movement states component.

Entities with the role name `"Empty_Role"` are skipped. Exceptions during movement state updates are logged and do not crash the system.

## Execution Order

- ComputeVelocitySystem | AFTER

## Constructor


public MovementStatesSystem(
    @Nonnull ComponentType<EntityStore, NPCEntity> npcComponentType,
    @Nonnull ComponentType<EntityStore, Velocity> velocityComponentType,
    @Nonnull ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentType
)

## Query

Matches entities with `NPCEntity`, `Velocity`, and `MovementStatesComponent`.

## Parallelism

Returns `false` -- this system does not run in parallel.

## Related Types

- ComputeVelocitySystem -- computes velocity consumed by this system
- SteppableTickingSystem -- base class
