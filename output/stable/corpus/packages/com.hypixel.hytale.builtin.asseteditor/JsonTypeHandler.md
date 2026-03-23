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
