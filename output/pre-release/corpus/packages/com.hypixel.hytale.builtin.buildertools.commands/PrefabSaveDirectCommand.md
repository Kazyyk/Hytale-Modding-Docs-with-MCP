# PrefabSaveDirectCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

private static class PrefabSaveDirectCommand extends AbstractPlayerCommand

Usage variant of `prefab save` that saves a prefab directly by name without opening a UI. Supports flags for overwrite, entities, empty, player anchor, clear support, and target asset pack.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private Vector3i getPlayerAnchor(Ref<EntityStore> ref, Store<EntityStore> store, boolean usePlayerAnchor)

Fields:
private final RequiredArg<String> nameArg
private final FlagArg overwriteFlag
private final FlagArg entitiesFlag
private final FlagArg emptyFlag
private final FlagArg playerAnchorFlag
private final FlagArg clearSupportFlag
private final DefaultArg<String> packArg
