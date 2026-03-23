# JsonTypeHandler

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.assettypehandler | Extends: AssetTypeHandler

public abstract class JsonTypeHandler extends AssetTypeHandler

Abstract handler for JSON-based asset types. Parses raw `byte[]` data as UTF-8 JSON into a `BsonDocument`, then delegates to the abstract `loadAssetFromDocument()` method. Validates JSON data by attempting to parse it with `RawJsonReader`.

Subclass: AssetStoreTypeHandler.

## Abstract Methods

- AssetLoadResult loadAssetFromDocument(AssetPath, Path, BsonDocument, AssetUpdateQuery, EditorClient) | Loads a parsed BSON document into the runtime

## Overrides

- loadAsset(AssetPath, Path, byte[], AssetUpdateQuery, EditorClient) | Parses JSON to `BsonDocument` and delegates to `loadAssetFromDocument
- boolean isValidData(byte[]) | Validates JSON structure via `RawJsonReader.validateBsonDocument()

Known subclasses: AssetStoreTypeHandler, NPCRoleAssetTypeHandler

Also in this package: AssetLoadResult, AssetStoreTypeHandler, AssetTypeHandler, CommonAssetTypeHandler

Complete API:
  public AssetTypeHandler.AssetLoadResult loadAsset(AssetPath path, Path dataPath, byte[] data, AssetUpdateQuery updateQuery, EditorClient editorClient)
  public abstract AssetTypeHandler.AssetLoadResult loadAssetFromDocument(AssetPath var1, Path var2, BsonDocument var3, AssetUpdateQuery var4, EditorClient var5)
  public AssetTypeHandler.AssetLoadResult loadAssetFromDocument(AssetPath path, Path dataPath, BsonDocument document, EditorClient editorClient)
  public boolean isValidData(byte[] data)

Fields:
private static final HytaleLogger LOGGER
