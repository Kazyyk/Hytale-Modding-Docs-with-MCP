---
title: "BlockSection"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.BlockSection"
api_surface: true
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "section"
  - "block"
  - "ecs"
  - "palette"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section`

```java
public class BlockSection implements Component<ChunkStore>
```

ECS component representing a 32x32x32 block section within a chunk column. Stores block type IDs, filler data, and rotation data in separate `ISectionPalette` instances that dynamically promote/demote between palette strategies (empty, single-value, indexed, full array) for memory efficiency. Also manages per-block ticking state via `BitSet`, lighting data (local and global), changed-position tracking, and cached network packets.

Thread safety is achieved via a `StampedLock` on the section data. All palette reads use optimistic reads with fallback to read locks; writes acquire write locks.

## Constants

| Constant | Type | Value | Description |
|---|---|---|---|
| `VERSION` | `int` | `6` | Current serialization version. |

## Static Methods

```java
public static ComponentType<ChunkStore, BlockSection> getComponentType()
```

## Instance Methods -- Block Access

```java
public int get(int x, int y, int z)
```

Returns the block type index at the given local coordinates.

```java
public int get(int index)
```

Returns the block type index at the given flat index (0-32767).

```java
public boolean set(int x, int y, int z, int blockId, int rotation, int filler)
```

Sets the block, rotation, and filler at the given coordinates. Handles palette promotion/demotion. Returns `true` if any value changed.

```java
public int getFiller(int x, int y, int z)
```

```java
public int getRotationIndex(int x, int y, int z)
```

```java
public RotationTuple getRotation(int x, int y, int z)
```

## Instance Methods -- Query

```java
public boolean contains(int id)
```

```java
public boolean containsAny(IntList ids)
```

```java
public int count()
```

Returns the number of non-zero blocks in the section.

```java
public int count(int id)
```

```java
public IntSet values()
```

Returns the set of distinct block type indexes present.

```java
public Int2ShortMap valueCounts()
```

Returns a map of block type index to count.

```java
public boolean isSolidAir()
```

Returns `true` if the entire section contains only air (block ID 0).

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
public boolean hasTicking()
```

```java
public void scheduleTick(int index, @Nullable Instant gameTime)
```

Schedules a block to start ticking at the given game time.

```java
public void preTick(Instant gameTime)
```

Processes scheduled tick requests and swaps the ticking bitset for the current tick cycle.

```java
public <T, V> int forEachTicking(T t, V v, int sectionIndex, @Nonnull ObjectPositionBlockFunction<T, V, BlockTickStrategy> acceptor)
```

Iterates over all ticking blocks in this section, invoking the acceptor for each.

## Instance Methods -- Lighting

```java
public ChunkLightData getLocalLight()
```

```java
public ChunkLightData getGlobalLight()
```

```java
public void setLocalLight(@Nonnull ChunkLightDataBuilder localLight)
```

```java
public void setGlobalLight(@Nonnull ChunkLightDataBuilder globalLight)
```

```java
public boolean hasLocalLight()
```

```java
public boolean hasGlobalLight()
```

```java
public void invalidateLocalLight()
```

```java
public void invalidateGlobalLight()
```

## Instance Methods -- Cache

```java
public void invalidate()
```

Clears the cached network packet, forcing re-serialization on next send.

```java
@Nonnull
public CompletableFuture<CachedPacket<SetChunk>> getCachedChunkPacket(int x, int y, int z)
```

Returns a lazily-computed cached `SetChunk` packet for this section's data.

```java
public double getMaximumHitboxExtent()
```

Returns the maximum bounding box extent of any block in this section, cached after first computation.

## Inner Records

- `TickRequest` -- Record holding a block index and the game time at which it should start ticking.
