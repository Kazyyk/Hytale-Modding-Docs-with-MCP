---
title: "com.hypixel.hytale.server.core.prefab.selection.buffer.impl"
kind: "package"
package: "com.hypixel.hytale.server.core.prefab.selection.buffer.impl"
generator_version: "2.0.0"
generated_at: "2026-03-21T03:03:19Z"
tags:
  - "prefab"
  - "selection"
  - "buffer"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.buffer.impl`

The buffer implementation package provides the core data structures for storing and reading prefab block data in a compact binary format. [IPrefabBuffer](IPrefabBuffer.md) defines the read interface with rotation-aware bounds queries and typed consumer/predicate iteration. [PrefabBuffer](PrefabBuffer.md) is the concrete implementation using a column-indexed `ByteBuf` with variable-width block encoding.

[PrefabBufferBlockEntry](PrefabBufferBlockEntry.md) is the mutable data holder used during construction, and [PrefabBufferColumn](PrefabBufferColumn.md) stores per-column metadata (buffer offset, entity holders, block components).

## API Types

| Type | Kind | Description |
|---|---|---|
| [IPrefabBuffer](IPrefabBuffer.md) | interface | Read interface for prefab buffer data with rotation-aware queries. |

## Internal Types

| Type | Kind | Description |
|---|---|---|
| [PrefabBuffer](PrefabBuffer.md) | class | Compact binary prefab buffer with column-indexed `ByteBuf` storage. |
| [PrefabBufferBlockEntry](PrefabBufferBlockEntry.md) | class | Mutable block entry used during buffer construction. |
| [PrefabBufferColumn](PrefabBufferColumn.md) | class | Column metadata (buffer offset, entity holders, block components). |

## Inner Types

| Type | Kind | Parent | Description |
|---|---|---|---|
| [IPrefabBuffer.BlockComparingPredicate](IPrefabBuffer.md) | interface | IPrefabBuffer | Block comparison predicate. |
| [IPrefabBuffer.BlockComparingPrefabPredicate](IPrefabBuffer.md) | interface | IPrefabBuffer | Cross-prefab block comparison predicate. |
| [IPrefabBuffer.BlockConsumer](IPrefabBuffer.md) | interface | IPrefabBuffer | Consumer for rotated block data. |
| [IPrefabBuffer.ChildConsumer](IPrefabBuffer.md) | interface | IPrefabBuffer | Consumer for child prefab entries. |
| [IPrefabBuffer.ColumnPredicate](IPrefabBuffer.md) | interface | IPrefabBuffer | Column iteration predicate. |
| [IPrefabBuffer.EntityConsumer](IPrefabBuffer.md) | interface | IPrefabBuffer | Consumer for entity data. |
| [IPrefabBuffer.EntityPredicate](IPrefabBuffer.md) | interface | IPrefabBuffer | Predicate for entity data. |
| [IPrefabBuffer.FluidConsumer](IPrefabBuffer.md) | interface | IPrefabBuffer | Consumer for fluid data. |
| [IPrefabBuffer.FluidPredicate](IPrefabBuffer.md) | interface | IPrefabBuffer | Predicate for fluid data. |
| [IPrefabBuffer.RawBlockConsumer](IPrefabBuffer.md) | interface | IPrefabBuffer | Consumer for raw block data. |
| [IPrefabBuffer.RawBlockPredicate](IPrefabBuffer.md) | interface | IPrefabBuffer | Predicate for raw block data. |
| [PrefabBuffer.BlockMaskConstants](PrefabBuffer.md#blockmaskconstants) | interface | PrefabBuffer | Binary block entry mask layout constants. |
| [PrefabBuffer.Builder](PrefabBuffer.md#builder) | class | PrefabBuffer | Builder for constructing prefab buffers. |
| [PrefabBuffer.ChildPrefab](PrefabBuffer.md#childprefab) | class | PrefabBuffer | Child prefab spawner entry. |
| [PrefabBuffer.PrefabBufferAccessor](PrefabBuffer.md#prefabbufferaccessor) | class | PrefabBuffer | Read-only `IPrefabBuffer` accessor. |
