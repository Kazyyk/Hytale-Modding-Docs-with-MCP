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
