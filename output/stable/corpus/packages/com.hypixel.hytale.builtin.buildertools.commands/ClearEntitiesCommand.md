# ClearEntitiesCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class ClearEntitiesCommand extends AbstractPlayerCommand

Removes all copyable entities within the current selection bounds. Iterates entities via `BuilderToolsPlugin.forEachCopyableInSelection()` and removes each with `RemoveReason.REMOVE`. Reports the count of removed entities.

## Command Registration

- **Name:** `clearEntities`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.clipboard`

## Arguments

None

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand, GlobalMaskSetCommand (and 40 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_NO_SELECTION
