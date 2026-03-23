---
title: "IndexedStorageChunkStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.IndexedStorageChunkStorageProvider"
api_surface: false
implements:
  - "IChunkStorageProvider<IndexedStorageCache>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public class IndexedStorageChunkStorageProvider implements IChunkStorageProvider<IndexedStorageCache>
```

File-based chunk storage using `IndexedStorageFile` region files. Chunks are stored in 32x32 region bins at `<world>/chunks/<x>.<z>.region.bin`. Supports configurable flush-on-write. Registered as `"IndexedStorage"` in the codec.
