# ReplaceCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class ReplaceCommand extends AbstractPlayerCommand

Replaces blocks in the current selection. Without a `from` argument, replaces all non-air blocks with the `to` pattern. Supports `--regex` for regex-based block name matching, and `--substringSwap` for substring-based replacement across all matching block type names. Handles both block and fluid materials. A variant accepts explicit `from` and `to` arguments.

## Command Registration

- **Name:** `replace`
- **Game Mode:** Creative

## Arguments

to (BlockPattern, required). Flags: substringSwap, regex. Variant: from (String) + to (BlockPattern)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 40 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static void executeReplace(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, String fromValue, BlockPattern toPattern, boolean substringSwap, boolean regex)

Fields:
private final RequiredArg<BlockPattern> toArg
private final FlagArg substringSwapFlag
private final FlagArg regexFlag
