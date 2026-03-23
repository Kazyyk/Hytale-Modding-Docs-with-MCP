---
title: "com.hypixel.hytale.server.core.prefab.selection.buffer"
kind: "package"
package: "com.hypixel.hytale.server.core.prefab.selection.buffer"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "prefab"
  - "buffer"
  - "codec"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.buffer`

Prefab buffer serialization, deserialization, and loading infrastructure. This package handles reading and writing prefab data (blocks, entities, fluids, rotations, filler metadata) in both binary and BSON formats. The buffer system supports version migration for block IDs across format revisions.

## Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [PrefabSupplier](PrefabSupplier.md) | interface | yes | Functional interface for deferred prefab buffer supply. |
| [PrefabBufferCodec](PrefabBufferCodec.md) | interface | no | Combined serialize/deserialize interface for prefab buffers. |
| [PrefabBufferSerializer](PrefabBufferSerializer.md) | interface | no | Serialization interface for prefab buffers. |
| [PrefabBufferDeserializer](PrefabBufferDeserializer.md) | interface | no | Deserialization interface for prefab buffers. |
| [BinaryPrefabBufferCodec](BinaryPrefabBufferCodec.md) | class | no | Binary format codec (version 21). |
| [BsonPrefabBufferDeserializer](BsonPrefabBufferDeserializer.md) | class | no | BSON/JSON format deserializer. |
| [PrefabBufferCall](PrefabBufferCall.md) | class | no | Queued prefab paste operation. |
| [PrefabBufferUtil](PrefabBufferUtil.md) | class | no | Static helpers for prefab buffer world application. |
| [PrefabLoader](PrefabLoader.md) | class | no | File-based prefab loader with format detection. |
| [UpdateBinaryPrefabException](UpdateBinaryPrefabException.md) | class | no | Thrown for obsolete prefab formats requiring re-export. |
