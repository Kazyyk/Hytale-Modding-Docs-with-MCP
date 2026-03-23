# AssetEditorSelectAssetEvent

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.event | Extends: EditorClientEvent<Void>

public class AssetEditorSelectAssetEvent extends EditorClientEvent<Void>

Fired when an asset is selected in the editor. Carries both the newly selected asset and the previously selected asset for transition handling (e.g. clearing weather preview when switching away from a weather asset).

## Constructor


public AssetEditorSelectAssetEvent(EditorClient editorClient, String assetType, AssetPath assetFilePath, String previousAssetType, AssetPath previousAssetFilePath)

## Methods

- String getAssetType() | Returns the selected asset's type ID
- AssetPath getAssetFilePath() | Returns the selected asset's path
- String getPreviousAssetType() | Returns the previously selected asset's type ID
- AssetPath getPreviousAssetFilePath() | Returns the previously selected asset's path

Also in this package: AssetEditorActivateButtonEvent, AssetEditorAssetCreatedEvent, AssetEditorClientDisconnectEvent, AssetEditorFetchAutoCompleteDataEvent, AssetEditorRequestDataSetEvent, AssetEditorUpdateWeatherPreviewLockEvent, EditorClientEvent

Complete API:
  public String getAssetType()
  public AssetPath getAssetFilePath()
  public String getPreviousAssetType()
  public AssetPath getPreviousAssetFilePath()

Fields:
private final String assetType
private final AssetPath assetFilePath
private final String previousAssetType
private final AssetPath previousAssetFilePath
