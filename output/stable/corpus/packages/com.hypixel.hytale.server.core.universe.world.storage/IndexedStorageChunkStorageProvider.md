# IndexedStorageChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkStorageProvider<IndexedStorageCache>

public class IndexedStorageChunkStorageProvider implements IChunkStorageProvider<IndexedStorageCache>

File-based chunk storage using `IndexedStorageFile` region files. Chunks are stored in 32x32 region bins at `<world>/chunks/<x>.<z>.region.bin`. Supports configurable flush-on-write. Registered as `"IndexedStorage"` in the codec.

Also in this package: CacheEntryMetricData, DefaultChunkStorageProvider, EmptyChunkLoader, EmptyChunkSaver, EmptyChunkStorageProvider, IChunkStorageProvider, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, Loader, MigrationChunkLoader, MigrationChunkStorageProvider, MigrationData, RocksDbChunkStorageProvider, RocksDbResource, Saver

Complete API:
  public IndexedStorageChunkStorageProvider.IndexedStorageCache initialize(Store<ChunkStore> store)
  public void close(IndexedStorageChunkStorageProvider.IndexedStorageCache cache, Store<ChunkStore> store)
  public IChunkLoader getLoader(IndexedStorageChunkStorageProvider.IndexedStorageCache cache, Store<ChunkStore> store)
  public IChunkSaver getSaver(IndexedStorageChunkStorageProvider.IndexedStorageCache cache, Store<ChunkStore> store)
  public String toString()
  private static String toFileName(int regionX, int regionZ)
  private static long fromFileName(String fileName)

Fields:
public static final String ID
public static final BuilderCodec<IndexedStorageChunkStorageProvider> CODEC
private boolean flushOnWrite
