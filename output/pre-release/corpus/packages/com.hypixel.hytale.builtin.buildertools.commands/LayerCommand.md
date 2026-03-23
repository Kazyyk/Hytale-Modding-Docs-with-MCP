# LayerCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class LayerCommand extends AbstractPlayerCommand

Applies layered block patterns to the current selection in a specified direction. Accepts a direction string (up, down, north, south, east, west, or camera) and a list of layer entries, each specifying a thickness and block type.

## Command Registration

- **Name:** `layer`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.clipboard`

## Arguments

direction (String, required), layers (List<Pair<Integer, String>>, required)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static Map<String,Vector3i> directions
private final RequiredArg<String> layerDirectionArg
private final RequiredArg<List<Pair<Integer,String>>> layersArg
