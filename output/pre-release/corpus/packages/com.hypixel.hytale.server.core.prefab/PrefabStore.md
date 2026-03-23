# PrefabStore

Type: class | Package: com.hypixel.hytale.server.core.prefab

public class PrefabStore

Singleton store for loading, caching, and saving prefab `BlockSelection` instances. Supports server prefabs, world-gen prefabs, asset prefabs, and per-asset-pack prefabs. Uses a concurrent cache keyed by normalized absolute paths. Provides directory listing, path resolution, and pack-relative path computation.

## Constants

- PREFAB_FILTER | Predicate<Path> | Filters paths ending with `.prefab.json`.
- PREFABS_PATH | Path | Path.of("prefabs")

## Static Methods

- static PrefabStore get()

## Methods

- @Nonnull BlockSelection getServerPrefab(@Nonnull String key)
- @Nonnull BlockSelection getPrefab(@Nonnull Path path)
- @Nonnull Map<Path, BlockSelection> getServerPrefabDir(@Nonnull String key)
- void savePrefab(@Nonnull Path path, @Nonnull BlockSelection prefab, boolean overwrite)
- @Nonnull BlockSelection getAssetPrefab(@Nonnull String key)
- @Nonnull BlockSelection getWorldGenPrefab(@Nonnull String key)
- @Nonnull List<AssetPackPrefabPath> getAllAssetPrefabPaths()
- @Nonnull Path getRelativePrefabPath(@Nonnull Path absolutePrefabPath)
- void savePrefabToPack(@Nonnull AssetPack pack, @Nonnull String key, @Nonnull BlockSelection prefab, boolean overwrite)

## Inner Types

- `PrefabStore.AssetPackPrefabPath` -- record linking an asset pack to its prefabs directory
