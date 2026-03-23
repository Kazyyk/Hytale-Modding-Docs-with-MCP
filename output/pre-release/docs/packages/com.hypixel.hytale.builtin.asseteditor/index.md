---
title: "com.hypixel.hytale.builtin.asseteditor"
kind: "package"
package: "com.hypixel.hytale.builtin.asseteditor"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "tooling"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor`

The asset editor module provides a server-side plugin for real-time editing of game assets (models, items, block types, textures, sounds, etc.) through a dedicated editor client. The system supports JSON asset editing with BSON-based incremental updates, undo/redo history, live preview of models/weather/time, and asset pack management. The editor communicates via a custom packet protocol separate from the game client connection.

All types in this package are internal (`api_surface: false`). They are not part of the public plugin API.

## Architecture

[AssetEditorPlugin](AssetEditorPlugin.md) is the central entry point. It manages editor client connections, asset pack data sources, schema distribution, and coordinates asset updates. [EditorClient](EditorClient.md) represents a connected editor session. Packet handling is split between [AssetEditorGamePacketHandler](AssetEditorGamePacketHandler.md) (in-game client) and [AssetEditorPacketHandler](AssetEditorPacketHandler.md) (standalone editor).

## Types

### Core

| Type | Kind | Description |
|---|---|---|
| [AssetEditorPlugin](AssetEditorPlugin.md) | class | Plugin entry point and central coordinator |
| [EditorClient](EditorClient.md) | class | Represents a connected editor session |
| [AssetEditorGamePacketHandler](AssetEditorGamePacketHandler.md) | class | Handles editor packets from in-game clients |
| [AssetEditorPacketHandler](AssetEditorPacketHandler.md) | class | Handles packets from standalone editor clients |
| [AssetPath](AssetPath.md) | record | Immutable pack ID + path pair |
| [AssetTree](AssetTree.md) | class | Sorted file tree for an asset pack |
| [AssetTypeRegistry](AssetTypeRegistry.md) | class | Registry of asset type handlers |
| [AssetSpecificFunctionality](AssetSpecificFunctionality.md) | class | Event handlers for model/item/weather preview |
| [Messages](Messages.md) | class | Localization message constants |
| [UndoRedoManager](UndoRedoManager.md) | class | Per-asset undo/redo stack manager |

### Asset Type Handlers (sub-package `assettypehandler`)

| Type | Kind | Description |
|---|---|---|
| [AssetTypeHandler](AssetTypeHandler.md) | abstract class | Base handler for loading/unloading assets |
| [JsonTypeHandler](JsonTypeHandler.md) | abstract class | Handler for JSON-based assets |
| [AssetStoreTypeHandler](AssetStoreTypeHandler.md) | class | Handler for asset-store-backed assets |
| [CommonAssetTypeHandler](CommonAssetTypeHandler.md) | class | Handler for common assets (textures, models, etc.) |

### Data (sub-package `data`)

| Type | Kind | Description |
|---|---|---|
| [AssetState](AssetState.md) | enum | Asset modification state (CHANGED, NEW, DELETED) |
| [AssetUndoRedoInfo](AssetUndoRedoInfo.md) | class | Undo/redo command stacks for a single asset |
| [ModifiedAsset](ModifiedAsset.md) | class | Tracks a modified asset with metadata |

### Data Sources (sub-package `datasource`)

| Type | Kind | Description |
|---|---|---|
| [DataSource](DataSource.md) | interface | Abstract file system operations for asset packs |
| [StandardDataSource](StandardDataSource.md) | class | File-system-backed data source implementation |

### Events (sub-package `event`)

| Type | Kind | Description |
|---|---|---|
| [EditorClientEvent](EditorClientEvent.md) | abstract class | Base event carrying an `EditorClient` reference |
| [AssetEditorActivateButtonEvent](AssetEditorActivateButtonEvent.md) | class | Button activation in editor UI |
| [AssetEditorAssetCreatedEvent](AssetEditorAssetCreatedEvent.md) | class | New asset created |
| [AssetEditorClientDisconnectEvent](AssetEditorClientDisconnectEvent.md) | class | Editor client disconnected |
| [AssetEditorFetchAutoCompleteDataEvent](AssetEditorFetchAutoCompleteDataEvent.md) | class | Auto-complete data request |
| [AssetEditorRequestDataSetEvent](AssetEditorRequestDataSetEvent.md) | class | Dataset request (e.g. item categories) |
| [AssetEditorSelectAssetEvent](AssetEditorSelectAssetEvent.md) | class | Asset selected in editor |
| [AssetEditorUpdateWeatherPreviewLockEvent](AssetEditorUpdateWeatherPreviewLockEvent.md) | class | Weather preview lock state change |

### Utilities (sub-package `util`)

| Type | Kind | Description |
|---|---|---|
| [AssetPathUtil](AssetPathUtil.md) | class | Path validation and filename utilities |
| [AssetStoreUtil](AssetStoreUtil.md) | class | Asset store index lookup utility |
| [BsonTransformationUtil](BsonTransformationUtil.md) | class | BSON document property manipulation |
