# DeselectCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class DeselectCommand extends AbstractPlayerCommand

Clears the current block selection. Delegates to `BuilderState.deselect()`.

## Command Registration

- **Name:** `deselect`
- **Game Mode:** Creative

## Aliases

`clearselection`

## Arguments

None

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
