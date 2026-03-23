# EmptyChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Implements: com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider

public class EmptyChunkStorageProvider implements IChunkStorageProvider<Void>

Singleton no-op provider that discards all save operations and always returns null from load. Provides empty index sets. Codec ID is `Empty`.

Also in this package: BackupChunkLoader, CacheEntryMetricData, DefaultChunkStorageProvider, EmptyChunkLoader, EmptyChunkSaver, IChunkStorageProvider, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, IndexedStorageChunkStorageProvider, Loader, MigrationChunkLoader, MigrationChunkStorageProvider, MigrationData, RocksDbChunkStorageProvider, RocksDbResource, Saver

Complete API:
  public Void initialize(Store<ChunkStore> store)
  public void close(Void o, Store<ChunkStore> store)
  public IChunkLoader getLoader(Void object, Store<ChunkStore> store)
  public IChunkSaver getSaver(Void object, Store<ChunkStore> store)
  public String toString()

Fields:
public static final String ID
public static final EmptyChunkStorageProvider INSTANCE
public static final BuilderCodec<EmptyChunkStorageProvider> CODEC
private static final EmptyChunkStorageProvider.EmptyChunkLoader EMPTY_CHUNK_LOADER
private static final EmptyChunkStorageProvider.EmptyChunkSaver EMPTY_CHUNK_SAVER
