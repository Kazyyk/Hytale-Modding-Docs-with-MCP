# WorldGenPrefabSupplier

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: java.lang.Object | Implements: PrefabSupplier

Supplies individual world generation prefabs on demand. Implements `PrefabSupplier`. Lazily resolves the prefab name and computes chunk bounds (with recursive child prefab expansion up to depth 10). Equality is based on the file path.

## Hierarchy

- **Extends:** `java.lang.Object`
- **Implements:** `PrefabSupplier`

## Methods

- getLoader() | WorldGenPrefabLoader | Returns the parent `WorldGenPrefabLoader`.
- getName() | String | Returns the full file path as the name.
- getPrefabName() | String | Lazily resolves and returns the relative prefab name.
- getPath() | Path | Returns the prefab file path.
- get() | IPrefabBuffer | Loads the prefab buffer from the chunk generator resource cache.
- getBounds(IPrefabBuffer) | IChunkBounds | Lazily computes and caches chunk bounds, recursively including child prefabs.

Also in this package: AssetFileSystem, ChunkGeneratorJsonLoader, Constants, Constants, MaskProviderJsonLoader, PrefabPathCollector, Resource, WorldGenPrefabLoader, ZonesJsonLoader

Complete API:
  public WorldGenPrefabLoader getLoader()
  public String getName()
  public String getPrefabKey()
  public String getPrefabName()
  public Path getPath()
  public IPrefabBuffer get()
  public IChunkBounds getBounds(IPrefabBuffer buffer)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  private ChunkBounds getBounds(int depth, int x, int z, IPrefabBuffer prefab, PrefabRotation rotation, ChunkBounds bounds)

Fields:
public static final WorldGenPrefabSupplier[] EMPTY_ARRAY
private final WorldGenPrefabLoader loader
private final String prefabKey
private final Path path
private String prefabName
private ChunkBounds bounds
