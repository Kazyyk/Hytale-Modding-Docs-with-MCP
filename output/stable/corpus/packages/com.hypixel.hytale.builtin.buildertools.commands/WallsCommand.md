# WallsCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class WallsCommand extends AbstractPlayerCommand

Creates walls around the current selection using the specified block pattern. Supports configurable thickness (1-128, validated). Flags: `--floor`/`--bottom`, `--roof`/`--ceiling`/`--top`, `--perimeter`/`--all`.

## Command Registration

- **Name:** `wall`
- **Game Mode:** Creative

## Aliases

`walls`, `side`, `sides`

## Arguments

pattern (BlockPattern, required), thickness (Integer, default 1). Flags: floor, roof, perimeter

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
