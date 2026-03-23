# DebugShapeConeCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.debug.commands | Extends: AbstractPlayerCommand

public class DebugShapeConeCommand extends AbstractPlayerCommand

Debug command that spawns a cone shape at the executing player's position (for arrow, along the player's look direction). Supports `--fade`, `--no-wireframe`, and `--no-solid` flags. Uses `DebugUtils.addCone()` with a random color and 30-second display time.

## Relationships

- Extends `AbstractPlayerCommand`
- Part of DebugShapeSubCommand
- Uses DebugUtils

Also in this package: DebugCommand, DebugShapeArrowCommand, DebugShapeClearCommand, DebugShapeCubeCommand, DebugShapeCylinderCommand, DebugShapeShowForceCommand, DebugShapeSphereCommand, DebugShapeSubCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_DEBUG_SHAPE_CONE_SUCCESS
private final FlagArg fadeFlag
private final FlagArg noWireframeFlag
private final FlagArg noSolidFlag
