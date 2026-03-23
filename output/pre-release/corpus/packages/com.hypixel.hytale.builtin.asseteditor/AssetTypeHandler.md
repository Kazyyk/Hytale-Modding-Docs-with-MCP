# AssetTypeHandler

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.assettypehandler

public abstract class AssetTypeHandler

Base class for asset type handlers. Defines the contract for loading, unloading, and restoring assets of a specific type. Each handler is configured with an `AssetEditorAssetType` descriptor (id, icon, path, file extension, editor type).

## Abstract Methods

- AssetLoadResult loadAsset(AssetPath, Path, byte[], AssetUpdateQuery, EditorClient) | Loads asset data into the runtime system
- AssetLoadResult unloadAsset(AssetPath, AssetUpdateQuery) | Removes a loaded asset
- AssetLoadResult restoreOriginalAsset(AssetPath, AssetUpdateQuery) | Restores an asset from its original on-disk state
- AssetUpdateQuery getDefaultUpdateQuery() | Returns the default rebuild cache configuration

## Convenience Methods

- AssetLoadResult loadAsset(AssetPath, Path, byte[], EditorClient) | Calls `loadAsset` with the default update query
- AssetLoadResult unloadAsset(AssetPath) | Calls `unloadAsset` with the default update query
- AssetLoadResult restoreOriginalAsset(AssetPath) | Calls `restoreOriginalAsset` with the default update query
- boolean isValidData(byte[]) | Validates raw data; default returns `true
- AssetEditorAssetType getConfig() | Returns the asset type configuration
- Path getRootPath() | Returns the root path for this asset type

## Inner Enums

### AssetLoadResult


public static enum AssetLoadResult { ASSETS_UNCHANGED, ASSETS_CHANGED, COMMON_ASSETS_CHANGED }

- ASSETS_UNCHANGED | No runtime changes occurred
- ASSETS_CHANGED | Server-side assets were modified
- COMMON_ASSETS_CHANGED | Common (client-distributed) assets were modified

Known subclasses: CommonAssetTypeHandler, JsonTypeHandler

Also in this package: AssetLoadResult, AssetStoreTypeHandler, CommonAssetTypeHandler, JsonTypeHandler

Complete API:
  public abstract AssetTypeHandler.AssetLoadResult loadAsset(AssetPath var1, Path var2, byte[] var3, AssetUpdateQuery var4, EditorClient var5)
  public abstract AssetTypeHandler.AssetLoadResult unloadAsset(AssetPath var1, AssetUpdateQuery var2)
  public abstract AssetTypeHandler.AssetLoadResult restoreOriginalAsset(AssetPath var1, AssetUpdateQuery var2)
  public abstract AssetUpdateQuery getDefaultUpdateQuery()
  public AssetTypeHandler.AssetLoadResult loadAsset(AssetPath path, Path dataPath, byte[] data, EditorClient editorClient)
  public AssetTypeHandler.AssetLoadResult unloadAsset(AssetPath path)
  public AssetTypeHandler.AssetLoadResult restoreOriginalAsset(AssetPath originalAssetPath)
  public boolean isValidData(byte[] data)
  public AssetEditorAssetType getConfig()
  public Path getRootPath()

Fields:
protected final AssetEditorAssetType config
protected final Path rootPath
protected AssetUpdateQuery cachedDefaultUpdateQuery
