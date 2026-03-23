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
