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

Also in this package: AssetPackPrefabPath, PrefabCopyableComponent, PrefabEntry, PrefabLoadException, PrefabRotation, PrefabSaveException, PrefabWeights, RotationExecutor, RotationExecutor_0, RotationExecutor_180, RotationExecutor_270, RotationExecutor_90, Type, Type, WeightMapValidator

Complete API:
  private static Path resolvePrefabKey(Path basePath, String key)
  public BlockSelection getServerPrefab(String key)
  public BlockSelection getPrefab(Path path)
  public Path getServerPrefabsPath()
  public Map<Path,BlockSelection> getServerPrefabDir(String key)
  public Map<Path,BlockSelection> getPrefabDir(Path dir)
  public void saveServerPrefab(String key, BlockSelection prefab)
  public void saveWorldGenPrefab(String key, BlockSelection prefab, boolean overwrite)
  public void savePrefab(Path path, BlockSelection prefab, boolean overwrite)
  public Path getWorldGenPrefabsPath()
  public Path getAssetRootPath()
  public Path getWorldGenPrefabsPath(String name)
  public void saveServerPrefab(String key, BlockSelection prefab, boolean overwrite)
  public Path getAssetPrefabsPath()
  public Path getAssetPrefabsPathForPack(AssetPack pack)
  public List<PrefabStore.AssetPackPrefabPath> getAllAssetPrefabPaths()
  public BlockSelection getAssetPrefabFromAnyPack(String key)
  public Path findAssetPrefabPath(String key)
  public AssetPack findAssetPackForPrefabPath(Path prefabPath)
  public BlockSelection getAssetPrefab(String key)
  public Map<Path,BlockSelection> getAssetPrefabDir(String key)
  public void saveAssetPrefab(String key, BlockSelection prefab)
  public void saveAssetPrefab(String key, BlockSelection prefab, boolean overwrite)
  public BlockSelection getWorldGenPrefab(String key)
  public BlockSelection getWorldGenPrefab(Path prefabsPath, String key)
  public Map<Path,BlockSelection> getWorldGenPrefabDir(String key)
  public void saveWorldGenPrefab(String key, BlockSelection prefab)
  public static PrefabStore get()

Fields:
public static final Predicate<Path> PREFAB_FILTER
public static final Path PREFABS_PATH
private static final String DEFAULT_WORLDGEN_NAME
private static final PrefabStore INSTANCE
private final Map<Path,BlockSelection> PREFAB_CACHE
