# AssetStoreTypeHandler

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.assettypehandler | Extends: JsonTypeHandler

public class AssetStoreTypeHandler extends JsonTypeHandler

## Fields

- private static final HytaleLogger LOGGER
- @Nonnull private final AssetStore assetStore

## Constructors

- public AssetStoreTypeHandler(@Nonnull AssetStore assetStore)

## Methods

- @Nonnull public AssetStore getAssetStore()
- @Nonnull @Override public AssetTypeHandler.AssetLoadResult loadAssetFromDocument(AssetPath path, Path dataPath, BsonDocument document, AssetUpdateQuery updateQuery, EditorClient editorClient)
- @Nonnull @Override public AssetTypeHandler.AssetLoadResult unloadAsset(@Nonnull AssetPath path, @Nonnull AssetUpdateQuery updateQuery)
- @Nonnull @Override public AssetTypeHandler.AssetLoadResult restoreOriginalAsset(@Nonnull AssetPath originalAssetPath, @Nonnull AssetUpdateQuery updateQuery)
- @Nonnull @Override public AssetUpdateQuery getDefaultUpdateQuery()
