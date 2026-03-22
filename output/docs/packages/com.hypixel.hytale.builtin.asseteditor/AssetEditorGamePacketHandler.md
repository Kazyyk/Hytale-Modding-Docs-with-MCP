---
title: "AssetEditorGamePacketHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor"
fqcn: "com.hypixel.hytale.builtin.asseteditor.AssetEditorGamePacketHandler"
api_surface: false
extends: null
implements:
  - "SubPacketHandler"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "networking"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor`

```java
public class AssetEditorGamePacketHandler implements SubPacketHandler
```

Handles asset editor packets arriving through the in-game client connection. Registered as a sub-packet handler on `ServerManager`. Supports two packet types: `AssetEditorInitialize` (packet ID 302) for opening the editor, and `AssetEditorUpdateJsonAsset` (packet ID 323, deprecated) for inline JSON updates.

When the plugin is disabled, both packet IDs are registered as no-ops.

## Constructor

```java
public AssetEditorGamePacketHandler(IPacketHandler packetHandler)
```

## Key Methods

| Method | Description |
|---|---|
| `void registerHandlers()` | Registers packet handlers or no-ops based on plugin state |
| `void handle(AssetEditorInitialize)` | Authorizes the player via `hytale.editor.asset` permission, sends `AssetEditorAuthorization`, and initializes the editor |
| `void handle(AssetEditorUpdateJsonAsset)` | Deprecated. Creates a mock `EditorClient` from the `PlayerRef` and dispatches JSON update asynchronously |

## Permission

Requires the `hytale.editor.asset` permission. Players without this permission receive an `AssetEditorAuthorization(false)` response or the `Messages.USAGE_DENIED` message.
