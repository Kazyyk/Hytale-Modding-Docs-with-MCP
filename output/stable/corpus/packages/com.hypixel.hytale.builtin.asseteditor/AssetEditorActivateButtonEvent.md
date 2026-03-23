# AssetEditorActivateButtonEvent

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.event | Extends: EditorClientEvent<String>

public class AssetEditorActivateButtonEvent extends EditorClientEvent<String>

Fired when a button is activated in the editor UI. The event key is the button ID string (e.g. `"EquipItem"`, `"UseModel"`, `"ResetModel"`).

## Constructor


public AssetEditorActivateButtonEvent(EditorClient editorClient, String buttonId)

## Methods

- String getButtonId() | Returns the button identifier
