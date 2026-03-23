---
title: "IndexedStorageChunkStorageProvider.IndexedStorageChunkLoader"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.IndexedStorageChunkStorageProvider.IndexedStorageChunkLoader"
api_surface: false
extends: "BufferChunkLoader"
implements:
  - "MetricProvider"
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "storage"
  - "chunks"
  - "inner-class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage.provider`

```java
public static class IndexedStorageChunkStorageProvider.IndexedStorageChunkLoader extends BufferChunkLoader implements MetricProvider
```

Reads chunk data from indexed storage region files. Resolves chunk coordinates to region file + blob index, then reads asynchronously. Optionally owns the cache for recovery loaders.

## Constructor

```java
public IndexedStorageChunkLoader(@Nonnull Store<ChunkStore> store, @Nonnull IndexedStorageChunkStorageProvider.IndexedStorageCache cache, boolean flushOnWrite, boolean ownsCache)
```

## Key Methods

| Method | Return Type | Description |
|---|---|---|
| `loadBuffer(int x, int z)` | `CompletableFuture<ByteBuffer>` | Reads chunk data from the region file at the computed region/local coordinates. |
| `getIndexes()` | `LongSet` | Returns all chunk indexes available in the cache. |
| `close()` | `void` | Closes the cache if this loader owns it. |
| `toMetricResults()` | `MetricResults` | Returns cache metrics (suppressed if a saver exists for the same cache). |
