---
title: "RocksDbChunkStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.RocksDbChunkStorageProvider"
api_surface: false
implements:
  - "IChunkStorageProvider<RocksDbResource>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public class RocksDbChunkStorageProvider implements IChunkStorageProvider<RocksDbResource>
```

RocksDB-backed chunk storage using LZ4+ZSTD compression, bloom filters, and level-based compaction. Stores chunks in a `chunks` column family. Registered as `"RocksDb"` in the codec.
