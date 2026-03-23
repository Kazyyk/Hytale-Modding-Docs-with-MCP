# DataSource

Type: interface | Package: com.hypixel.hytale.builtin.asseteditor.datasource

public interface DataSource

Interface for data source providers used by the built-in asset editor to supply asset data for editing.

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
