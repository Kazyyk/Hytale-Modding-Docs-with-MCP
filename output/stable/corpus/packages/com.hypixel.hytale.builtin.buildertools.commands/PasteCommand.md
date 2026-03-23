# PasteCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class PasteCommand extends AbstractPlayerCommand

Pastes the clipboard at the player's current position or at specified coordinates. Supports a `--technical` flag for technical paste mode. An alternative variant accepts a `RelativeIntPosition`.

## Command Registration

- **Name:** `paste`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.clipboard`

## Arguments

Flag: technical. Variant: position (RelativeIntPosition)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
