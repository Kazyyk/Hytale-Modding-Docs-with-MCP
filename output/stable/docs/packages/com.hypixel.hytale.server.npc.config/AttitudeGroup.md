---
title: "AttitudeGroup"
kind: "class"
package: "com.hypixel.hytale.server.npc.config"
fqcn: "com.hypixel.hytale.server.npc.config.AttitudeGroup"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, AttitudeGroup>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.config`

```java
public class AttitudeGroup implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, AttitudeGroup>>
```

Implementation of `JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, AttitudeGroup>>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `ASSET_MAP` | `IndexedLookupTableAssetMap<String, AttitudeGroup>` | Static IndexedLookupTableAssetMap<String, AttitudeGroup> field. |
| `data` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |
| `id` | `String` | String field. |

## Constructors

| Constructor | Description |
|---|---|
| `AttitudeGroup(String id)` | Creates a new AttitudeGroup instance. |
| `AttitudeGroup()` | Creates a new AttitudeGroup instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getAssetMap()` | `IndexedLookupTableAssetMap<String, AttitudeGroup>` | static public method. |
| `getId()` | `String` | public method. |
| `getAttitudeGroups()` | `Map<Attitude, String[]>` | public method. |
