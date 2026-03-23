# MigrationChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkStorageProvider<MigrationData>

public class MigrationChunkStorageProvider implements IChunkStorageProvider<MigrationData>

Chains multiple loader providers with a single saver. Loaders are tried in order until one succeeds. Registered as `"Migration"` in the codec. Useful for format migration or read-only configurations.

Also in this package: BackupChunkLoader, CacheEntryMetricData, DefaultChunkStorageProvider, EmptyChunkLoader, EmptyChunkSaver, EmptyChunkStorageProvider, IChunkStorageProvider, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, IndexedStorageChunkStorageProvider, Loader, MigrationChunkLoader, MigrationData, RocksDbChunkStorageProvider, RocksDbResource, Saver

Complete API:
  public MigrationChunkStorageProvider.MigrationData initialize(Store<ChunkStore> store)
  public void close(MigrationChunkStorageProvider.MigrationData migrationData, Store<ChunkStore> store)
  public IChunkLoader getLoader(MigrationChunkStorageProvider.MigrationData migrationData, Store<ChunkStore> store)
  public IChunkSaver getSaver(MigrationChunkStorageProvider.MigrationData migrationData, Store<ChunkStore> store)
  public String toString()

Fields:
public static final String ID
public static final BuilderCodec<MigrationChunkStorageProvider> CODEC
private IChunkStorageProvider<?>[] from
private IChunkStorageProvider<?> to
