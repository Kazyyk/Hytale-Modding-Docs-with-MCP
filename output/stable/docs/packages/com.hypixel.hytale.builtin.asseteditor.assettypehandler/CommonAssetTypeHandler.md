---
title: "CommonAssetTypeHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.assettypehandler"
fqcn: "com.hypixel.hytale.builtin.asseteditor.assettypehandler.CommonAssetTypeHandler"
api_surface: false
extends: "AssetTypeHandler"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "assettypehandler"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.assettypehandler`

```java
public class CommonAssetTypeHandler extends AssetTypeHandler
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `HytaleLogger` | `LOGGER` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CommonAssetTypeHandler(String id, @Nullable String icon, String fileExtension, AssetEditorEditorType editorType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `AssetTypeHandler.AssetLoadResult` | `loadAsset(AssetPath path, Path dataPath, byte[] data, AssetUpdateQuery updateQuery, EditorClient editorClient)` |
| `@Nonnull @Override public` | `AssetTypeHandler.AssetLoadResult` | `unloadAsset(@Nonnull AssetPath path, @Nonnull AssetUpdateQuery updateQuery)` |
| `@Nonnull @Override public` | `AssetTypeHandler.AssetLoadResult` | `restoreOriginalAsset(@Nonnull AssetPath originalAssetPath, AssetUpdateQuery updateQuery)` |
| `@Nonnull @Override public` | `AssetUpdateQuery` | `getDefaultUpdateQuery()` |
