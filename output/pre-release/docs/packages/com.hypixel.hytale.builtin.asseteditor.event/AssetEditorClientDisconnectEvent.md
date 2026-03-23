---
title: "AssetEditorClientDisconnectEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorClientDisconnectEvent"
api_surface: false
extends: "EditorClientEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "event"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.event`

```java
public class AssetEditorClientDisconnectEvent extends EditorClientEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `PacketHandler.DisconnectReason` | `disconnectReason` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `PacketHandler.DisconnectReason` | `getDisconnectReason()` |
| `@Nonnull @Override public` | `String` | `toString()` |
