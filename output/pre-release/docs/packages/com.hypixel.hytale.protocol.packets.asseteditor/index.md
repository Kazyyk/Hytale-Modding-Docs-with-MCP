---
title: "com.hypixel.hytale.protocol.packets.asseteditor"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
---

**Package:** `com.hypixel.hytale.protocol.packets.asseteditor`

This package contains 72 types defining the asset editor protocol packets and data structures. These packets enable real-time asset management between the Hytale client and server, including asset creation, modification, deletion, export, undo/redo, schema validation, and file tree synchronization. All packet types use the standard Hytale binary wire format with nullable bit fields, fixed and variable blocks, and little-endian encoding.

## Enums

| Type | Description |
|---|---|
| [AssetEditorEditorType](AssetEditorEditorType.md) |  |
| [AssetEditorFileTree](AssetEditorFileTree.md) |  |
| [AssetEditorPopupNotificationType](AssetEditorPopupNotificationType.md) |  |
| [JsonUpdateType](JsonUpdateType.md) |  |
| [WriteUpdateType](WriteUpdateType.md) |  |

## Classes

| Type | Description |
|---|---|
| [AssetEditorActivateButton](AssetEditorActivateButton.md) |  |
| [AssetEditorAsset](AssetEditorAsset.md) |  |
| [AssetEditorAssetListSetup](AssetEditorAssetListSetup.md) |  |
| [AssetEditorAssetListUpdate](AssetEditorAssetListUpdate.md) |  |
| [AssetEditorAssetPackSetup](AssetEditorAssetPackSetup.md) |  |
| [AssetEditorAssetType](AssetEditorAssetType.md) |  |
| [AssetEditorAssetUpdated](AssetEditorAssetUpdated.md) |  |
| [AssetEditorAuthorization](AssetEditorAuthorization.md) |  |
| [AssetEditorCapabilities](AssetEditorCapabilities.md) |  |
| [AssetEditorCreateAsset](AssetEditorCreateAsset.md) |  |
| [AssetEditorCreateAssetPack](AssetEditorCreateAssetPack.md) |  |
| [AssetEditorCreateDirectory](AssetEditorCreateDirectory.md) |  |
| [AssetEditorDeleteAsset](AssetEditorDeleteAsset.md) |  |
| [AssetEditorDeleteAssetPack](AssetEditorDeleteAssetPack.md) |  |
| [AssetEditorDeleteDirectory](AssetEditorDeleteDirectory.md) |  |
| [AssetEditorDiscardChanges](AssetEditorDiscardChanges.md) |  |
| `AssetEditorEnableAssetPack` |  |
| [AssetEditorExportAssetFinalize](AssetEditorExportAssetFinalize.md) |  |
| [AssetEditorExportAssetInitialize](AssetEditorExportAssetInitialize.md) |  |
| [AssetEditorExportAssetPart](AssetEditorExportAssetPart.md) |  |
| [AssetEditorExportAssets](AssetEditorExportAssets.md) |  |
| [AssetEditorExportComplete](AssetEditorExportComplete.md) |  |
| [AssetEditorExportDeleteAssets](AssetEditorExportDeleteAssets.md) |  |
| [AssetEditorFetchAsset](AssetEditorFetchAsset.md) |  |
| [AssetEditorFetchAssetReply](AssetEditorFetchAssetReply.md) |  |
| [AssetEditorFetchAutoCompleteData](AssetEditorFetchAutoCompleteData.md) |  |
| [AssetEditorFetchAutoCompleteDataReply](AssetEditorFetchAutoCompleteDataReply.md) |  |
| [AssetEditorFetchJsonAssetWithParents](AssetEditorFetchJsonAssetWithParents.md) |  |
| [AssetEditorFetchJsonAssetWithParentsReply](AssetEditorFetchJsonAssetWithParentsReply.md) |  |
| [AssetEditorFetchLastModifiedAssets](AssetEditorFetchLastModifiedAssets.md) |  |
| [AssetEditorFileEntry](AssetEditorFileEntry.md) |  |
| [AssetEditorInitialize](AssetEditorInitialize.md) |  |
| [AssetEditorJsonAssetUpdated](AssetEditorJsonAssetUpdated.md) |  |
| [AssetEditorLastModifiedAssets](AssetEditorLastModifiedAssets.md) |  |
| [AssetEditorModifiedAssetsCount](AssetEditorModifiedAssetsCount.md) |  |
| [AssetEditorPopupNotification](AssetEditorPopupNotification.md) |  |
| [AssetEditorPreviewCameraSettings](AssetEditorPreviewCameraSettings.md) |  |
| [AssetEditorRebuildCaches](AssetEditorRebuildCaches.md) |  |
| [AssetEditorRedoChanges](AssetEditorRedoChanges.md) |  |
| [AssetEditorRenameAsset](AssetEditorRenameAsset.md) |  |
| [AssetEditorRenameDirectory](AssetEditorRenameDirectory.md) |  |
| [AssetEditorRequestChildrenList](AssetEditorRequestChildrenList.md) |  |
| [AssetEditorRequestChildrenListReply](AssetEditorRequestChildrenListReply.md) |  |
| [AssetEditorRequestDataset](AssetEditorRequestDataset.md) |  |
| [AssetEditorRequestDatasetReply](AssetEditorRequestDatasetReply.md) |  |
| [AssetEditorSelectAsset](AssetEditorSelectAsset.md) |  |
| [AssetEditorSetGameTime](AssetEditorSetGameTime.md) |  |
| [AssetEditorSetupAssetTypes](AssetEditorSetupAssetTypes.md) |  |
| [AssetEditorSetupSchemas](AssetEditorSetupSchemas.md) |  |
| [AssetEditorSubscribeModifiedAssetsChanges](AssetEditorSubscribeModifiedAssetsChanges.md) |  |
| [AssetEditorUndoChanges](AssetEditorUndoChanges.md) |  |
| [AssetEditorUndoRedoReply](AssetEditorUndoRedoReply.md) |  |
| [AssetEditorUpdateAsset](AssetEditorUpdateAsset.md) |  |
| [AssetEditorUpdateAssetPack](AssetEditorUpdateAssetPack.md) |  |
| [AssetEditorUpdateJsonAsset](AssetEditorUpdateJsonAsset.md) |  |
| [AssetEditorUpdateModelPreview](AssetEditorUpdateModelPreview.md) |  |
| [AssetEditorUpdateSecondsPerGameDay](AssetEditorUpdateSecondsPerGameDay.md) |  |
| [AssetEditorUpdateWeatherPreviewLock](AssetEditorUpdateWeatherPreviewLock.md) |  |
| [AssetInfo](AssetInfo.md) |  |
| [AssetPackManifest](AssetPackManifest.md) |  |
| [AssetPath](AssetPath.md) |  |
| [AuthorInfo](AuthorInfo.md) |  |
| [FailureReply](FailureReply.md) |  |
| [JsonUpdateCommand](JsonUpdateCommand.md) |  |
| [SchemaFile](SchemaFile.md) |  |
| [SuccessReply](SuccessReply.md) |  |
| [TimestampedAssetReference](TimestampedAssetReference.md) |  |
