---
title: "AssetEditorClientDisconnectEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorClientDisconnectEvent"
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
public class AssetEditorClientDisconnectEvent extends EditorClientEvent<Void>
```

Fired when an editor client disconnects. Carries the disconnect reason.

## Constructor

```java
public AssetEditorClientDisconnectEvent(EditorClient editorClient, PacketHandler.DisconnectReason disconnectReason)
```

## Methods

| Method | Description |
|---|---|
| `PacketHandler.DisconnectReason getDisconnectReason()` | Returns the reason for disconnection |
