---
title: "FlockAsset"
kind: "class"
package: "com.hypixel.hytale.server.flock.config"
fqcn: "com.hypixel.hytale.server.flock.config.FlockAsset"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FlockAsset>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "flock"
---

**Package:** `com.hypixel.hytale.server.flock.config`

```java
public abstract class FlockAsset implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FlockAsset>>
```

Implementation of `JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FlockAsset>>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `ASSET_STORE` | `AssetStore<String, FlockAsset, IndexedLookupTableAssetMap<String, FlockAsset>>` | Static AssetStore<String, FlockAsset, IndexedLookupTableAssetMap<String, FlockAsset>> field. |
| `data` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |
| `id` | `String` | String field. |
| `maxGrowSize` | `int` | int field. |
| `blockedRoles` | `String[]` | String[] field. |

## Constructors

| Constructor | Description |
|---|---|
| `FlockAsset()` | Creates a new FlockAsset instance. |
| `FlockAsset(String id)` | Creates a new FlockAsset instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getAssetStore()` | `AssetStore<String, FlockAsset, IndexedLookupTableAssetMap<String, FlockAsset>>` | static public method. |
| `getAssetMap()` | `IndexedLookupTableAssetMap<String, FlockAsset>` | static public method. |
| `getId()` | `String` | public method. |
| `getMinFlockSize()` | `int` | public method. |
| `pickFlockSize()` | `int` | public method. |
| `getMaxGrowSize()` | `int` | public method. |
| `getBlockedRoles()` | `String[]` | public method. |
| `toString()` | `String` | public method. |
