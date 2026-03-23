---
title: "JsonTypeHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.assettypehandler"
fqcn: "com.hypixel.hytale.builtin.asseteditor.assettypehandler.JsonTypeHandler"
api_surface: false
extends: "AssetTypeHandler"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "assettypehandler"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.assettypehandler`

```java
public abstract class JsonTypeHandler extends AssetTypeHandler
```

Abstract handler for JSON-based asset types. Parses raw `byte[]` data as UTF-8 JSON into a `BsonDocument`, then delegates to the abstract `loadAssetFromDocument()` method. Validates JSON data by attempting to parse it with `RawJsonReader`.

Subclass: [AssetStoreTypeHandler](AssetStoreTypeHandler.md).

## Abstract Methods

| Method | Description |
|---|---|
| `AssetLoadResult loadAssetFromDocument(AssetPath, Path, BsonDocument, AssetUpdateQuery, EditorClient)` | Loads a parsed BSON document into the runtime |

## Overrides

| Method | Description |
|---|---|
| `loadAsset(AssetPath, Path, byte[], AssetUpdateQuery, EditorClient)` | Parses JSON to `BsonDocument` and delegates to `loadAssetFromDocument` |
| `boolean isValidData(byte[])` | Validates JSON structure via `RawJsonReader.validateBsonDocument()` |
