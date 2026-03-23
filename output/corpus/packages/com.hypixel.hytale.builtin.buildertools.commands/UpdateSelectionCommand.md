# UpdateSelectionCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class UpdateSelectionCommand extends AbstractPlayerCommand

Directly updates the selection bounds to the specified min/max coordinates. Delegates to `BuilderState.update()`.

## Command Registration

- **Name:** `updateselection`
- **Game Mode:** Creative

## Arguments

xMin, yMin, zMin, xMax, yMax, zMax (Integer, all required)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
