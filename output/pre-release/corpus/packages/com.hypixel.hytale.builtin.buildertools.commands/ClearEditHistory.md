# ClearEditHistory

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class ClearEditHistory extends AbstractPlayerCommand

Clears all undo and redo history for the executing player's builder state. Delegates to `BuilderState.clearHistory()`.

## Command Registration

- **Name:** `clearEditHistory`
- **Game Mode:** Creative

## Aliases

`clearHistory`, `clearToolHistory`

## Arguments

None

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
