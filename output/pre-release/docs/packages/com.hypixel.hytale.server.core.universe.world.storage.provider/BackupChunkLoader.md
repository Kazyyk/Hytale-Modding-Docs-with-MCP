---
title: "BackupChunkLoader"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.BackupChunkLoader"
api_surface: false
implements:
  - "IChunkLoader"
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "storage"
  - "backup"
  - "chunks"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage.provider`

```java
public class BackupChunkLoader implements IChunkLoader
```

Loads chunks from one or more backup archives for disaster recovery. Accepts a list of backup paths (ZIP files) and iterates through them in order to find chunk data. Supports both filesystem-based and ZIP-based backup formats.

For each backup, either opens the filesystem directly (if the expected world path exists) or extracts chunk files to a temp directory. Delegates to the base storage provider's recovery loader for actual deserialization.

## Constructor

```java
public BackupChunkLoader(ChunkStore store, List<Path> backups) throws IOException
```

## Key Methods

| Method | Return Type | Description |
|---|---|---|
| `loadHolder(int x, int z)` | `CompletableFuture<Holder<ChunkStore>>` | Attempts to load a chunk from each backup in order, falling through on failure. |
| `getIndexes()` | `LongSet` | Returns an empty set (backup loader does not enumerate available chunks). |
| `close()` | `void` | Closes all loaders, filesystems, and deletes temporary directories. |
