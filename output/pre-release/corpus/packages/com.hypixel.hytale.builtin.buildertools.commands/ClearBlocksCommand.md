# ClearBlocksCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class ClearBlocksCommand extends AbstractPlayerCommand

Clears all blocks within the current selection or between two specified coordinate positions. When invoked without arguments, sets the selection to `BlockPattern.EMPTY`. An alternative usage variant accepts two `RelativeIntPosition` arguments to clear a specific coordinate range.

## Command Registration

- **Name:** `clearBlocks`
- **Game Mode:** Creative

## Aliases

`clear`

## Arguments

Optional: positionOne (RelativeIntPosition), positionTwo (RelativeIntPosition)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand, GlobalMaskSetCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_CLEAR_NO_SELECTION
private static final Message MESSAGE_COMMANDS_CLEAR_SUCCESS
