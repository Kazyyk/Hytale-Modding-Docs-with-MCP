# DebugShapeSubCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.debug.commands | Extends: AbstractCommandCollection

public class DebugShapeSubCommand extends AbstractCommandCollection

Command collection registering all debug shape subcommands: sphere, cube, cylinder, cone, arrow, show-force, and clear. Provides the `buildFlags` helper method used by all shape commands to construct the debug flags bitmask from `--fade`, `--no-wireframe`, and `--no-solid` flag arguments.

## Static Methods

- static int buildFlags(CommandContext context, FlagArg fadeFlag, FlagArg noWireframeFlag, FlagArg noSolidFlag)

## Relationships

- Extends `AbstractCommandCollection`
- Registers shape commands below
