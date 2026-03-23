# PrefabCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractCommandCollection

public class PrefabCommand extends AbstractCommandCollection

Root command for prefab management. Contains subcommands `save`, `load`, `delete`, and `list`. The `load` subcommand supports loading by name from asset/server/worldgen stores with optional recursive child loading. The `save` subcommand supports direct save with flags for overwrite, entities, empty, player anchor, and clear support. The `list` subcommand supports asset/server/worldgen store types and a `--text` flag for text-only output.

## Command Registration

- **Name:** `prefab`
- **Game Mode:** Creative

## Aliases

`p`

## Arguments

Subcommands: save, load, delete, list

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 42 more)
