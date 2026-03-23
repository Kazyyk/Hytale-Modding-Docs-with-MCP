# StandardDataSource

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.datasource

public class StandardDataSource implements DataSource

Standard implementation of `DataSource` that provides asset data from the default asset store for the built-in asset editor.

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
