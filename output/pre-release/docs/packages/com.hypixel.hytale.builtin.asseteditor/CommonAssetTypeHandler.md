---
title: "CommonAssetTypeHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.assettypehandler"
fqcn: "com.hypixel.hytale.builtin.asseteditor.assettypehandler.CommonAssetTypeHandler"
api_surface: false
extends: "AssetTypeHandler"
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
public class CommonAssetTypeHandler extends AssetTypeHandler
```

Handler for common (client-distributed) asset types: textures (.png), models (.blockymodel), animations (.blockyanim), sounds (.ogg), UI files (.ui), and language files (.lang). These assets live under the `Common/` directory and are distributed to all connected clients.

## Constructor

```java
public CommonAssetTypeHandler(String id, String icon, String fileExtension, AssetEditorEditorType editorType)
```

## Key Methods

| Method | Description |
|---|---|
| `AssetLoadResult loadAsset(...)` | Registers a `FileCommonAsset` in `CommonAssetRegistry`; returns `COMMON_ASSETS_CHANGED` if the hash differs |
| `AssetLoadResult unloadAsset(AssetPath, AssetUpdateQuery)` | Removes from `CommonAssetRegistry` and sends removal to players if needed |
| `AssetLoadResult restoreOriginalAsset(AssetPath, AssetUpdateQuery)` | Reads the original file from the asset pack root and re-registers it |
| `AssetUpdateQuery getDefaultUpdateQuery()` | Returns a query with `commonAssetsRebuild = true` |
