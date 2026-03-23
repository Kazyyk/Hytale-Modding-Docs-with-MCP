---
title: "PrefabStore"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab"
fqcn: "com.hypixel.hytale.server.core.prefab.PrefabStore"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "prefab"
  - "store"
  - "cache"
---

**Package:** `com.hypixel.hytale.server.core.prefab`

```java
public class PrefabStore
```

Singleton store for loading, caching, and saving prefab `BlockSelection` instances. Supports server prefabs, world-gen prefabs, asset prefabs, and per-asset-pack prefabs. Uses a concurrent cache keyed by normalized absolute paths. Provides directory listing, path resolution, and pack-relative path computation.

## Constants

| Field | Type | Description |
|---|---|---|
| `PREFAB_FILTER` | `Predicate<Path>` | Filters paths ending with `.prefab.json`. |
| `PREFABS_PATH` | `Path` | `Path.of("prefabs")` |

## Static Methods

| Method | Signature |
|---|---|
| `get` | `static PrefabStore get()` |

## Methods

| Method | Signature |
|---|---|
| `getServerPrefab` | `@Nonnull BlockSelection getServerPrefab(@Nonnull String key)` |
| `getPrefab` | `@Nonnull BlockSelection getPrefab(@Nonnull Path path)` |
| `getServerPrefabDir` | `@Nonnull Map<Path, BlockSelection> getServerPrefabDir(@Nonnull String key)` |
| `savePrefab` | `void savePrefab(@Nonnull Path path, @Nonnull BlockSelection prefab, boolean overwrite)` |
| `getAssetPrefab` | `@Nonnull BlockSelection getAssetPrefab(@Nonnull String key)` |
| `getWorldGenPrefab` | `@Nonnull BlockSelection getWorldGenPrefab(@Nonnull String key)` |
| `getAllAssetPrefabPaths` | `@Nonnull List<AssetPackPrefabPath> getAllAssetPrefabPaths()` |
| `getRelativePrefabPath` | `@Nonnull Path getRelativePrefabPath(@Nonnull Path absolutePrefabPath)` |
| `savePrefabToPack` | `void savePrefabToPack(@Nonnull AssetPack pack, @Nonnull String key, @Nonnull BlockSelection prefab, boolean overwrite)` |

## Inner Types

- `PrefabStore.AssetPackPrefabPath` -- record linking an asset pack to its prefabs directory