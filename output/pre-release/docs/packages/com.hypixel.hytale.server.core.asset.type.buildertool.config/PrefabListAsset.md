---
title: "PrefabListAsset"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.PrefabListAsset"
api_surface: false
extends: null
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, PrefabListAsset>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "buildertool"
  - "asset"
  - "prefab"
  - "class"
  - "internal"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.buildertool.config`

```java
public class PrefabListAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, PrefabListAsset>>
```

Asset defining a named list of prefab file references, used by builder tools. Supports server, asset, and worldgen root directories, optional recursive directory scanning, and random prefab selection.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String, PrefabListAsset, DefaultAssetMap<String, PrefabListAsset>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String, PrefabListAsset>` | `getAssetMap()` |
| `public` | `Path[]` | `getPrefabPaths()` |
| `public` | `PrefabListAsset.PrefabReference[]` | `getPrefabReferences()` |
| `public` | `Path` | `getRandomPrefab()` |
| `public` | `String` | `getId()` |

## Inner Types

| Type | Kind | Description |
|---|---|---|
| `PrefabListAsset.PrefabReference` | class | Individual prefab path reference with optional recursion |
| `PrefabListAsset.PrefabRootDirectory` | enum | Root directories: `Server`, `Asset`, `Worldgen` |
