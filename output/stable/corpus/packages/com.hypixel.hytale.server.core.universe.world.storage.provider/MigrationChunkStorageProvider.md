# MigrationChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Implements: com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider

public class MigrationChunkStorageProvider implements IChunkStorageProvider<MigrationChunkStorageProvider.MigrationData>

Chains multiple storage providers: tries each loader in order until a chunk is found, and saves to a single target provider. Used for migrating worlds between storage formats or creating read-only storage backed by multiple sources.

Also in this package: CacheEntryMetricData, DefaultChunkStorageProvider, EmptyChunkLoader, EmptyChunkSaver, EmptyChunkStorageProvider, IChunkStorageProvider, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, IndexedStorageChunkStorageProvider, Loader, MigrationChunkLoader, MigrationData, RocksDbChunkStorageProvider, RocksDbResource, Saver

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
