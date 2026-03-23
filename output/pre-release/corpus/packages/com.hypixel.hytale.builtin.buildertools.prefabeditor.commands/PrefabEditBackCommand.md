# PrefabEditBackCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.commands | Extends: AbstractAsyncPlayerCommand

public class PrefabEditBackCommand extends AbstractAsyncPlayerCommand

Returns the player from the prefab editing world to the world they arrived from. If the player is not in their edit session world, sends them to it instead. Extends `AbstractAsyncPlayerCommand`.

Also in this package: PrefabEditCommand, PrefabEditCreateNewCommand, PrefabEditExitCommand, PrefabEditInfoCommand, PrefabEditKillEntitiesCommand, PrefabEditLoadCommand, PrefabEditModifiedCommand, PrefabEditSaveAsCommand, PrefabEditSaveCommand, PrefabEditSaveUICommand, PrefabEditSelectCommand, PrefabEditTeleportCommand, PrefabEditUpdateBoxCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_NOT_IN_EDIT_SESSION
private static final Message MESSAGE_COMMANDS_ALREADY_IN_EDIT_SESSION
