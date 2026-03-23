---
title: "AssetEditorUpdateWeatherPreviewLockEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorUpdateWeatherPreviewLockEvent"
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
public class AssetEditorUpdateWeatherPreviewLockEvent extends EditorClientEvent<Void>
```

Fired when the editor client toggles the weather preview lock. When locked, the weather preview persists even when switching to a different asset.

## Constructor

```java
public AssetEditorUpdateWeatherPreviewLockEvent(EditorClient editorClient, boolean locked)
```

## Methods

| Method | Description |
|---|---|
| `boolean isLocked()` | Returns whether the weather preview is now locked |
