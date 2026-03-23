# AssetStoreTypeHandler

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.assettypehandler | Extends: JsonTypeHandler

public class AssetStoreTypeHandler extends JsonTypeHandler

Handler for asset types backed by an `AssetStore`. Decodes a BSON document into the store's asset format, loads it into the store, and manages the rebuild cache configuration from the asset's JSON schema. Used for all `Server/`-side JSON asset types (block types, items, models, weather, etc.).

## Constructor


public AssetStoreTypeHandler(AssetStore assetStore)

Automatically creates the `AssetEditorAssetType` config from the store's class name, path, extension, and `JsonConfig` editor type.

## Key Methods

- AssetStore getAssetStore() | Returns the backing `AssetStore
- AssetLoadResult loadAssetFromDocument(...) | Decodes the document, loads into the store; sends error popup on failure
- AssetLoadResult unloadAsset(AssetPath, AssetUpdateQuery) | Removes the asset from the store
- AssetLoadResult restoreOriginalAsset(AssetPath, AssetUpdateQuery) | Reloads the asset from disk via `loadAssetsFromPaths
- AssetUpdateQuery getDefaultUpdateQuery() | Builds the rebuild cache from the schema's `uiRebuildCaches` (models, textures, icons, blocks, map geometry)

Also in this package: AssetLoadResult, AssetTypeHandler, CommonAssetTypeHandler, JsonTypeHandler

Complete API:
  public AssetStore getAssetStore()
  public AssetTypeHandler.AssetLoadResult loadAssetFromDocument(AssetPath path, Path dataPath, BsonDocument document, AssetUpdateQuery updateQuery, EditorClient editorClient)
  public AssetTypeHandler.AssetLoadResult unloadAsset(AssetPath path, AssetUpdateQuery updateQuery)
  public AssetTypeHandler.AssetLoadResult restoreOriginalAsset(AssetPath originalAssetPath, AssetUpdateQuery updateQuery)
  public AssetUpdateQuery getDefaultUpdateQuery()

Fields:
private static final HytaleLogger LOGGER
private final AssetStore assetStore
