# Pos2Command

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class Pos2Command extends AbstractPlayerCommand

Sets selection position 2. When x/y/z arguments are provided, uses those coordinates; otherwise uses the player's current block position.

## Command Registration

- **Name:** `pos2`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.use`

## Arguments

x (Integer, optional), y (Integer, optional), z (Integer, optional)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final OptionalArg<Integer> xArg
private final OptionalArg<Integer> yArg
private final OptionalArg<Integer> zArg
