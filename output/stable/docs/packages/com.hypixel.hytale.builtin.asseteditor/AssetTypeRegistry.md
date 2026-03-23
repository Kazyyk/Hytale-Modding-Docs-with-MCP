---
title: "AssetTypeRegistry"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor"
fqcn: "com.hypixel.hytale.builtin.asseteditor.AssetTypeRegistry"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor`

```java
public class AssetTypeRegistry
```

Registry mapping asset type IDs to their [AssetTypeHandler](AssetTypeHandler.md) instances. Backed by a `ConcurrentHashMap`. Provides lookup by ID, lookup by file path (matching extension and path prefix), and packet generation for sending the full type list to editor clients.

## Key Methods

| Method | Description |
|---|---|
| `void registerAssetType(AssetTypeHandler)` | Registers a handler; throws if ID already registered |
| `void unregisterAssetType(AssetTypeHandler)` | Removes a handler by ID |
| `AssetTypeHandler getAssetTypeHandler(String id)` | Looks up a handler by asset type ID |
| `AssetTypeHandler getAssetTypeHandlerForPath(Path)` | Finds the handler matching a file path's extension and prefix |
| `boolean isPathInAssetTypeFolder(Path)` | Checks if a path falls within any registered asset type's root |
| `AssetTypeHandler tryGetAssetTypeHandler(Path, EditorClient, int)` | Looks up handler with error messaging on failure |
| `void sendPacket(EditorClient)` | Sends the cached `AssetEditorSetupAssetTypes` packet |
| `void setupPacket()` | Builds the setup packet from all registered handlers |
| `Map<String, AssetTypeHandler> getRegisteredAssetTypeHandlers()` | Returns the full handler map |
