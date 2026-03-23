# RocksDbChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Implements: com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider

public class RocksDbChunkStorageProvider implements IChunkStorageProvider<RocksDbChunkStorageProvider.RocksDbResource>

RocksDB-backed chunk storage with LZ4 compression, ZSTD bottommost compression, bloom filters, and level-style compaction. Stores chunks as blobs in a dedicated column family. Contains inner `Loader`, `Saver`, and `RocksDbResource` classes.

Also in this package: BackupChunkLoader, CacheEntryMetricData, DefaultChunkStorageProvider, EmptyChunkLoader, EmptyChunkSaver, EmptyChunkStorageProvider, IChunkStorageProvider, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, IndexedStorageChunkStorageProvider, Loader, MigrationChunkLoader, MigrationChunkStorageProvider, MigrationData, RocksDbResource, Saver

Complete API:
  public RocksDbChunkStorageProvider.RocksDbResource initialize(Store<ChunkStore> store)
  public void close(RocksDbChunkStorageProvider.RocksDbResource resource, Store<ChunkStore> store)
  public IChunkLoader getLoader(RocksDbChunkStorageProvider.RocksDbResource resource, Store<ChunkStore> store)
  public IChunkSaver getSaver(RocksDbChunkStorageProvider.RocksDbResource resource, Store<ChunkStore> store)
  private static byte[] toKey(int x, int z)
  private static int keyToX(byte[] key)
  private static int keyToZ(byte[] key)

Fields:
public static final String ID
public static final BuilderCodec<RocksDbChunkStorageProvider> CODEC
