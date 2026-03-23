# DataSource

Type: interface | Package: com.hypixel.hytale.builtin.asseteditor.datasource

public interface DataSource

Abstraction over file system operations for an asset pack. Provides directory and asset CRUD, asset tree management, immutability checks, and modification tracking. The sole implementation is StandardDataSource.

## Methods

### Lifecycle

- void start() | Initializes the data source (loads modification index, starts save scheduler)
- void shutdown() | Shuts down (cancels scheduler, saves pending modifications)

### Directory Operations

- boolean doesDirectoryExist(Path) | Checks if a directory exists
- boolean createDirectory(Path, EditorClient) | Creates a directory
- boolean deleteDirectory(Path) | Deletes a directory
- boolean moveDirectory(Path, Path) | Moves/renames a directory

### Asset Operations

- boolean doesAssetExist(Path) | Checks if an asset file exists
- byte[] getAssetBytes(Path) | Reads asset file contents
- boolean updateAsset(Path, byte[], EditorClient) | Writes updated asset data
- boolean createAsset(Path, byte[], EditorClient) | Creates a new asset file
- boolean deleteAsset(Path, EditorClient) | Deletes an asset file
- boolean moveAsset(Path, Path, EditorClient) | Moves/renames an asset file

### Asset Tree

- AssetTree getAssetTree() | Returns the current asset tree
- AssetTree loadAssetTree(Collection<AssetTypeHandler>) | Builds a fresh asset tree from disk

### Metadata

- boolean shouldReloadAssetFromDisk(Path) | Whether an external file change requires reloading
- Instant getLastModificationTimestamp(Path) | Returns last modification time
- Path getFullPathToAssetData(Path) | Resolves absolute path to asset file
- boolean isImmutable() | Whether this data source is read-only
- Path getRootPath() | Root path of the asset pack
- PluginManifest getManifest() | Asset pack manifest
- void updateRuntimeAssets() | Default no-op hook for runtime asset refresh

Known implementors: StandardDataSource

Also in this package: EditorFileSaveInfo, StandardDataSource

Complete API:
  void start()
  void shutdown()
  AssetTree getAssetTree()
  AssetTree loadAssetTree(Collection<AssetTypeHandler> var1)
  boolean doesDirectoryExist(Path var1)
  boolean createDirectory(Path var1, EditorClient var2)
  boolean deleteDirectory(Path var1)
  boolean moveDirectory(Path var1, Path var2)
  boolean doesAssetExist(Path var1)
  byte[] getAssetBytes(Path var1)
  boolean updateAsset(Path var1, byte[] var2, EditorClient var3)
  boolean createAsset(Path var1, byte[] var2, EditorClient var3)
  boolean deleteAsset(Path var1, EditorClient var2)
  boolean moveAsset(Path var1, Path var2, EditorClient var3)
  boolean shouldReloadAssetFromDisk(Path var1)
  Instant getLastModificationTimestamp(Path var1)
  default void updateRuntimeAssets()
  Path getFullPathToAssetData(Path var1)
  boolean isImmutable()
  Path getRootPath()
  PluginManifest getManifest()
