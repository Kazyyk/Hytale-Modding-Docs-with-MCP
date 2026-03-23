# PlayerInput.SetRiderMovementStates

Type: record | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: PlayerInput.InputUpdate

public record PlayerInput.SetRiderMovementStates(MovementStates movementStates) implements PlayerInput.InputUpdate

An input update that carries movement state flags for a mounted player's ride. The `apply()` method is a no-op in the current implementation.

## Record Components

- movementStates | MovementStates | The rider movement state flags.

## Related Types

- PlayerInput -- parent component
- PlayerInput.SetMovementStates -- player's own movement states
