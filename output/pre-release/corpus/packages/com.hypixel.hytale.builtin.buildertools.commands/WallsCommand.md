# WallsCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class WallsCommand extends AbstractPlayerCommand

Creates walls around the current selection using the specified block pattern. Supports configurable thickness (1-128, validated). Flags: `--floor`/`--bottom`, `--roof`/`--ceiling`/`--top`, `--perimeter`/`--all`.

## Command Registration

- **Name:** `wall`
- **Game Mode:** Creative

## Aliases

`walls`, `side`, `sides`

## Arguments

pattern (BlockPattern, required), thickness (Integer, default 1). Flags: floor, roof, perimeter

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<BlockPattern> patternArg
private final DefaultArg<Integer> thicknessArg
private final FlagArg floorArg
private final FlagArg roofArg
private final FlagArg perimeterArg
