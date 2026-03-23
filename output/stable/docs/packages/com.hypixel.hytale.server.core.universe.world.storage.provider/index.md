---
title: "com.hypixel.hytale.server.core.universe.world.storage.provider"
kind: "package"
package: "com.hypixel.hytale.server.core.universe.world.storage.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "storage"
  - "chunks"
  - "world"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage.provider`

Chunk storage provider implementations. Defines the `IChunkStorageProvider` interface and concrete providers for different storage backends: indexed file-based storage, RocksDB, empty (no-op), default (delegates to indexed), and migration (chains multiple loaders with a single saver for format transitions).

## Types

| Type | Kind | Description |
|---|---|---|
| [IChunkStorageProvider](IChunkStorageProvider.md) | interface | Contract for chunk storage backends: initialize, close, get loader/saver. |
| [DefaultChunkStorageProvider](DefaultChunkStorageProvider.md) | class | Delegates to the server-recommended default storage (currently IndexedStorage). |
| [EmptyChunkStorageProvider](EmptyChunkStorageProvider.md) | class | No-op provider that discards saves and always fails to load chunks. |
| [IndexedStorageChunkStorageProvider](IndexedStorageChunkStorageProvider.md) | class | Region-file-based storage using `IndexedStorageFile` with optional flush-on-write. |
| [MigrationChunkStorageProvider](MigrationChunkStorageProvider.md) | class | Chains multiple loaders with a single saver for format migration. |
| [RocksDbChunkStorageProvider](RocksDbChunkStorageProvider.md) | class | RocksDB-backed chunk storage with LZ4/ZSTD compression and bloom filters. |
