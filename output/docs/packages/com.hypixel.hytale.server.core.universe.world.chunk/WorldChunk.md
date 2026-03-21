---
title: "WorldChunk"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.WorldChunk"
api_surface: true
extends: ~
implements:
  - "BlockAccessor"
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "world"
  - "ecs"
  - "block"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk`

```java
public class WorldChunk implements BlockAccessor, Component<ChunkStore>
```

The primary ECS component representing a loaded chunk column in the world. Wraps references to the underlying [BlockChunk](BlockChunk.md), [BlockComponentChunk](BlockComponentChunk.md), and [EntityChunk](EntityChunk.md). Manages chunk lifecycle flags (via [ChunkFlag](ChunkFlag.md)), keep-alive timers, save tracking, lighting update toggles, and provides the `BlockAccessor` interface for reading/writing blocks, fluids, block states, and support values.

World height range is 0-319 (320 blocks). Chunk dimensions are 32x320x32.

## Constants

| Constant | Type | Value | Description |
|---|---|---|---|
| `KEEP_ALIVE_DEFAULT` | `int` | `15` | Default keep-alive tick count before a chunk can be unloaded. |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `BuilderCodec<WorldChunk>` | Codec for serialization (empty builder). |

## Static Methods

```java
public static ComponentType<ChunkStore, WorldChunk> getComponentType()
```

Returns the ECS component type, obtained from `LegacyModule`.

## Constructors

```java
public WorldChunk(World world, Flags<ChunkFlag> state, BlockChunk blockChunk, BlockComponentChunk blockComponentChunk, EntityChunk entityChunk)
```

Creates a fully initialized chunk with all sub-components.

## Instance Methods -- Flags

```java
public boolean is(@Nonnull ChunkFlag flag)
```

Thread-safe check whether the given flag is set.

```java
public boolean not(@Nonnull ChunkFlag flag)
```

Thread-safe check whether the given flag is not set.

```java
public void setFlag(@Nonnull ChunkFlag flag, boolean value)
```

Sets a chunk flag and triggers associated lifecycle transitions (e.g., `TICKING` starts/stops ticking).

```java
public boolean toggleFlag(@Nonnull ChunkFlag flag)
```

Toggles a flag and returns the new value.

```java
public void initFlags()
```

Called after `START_INIT` to apply all flag-triggered behaviors and set `INIT`.

## Instance Methods -- Block Access

```java
@Override
public int getBlock(int x, int y, int z)
```

Returns the block type index at the given chunk-local coordinates. Returns 0 for out-of-range Y.

```java
@Override
public boolean setBlock(int x, int y, int z, int id, @Nonnull BlockType blockType, int rotation, int filler, int settings)
```

Sets a block with full control over rotation, filler, and behavior flags. Handles heightmap updates, particle events, block states, lighting invalidation, tick scheduling, filler block propagation, physics, and connected block updates.

```java
@Nullable
@Override
public BlockState getState(int x, int y, int z)
```

Returns the block state at the given position, or `null` if none exists.

```java
@Override
public void setState(int x, int y, int z, @Nullable BlockState state, boolean notify)
```

## Instance Methods -- Fluids (Deprecated)

```java
@Deprecated(forRemoval = true)
public int getFluidId(int x, int y, int z)
```

```java
@Deprecated(forRemoval = true)
public byte getFluidLevel(int x, int y, int z)
```

## Instance Methods -- Lifecycle

```java
public void markNeedsSaving()
```

```java
public boolean getNeedsSaving()
```

Returns `true` if this chunk or any of its sub-components need saving.

```java
public boolean consumeNeedsSaving()
```

Returns and clears the needs-saving flag for this chunk and all sub-components.

```java
public boolean isSaving()
```

```java
public void setSaving(boolean saving)
```

## Instance Methods -- Keep Alive

```java
public int pollKeepAlive(int pollCount)
```

Decrements and returns the keep-alive counter.

```java
public void resetKeepAlive()
```

```java
public boolean shouldKeepLoaded()
```

```java
public void addKeepLoaded()
```

```java
public void removeKeepLoaded()
```

## Instance Methods -- Components

```java
@Nullable
public BlockChunk getBlockChunk()
```

```java
@Nullable
public BlockComponentChunk getBlockComponentChunk()
```

```java
@Nullable
public EntityChunk getEntityChunk()
```

```java
public Ref<ChunkStore> getReference()
```

```java
public World getWorld()
```

```java
public long getIndex()
```

```java
@Override
public int getX()
```

```java
@Override
public int getZ()
```

## Related Types

- [BlockChunk](BlockChunk.md) -- Block data, heightmap, tint, environment, and section management.
- [BlockComponentChunk](BlockComponentChunk.md) -- ECS entity storage for per-block components (block states).
- [EntityChunk](EntityChunk.md) -- ECS entity storage for world entities within this chunk.
- [ChunkFlag](ChunkFlag.md) -- Lifecycle flags for chunk state management.
- [ChunkColumn](ChunkColumn.md) -- Section holder managing vertical subdivisions.
