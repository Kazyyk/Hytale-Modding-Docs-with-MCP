---
title: "AssetEditorPacketHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor"
fqcn: "com.hypixel.hytale.builtin.asseteditor.AssetEditorPacketHandler"
api_surface: false
extends: "GenericPacketHandler"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "networking"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor`

```java
public class AssetEditorPacketHandler extends GenericPacketHandler
```

Handles the full asset editor protocol for standalone editor client connections. Creates an [EditorClient](EditorClient.md) on construction and registers handlers for 27 packet types covering asset CRUD, JSON updates, directory management, schema requests, undo/redo, export, auto-complete, and weather preview.

## Constructors

```java
public AssetEditorPacketHandler(Channel channel, ProtocolVersion protocolVersion, String language, PlayerAuthentication auth)
```

```java
public AssetEditorPacketHandler(Channel channel, ProtocolVersion protocolVersion, String language, UUID uuid, String username)
```

```java
public AssetEditorPacketHandler(Channel channel, ProtocolVersion protocolVersion, String language, UUID uuid, String username, byte[] referralData, HostAddress referralSource)
```

## Registered Packet Handlers

| ID | Packet | Operation |
|---|---|---|
| 1 | `Disconnect` | Client disconnect |
| 3 | `Pong` | Keep-alive |
| 310 | `AssetEditorFetchAsset` | Fetch asset data |
| 311 | `AssetEditorFetchJsonAssetWithParents` | Fetch JSON asset with inheritance chain |
| 307 | `AssetEditorCreateDirectory` | Create directory |
| 308 | `AssetEditorDeleteDirectory` | Delete directory |
| 309 | `AssetEditorRenameDirectory` | Rename directory |
| 316 | `AssetEditorCreateAssetPack` | Create asset pack |
| 315 | `AssetEditorUpdateAssetPack` | Update asset pack manifest |
| 317 | `AssetEditorDeleteAssetPack` | Delete asset pack |
| 321 | `AssetEditorRequestChildrenList` | Request child asset list |
| 323 | `AssetEditorUpdateJsonAsset` | Update JSON asset |
| 324 | `AssetEditorUpdateAsset` | Update binary asset |
| 327 | `AssetEditorCreateAsset` | Create new asset |
| 328 | `AssetEditorRenameAsset` | Rename asset |
| 329 | `AssetEditorDeleteAsset` | Delete asset |
| 331 | `AssetEditorFetchAutoCompleteData` | Auto-complete query |
| 333 | `AssetEditorRequestDataset` | Dataset request |
| 335 | `AssetEditorActivateButton` | UI button activation |
| 336 | `AssetEditorSelectAsset` | Asset selection |
| 338 | `AssetEditorFetchLastModifiedAssets` | Recent modifications |
| 341 | `AssetEditorSubscribeModifiedAssetsChanges` | Subscribe/unsubscribe to change notifications |
| 342 | `AssetEditorExportAssets` | Export assets |
| 349 | `AssetEditorUndoChanges` | Undo |
| 350 | `AssetEditorRedoChanges` | Redo |
| 352 | `AssetEditorSetGameTime` | Override game time |
| 354 | `AssetEditorUpdateWeatherPreviewLock` | Weather preview lock |
| 232 | `UpdateLanguage` | Language change |

## Lifecycle

On construction, `init()` calls `registerHandlers()` and then `AssetEditorPlugin.get().handleInitializeClient(editorClient)`. On channel close, `closed()` notifies the plugin via `handleEditorClientDisconnected()`.
