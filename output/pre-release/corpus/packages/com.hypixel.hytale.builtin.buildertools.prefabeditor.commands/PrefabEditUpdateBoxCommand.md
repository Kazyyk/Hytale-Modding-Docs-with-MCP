# PrefabEditUpdateBoxCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.commands

public class PrefabEditUpdateBoxCommand

Subcommand to update the editing bounds box dimensions.

Also in this package: PrefabEditBackCommand, PrefabEditCommand, PrefabEditCreateNewCommand, PrefabEditExitCommand, PrefabEditInfoCommand, PrefabEditKillEntitiesCommand, PrefabEditLoadCommand, PrefabEditModifiedCommand, PrefabEditSaveAsCommand, PrefabEditSaveCommand, PrefabEditSaveUICommand, PrefabEditSelectCommand, PrefabEditTeleportCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  public boolean isLocationWithinSelection(Vector3i location, BlockSelection selection)

Fields:
private final FlagArg confirmAnchorDeletionArg
