# DefaultChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkStorageProvider<Object>

public class DefaultChunkStorageProvider implements IChunkStorageProvider<Object>

Default chunk storage provider that delegates to `IndexedStorageChunkStorageProvider`. Registered as `"Hytale"` in the codec.

Also in this package: BackupChunkLoader, CacheEntryMetricData, EmptyChunkLoader, EmptyChunkSaver, EmptyChunkStorageProvider, IChunkStorageProvider, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, IndexedStorageChunkStorageProvider, Loader, MigrationChunkLoader, MigrationChunkStorageProvider, MigrationData, RocksDbChunkStorageProvider, RocksDbResource, Saver

Complete API:
  public Object initialize(Store<ChunkStore> store)
  public void close(Object o, Store<ChunkStore> store)
  public IChunkLoader getLoader(Object o, Store<ChunkStore> store)
  public IChunkSaver getSaver(Object o, Store<ChunkStore> store)
  public IChunkLoader getRecoveryLoader(Store<ChunkStore> store, Path backupPath)
  public void beginRecovery(Path file, Path recoveryPath)
  public void revertRecovery(Path file, Path recoveryPath)
  public boolean isSame(IChunkStorageProvider<?> other)
  public String toString()

Fields:
public static final int VERSION
public static final String ID
private static final IChunkStorageProvider<?> DEFAULT_INDEXED
public static final BuilderCodec<DefaultChunkStorageProvider> CODEC
private IChunkStorageProvider<?> provider
