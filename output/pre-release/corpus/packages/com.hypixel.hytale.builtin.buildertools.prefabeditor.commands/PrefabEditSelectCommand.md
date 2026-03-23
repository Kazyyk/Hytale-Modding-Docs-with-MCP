# PrefabEditSelectCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.commands

public class PrefabEditSelectCommand

Subcommand to select a prefab within the editing session.

Also in this package: PrefabEditBackCommand, PrefabEditCommand, PrefabEditCreateNewCommand, PrefabEditExitCommand, PrefabEditInfoCommand, PrefabEditKillEntitiesCommand, PrefabEditLoadCommand, PrefabEditModifiedCommand, PrefabEditSaveAsCommand, PrefabEditSaveCommand, PrefabEditSaveUICommand, PrefabEditTeleportCommand, PrefabEditUpdateBoxCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static Vector3i getTargetLocation(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_SELECT_ERROR_NO_TARGET_FOUND
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_SELECT_ERROR_NO_PREFAB_FOUND
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_NOT_IN_EDIT_SESSION
private final FlagArg nearestArg
