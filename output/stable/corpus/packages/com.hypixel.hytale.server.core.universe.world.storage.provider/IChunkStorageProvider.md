# IChunkStorageProvider

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.storage.provider

public interface IChunkStorageProvider<Data>

Contract for chunk storage backends. Generic type parameter `Data` represents backend-specific initialization state. Provides lifecycle methods (initialize, close) and factory methods for `IChunkLoader` and `IChunkSaver`. Includes a default `migrateFrom` method that copies all chunks from one provider to another with progress reporting.

## Constants

- @Nonnull public static final BuilderCodecMapCodec<IChunkStorageProvider<?>> CODEC

## Methods

- Data initialize(@Nonnull Store<ChunkStore> var1)
- default Data migrateFrom(@Nonnull Store<ChunkStore> store, IChunkStorageProvider<OtherData> other)
- void close(@Nonnull Data var1, @Nonnull Store<ChunkStore> var2)
- @Nonnull IChunkLoader getLoader(@Nonnull Data var1, @Nonnull Store<ChunkStore> var2)
- @Nonnull IChunkSaver getSaver(@Nonnull Data var1, @Nonnull Store<ChunkStore> var2)
- default boolean isSame(IChunkStorageProvider<?> other)

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
