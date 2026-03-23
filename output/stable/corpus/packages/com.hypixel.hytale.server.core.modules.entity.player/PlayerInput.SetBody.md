# PlayerInput.SetBody

Type: record | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: PlayerInput.InputUpdate

public record PlayerInput.SetBody(Direction direction) implements PlayerInput.InputUpdate

An input update that sets the entity's body rotation from the client-reported `Direction` (pitch, yaw, roll). Updates the `TransformComponent` rotation.

## Record Components

- direction | Direction | The body orientation to apply.

## Related Types

- PlayerInput -- parent component
- PlayerInput.SetHead -- head rotation counterpart
