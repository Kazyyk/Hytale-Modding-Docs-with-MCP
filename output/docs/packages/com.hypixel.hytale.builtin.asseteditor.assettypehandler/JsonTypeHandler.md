---
title: "JsonTypeHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.assettypehandler"
fqcn: "com.hypixel.hytale.builtin.asseteditor.assettypehandler.JsonTypeHandler"
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
public abstract class JsonTypeHandler extends AssetTypeHandler
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `HytaleLogger` | `LOGGER` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `JsonTypeHandler(@Nonnull AssetEditorAssetType config)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `AssetTypeHandler.AssetLoadResult` | `loadAsset(AssetPath path, Path dataPath, byte[] data, AssetUpdateQuery updateQuery, EditorClient editorClient)` |
| `public abstract` | `AssetTypeHandler.AssetLoadResult` | `loadAssetFromDocument(AssetPath var1, Path var2, BsonDocument var3, AssetUpdateQuery var4, EditorClient var5)` |
| `public` | `AssetTypeHandler.AssetLoadResult` | `loadAssetFromDocument(AssetPath path, Path dataPath, BsonDocument document, EditorClient editorClient)` |
| `@Override public` | `boolean` | `isValidData(@Nonnull byte[] data)` |
