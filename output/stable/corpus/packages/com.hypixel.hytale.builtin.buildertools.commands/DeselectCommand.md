# DeselectCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class DeselectCommand extends AbstractPlayerCommand

Clears the current block selection. Delegates to `BuilderState.deselect()`.

## Command Registration

- **Name:** `deselect`
- **Game Mode:** Creative

## Aliases

`clearselection`

## Arguments

None

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand, GlobalMaskSetCommand (and 40 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
