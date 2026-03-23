# FlipCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class FlipCommand extends AbstractPlayerCommand

Flips (mirrors) the clipboard contents along an axis. When invoked without arguments, uses the player's current look axis. An alternative variant accepts an explicit `RelativeDirection`.

## Command Registration

- **Name:** `flip`
- **Game Mode:** Creative

## Arguments

Optional: direction (RelativeDirection)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
