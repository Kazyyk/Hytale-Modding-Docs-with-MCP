# JsonTypeHandler

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.assettypehandler | Extends: AssetTypeHandler

public abstract class JsonTypeHandler extends AssetTypeHandler

## Fields

- private static final HytaleLogger LOGGER

## Constructors

- protected JsonTypeHandler(@Nonnull AssetEditorAssetType config)

## Methods

- @Override public AssetTypeHandler.AssetLoadResult loadAsset(AssetPath path, Path dataPath, byte[] data, AssetUpdateQuery updateQuery, EditorClient editorClient)
- public abstract AssetTypeHandler.AssetLoadResult loadAssetFromDocument(AssetPath var1, Path var2, BsonDocument var3, AssetUpdateQuery var4, EditorClient var5)
- public AssetTypeHandler.AssetLoadResult loadAssetFromDocument(AssetPath path, Path dataPath, BsonDocument document, EditorClient editorClient)
- @Override public boolean isValidData(@Nonnull byte[] data)
