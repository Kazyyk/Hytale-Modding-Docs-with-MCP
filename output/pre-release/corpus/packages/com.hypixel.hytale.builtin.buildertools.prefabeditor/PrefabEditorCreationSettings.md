# PrefabEditorCreationSettings

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor | Implements: PrefabEditorCreationContext, JsonAssetWithMap

public class PrefabEditorCreationSettings implements PrefabEditorCreationContext, JsonAssetWithMap<String, DefaultAssetMap<String, PrefabEditorCreationSettings>>

Persistent, serializable settings for creating a prefab edit session. Stored as a JSON asset and loadable by name. Contains all parameters from `PrefabEditorCreationContext` plus path resolution logic that handles asset-pack, server, and worldgen root directories. Validates paths for traversal attacks on non-singleplayer owners. Supports recursive directory walking up to depth 10.

## Constants

- RECURSIVE_SEARCH_MAX_DEPTH | int | 10 | Maximum directory recursion depth.

## Key Methods

- getAssetStore() | AssetStore<...> | Returns the global asset store for creation settings.
- getAssetMap() | DefaultAssetMap<...> | Returns the asset map for named lookup.
- finishProcessing(Player, PlayerRef, boolean) | PrefabEditorCreationContext | Resolves raw paths into absolute prefab file paths. Returns null on validation failure.
- load(String) | CompletableFuture<PrefabEditorCreationSettings> | Asynchronously loads a named settings preset.
- save(String, PrefabEditorCreationSettings) | CompletableFuture<Void> | Asynchronously saves settings under a name.
- stringEndsWithPrefabPath(String) | boolean | Checks if a string ends with a prefab file extension.

## See Also

- PrefabEditorCreationContext
- PrefabEditSessionManager

Also in this package: BlockBreakDirtySystem, BlockPlaceDirtySystem, LoadingError, Phase, PrefabAnchor, PrefabDirtySystems, PrefabEditSession, PrefabEditSessionManager, PrefabEditingMetadata, PrefabEditorCreationContext, PrefabLoadingState, PrefabMarkerProvider, PrefabSelectionInteraction, Tri

Complete API:
  public static AssetStore<String,PrefabEditorCreationSettings,DefaultAssetMap<String,PrefabEditorCreationSettings>> getAssetStore()
  public static DefaultAssetMap<String,PrefabEditorCreationSettings> getAssetMap()
  PrefabEditorCreationContext finishProcessing(Player editor, PlayerRef playerRef, boolean creatingNewPrefab)
  private Path resolveRootPathForInput(String inputPath)
  private String getRelativePathForInput(String inputPath)
  public static boolean stringEndsWithPrefabPath(String input)
  public static CompletableFuture<PrefabEditorCreationSettings> load(String name)
  public static CompletableFuture<Void> save(String name, PrefabEditorCreationSettings settings)
  public static CompletableFuture<Void> save(String name, PrefabEditorCreationSettings settings, AssetPack pack)
  public Player getEditor()
  public PlayerRef getEditorRef()
  public List<Path> getPrefabPaths()
  public int getBlocksBetweenEachPrefab()
  public int getPasteLevelGoal()
  public boolean loadChildPrefabs()
  public boolean shouldLoadEntities()
  public PrefabStackingAxis getStackingAxis()
  public WorldGenType getWorldGenType()
  public int getBlocksAboveSurface()
  public PrefabAlignment getAlignment()
  public String getId()
  public PrefabRootDirectory getPrefabRootDirectory()
  public List<String> getUnprocessedPrefabPaths()
  public int getPasteYLevelGoal()
  public boolean isRecursive()
  public boolean isLoadChildren()
  public boolean isWorldTickingEnabled()
  public PrefabRowSplitMode getRowSplitMode()
  public String getEnvironment()
  public String getGrassTint()

Fields:
private static final int RECURSIVE_SEARCH_MAX_DEPTH
public static final AssetBuilderCodec<String,PrefabEditorCreationSettings> CODEC
private static AssetStore<String,PrefabEditorCreationSettings,DefaultAssetMap<String,PrefabEditorCreationSettings>> ASSET_STORE
private String id
private AssetExtraInfo.Data data
private transient Player player
private transient PlayerRef playerRef
private PrefabRootDirectory prefabRootDirectory
private final transient List<Path> prefabPaths
private List<String> unprocessedPrefabPaths
private int pasteYLevelGoal
private int blocksBetweenEachPrefab
private WorldGenType worldGenType
private int blocksAboveSurface
private PrefabStackingAxis stackingAxis
private PrefabAlignment alignment
private boolean recursive
private boolean loadChildren
private boolean loadEntities
private boolean enableWorldTicking
private PrefabRowSplitMode rowSplitMode
private String environment
private String grassTint
