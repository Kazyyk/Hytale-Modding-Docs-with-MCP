# NPCRoleAssetTypeHandler

Type: class | Package: com.hypixel.hytale.builtin.npceditor | Extends: JsonTypeHandler

public class NPCRoleAssetTypeHandler extends JsonTypeHandler

## Fields

- public static final String TYPE_ID

## Methods

- @Nonnull @Override public AssetTypeHandler.AssetLoadResult loadAssetFromDocument(AssetPath assetPath, Path dataPath, BsonDocument document, AssetUpdateQuery updateQuery, EditorClient editorClient)
- @Nonnull @Override public AssetTypeHandler.AssetLoadResult unloadAsset(AssetPath path, AssetUpdateQuery updateQuery)
- @Nonnull @Override public AssetTypeHandler.AssetLoadResult restoreOriginalAsset(AssetPath originalAssetPath, AssetUpdateQuery updateQuery)
- @Nonnull @Override public AssetUpdateQuery getDefaultUpdateQuery()

Also in this package: NPCEditorPlugin

Complete API:
  public AssetTypeHandler.AssetLoadResult loadAssetFromDocument(AssetPath assetPath, Path dataPath, BsonDocument document, AssetUpdateQuery updateQuery, EditorClient editorClient)
  public AssetTypeHandler.AssetLoadResult unloadAsset(AssetPath path, AssetUpdateQuery updateQuery)
  public AssetTypeHandler.AssetLoadResult restoreOriginalAsset(AssetPath originalAssetPath, AssetUpdateQuery updateQuery)
  public AssetUpdateQuery getDefaultUpdateQuery()

Fields:
public static final String TYPE_ID
