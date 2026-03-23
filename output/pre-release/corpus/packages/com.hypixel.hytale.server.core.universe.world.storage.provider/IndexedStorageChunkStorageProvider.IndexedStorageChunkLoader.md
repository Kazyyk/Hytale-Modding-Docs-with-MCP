# IndexedStorageChunkStorageProvider.IndexedStorageChunkLoader

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Extends: BufferChunkLoader | Implements: MetricProvider

public static class IndexedStorageChunkStorageProvider.IndexedStorageChunkLoader extends BufferChunkLoader implements MetricProvider

Reads chunk data from indexed storage region files. Resolves chunk coordinates to region file + blob index, then reads asynchronously. Optionally owns the cache for recovery loaders.

## Constructor


public IndexedStorageChunkLoader(@Nonnull Store<ChunkStore> store, @Nonnull IndexedStorageChunkStorageProvider.IndexedStorageCache cache, boolean flushOnWrite, boolean ownsCache)

## Key Methods

- loadBuffer(int x, int z) | CompletableFuture<ByteBuffer> | Reads chunk data from the region file at the computed region/local coordinates.
- getIndexes() | LongSet | Returns all chunk indexes available in the cache.
- close() | void | Closes the cache if this loader owns it.
- toMetricResults() | MetricResults | Returns cache metrics (suppressed if a saver exists for the same cache).
