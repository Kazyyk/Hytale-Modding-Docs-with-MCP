# PrefabStore

Type: class | Package: com.hypixel.hytale.server.core.prefab

public class PrefabStore

Singleton store for loading, caching, and saving prefab files. Manages three prefab sources: server prefabs (at `prefabs/`), world generation prefabs (under `WorldGen/<name>/Prefabs/`), and asset pack prefabs (under `<pack>/Server/Prefabs/`). Uses a `ConcurrentHashMap` cache keyed by absolute normalized path.

Prefab files are BSON-serialized `BlockSelection` objects via `SelectionPrefabSerializer`.

## Fields

- public static final Predicate<Path> PREFAB_FILTER
- public static final Path PREFABS_PATH

## Methods

- public static PrefabStore get()
- @Nonnull public BlockSelection getServerPrefab(@Nonnull String key)
- @Nonnull public BlockSelection getPrefab(@Nonnull Path path)
- public Path getServerPrefabsPath()
- @Nonnull public Map<Path, BlockSelection> getServerPrefabDir(@Nonnull String key)
- @Nonnull public Map<Path, BlockSelection> getPrefabDir(@Nonnull Path dir)
- public void saveServerPrefab(@Nonnull String key, @Nonnull BlockSelection prefab)
- public void saveServerPrefab(@Nonnull String key, @Nonnull BlockSelection prefab, boolean overwrite)
- public void savePrefab(@Nonnull Path path, @Nonnull BlockSelection prefab, boolean overwrite)
- @Nonnull public Path getWorldGenPrefabsPath()
- @Nonnull public Path getWorldGenPrefabsPath(@Nullable String name)
- @Nonnull public BlockSelection getWorldGenPrefab(@Nonnull String key)
- @Nonnull public BlockSelection getAssetPrefab(@Nonnull String key)
- @Nullable public BlockSelection getAssetPrefabFromAnyPack(@Nonnull String key)
- @Nullable public Path findAssetPrefabPath(@Nonnull String key)
- @Nonnull public List<PrefabStore.AssetPackPrefabPath> getAllAssetPrefabPaths()

## Inner Types

### AssetPackPrefabPath


public record AssetPackPrefabPath(@Nullable AssetPack pack, @Nonnull Path prefabsPath)

Pairs an asset pack with its prefabs directory path. Provides `isBasePack()`, `isFromAssetPack()`, `getPackName()`, and `getDisplayName()`.
