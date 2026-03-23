# StackCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class StackCommand extends AbstractPlayerCommand

Stacks the current selection in a direction, repeating it the specified number of times. Without arguments, stacks 1 time in the look direction. Supports `--empty` (include air) and `--spacing` (gap between repeats) options. Variants accept a count, or a direction plus count.

## Command Registration

- **Name:** `stack`
- **Game Mode:** Creative

## Arguments

Flags: empty. Optional: spacing (Integer). Variants: count (Integer); direction (RelativeDirection) + count (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static void executeStack(Store<EntityStore> store, Ref<EntityStore> ref, RelativeDirection direction, int count, boolean empty, int spacing)

Fields:
private final FlagArg emptyFlag
private final OptionalArg<Integer> spacingArg
