# EditLineCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class EditLineCommand extends AbstractPlayerCommand

Draws a line of blocks between two points with configurable brush parameters. Start and end positions are relative to the player. Supports material pattern, width, height, wall thickness, brush shape, brush origin, spacing, and density arguments.

## Command Registration

- **Name:** `editline`
- **Game Mode:** Creative

## Arguments

start (RelativeVector3i), end (RelativeVector3i), material (String), width (Integer, default 1), height (Integer, default 1), wallThickness (Integer, default 0), shape (String, default Cube), origin (String, default Center), spacing (Integer, default 1), density (Integer, default 100)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand, GlobalMaskSetCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<RelativeVector3i> startArg
private final RequiredArg<RelativeVector3i> endArg
private final RequiredArg<String> materialArg
private final DefaultArg<Integer> widthArg
private final DefaultArg<Integer> heightArg
private final DefaultArg<Integer> wallThicknessArg
private final DefaultArg<String> shapeArg
private final DefaultArg<String> originArg
private final DefaultArg<Integer> spacingArg
private final DefaultArg<Integer> densityArg
