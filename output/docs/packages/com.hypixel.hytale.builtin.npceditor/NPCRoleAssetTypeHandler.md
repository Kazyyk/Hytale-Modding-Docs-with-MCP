---
title: "NPCRoleAssetTypeHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.npceditor"
fqcn: "com.hypixel.hytale.builtin.npceditor.NPCRoleAssetTypeHandler"
api_surface: false
extends: "JsonTypeHandler"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "npceditor"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.npceditor`

```java
public class NPCRoleAssetTypeHandler extends JsonTypeHandler
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `TYPE_ID` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `AssetTypeHandler.AssetLoadResult` | `loadAssetFromDocument(AssetPath assetPath, Path dataPath, BsonDocument document, AssetUpdateQuery updateQuery, EditorClient editorClient)` |
| `@Nonnull @Override public` | `AssetTypeHandler.AssetLoadResult` | `unloadAsset(AssetPath path, AssetUpdateQuery updateQuery)` |
| `@Nonnull @Override public` | `AssetTypeHandler.AssetLoadResult` | `restoreOriginalAsset(AssetPath originalAssetPath, AssetUpdateQuery updateQuery)` |
| `@Nonnull @Override public` | `AssetUpdateQuery` | `getDefaultUpdateQuery()` |
