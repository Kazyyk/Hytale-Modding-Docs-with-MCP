# UndoCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class UndoCommand extends AbstractPlayerCommand

Undoes previous edits. Without arguments, undoes 1 step. A variant accepts a count argument. Delegates to `BuilderState.undo()`.

## Command Registration

- **Name:** `undo`
- **Game Mode:** Creative

## Aliases

`u`

## Permission

`hytale.editor.history`

## Arguments

Optional: count (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
