# ShiftCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class ShiftCommand extends AbstractPlayerCommand

Shifts the selection position by a specified distance along an axis or the player's look direction. Does not move the selection contents; only adjusts the selection bounds. Defaults to distance 1.

## Command Registration

- **Name:** `shift`
- **Game Mode:** Creative

## Arguments

distance (Integer, default 1), axis (Axis, optional)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
