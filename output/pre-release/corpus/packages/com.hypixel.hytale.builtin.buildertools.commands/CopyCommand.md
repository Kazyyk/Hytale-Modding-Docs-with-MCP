# CopyCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class CopyCommand extends AbstractPlayerCommand

Copies the current selection to the clipboard. Supports flags for excluding entities (`--noEntities`), copying only entities (`--onlyEntities`), copying empty space (`--empty`), keeping prefab anchors (`--keepanchors`), and using the player position as anchor (`--playerAnchor`). An alternative usage variant accepts explicit min/max coordinates. Also provides static `copySelection()` utility methods for programmatic use.

## Command Registration

- **Name:** `copy`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.clipboard`

## Arguments

Flags: noEntities, onlyEntities, empty, keepanchors, playerAnchor. Variant: xMin, yMin, zMin, xMax, yMax, zMax (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
