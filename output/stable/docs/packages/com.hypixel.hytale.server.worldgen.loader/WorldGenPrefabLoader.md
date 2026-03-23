---
title: "WorldGenPrefabLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader"
fqcn: "com.hypixel.hytale.server.worldgen.loader.WorldGenPrefabLoader"
api_surface: true
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader`

```java
public class WorldGenPrefabLoader
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `PREFAB_FOLDER` |
| `private final` | `Path` | `root` |
| `private final` | `PrefabStoreRoot` | `store` |
| `private final` | `PrefabLoader[]` | `prefabLoaders` |
| `private final` | `TimeoutCache<String, WorldGenPrefabSupplier[]>` | `cache` |
| `` | `Path` | `storePath` |
| `` | `WorldGenPrefabSupplier[]` | `var9` |
| `` | `AssetModule` | `assets` |
| `` | `Path` | `root` |
| `` | `Path` | `assetPath` |
| `` | `List<AssetPack>` | `packs` |
| `` | `Path[]` | `roots` |
| `` | `PrefabLoader[]` | `loaders` |
| `` | `private final ObjectSet<Path>` | `visited` |
| `` | `private final ObjectList<WorldGenPrefabSupplier>` | `list` |
| `` | `private transient String` | `key` |
| `` | `private transient Path` | `root` |
| `` | `private transient WorldGenPrefabLoader` | `loader` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WorldGenPrefabLoader(@Nonnull PrefabStoreRoot store, @Nonnull WorldGenConfig config)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `PrefabStoreRoot` | `getStore()` |
| `` | `public Path` | `getRootFolder()` |
| `public` | `WorldGenPrefabSupplier[]` | `get(@Nonnull String prefabName)` |
| `` | `private WorldGenPrefabSupplier[]` | `compute(@Nonnull String key)` |
| `` | `throw new` | `Error("Failed to find prefab: " + key)` |
| `` | `private static PrefabLoader[]` | `getPrefabLoaders(@Nonnull WorldGenConfig config, @Nonnull Path prefabStorePath)` |
| `` | `public void` | `accept(@Nonnull Path path)` |
| `` | `public void` | `close()` |
| `` | `public WorldGenPrefabSupplier[]` | `result()` |

## Inner Types

- `WorldGenPrefabLoader.PrefabPathCollector`

## Related Types

- [AssetFileSystem](AssetFileSystem.md)
- [WorldGenPrefabSupplier](WorldGenPrefabSupplier.md)
