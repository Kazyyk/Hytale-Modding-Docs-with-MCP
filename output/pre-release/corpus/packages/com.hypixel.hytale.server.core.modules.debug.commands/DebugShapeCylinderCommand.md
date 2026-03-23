# DebugShapeCylinderCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.debug.commands | Extends: AbstractPlayerCommand

public class DebugShapeCylinderCommand extends AbstractPlayerCommand

Debug command that spawns a cylinder shape at the executing player's position (for arrow, along the player's look direction). Supports `--fade`, `--no-wireframe`, and `--no-solid` flags. Uses `DebugUtils.addCylinder()` with a random color and 30-second display time.

## Relationships

- Extends `AbstractPlayerCommand`
- Part of DebugShapeSubCommand
- Uses DebugUtils
