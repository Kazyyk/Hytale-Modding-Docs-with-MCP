---
title: "BlockChunk"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.BlockChunk"
api_surface: true
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "block"
  - "ecs"
  - "heightmap"
  - "environment"
  - "lighting"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk`

```java
public class BlockChunk implements Component<ChunkStore>
```

ECS component storing the block data for a chunk column: block IDs across 10 vertical sections (32x32x32 each, totaling 32x320x32), heightmap, tint map, environment data, ticking block tracking, and lighting data caches. Serialized via a versioned binary codec (current version 3).

## Constants

| Constant | Type | Value | Description |
|---|---|---|---|
| `VERSION` | `int` | `3` | Current serialization version. |
| `SEND_LOCAL_LIGHTING_DATA` | `boolean` | `true` | Whether local lighting is sent to clients. |
| `SEND_GLOBAL_LIGHTING_DATA` | `boolean` | `false` | Whether global lighting is sent to clients. |

## Static Methods

```java
public static ComponentType<ChunkStore, BlockChunk> getComponentType()
```

## Constructors

```java
public BlockChunk(int x, int z)
```

Creates a new block chunk at the given chunk coordinates with default palettes and sections.

## Instance Methods -- Position

```java
public long getIndex()
```

```java
public int getX()
```

```java
public int getZ()
```

## Instance Methods -- Block Data

```java
public int getBlock(int x, int y, int z)
```

Returns the block type index at chunk-local coordinates. Returns 0 for out-of-range Y.

```java
public boolean setBlock(int x, int y, int z, int blockId, int rotation, int filler)
```

Sets a block in the section palette, invalidates the section cache, and marks needs-saving.

```java
public boolean contains(int blockId)
```

```java
public int count(int blockId)
```

```java
@Nonnull
public Int2IntMap blockCounts()
```

Returns a map of block type index to count across all sections.

```java
@Nonnull
public IntSet blocks()
```

Returns the set of distinct block type indexes present in this chunk.

## Instance Methods -- Heightmap

```java
public short getHeight(int x, int z)
```

```java
public void setHeight(int x, int z, short height)
```

```java
public short updateHeight(int x, int z)
```

Recalculates the heightmap entry by scanning downward for the first non-transparent block.

## Instance Methods -- Environment & Tint

```java
public int getEnvironment(int x, int y, int z)
```

```java
public void setEnvironment(int x, int y, int z, int environment)
```

```java
public int getTint(int x, int z)
```

```java
public void setTint(int x, int z, int tint)
```

## Instance Methods -- Lighting

```java
public byte getRedBlockLight(int x, int y, int z)
```

```java
public byte getGreenBlockLight(int x, int y, int z)
```

```java
public byte getBlueBlockLight(int x, int y, int z)
```

```java
public short getBlockLight(int x, int y, int z)
```

```java
public byte getSkyLight(int x, int y, int z)
```

## Instance Methods -- Sections

```java
@Deprecated(forRemoval = false)
public BlockSection getSectionAtBlockY(int y)
```

```java
@Deprecated(forRemoval = false)
public BlockSection getSectionAtIndex(int index)
```

```java
public int getSectionCount()
```

## Instance Methods -- Ticking

```java
public boolean setTicking(int x, int y, int z, boolean ticking)
```

```java
public boolean isTicking(int x, int y, int z)
```

```java
public int getTickingBlocksCount()
```

```java
public <T, V> int forEachTicking(T t, V v, ObjectPositionBlockFunction<T, V, BlockTickStrategy> acceptor)
```

Iterates over all ticking blocks, invoking the acceptor for each.

## Inner Classes

- `LoadBlockChunkPacketSystem` -- Sends heightmap, tintmap, environments, and section data packets to clients on chunk load.
