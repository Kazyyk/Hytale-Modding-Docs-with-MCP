# UpdateSelectionCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class UpdateSelectionCommand extends AbstractPlayerCommand

Directly updates the selection bounds to the specified min/max coordinates. Delegates to `BuilderState.update()`.

## Command Registration

- **Name:** `updateselection`
- **Game Mode:** Creative

## Arguments

xMin, yMin, zMin, xMax, yMax, zMax (Integer, all required)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<Integer> xMinArg
private final RequiredArg<Integer> yMinArg
private final RequiredArg<Integer> zMinArg
private final RequiredArg<Integer> xMaxArg
private final RequiredArg<Integer> yMaxArg
private final RequiredArg<Integer> zMaxArg
