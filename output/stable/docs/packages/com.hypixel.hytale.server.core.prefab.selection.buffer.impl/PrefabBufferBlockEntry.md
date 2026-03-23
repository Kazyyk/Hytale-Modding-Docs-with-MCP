---
title: "PrefabBufferBlockEntry"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.buffer.impl"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.buffer.impl.PrefabBufferBlockEntry"
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
public class PrefabBufferBlockEntry
```

Mutable data holder for a single block entry within a prefab column. Used by `PrefabBuffer.Builder` during prefab construction. Each entry represents a block at a specific Y position with associated metadata.

## Constants

| Type | Name | Description |
|---|---|---|
| `PrefabBufferBlockEntry[]` | `EMPTY_ARRAY` | Empty array constant. |

## Fields

| Type | Name | Description |
|---|---|---|
| `int` | `y` | Y position of the block (final). |
| `String` | `blockTypeKey` | String key of the block type. |
| `int` | `blockId` | Numeric block type ID. |
| `float` | `chance` | Spawn probability (1.0 = always). |
| `Holder<ChunkStore>` | `state` | Optional block state component holder (nullable). |
| `int` | `fluidId` | Fluid type ID (0 = none). |
| `byte` | `fluidLevel` | Fluid level. |
| `byte` | `supportValue` | Block support value. |
| `int` | `filler` | Filler block ID (0 = none). |
| `int` | `rotation` | Rotation index. |

## Constructors

```java
public PrefabBufferBlockEntry(int y)
```

Creates an empty block entry at the given Y position (block ID 0, key "Empty").

```java
public PrefabBufferBlockEntry(int y, int blockId, String blockTypeKey)
```

Creates a block entry with default chance (1.0).

```java
public PrefabBufferBlockEntry(int y, int blockId, String blockTypeKey, float chance)
```

Creates a block entry with the given chance.

```java
public PrefabBufferBlockEntry(int y, int blockId, String blockTypeKey, float chance, Holder<ChunkStore> state, int fluidId, byte fluidLevel, byte supportValue, int rotation, int filler)
```

Creates a fully specified block entry.
