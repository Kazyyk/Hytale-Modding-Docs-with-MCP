# ChunkStore

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: WorldProvider

public class ChunkStore implements WorldProvider

Central manager for chunk-level ECS storage. Owns the `Store<ChunkStore>` and a concurrent map of `ChunkLoadState` entries indexed by chunk coordinate. Handles async chunk loading, world generation, chunk addition/removal, and failure backoff. Integrates with `IChunkLoader`, `IChunkSaver`, and `IWorldGen` for pluggable storage and generation backends.

## Static Fields

- REGISTRY | ComponentRegistry<ChunkStore> | Chunk-level component registry.
- LOAD_PACKETS_DATA_QUERY_SYSTEM_TYPE | SystemType<...> | System type for load packet data queries.
- LOAD_FUTURE_PACKETS_DATA_QUERY_SYSTEM_TYPE | SystemType<...> | System type for future load packet data queries.
- UNLOAD_PACKETS_DATA_QUERY_SYSTEM_TYPE | SystemType<...> | System type for unload packet data queries.
- UNLOAD_RESOURCE | ResourceType<...> | Resource for chunk unloading state.
- SAVE_RESOURCE | ResourceType<...> | Resource for chunk saving state.
- INIT_GROUP | SystemGroup<ChunkStore> | System group for initialization.
- MAX_FAILURE_BACKOFF_NANOS | long | Maximum failure backoff: 10 seconds.
- FAILURE_BACKOFF_NANOS | long | Base backoff increment: 1 millisecond.

## Key Methods

- getWorld() | World | Returns the owning world.
- getStore() | Store<ChunkStore> | Returns the underlying ECS store.
- getLoader() | IChunkLoader | Returns the chunk loader (from storage provider).
- getSaver() | IChunkSaver | Returns the chunk saver (from storage provider).
- getGenerator() | IWorldGen | Returns the world generator (thread-safe via `StampedLock`).
- getChunkReference(long index) | Ref<ChunkStore> | Returns the chunk reference for a coordinate index, using optimistic locking.
- getChunkReferenceAsync(long index, int flags) | CompletableFuture<Ref<ChunkStore>> | Asynchronously loads/generates a chunk with configurable flags.
- getLoadedChunksCount() | int | Returns the number of loaded chunks.
- remove(Ref, RemoveReason) | void | Removes a chunk from the store.
- start(IResourceStorage) | void | Initializes the ECS store.
- shutdown() | void | Shuts down the store and clears chunks.
- waitForLoadingChunks() | void | Blocks until all pending chunk loads complete (up to 5 seconds).

## Inner Types

- ChunkLoaderSaverSetupSystem | Store system that initializes/migrates the chunk storage provider.
- ChunkStore.LoadPacketDataQuerySystem | Abstract system type for load packet queries.
- ChunkStore.LoadFuturePacketDataQuerySystem | Abstract system type for future load packet queries.
- ChunkStore.UnloadPacketDataQuerySystem | Abstract system type for unload packet queries.
