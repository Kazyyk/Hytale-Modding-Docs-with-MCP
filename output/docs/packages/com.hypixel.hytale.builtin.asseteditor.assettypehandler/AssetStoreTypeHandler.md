---
title: "AssetStoreTypeHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.assettypehandler"
fqcn: "com.hypixel.hytale.builtin.asseteditor.assettypehandler.AssetStoreTypeHandler"
api_surface: false
extends: "JsonTypeHandler"
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
public class AssetStoreTypeHandler extends JsonTypeHandler
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `HytaleLogger` | `LOGGER` |
| `@Nonnull private final` | `AssetStore` | `assetStore` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `AssetStoreTypeHandler(@Nonnull AssetStore assetStore)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `AssetStore` | `getAssetStore()` |
| `@Nonnull @Override public` | `AssetTypeHandler.AssetLoadResult` | `loadAssetFromDocument(AssetPath path, Path dataPath, BsonDocument document, AssetUpdateQuery updateQuery, EditorClient editorClient)` |
| `@Nonnull @Override public` | `AssetTypeHandler.AssetLoadResult` | `unloadAsset(@Nonnull AssetPath path, @Nonnull AssetUpdateQuery updateQuery)` |
| `@Nonnull @Override public` | `AssetTypeHandler.AssetLoadResult` | `restoreOriginalAsset(@Nonnull AssetPath originalAssetPath, @Nonnull AssetUpdateQuery updateQuery)` |
| `@Nonnull @Override public` | `AssetUpdateQuery` | `getDefaultUpdateQuery()` |
