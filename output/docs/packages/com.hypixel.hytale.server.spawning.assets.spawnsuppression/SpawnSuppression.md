---
title: "SpawnSuppression"
kind: "class"
package: "com.hypixel.hytale.server.spawning.assets.spawnsuppression"
fqcn: "com.hypixel.hytale.server.spawning.assets.spawnsuppression.SpawnSuppression"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "assets"
  - "spawnsuppression"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.assets.spawnsuppression`

```java
public class SpawnSuppression implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,SpawnSuppression>` | `CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,SpawnSuppression,IndexedAssetMap<String,SpawnSuppression>>` | `ASSET_STORE` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `double` | `radius` |
| `protected` | `String[]` | `suppressedGroups` |
| `protected` | `int[]` | `suppressedGroupIds` |
| `protected` | `boolean` | `suppressSpawnMarkers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String,SpawnSuppression,IndexedAssetMap<String,SpawnSuppression>>` | `getAssetStore()` |
| `public static` | `IndexedAssetMap<String,SpawnSuppression>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `double` | `getRadius()` |
| `public` | `int[]` | `getSuppressedGroupIds()` |
| `public` | `boolean` | `isSuppressSpawnMarkers()` |
| `@Nonnull @Override public` | `String` | `toString()` |
