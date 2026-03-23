# CutCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class CutCommand extends AbstractPlayerCommand

Cuts the current selection to the clipboard (copy then clear original). Uses settings bitflag `2` (cut flag) in addition to the same flags as CopyCommand. Supports an alternative coordinate-based variant.

## Command Registration

- **Name:** `cut`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.clipboard`

## Arguments

Flags: noEntities, onlyEntities, empty, keepanchors. Variant: xMin, yMin, zMin, xMax, yMax, zMax (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand, GlobalMaskSetCommand (and 40 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_BUILDER_TOOLS_COPY_CUT_NO_SELECTION
private final FlagArg noEntitiesFlag
private final FlagArg entitiesOnlyFlag
private final FlagArg emptyFlag
private final FlagArg keepAnchorsFlag
