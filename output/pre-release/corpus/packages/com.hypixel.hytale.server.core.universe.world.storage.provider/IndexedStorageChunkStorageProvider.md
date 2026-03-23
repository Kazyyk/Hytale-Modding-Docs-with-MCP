# IndexedStorageChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Implements: com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider

public class IndexedStorageChunkStorageProvider implements IChunkStorageProvider<IndexedStorageChunkStorageProvider.IndexedStorageCache>

Region-file-based chunk storage using `IndexedStorageFile`. Chunks are organized into 32x32 regions stored as individual `.region.bin` files. Supports optional flush-on-write to prevent corruption during unclean shutdowns. Contains inner `IndexedStorageCache`, `IndexedStorageChunkLoader`, and `IndexedStorageChunkSaver` classes.

Also in this package: BackupChunkLoader, CacheEntryMetricData, DefaultChunkStorageProvider, EmptyChunkLoader, EmptyChunkSaver, EmptyChunkStorageProvider, IChunkStorageProvider, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, Loader, MigrationChunkLoader, MigrationChunkStorageProvider, MigrationData, RocksDbChunkStorageProvider, RocksDbResource, Saver

Complete API:
  public IndexedStorageChunkStorageProvider.IndexedStorageCache initialize(Store<ChunkStore> store)
  public void close(IndexedStorageChunkStorageProvider.IndexedStorageCache cache, Store<ChunkStore> store)
  public IChunkLoader getLoader(IndexedStorageChunkStorageProvider.IndexedStorageCache cache, Store<ChunkStore> store)
  public IChunkSaver getSaver(IndexedStorageChunkStorageProvider.IndexedStorageCache cache, Store<ChunkStore> store)
  public void beginRecovery(Path file, Path recoveryPath)
  public void revertRecovery(Path file, Path recoveryPath)
  public IChunkLoader getRecoveryLoader(Store<ChunkStore> store, Path backupPath)
  public String toString()
  private static String toFileName(int regionX, int regionZ)
  private static long fromFileName(String fileName)

Fields:
public static final String ID
public static final BuilderCodec<IndexedStorageChunkStorageProvider> CODEC
private boolean flushOnWrite
