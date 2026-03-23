# AssetEditorUpdateWeatherPreviewLockEvent

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.event | Extends: EditorClientEvent<Void>

public class AssetEditorUpdateWeatherPreviewLockEvent extends EditorClientEvent<Void>

Fired when the editor client toggles the weather preview lock. When locked, the weather preview persists even when switching to a different asset.

## Constructor


public AssetEditorUpdateWeatherPreviewLockEvent(EditorClient editorClient, boolean locked)

## Methods

- boolean isLocked() | Returns whether the weather preview is now locked

Also in this package: AssetEditorActivateButtonEvent, AssetEditorAssetCreatedEvent, AssetEditorClientDisconnectEvent, AssetEditorFetchAutoCompleteDataEvent, AssetEditorRequestDataSetEvent, AssetEditorSelectAssetEvent, EditorClientEvent

Complete API:
  public boolean isLocked()

Fields:
private final boolean locked
