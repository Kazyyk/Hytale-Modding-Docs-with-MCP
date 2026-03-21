---
title: "PrefabBufferColumn"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.buffer.impl"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.buffer.impl.PrefabBufferColumn"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:03:19Z"
tags:
  - "prefab"
  - "selection"
  - "buffer"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.buffer.impl`

```java
public class PrefabBufferColumn
```

Metadata for a single column within a [PrefabBuffer](PrefabBuffer.md). Stores the reader index into the binary buffer, optional entity holders, and optional block component holders.

## Fields

| Type | Name | Description |
|---|---|---|
| `int` | `readerIndex` | Byte offset into the `PrefabBuffer`'s `ByteBuf` where this column's data starts. |
| `Holder<EntityStore>[]` | `entityHolders` | Entity component holders for this column (nullable). |
| `Int2ObjectMap<Holder<ChunkStore>>` | `blockComponents` | Map of Y position to block state component holders. |

## Constructors

```java
public PrefabBufferColumn(int readerIndex, Holder<EntityStore>[] entityHolders, Int2ObjectMap<Holder<ChunkStore>> blockComponents)
```

## Methods

```java
public int getReaderIndex()
```

Returns the byte offset into the buffer.

```java
@Nullable
public Holder<EntityStore>[] getEntityHolders()
```

Returns the entity holders array, or `null` if this column has no entities.

```java
public Int2ObjectMap<Holder<ChunkStore>> getBlockComponents()
```

Returns the block component holder map.
