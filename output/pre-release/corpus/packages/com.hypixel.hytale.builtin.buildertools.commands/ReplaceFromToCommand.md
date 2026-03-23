# ReplaceFromToCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

private static class ReplaceFromToCommand extends AbstractPlayerCommand

Usage variant of `replace` that accepts explicit `from` (BlockMask) and `to` (BlockPattern) arguments. Delegates to `ReplaceCommand.executeBlockReplace()` with both arguments.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<BlockMask> fromArg
private final RequiredArg<BlockPattern> toArg
