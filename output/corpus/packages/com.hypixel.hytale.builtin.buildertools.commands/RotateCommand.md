# RotateCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractCommandCollection

public class RotateCommand extends AbstractCommandCollection

Rotates the clipboard. Has two variants: axis-based rotation taking an angle (must be a multiple of 90) and optional axis (default Y), and arbitrary rotation taking yaw/pitch/roll floats. Simple 90-degree Y-axis rotations are optimized to use the faster `BuilderState.rotate()` path.

## Command Registration

- **Name:** `rotate`
- **Game Mode:** Creative

## Arguments

Variant 1: angle (Integer), axis (Axis, default Y). Variant 2: yaw (Float), pitch (Float), roll (Float)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
