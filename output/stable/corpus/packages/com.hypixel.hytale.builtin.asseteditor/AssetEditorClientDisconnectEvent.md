# AssetEditorClientDisconnectEvent

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.event | Extends: EditorClientEvent<Void>

public class AssetEditorClientDisconnectEvent extends EditorClientEvent<Void>

Fired when an editor client disconnects. Carries the disconnect reason.

## Constructor


public AssetEditorClientDisconnectEvent(EditorClient editorClient, PacketHandler.DisconnectReason disconnectReason)

## Methods

- PacketHandler.DisconnectReason getDisconnectReason() | Returns the reason for disconnection
