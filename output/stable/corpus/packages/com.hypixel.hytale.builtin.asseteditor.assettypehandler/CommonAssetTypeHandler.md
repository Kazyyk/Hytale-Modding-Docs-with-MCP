# CommonAssetTypeHandler

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.assettypehandler | Extends: AssetTypeHandler

public class CommonAssetTypeHandler extends AssetTypeHandler

## Fields

- private static final HytaleLogger LOGGER

## Constructors

- public CommonAssetTypeHandler(String id, @Nullable String icon, String fileExtension, AssetEditorEditorType editorType)

## Methods

- @Nonnull @Override public AssetTypeHandler.AssetLoadResult loadAsset(AssetPath path, Path dataPath, byte[] data, AssetUpdateQuery updateQuery, EditorClient editorClient)
- @Nonnull @Override public AssetTypeHandler.AssetLoadResult unloadAsset(@Nonnull AssetPath path, @Nonnull AssetUpdateQuery updateQuery)
- @Nonnull @Override public AssetTypeHandler.AssetLoadResult restoreOriginalAsset(@Nonnull AssetPath originalAssetPath, AssetUpdateQuery updateQuery)
- @Nonnull @Override public AssetUpdateQuery getDefaultUpdateQuery()
