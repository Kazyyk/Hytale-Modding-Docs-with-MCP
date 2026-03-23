---
title: "TagPattern"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.tagpattern.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.tagpattern.config.TagPattern"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, TagPattern>>"
  - "NetworkSerializable<com.hypixel.hytale.protocol.TagPattern>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "asset"
  - "tags"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.tagpattern.config`

```java
public abstract class TagPattern implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, TagPattern>>, NetworkSerializable<com.hypixel.hytale.protocol.TagPattern>
```

Class in the config subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `ASSET_STORE` | `AssetStore<String, TagPattern, IndexedLookupTableAssetMap<String, TagPattern>>` | Static AssetStore<String, TagPattern, IndexedLookupTableAssetMap<String, TagPattern>> field. |
| `data` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |
| `id` | `String` | String field. |
| `cachedPacket` | `SoftReference<com.hypixel.hytale.protocol.TagPattern>` | SoftReference<com.hypixel.hytale.protocol.TagPattern> field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getAssetStore()` | `AssetStore<String, TagPattern, IndexedLookupTableAssetMap<String, TagPattern>>` | static public method. |
| `getAssetMap()` | `IndexedLookupTableAssetMap<String, TagPattern>` | static public method. |
| `getId()` | `String` | public method. |
| `test(Int2ObjectMap<IntSet> var1)` | `boolean` | public method. |
| `toString()` | `String` | public method. |
