# AssetEditorAssetCreatedEvent

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.event | Extends: EditorClientEvent<String>

public class AssetEditorAssetCreatedEvent extends EditorClientEvent<String>

Fired when a new asset has been created in the editor. The event key is the asset type ID string.

## Constructor


public AssetEditorAssetCreatedEvent(EditorClient editorClient, String assetType, Path assetPath, byte[] data, String buttonId)

## Methods

- String getAssetType() | Returns the asset type ID
- Path getAssetPath() | Returns the created asset's path
- byte[] getData() | Returns the raw asset data
- String getButtonId() | Returns the button that triggered creation
