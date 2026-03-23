# ClearBlocksCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class ClearBlocksCommand extends AbstractPlayerCommand

Clears all blocks within the current selection or between two specified coordinate positions. When invoked without arguments, sets the selection to `BlockPattern.EMPTY`. An alternative usage variant accepts two `RelativeIntPosition` arguments to clear a specific coordinate range.

## Command Registration

- **Name:** `clearBlocks`
- **Game Mode:** Creative

## Aliases

`clear`

## Arguments

Optional: positionOne (RelativeIntPosition), positionTwo (RelativeIntPosition)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
