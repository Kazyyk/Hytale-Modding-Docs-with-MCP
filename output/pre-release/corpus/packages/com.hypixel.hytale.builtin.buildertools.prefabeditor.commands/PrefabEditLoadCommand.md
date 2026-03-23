# PrefabEditLoadCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.commands

public class PrefabEditLoadCommand

Subcommand to load an existing prefab for editing with configurable alignment and stacking options.

Also in this package: PrefabEditBackCommand, PrefabEditCommand, PrefabEditCreateNewCommand, PrefabEditExitCommand, PrefabEditInfoCommand, PrefabEditKillEntitiesCommand, PrefabEditModifiedCommand, PrefabEditSaveAsCommand, PrefabEditSaveCommand, PrefabEditSaveUICommand, PrefabEditSelectCommand, PrefabEditTeleportCommand, PrefabEditUpdateBoxCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
public static final int DEFAULT_PASTE_LEVEL_GOAL
public static final int DEFAULT_BLOCKS_BETWEEN_MULTI_PREFABS
public static final WorldGenType DEFAULT_WORLD_GEN_TYPE
public static final int DEFAULT_BLOCKS_ABOVE_SURFACE
public static final PrefabStackingAxis DEFAULT_PREFAB_STACKING_AXIS
public static final PrefabAlignment DEFAULT_PREFAB_ALIGNMENT
public static final int MAX_BLOCKS_BETWEEN_EACH_PREFAB
public static final int MAX_BLOCKS_UNTIL_SURFACE
public static final PrefabRootDirectory DEFAULT_PREFAB_ROOT_DIRECTORY
public static final PrefabRowSplitMode DEFAULT_ROW_SPLIT_MODE
private static final Message MESSAGE_COMMANDS_PREFAB_EDIT_SESSION_MANAGER_EXISTING_EDIT_SESSION
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_LOADING
private final RequiredArg<PrefabRootDirectory> prefabPathArg
private final RequiredArg<List<String>> prefabNameArg
private final DefaultArg<Integer> pasteLevelGoalArg
private final DefaultArg<Integer> blocksBetweenMultiPrefabsArg
private final DefaultArg<WorldGenType> worldGenTypeArg
private final DefaultArg<Integer> flatNumBlocksBelowArg
private final DefaultArg<PrefabStackingAxis> axisArg
private final DefaultArg<PrefabAlignment> alignmentArg
private final FlagArg recursiveArg
private final FlagArg loadChildrenArg
private final FlagArg loadEntitiesArg
