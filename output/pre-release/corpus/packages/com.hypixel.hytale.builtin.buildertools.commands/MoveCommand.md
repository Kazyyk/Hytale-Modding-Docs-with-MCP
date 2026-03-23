# MoveCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class MoveCommand extends AbstractPlayerCommand

Moves the contents of the current selection in a direction. Without arguments, moves 1 block in the look direction. Variants accept a distance or a direction plus distance. Supports `--empty` (leave source empty) and `--entities` (move entities) flags.

## Command Registration

- **Name:** `move`
- **Game Mode:** Creative

## Arguments

Flags: empty, entities. Variants: distance (Integer); direction (RelativeDirection) + distance (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static void executeMove(Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, RelativeDirection direction, int distance, boolean empty, boolean entities)

Fields:
private final FlagArg emptyFlag
private final FlagArg entitiesFlag
