# CommonAssetTypeHandler

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.assettypehandler | Extends: AssetTypeHandler

public class CommonAssetTypeHandler extends AssetTypeHandler

Handler for common (client-distributed) asset types: textures (.png), models (.blockymodel), animations (.blockyanim), sounds (.ogg), UI files (.ui), and language files (.lang). These assets live under the `Common/` directory and are distributed to all connected clients.

## Constructor


public CommonAssetTypeHandler(String id, String icon, String fileExtension, AssetEditorEditorType editorType)

## Key Methods

- AssetLoadResult loadAsset(...) | Registers a `FileCommonAsset` in `CommonAssetRegistry`; returns `COMMON_ASSETS_CHANGED` if the hash differs
- AssetLoadResult unloadAsset(AssetPath, AssetUpdateQuery) | Removes from `CommonAssetRegistry` and sends removal to players if needed
- AssetLoadResult restoreOriginalAsset(AssetPath, AssetUpdateQuery) | Reads the original file from the asset pack root and re-registers it
- AssetUpdateQuery getDefaultUpdateQuery() | Returns a query with `commonAssetsRebuild = true

Also in this package: AssetLoadResult, AssetStoreTypeHandler, AssetTypeHandler, JsonTypeHandler

Complete API:
  public AssetTypeHandler.AssetLoadResult loadAsset(AssetPath path, Path dataPath, byte[] data, AssetUpdateQuery updateQuery, EditorClient editorClient)
  public AssetTypeHandler.AssetLoadResult unloadAsset(AssetPath path, AssetUpdateQuery updateQuery)
  public AssetTypeHandler.AssetLoadResult restoreOriginalAsset(AssetPath originalAssetPath, AssetUpdateQuery updateQuery)
  public AssetUpdateQuery getDefaultUpdateQuery()

Fields:
private static final HytaleLogger LOGGER
