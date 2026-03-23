---
title: "AssetTypeHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.assettypehandler"
fqcn: "com.hypixel.hytale.builtin.asseteditor.assettypehandler.AssetTypeHandler"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "assettypehandler"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.assettypehandler`

```java
public abstract class AssetTypeHandler
```

Base class for asset type handlers. Defines the contract for loading, unloading, and restoring assets of a specific type. Each handler is configured with an `AssetEditorAssetType` descriptor (id, icon, path, file extension, editor type).

## Abstract Methods

| Method | Description |
|---|---|
| `AssetLoadResult loadAsset(AssetPath, Path, byte[], AssetUpdateQuery, EditorClient)` | Loads asset data into the runtime system |
| `AssetLoadResult unloadAsset(AssetPath, AssetUpdateQuery)` | Removes a loaded asset |
| `AssetLoadResult restoreOriginalAsset(AssetPath, AssetUpdateQuery)` | Restores an asset from its original on-disk state |
| `AssetUpdateQuery getDefaultUpdateQuery()` | Returns the default rebuild cache configuration |

## Convenience Methods

| Method | Description |
|---|---|
| `AssetLoadResult loadAsset(AssetPath, Path, byte[], EditorClient)` | Calls `loadAsset` with the default update query |
| `AssetLoadResult unloadAsset(AssetPath)` | Calls `unloadAsset` with the default update query |
| `AssetLoadResult restoreOriginalAsset(AssetPath)` | Calls `restoreOriginalAsset` with the default update query |
| `boolean isValidData(byte[])` | Validates raw data; default returns `true` |
| `AssetEditorAssetType getConfig()` | Returns the asset type configuration |
| `Path getRootPath()` | Returns the root path for this asset type |

## Inner Enums

### AssetLoadResult

```java
public static enum AssetLoadResult { ASSETS_UNCHANGED, ASSETS_CHANGED, COMMON_ASSETS_CHANGED }
```

| Value | Description |
|---|---|
| `ASSETS_UNCHANGED` | No runtime changes occurred |
| `ASSETS_CHANGED` | Server-side assets were modified |
| `COMMON_ASSETS_CHANGED` | Common (client-distributed) assets were modified |
