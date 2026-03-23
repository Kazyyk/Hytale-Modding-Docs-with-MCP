# HollowCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class HollowCommand extends AbstractPlayerCommand

Hollows out the current selection, replacing interior blocks with the specified block type. Supports configurable thickness (1-128, validated), and flags for including the floor (`--floor`/`--bottom`), roof (`--roof`/`--ceiling`/`--top`), and full perimeter (`--perimeter`/`--all`).

## Command Registration

- **Name:** `hollow`
- **Game Mode:** Creative

## Arguments

blockType (String, default Empty/Air), thickness (Integer, default 1). Flags: floor, roof, perimeter

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
