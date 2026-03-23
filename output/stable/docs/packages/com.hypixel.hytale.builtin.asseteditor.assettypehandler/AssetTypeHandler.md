---
title: "AssetTypeHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.assettypehandler"
fqcn: "com.hypixel.hytale.builtin.asseteditor.assettypehandler.AssetTypeHandler"
api_surface: false
extends: ~
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
public abstract class AssetTypeHandler
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull protected final` | `AssetEditorAssetType` | `config` |
| `@Nonnull protected final` | `Path` | `rootPath` |
| `protected` | `AssetUpdateQuery` | `cachedDefaultUpdateQuery` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `AssetTypeHandler(@Nonnull AssetEditorAssetType config)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `AssetTypeHandler.AssetLoadResult` | `loadAsset(AssetPath var1, Path var2, byte[] var3, AssetUpdateQuery var4, EditorClient var5)` |
| `public abstract` | `AssetTypeHandler.AssetLoadResult` | `unloadAsset(AssetPath var1, AssetUpdateQuery var2)` |
| `public abstract` | `AssetTypeHandler.AssetLoadResult` | `restoreOriginalAsset(AssetPath var1, AssetUpdateQuery var2)` |
| `public abstract` | `AssetUpdateQuery` | `getDefaultUpdateQuery()` |
| `public` | `AssetTypeHandler.AssetLoadResult` | `loadAsset(AssetPath path, Path dataPath, byte[] data, EditorClient editorClient)` |
| `public` | `AssetTypeHandler.AssetLoadResult` | `unloadAsset(AssetPath path)` |
| `public` | `AssetTypeHandler.AssetLoadResult` | `restoreOriginalAsset(AssetPath originalAssetPath)` |
| `public` | `boolean` | `isValidData(byte[] data)` |
| `@Nonnull public` | `AssetEditorAssetType` | `getConfig()` |
| `@Nonnull public` | `Path` | `getRootPath()` |

## Inner Types

- `AssetTypeHandler.AssetLoadResult`
