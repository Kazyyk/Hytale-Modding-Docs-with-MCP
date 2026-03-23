# Pos1Command

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class Pos1Command extends AbstractPlayerCommand

Sets selection position 1. When x/y/z arguments are provided, uses those coordinates; otherwise uses the player's current block position.

## Command Registration

- **Name:** `pos1`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.use`

## Arguments

x (Integer, optional), y (Integer, optional), z (Integer, optional)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
