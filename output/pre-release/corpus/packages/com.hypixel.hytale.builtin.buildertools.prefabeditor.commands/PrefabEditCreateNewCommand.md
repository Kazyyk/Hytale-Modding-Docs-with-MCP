# PrefabEditCreateNewCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.commands

public class PrefabEditCreateNewCommand

Subcommand to create a new prefab editing session with configurable world gen type, root directory, and dimensions.

Also in this package: PrefabEditBackCommand, PrefabEditCommand, PrefabEditExitCommand, PrefabEditInfoCommand, PrefabEditKillEntitiesCommand, PrefabEditLoadCommand, PrefabEditModifiedCommand, PrefabEditSaveAsCommand, PrefabEditSaveCommand, PrefabEditSaveUICommand, PrefabEditSelectCommand, PrefabEditTeleportCommand, PrefabEditUpdateBoxCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_NEW_ERRORS_NOT_A_FILE
private final RequiredArg<String> prefabNameArg
private final DefaultArg<WorldGenType> worldGenTypeArg
private final DefaultArg<Integer> flatNumBlocksBelowArg
private final DefaultArg<PrefabRootDirectory> prefabPathArg
