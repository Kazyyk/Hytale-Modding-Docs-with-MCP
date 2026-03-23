# AssetTree

Type: class | Package: com.hypixel.hytale.builtin.asseteditor

public class AssetTree

Represents the sorted file tree for a single asset pack. Maintains two separate lists of `AssetEditorFileEntry` objects for `Server/` and `Common/` directories, protected by a `StampedLock` for concurrent read/write access. Supports file lookup via binary search, insertion with parent directory creation, removal with subtree cleanup, and batch application of asset changes.

## Constructor


public AssetTree(Path rootPath, String packKey, boolean isReadOnly, boolean canBeDeleted)


public AssetTree(Path rootPath, String packKey, boolean isReadOnly, boolean canBeDeleted, Collection<AssetTypeHandler> assetTypes)

The second constructor immediately loads the file tree by walking `Server/` (filtered by registered asset type paths) and `Common/` directories.

## Key Methods

- void sendPackets(EditorClient) | Sends both Server and Common file tree setup packets
- void replaceAssetTree(AssetTree) | Atomically replaces both asset lists
- AssetEditorFileEntry ensureAsset(Path, boolean) | Inserts a file/directory entry, creating parent dirs as needed; returns null if already present
- AssetEditorFileEntry getAssetFile(Path) | Binary-searches for a file entry by path
- AssetEditorFileEntry removeAsset(Path) | Removes a file or directory (and all children)
- boolean isDirectoryEmpty(Path) | Checks if a directory has any child entries
- void applyAssetChanges(Map<Path, ModifiedAsset>, Map<Path, ModifiedAsset>) | Batch-applies directory creations and asset modifications (new, deleted, renamed)

Also in this package: AssetEditorGamePacketHandler, AssetEditorPacketHandler, AssetEditorPlugin, AssetPath, AssetSpecificFunctionality, AssetToDiscard, AssetTypeRegistry, DiscardResult, EditorClient, InitState, Messages, PlayerPreviewData, UndoRedoManager

Complete API:
  public void replaceAssetTree(AssetTree assetTree)
  public void sendPackets(EditorClient editorClient)
  public boolean isDirectoryEmpty(Path path)
  public AssetEditorFileEntry ensureAsset(Path path, boolean isDirectory)
  public AssetEditorFileEntry getAssetFile(Path path)
  public AssetEditorFileEntry removeAsset(Path path)
  public void applyAssetChanges(Map<Path,ModifiedAsset> createdDirectories, Map<Path,ModifiedAsset> modifiedAssets)
  private List<AssetEditorFileEntry> getAssetListForPath(Path path)
  private void load(Collection<AssetTypeHandler> assetTypes)
  private static void loadServerAssets(Path root, Collection<AssetTypeHandler> assetTypes, List<AssetEditorFileEntry> files)
  private static void walkFileTree(Path root, Path dirPath, List<AssetEditorFileEntry> files)

Fields:
private static final HytaleLogger LOGGER
private final StampedLock lock
private final Path rootPath
private final String packKey
private final boolean isReadOnly
private final boolean canBeDeleted
List<AssetEditorFileEntry> serverAssets
List<AssetEditorFileEntry> commonAssets
