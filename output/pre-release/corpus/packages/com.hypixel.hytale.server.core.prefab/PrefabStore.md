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
  public Path getRelativePrefabPath(Path absolutePrefabPath)
  public BlockSelection getAssetPrefab(String key)
  public Map<Path,BlockSelection> getAssetPrefabDir(String key)
  public void saveAssetPrefab(String key, BlockSelection prefab)
  public void saveAssetPrefab(String key, BlockSelection prefab, boolean overwrite)
  public void savePrefabToPack(AssetPack pack, String key, BlockSelection prefab, boolean overwrite)
  public Path getPrefabsPathForPack(AssetPack pack)
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
