# StandardDataSource

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.datasource | Implements: DataSource

public class StandardDataSource implements DataSource

File-system-backed implementation of DataSource. Reads/writes asset files on disk, tracks recent modifications with periodic persistence (every 60 seconds), and maintains an editor-save hash cache to detect whether file changes originated from the editor (to avoid redundant reloads from file watchers).

## Constructor


public StandardDataSource(String packKey, Path rootPath, boolean isImmutable, PluginManifest manifest)

The data source is deleteable only if not immutable and located under the mods directory.

## Key Behaviors

### Modification Tracking

Recently modified assets are stored in `modifiedAssets` (max 50 entries, oldest evicted). The index is persisted to `assetEditor/recentAssetEdits_{packKey}.json` with a `.bak` fallback. Each `ModifiedAsset` records the path, state, timestamp, and editor username.

### Editor Save Cache

When the editor saves a file, its SHA-256 hash is recorded in `editorSaves` with a 30-second expiry. When `shouldReloadAssetFromDisk()` is called (e.g. by a file watcher), it checks whether the current file hash matches any cached editor save. If so, the reload is suppressed. Maximum 20 cached saves per path.

## Key Methods

- void start() | Loads modification index and starts 60-second save scheduler
- void shutdown() | Cancels scheduler and saves pending modifications
- void saveRecentModifications() | Persists the modification index if dirty
- boolean canAssetPackBeDeleted() | Whether this pack can be deleted (non-immutable + in mods dir)
- Path resolveAbsolutePath(Path) | Resolves and validates a path against the root
- void putModifiedAsset(ModifiedAsset) | Tracks a modification with LRU eviction at 50 entries
- Map<Path, ModifiedAsset> getRecentlyModifiedAssets() | Returns the modifications map

## Inner Records

### EditorFileSaveInfo


record EditorFileSaveInfo(String hash, long expiryMs)

Tracks a single editor-originated file save with its content hash and expiry timestamp.

Also in this package: DataSource, EditorFileSaveInfo

Complete API:
  private static boolean isInModsDirectory(Path path)
  public void start()
  public void shutdown()
  private void loadRecentModifications()
  public void saveRecentModifications()
  public boolean canAssetPackBeDeleted()
  public Path resolveAbsolutePath(Path path)
  public Path getFullPathToAssetData(Path assetPath)
  public AssetTree getAssetTree()
  public boolean isImmutable()
  public Path getRootPath()
  public PluginManifest getManifest()
  public boolean doesDirectoryExist(Path folderPath)
  public boolean createDirectory(Path dirPath, EditorClient editorClient)
  public boolean deleteDirectory(Path dirPath)
  public boolean moveDirectory(Path oldDirPath, Path newDirPath)
  public boolean doesAssetExist(Path assetPath)
  public byte[] getAssetBytes(Path assetPath)
  public boolean updateAsset(Path assetPath, byte[] bytes, EditorClient editorClient)
  public boolean createAsset(Path assetPath, byte[] bytes, EditorClient editorClient)
  public boolean deleteAsset(Path assetPath, EditorClient editorClient)
  public boolean shouldReloadAssetFromDisk(Path assetPath)
  public Instant getLastModificationTimestamp(Path assetPath)
  public boolean moveAsset(Path oldAssetPath, Path newAssetPath, EditorClient editorClient)
  public AssetTree loadAssetTree(Collection<AssetTypeHandler> assetTypes)
  public void putModifiedAsset(ModifiedAsset modifiedAsset)
  public Map<Path,ModifiedAsset> getRecentlyModifiedAssets()
  private void trackEditorFileSave(Path path, String hash)

Fields:
private static final HytaleLogger LOGGER
private final Path rootPath
private final ConcurrentHashMap<Path,Deque<StandardDataSource.EditorFileSaveInfo>> editorSaves
private final AssetTree assetTree
private final String packKey
private final PluginManifest manifest
private final boolean isImmutable
private final Path recentModificationsFilePath
private final AtomicBoolean indexNeedsSaving
private final Map<Path,ModifiedAsset> modifiedAssets
private ScheduledFuture<?> saveSchedule
private boolean isAssetPackBeDeleteable
