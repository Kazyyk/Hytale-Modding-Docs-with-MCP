# WorldGenPrefabSupplier

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Implements: com.hypixel.hytale.server.core.prefab.selection.buffer.PrefabSupplier

public class WorldGenPrefabSupplier implements PrefabSupplier

Implements `PrefabSupplier` for world generation. Lazily loads prefab buffers via `ChunkGenerator.getResource()`, resolves the prefab name from the file path, and computes chunk bounds recursively including child prefabs up to depth 10.

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
