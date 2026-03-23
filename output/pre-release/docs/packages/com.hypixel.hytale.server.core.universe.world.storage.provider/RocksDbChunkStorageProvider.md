---
title: "RocksDbChunkStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.RocksDbChunkStorageProvider"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "storage"
  - "chunks"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage.provider`

```java
public class RocksDbChunkStorageProvider implements IChunkStorageProvider<RocksDbChunkStorageProvider.RocksDbResource>
```

RocksDB-backed chunk storage with LZ4 compression, ZSTD bottommost compression, bloom filters, and level-style compaction. Stores chunks as blobs in a dedicated column family. Contains inner `Loader`, `Saver`, and `RocksDbResource` classes.
