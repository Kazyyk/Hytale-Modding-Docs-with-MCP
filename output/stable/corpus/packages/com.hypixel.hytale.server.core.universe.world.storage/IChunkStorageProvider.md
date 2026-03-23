# IChunkStorageProvider

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.storage

public interfaceinterface IChunkStorageProvider

Pluggable storage backend interface for chunk persistence. Implementations provide `initialize`, `close`, `getLoader`, `getSaver`, and `migrateFrom` methods. Uses `BuilderCodecMapCodec` for JSON configuration.

Known implementors: DefaultChunkStorageProvider, EmptyChunkStorageProvider, IndexedStorageChunkStorageProvider, MigrationChunkStorageProvider, RocksDbChunkStorageProvider

Also in this package: CacheEntryMetricData, DefaultChunkStorageProvider, EmptyChunkLoader, EmptyChunkSaver, EmptyChunkStorageProvider, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, IndexedStorageChunkStorageProvider, Loader, MigrationChunkLoader, MigrationChunkStorageProvider, MigrationData, RocksDbChunkStorageProvider, RocksDbResource, Saver

Complete API:
  Data initialize(Store<ChunkStore> var1)
  default Data migrateFrom(Store<ChunkStore> store, IChunkStorageProvider<OtherData> other)
  void close(Data var1, Store<ChunkStore> var2)
  IChunkLoader getLoader(Data var1, Store<ChunkStore> var2)
  IChunkSaver getSaver(Data var1, Store<ChunkStore> var2)
  default boolean isSame(IChunkStorageProvider<?> other)

Fields:
BuilderCodecMapCodec<IChunkStorageProvider<?>> CODEC
