# WorldGenPrefabSupplier

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: null | Implements: PrefabSupplier

public class WorldGenPrefabSupplier implements PrefabSupplier

## Fields

- public static final WorldGenPrefabSupplier[] EMPTY_ARRAY
- private final WorldGenPrefabLoader loader
- private final String prefabKey
- private final Path path
- private String prefabName
- private ChunkBounds bounds
- WorldGenPrefabSupplier that
- int minX
- int minZ
- int maxX
- int maxZ
- int childX
- int childZ
- IPrefabBuffer childPrefab
- PrefabRotation childRotation

## Constructors

- public WorldGenPrefabSupplier(WorldGenPrefabLoader loader, String prefabKey, Path path)

## Methods

- public WorldGenPrefabLoader getLoader()
- public String getName()
- public String getPrefabName()
- public Path getPath()
- public IPrefabBuffer get()
- public IChunkBounds getBounds(@Nonnull IPrefabBuffer buffer)
- public boolean equals(@Nullable Object o)
- public int hashCode()
- public String toString()
- private ChunkBounds getBounds(int depth, int x, int z, @Nonnull IPrefabBuffer prefab, @Nonnull PrefabRotation rotation, @Nonnull ChunkBounds bounds)

## Related Types

- WorldGenPrefabLoader

Also in this package: AssetFileSystem, ChunkGeneratorJsonLoader, Constants, Constants, MaskProviderJsonLoader, PrefabPathCollector, Resource, WorldGenPrefabLoader, ZonesJsonLoader

Complete API:
  public WorldGenPrefabLoader getLoader()
  public String getName()
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
