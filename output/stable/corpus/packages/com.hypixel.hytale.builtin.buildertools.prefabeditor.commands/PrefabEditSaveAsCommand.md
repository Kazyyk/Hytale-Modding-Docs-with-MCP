# PrefabEditSaveAsCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.commands

public class PrefabEditSaveAsCommand

Subcommand to save the current prefab to a specified path.

Also in this package: PrefabEditCommand, PrefabEditCreateNewCommand, PrefabEditExitCommand, PrefabEditInfoCommand, PrefabEditKillEntitiesCommand, PrefabEditLoadCommand, PrefabEditModifiedCommand, PrefabEditSaveCommand, PrefabEditSaveUICommand, PrefabEditSelectCommand, PrefabEditTeleportCommand, PrefabEditUpdateBoxCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<String> fileNameArg
private final DefaultArg<PrefabRootDirectory> prefabPathArg
private final FlagArg noEntitiesArg
private final FlagArg overwriteArg
private final FlagArg emptyArg
private final FlagArg noUpdateArg
private final FlagArg clearSupportArg
