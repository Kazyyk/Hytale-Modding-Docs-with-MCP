---
title: "AssetEditorAssetCreatedEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorAssetCreatedEvent"
api_surface: false
extends: "EditorClientEvent<String>"
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
public class AssetEditorAssetCreatedEvent extends EditorClientEvent<String>
```

Fired when a new asset has been created in the editor. The event key is the asset type ID string.

## Constructor

```java
public AssetEditorAssetCreatedEvent(EditorClient editorClient, String assetType, Path assetPath, byte[] data, String buttonId)
```

## Methods

| Method | Description |
|---|---|
| `String getAssetType()` | Returns the asset type ID |
| `Path getAssetPath()` | Returns the created asset's path |
| `byte[] getData()` | Returns the raw asset data |
| `String getButtonId()` | Returns the button that triggered creation |
