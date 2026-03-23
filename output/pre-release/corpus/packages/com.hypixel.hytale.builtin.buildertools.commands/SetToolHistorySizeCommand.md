# SetToolHistorySizeCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: CommandBase

public class SetToolHistorySizeCommand extends CommandBase

Changes the maximum undo/redo history size for the builder tools plugin. Validates the history length to the range 10-250. Executes synchronously (not queued).

## Command Registration

- **Name:** `setToolHistorySize`
- **Game Mode:** Creative

## Arguments

historyLength (Integer, 10-250, required)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
