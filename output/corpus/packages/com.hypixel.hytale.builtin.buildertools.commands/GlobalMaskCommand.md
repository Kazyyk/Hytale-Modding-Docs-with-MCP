# GlobalMaskCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class GlobalMaskCommand extends AbstractPlayerCommand

Manages the global block mask applied to all editing operations. Without arguments, displays the current mask. A `set` usage variant accepts a `BlockMask` argument. The `clear` subcommand (aliases: `disable`, `c`) removes the mask.

## Command Registration

- **Name:** `gmask`
- **Game Mode:** Creative

## Arguments

Variant: mask (BlockMask). Subcommand: clear

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
