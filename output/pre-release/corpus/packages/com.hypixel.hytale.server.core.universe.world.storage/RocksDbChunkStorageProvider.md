# RocksDbChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkStorageProvider<RocksDbResource>

public class RocksDbChunkStorageProvider implements IChunkStorageProvider<RocksDbResource>

RocksDB-backed chunk storage using LZ4+ZSTD compression, bloom filters, and level-based compaction. Stores chunks in a `chunks` column family. Registered as `"RocksDb"` in the codec.

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
