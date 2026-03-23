# PrefabEditSaveCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.commands

public class PrefabEditSaveCommand

Subcommand to save the current prefab to its original path.

Also in this package: PrefabEditCommand, PrefabEditCreateNewCommand, PrefabEditExitCommand, PrefabEditInfoCommand, PrefabEditKillEntitiesCommand, PrefabEditLoadCommand, PrefabEditModifiedCommand, PrefabEditSaveAsCommand, PrefabEditSaveUICommand, PrefabEditSelectCommand, PrefabEditTeleportCommand, PrefabEditUpdateBoxCommand

Complete API:
  private static boolean isPathInAllowedPrefabDirectory(Path path)
  protected CompletableFuture<Void> executeAsync(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static Path getWritableSavePath(PrefabEditingMetadata metadata, boolean confirm)

Fields:
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_NOT_IN_EDIT_SESSION
private static final Message MESSAGE_PATH_OUTSIDE_PREFABS_DIR
private final FlagArg saveAllArg
private final FlagArg noEntitiesArg
private final FlagArg emptyArg
private final FlagArg confirmArg
private final FlagArg clearSupportArg
