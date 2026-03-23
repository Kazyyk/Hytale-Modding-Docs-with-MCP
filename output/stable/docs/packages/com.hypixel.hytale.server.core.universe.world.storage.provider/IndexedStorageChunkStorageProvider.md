---
title: "IndexedStorageChunkStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.IndexedStorageChunkStorageProvider"
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
public class IndexedStorageChunkStorageProvider implements IChunkStorageProvider<IndexedStorageChunkStorageProvider.IndexedStorageCache>
```

Region-file-based chunk storage using `IndexedStorageFile`. Chunks are organized into 32x32 regions stored as individual `.region.bin` files. Supports optional flush-on-write to prevent corruption during unclean shutdowns. Contains inner `IndexedStorageCache`, `IndexedStorageChunkLoader`, and `IndexedStorageChunkSaver` classes.
