# SelectChunkSectionCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class SelectChunkSectionCommand extends AbstractPlayerCommand

Selects the chunk section (32x32x32 block volume) at the player's current position.

## Command Registration

- **Name:** `selectchunksection`
- **Game Mode:** Creative

## Arguments

None

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 40 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
