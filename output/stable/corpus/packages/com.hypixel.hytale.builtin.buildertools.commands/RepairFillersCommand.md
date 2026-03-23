# RepairFillersCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class RepairFillersCommand extends AbstractPlayerCommand

Repairs filler blocks within the current selection. Delegates to `BuilderState.repairFillers()`.

## Command Registration

- **Name:** `repairfillers`
- **Game Mode:** Creative

## Arguments

None

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
