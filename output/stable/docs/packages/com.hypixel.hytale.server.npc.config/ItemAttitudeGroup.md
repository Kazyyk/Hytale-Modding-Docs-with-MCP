---
title: "ItemAttitudeGroup"
kind: "class"
package: "com.hypixel.hytale.server.npc.config"
fqcn: "com.hypixel.hytale.server.npc.config.ItemAttitudeGroup"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ItemAttitudeGroup>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.config`

```java
public class ItemAttitudeGroup implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ItemAttitudeGroup>>
```

Implementation of `JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ItemAttitudeGroup>>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `ASSET_MAP` | `IndexedLookupTableAssetMap<String, ItemAttitudeGroup>` | Static IndexedLookupTableAssetMap<String, ItemAttitudeGroup> field. |
| `data` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |
| `id` | `String` | String field. |

## Constructors

| Constructor | Description |
|---|---|
| `ItemAttitudeGroup(String id)` | Creates a new ItemAttitudeGroup instance. |
| `ItemAttitudeGroup()` | Creates a new ItemAttitudeGroup instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getAssetMap()` | `IndexedLookupTableAssetMap<String, ItemAttitudeGroup>` | static public method. |
| `getId()` | `String` | public method. |
| `getAttitudes()` | `Map<Attitude, String[]>` | public method. |
