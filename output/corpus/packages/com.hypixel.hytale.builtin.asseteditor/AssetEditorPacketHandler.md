# AssetEditorPacketHandler

Type: class | Package: com.hypixel.hytale.builtin.asseteditor | Extends: GenericPacketHandler

public class AssetEditorPacketHandler extends GenericPacketHandler

Handles the full asset editor protocol for standalone editor client connections. Creates an EditorClient on construction and registers handlers for 27 packet types covering asset CRUD, JSON updates, directory management, schema requests, undo/redo, export, auto-complete, and weather preview.

## Constructors


public AssetEditorPacketHandler(Channel channel, ProtocolVersion protocolVersion, String language, PlayerAuthentication auth)


public AssetEditorPacketHandler(Channel channel, ProtocolVersion protocolVersion, String language, UUID uuid, String username)


public AssetEditorPacketHandler(Channel channel, ProtocolVersion protocolVersion, String language, UUID uuid, String username, byte[] referralData, HostAddress referralSource)

## Registered Packet Handlers

- 1 | Disconnect | Client disconnect
- 3 | Pong | Keep-alive
- 310 | AssetEditorFetchAsset | Fetch asset data
- 311 | AssetEditorFetchJsonAssetWithParents | Fetch JSON asset with inheritance chain
- 307 | AssetEditorCreateDirectory | Create directory
- 308 | AssetEditorDeleteDirectory | Delete directory
- 309 | AssetEditorRenameDirectory | Rename directory
- 316 | AssetEditorCreateAssetPack | Create asset pack
- 315 | AssetEditorUpdateAssetPack | Update asset pack manifest
- 317 | AssetEditorDeleteAssetPack | Delete asset pack
- 321 | AssetEditorRequestChildrenList | Request child asset list
- 323 | AssetEditorUpdateJsonAsset | Update JSON asset
- 324 | AssetEditorUpdateAsset | Update binary asset
- 327 | AssetEditorCreateAsset | Create new asset
- 328 | AssetEditorRenameAsset | Rename asset
- 329 | AssetEditorDeleteAsset | Delete asset
- 331 | AssetEditorFetchAutoCompleteData | Auto-complete query
- 333 | AssetEditorRequestDataset | Dataset request
- 335 | AssetEditorActivateButton | UI button activation
- 336 | AssetEditorSelectAsset | Asset selection
- 338 | AssetEditorFetchLastModifiedAssets | Recent modifications
- 341 | AssetEditorSubscribeModifiedAssetsChanges | Subscribe/unsubscribe to change notifications
- 342 | AssetEditorExportAssets | Export assets
- 349 | AssetEditorUndoChanges | Undo
- 350 | AssetEditorRedoChanges | Redo
- 352 | AssetEditorSetGameTime | Override game time
- 354 | AssetEditorUpdateWeatherPreviewLock | Weather preview lock
- 232 | UpdateLanguage | Language change

## Lifecycle

On construction, `init()` calls `registerHandlers()` and then `AssetEditorPlugin.get().handleInitializeClient(editorClient)`. On channel close, `closed()` notifies the plugin via `handleEditorClientDisconnected()`.
