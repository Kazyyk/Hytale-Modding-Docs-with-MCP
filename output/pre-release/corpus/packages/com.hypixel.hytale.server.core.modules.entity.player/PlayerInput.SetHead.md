# PlayerInput.SetHead

Type: record | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: PlayerInput.InputUpdate

public record PlayerInput.SetHead(Direction direction) implements PlayerInput.InputUpdate

An input update that sets the entity's head rotation from the client-reported `Direction` (pitch, yaw, roll). Updates the `HeadRotation` component.

## Record Components

- direction | Direction | The head orientation to apply.

## Related Types

- PlayerInput -- parent component
- PlayerInput.SetBody -- body rotation counterpart
