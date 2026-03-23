# RedoCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class RedoCommand extends AbstractPlayerCommand

Redoes previously undone edits. Without arguments, redoes 1 step. A variant accepts a count argument. Delegates to `BuilderState.redo()`.

## Command Registration

- **Name:** `redo`
- **Game Mode:** Creative

## Aliases

`r`

## Permission

`hytale.editor.history`

## Arguments

Optional: count (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
