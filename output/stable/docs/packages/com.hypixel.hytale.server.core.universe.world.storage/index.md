---
title: "storage"
kind: "index"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "storage"
  - "index"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

World storage subsystem -- manages chunk and entity ECS stores, chunk loading/saving/unloading, and pluggable storage backends (indexed files, RocksDB, migration chains).

## Core Types

| Type | Kind | Description |
|---|---|---|
| [ChunkStore](ChunkStore.md) | class | Central chunk-level ECS manager. |
| [EntityStore](EntityStore.md) | class | Central entity-level ECS manager. |
| [IChunkLoader](IChunkLoader.md) | interface | Chunk loading interface. |
| [IChunkSaver](IChunkSaver.md) | interface | Chunk saving interface. |
| [BufferChunkLoader](BufferChunkLoader.md) | class | Abstract BSON buffer-based loader. |
| [BufferChunkSaver](BufferChunkSaver.md) | class | Abstract BSON buffer-based saver. |
| [GetChunkFlags](GetChunkFlags.md) | class | Bit flags for async chunk loading. |

## Systems

| Type | Kind | Description |
|---|---|---|
| [ChunkSavingSystems](ChunkSavingSystems.md) | class | Chunk save queue and systems. |
| [ChunkSavingSystems.Data](ChunkSavingSystems.Data.md) | class | Save queue resource. |
| [ChunkUnloadingSystem](ChunkUnloadingSystem.md) | class | Chunk unload system with RAM pressure. |
| [ChunkUnloadingSystem.Data](ChunkUnloadingSystem.Data.md) | class | Unload timer resource. |

## Storage Providers (Chunks)

| Type | Kind | Description |
|---|---|---|
| [IChunkStorageProvider](IChunkStorageProvider.md) | interface | Pluggable chunk storage backend. |
| [DefaultChunkStorageProvider](DefaultChunkStorageProvider.md) | class | Default (delegates to IndexedStorage). |
| [EmptyChunkStorageProvider](EmptyChunkStorageProvider.md) | class | No-op provider. |
| [IndexedStorageChunkStorageProvider](IndexedStorageChunkStorageProvider.md) | class | Region-file based storage. |
| [MigrationChunkStorageProvider](MigrationChunkStorageProvider.md) | class | Multi-loader chain for migration. |
| [RocksDbChunkStorageProvider](RocksDbChunkStorageProvider.md) | class | RocksDB-backed storage. |

## Storage Providers (Resources)

| Type | Kind | Description |
|---|---|---|
| [IResourceStorageProvider](IResourceStorageProvider.md) | interface | Pluggable resource storage backend. |
| [DefaultResourceStorageProvider](DefaultResourceStorageProvider.md) | class | Default (delegates to Disk). |
| [DiskResourceStorageProvider](DiskResourceStorageProvider.md) | class | JSON file-based storage. |
| [EmptyResourceStorageProvider](EmptyResourceStorageProvider.md) | class | No-op provider. |

## Abstract System Types (ChunkStore)

| Type | Description |
|---|---|
| [ChunkStore.LoadPacketDataQuerySystem](ChunkStore.LoadPacketDataQuerySystem.md) | Load packet data queries. |
| [ChunkStore.LoadFuturePacketDataQuerySystem](ChunkStore.LoadFuturePacketDataQuerySystem.md) | Future load packet queries. |
| [ChunkStore.UnloadPacketDataQuerySystem](ChunkStore.UnloadPacketDataQuerySystem.md) | Unload packet queries. |
