---
title: "AssetEditorSelectAssetEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorSelectAssetEvent"
api_surface: false
extends: "EditorClientEvent<Void>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "event"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.event`

```java
public class AssetEditorSelectAssetEvent extends EditorClientEvent<Void>
```

Fired when an asset is selected in the editor. Carries both the newly selected asset and the previously selected asset for transition handling (e.g. clearing weather preview when switching away from a weather asset).

## Constructor

```java
public AssetEditorSelectAssetEvent(EditorClient editorClient, String assetType, AssetPath assetFilePath, String previousAssetType, AssetPath previousAssetFilePath)
```

## Methods

| Method | Description |
|---|---|
| `String getAssetType()` | Returns the selected asset's type ID |
| `AssetPath getAssetFilePath()` | Returns the selected asset's path |
| `String getPreviousAssetType()` | Returns the previously selected asset's type ID |
| `AssetPath getPreviousAssetFilePath()` | Returns the previously selected asset's path |
