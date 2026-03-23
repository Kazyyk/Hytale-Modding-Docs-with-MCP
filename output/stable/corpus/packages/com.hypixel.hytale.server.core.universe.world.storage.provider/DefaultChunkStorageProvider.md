# DefaultChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Implements: com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider

public class DefaultChunkStorageProvider implements IChunkStorageProvider<Object>

Delegates all operations to the server-recommended default storage provider (currently `IndexedStorageChunkStorageProvider`). Versioned codec with ID `Hytale`.

Also in this package: CacheEntryMetricData, EmptyChunkLoader, EmptyChunkSaver, EmptyChunkStorageProvider, IChunkStorageProvider, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, IndexedStorageChunkStorageProvider, Loader, MigrationChunkLoader, MigrationChunkStorageProvider, MigrationData, RocksDbChunkStorageProvider, RocksDbResource, Saver

Complete API:
  public Object initialize(Store<ChunkStore> store)
  public void close(Object o, Store<ChunkStore> store)
  public IChunkLoader getLoader(Object o, Store<ChunkStore> store)
  public IChunkSaver getSaver(Object o, Store<ChunkStore> store)
  public boolean isSame(IChunkStorageProvider<?> other)
  public String toString()

Fields:
public static final int VERSION
public static final String ID
private static final IChunkStorageProvider<?> DEFAULT_INDEXED
public static final BuilderCodec<DefaultChunkStorageProvider> CODEC
private IChunkStorageProvider<?> provider
