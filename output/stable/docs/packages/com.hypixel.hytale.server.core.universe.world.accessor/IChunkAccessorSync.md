---
title: "IChunkAccessorSync"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.accessor"
fqcn: "com.hypixel.hytale.server.core.universe.world.accessor.IChunkAccessorSync"
api_surface: true
extends: "BlockAccessor>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "accessor"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.accessor`

```java
public interface IChunkAccessorSync<WorldChunk extends BlockAccessor>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable` | `WorldChunk` | `getChunkIfInMemory(long var1)` |
| `@Nullable` | `WorldChunk` | `loadChunkIfInMemory(long var1)` |
| `@Nullable` | `WorldChunk` | `getChunkIfLoaded(long var1)` |
| `@Nullable` | `WorldChunk` | `getChunkIfNonTicking(long var1)` |
| `@Nullable` | `WorldChunk` | `getChunk(long var1)` |
| `@Nullable` | `WorldChunk` | `getNonTickingChunk(long var1)` |
| `` | `int` | `getBlock(@Nonnull Vector3i pos)` |
| `` | `int` | `getBlock(int x, int y, int z)` |
| `@Nullable` | `BlockType` | `getBlockType(@Nonnull Vector3i pos)` |
| `@Nullable` | `BlockType` | `getBlockType(int x, int y, int z)` |
| `` | `void` | `setBlock(int x, int y, int z, String blockTypeKey)` |
| `` | `void` | `setBlock(int x, int y, int z, String blockTypeKey, int settings)` |
| `` | `boolean` | `breakBlock(int x, int y, int z, int settings)` |
| `` | `boolean` | `testBlockTypes( int x, int y, int z, @Nonnull BlockType blockTypeToTest, int rotation, @Nonnull IChunkAccessorSync.TestBlockFunction predicate )` |
| `` | `boolean` | `testPlaceBlock(int x, int y, int z, @Nonnull BlockType blockTypeToTest, int rotation)` |
| `` | `boolean` | `testPlaceBlock( int x, int y, int z, @Nonnull BlockType blockTypeToTest, int rotation, @Nonnull IChunkAccessorSync.TestBlockFunction predicate )` |
| `@Nullable` | `BlockState` | `getState(int x, int y, int z, boolean followFiller)` |
| `@Nullable` | `Holder<ChunkStore>` | `getBlockComponentHolder(int x, int y, int z)` |
| `` | `void` | `setBlockInteractionState(@Nonnull Vector3i blockPosition, @Nonnull BlockType blockType, @Nonnull String state)` |
| `@Nonnull` | `BlockPosition` | `getBaseBlock(@Nonnull BlockPosition position)` |
| `` | `int` | `getBlockRotationIndex(int x, int y, int z)` |

## Inner Types

- `IChunkAccessorSync.TestBlockFunction`
