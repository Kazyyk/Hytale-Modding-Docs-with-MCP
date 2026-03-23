# SelectionHistoryCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class SelectionHistoryCommand extends AbstractPlayerCommand

Toggles whether selection changes are recorded in the undo/redo history. Sets the `recordSelectionHistory` flag on the player's `BuilderToolsUserData` component.

## Command Registration

- **Name:** `selectionHistory`
- **Game Mode:** Creative

## Arguments

enabled (Boolean, required)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<Boolean> enabledArg
