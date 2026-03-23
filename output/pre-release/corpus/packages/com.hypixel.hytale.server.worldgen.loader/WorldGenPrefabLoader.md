# WorldGenPrefabLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: null

public class WorldGenPrefabLoader

## Fields

- public static final String PREFAB_FOLDER
- private final Path root
- private final PrefabStoreRoot store
- private final PrefabLoader[] prefabLoaders
- private final TimeoutCache<String, WorldGenPrefabSupplier[]> cache
- Path storePath
- WorldGenPrefabSupplier[] var9
- AssetModule assets
- Path root
- Path assetPath
- List<AssetPack> packs
- Path[] roots
- PrefabLoader[] loaders
- private final ObjectSet<Path> visited
- private final ObjectList<WorldGenPrefabSupplier> list
- private transient String key
- private transient Path root
- private transient WorldGenPrefabLoader loader

## Constructors

- public WorldGenPrefabLoader(@Nonnull PrefabStoreRoot store, @Nonnull WorldGenConfig config)

## Methods

- public PrefabStoreRoot getStore()
- public Path getRootFolder()
- public WorldGenPrefabSupplier[] get(@Nonnull String prefabName)
- private WorldGenPrefabSupplier[] compute(@Nonnull String key)
- throw new Error("Failed to find prefab: " + key)
- private static PrefabLoader[] getPrefabLoaders(@Nonnull WorldGenConfig config, @Nonnull Path prefabStorePath)
- public void accept(@Nonnull Path path)
- public void close()
- public WorldGenPrefabSupplier[] result()

## Inner Types

- `WorldGenPrefabLoader.PrefabPathCollector`

## Related Types

- AssetFileSystem
- WorldGenPrefabSupplier

Also in this package: AssetFileSystem, ChunkGeneratorJsonLoader, Constants, Constants, MaskProviderJsonLoader, PrefabPathCollector, Resource, WorldGenPrefabSupplier, ZonesJsonLoader

Complete API:
  public PrefabStoreRoot getStore()
  public Path getRootFolder()
  public WorldGenPrefabSupplier[] get(String prefabName)
  private WorldGenPrefabSupplier[] compute(String key)
  private static PrefabLoader[] getPrefabLoaders(WorldGenConfig config, Path prefabStorePath)

Fields:
public static final String PREFAB_FOLDER
private final Path root
private final PrefabStoreRoot store
private final PrefabLoader[] prefabLoaders
private final TimeoutCache<String,WorldGenPrefabSupplier[]> cache
