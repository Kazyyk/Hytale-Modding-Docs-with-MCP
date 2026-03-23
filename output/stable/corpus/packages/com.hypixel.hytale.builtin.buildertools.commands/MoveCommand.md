# MoveCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class MoveCommand extends AbstractPlayerCommand

Moves the contents of the current selection in a direction. Without arguments, moves 1 block in the look direction. Variants accept a distance or a direction plus distance. Supports `--empty` (leave source empty) and `--entities` (move entities) flags.

## Command Registration

- **Name:** `move`
- **Game Mode:** Creative

## Arguments

Flags: empty, entities. Variants: distance (Integer); direction (RelativeDirection) + distance (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
