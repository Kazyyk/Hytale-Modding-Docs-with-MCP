---
title: "com.hypixel.hytale.builtin.buildertools.commands"
package: "com.hypixel.hytale.builtin.buildertools.commands"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "command"
  - "package-index"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.commands`

Builder tool commands providing WorldEdit-like editing functionality for creative mode. All 38 commands in this package extend `AbstractPlayerCommand` (or `AbstractCommandCollection`/`CommandBase`) and are gated to Creative mode. Operations are queued through `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread. None of the types in this package are part of the public API surface.

## Selection Commands

| Type | Kind | Description |
|---|---|---|
| [Pos1Command](Pos1Command.md) | class | Sets selection position 1. |
| [Pos2Command](Pos2Command.md) | class | Sets selection position 2. |
| [SelectChunkCommand](SelectChunkCommand.md) | class | Selects the entire chunk at the player's position. |
| [SelectChunkSectionCommand](SelectChunkSectionCommand.md) | class | Selects the chunk section at the player's position. |
| [ExpandCommand](ExpandCommand.md) | class | Expands selection by distance along an axis or look direction. |
| [ContractSelectionCommand](ContractSelectionCommand.md) | class | Contracts selection by distance. |
| [ShiftCommand](ShiftCommand.md) | class | Shifts selection position without moving contents. |
| [UpdateSelectionCommand](UpdateSelectionCommand.md) | class | Directly updates selection bounds to specified coordinates. |
| [DeselectCommand](DeselectCommand.md) | class | Clears the current selection. |
| [SelectionHistoryCommand](SelectionHistoryCommand.md) | class | Toggles selection history recording in undo/redo. |

## Edit Commands

| Type | Kind | Description |
|---|---|---|
| [SetCommand](SetCommand.md) | class | Sets all blocks in selection to a pattern. |
| [FillCommand](FillCommand.md) | class | Fills selection with a pattern. |
| [ReplaceCommand](ReplaceCommand.md) | class | Replaces blocks with support for regex and substring swap. |
| [ClearBlocksCommand](ClearBlocksCommand.md) | class | Clears all blocks in selection or by coordinates. |
| [ClearEntitiesCommand](ClearEntitiesCommand.md) | class | Removes entities within selection. |
| [WallsCommand](WallsCommand.md) | class | Creates walls around selection. |
| [HollowCommand](HollowCommand.md) | class | Hollows out selection interior. |
| [LayerCommand](LayerCommand.md) | class | Applies layered block patterns to selection. |
| [SubmergeCommand](SubmergeCommand.md) | class | Submerges selection in fluid. |
| [RepairFillersCommand](RepairFillersCommand.md) | class | Repairs filler blocks in selection. |
| [TintCommand](TintCommand.md) | class | Sets tint color on blocks in selection. |
| [EnvironmentCommand](EnvironmentCommand.md) | class | Sets environment for selection area. |
| [EditLineCommand](EditLineCommand.md) | class | Draws a line between two points. |
| [ExtendFaceCommand](ExtendFaceCommand.md) | class | Extrudes a block face. |
| [GlobalMaskCommand](GlobalMaskCommand.md) | class | Sets or clears global mask for all operations. |

## Clipboard Commands

| Type | Kind | Description |
|---|---|---|
| [CopyCommand](CopyCommand.md) | class | Copies selection to clipboard. |
| [CutCommand](CutCommand.md) | class | Cuts selection to clipboard. |
| [PasteCommand](PasteCommand.md) | class | Pastes clipboard at player position or coordinates. |
| [RotateCommand](RotateCommand.md) | class | Rotates clipboard by angle or arbitrary yaw/pitch/roll. |
| [FlipCommand](FlipCommand.md) | class | Flips clipboard along axis based on look direction. |
| [MoveCommand](MoveCommand.md) | class | Moves selection contents. |
| [StackCommand](StackCommand.md) | class | Stacks selection in a direction. |

## History Commands

| Type | Kind | Description |
|---|---|---|
| [UndoCommand](UndoCommand.md) | class | Undoes edits. |
| [RedoCommand](RedoCommand.md) | class | Redoes edits. |
| [ClearEditHistory](ClearEditHistory.md) | class | Clears all undo/redo history. |
| [SetToolHistorySizeCommand](SetToolHistorySizeCommand.md) | class | Changes max history size. |

## Prefab and Hotbar Commands

| Type | Kind | Description |
|---|---|---|
| [PrefabCommand](PrefabCommand.md) | class | Load, save, delete, and list prefabs. |
| [HotbarSwitchCommand](HotbarSwitchCommand.md) | class | Save or load hotbar row configurations. |
- [ReplaceSwapCommand](ReplaceSwapCommand.md)
