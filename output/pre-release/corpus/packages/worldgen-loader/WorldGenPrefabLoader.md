# WorldGenPrefabLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: java.lang.Object

Manages loading and caching of world generation prefabs. Maintains a `TimeoutCache` (30-second TTL) of prefab supplier arrays keyed by prefab name. Resolves prefabs across multiple `PrefabLoader` instances (one per asset pack root). Inner class `PrefabPathCollector` deduplicates prefab paths across pack layers.

## Hierarchy

- **Extends:** `java.lang.Object`

## Methods

- getStore() | PrefabStoreRoot | Returns the prefab store root (e.g., `DEFAULT`).
- getRootFolder() | Path | Returns the resolved prefab store root path.
- get(String) | WorldGenPrefabSupplier[] | Returns cached prefab suppliers for a name, computing on cache miss.
- compute(String) | WorldGenPrefabSupplier[] | Resolves prefab paths across all loaders using the `PrefabPathCollector`.
- getPrefabLoaders(WorldGenConfig, Path) | PrefabLoader[] | Static method. Creates `PrefabLoader` instances for each asset pack root containing the prefab store path.

## Inner Types

### PrefabPathCollector

*class*

Collects and deduplicates prefab paths across asset packs. Implements `Consumer<Path>` and `AutoCloseable`. Uses a path-based `ObjectOpenCustomHashSet` for deduplication.

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
