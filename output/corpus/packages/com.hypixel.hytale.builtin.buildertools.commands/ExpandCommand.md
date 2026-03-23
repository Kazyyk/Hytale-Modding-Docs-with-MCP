# ExpandCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class ExpandCommand extends AbstractPlayerCommand

Expands the current selection by a given distance along a specified axis or the player's look direction. Defaults to distance 1.

## Command Registration

- **Name:** `expand`
- **Game Mode:** Creative

## Arguments

distance (Integer, default 1), axis (Axis, optional)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
