---
title: "BlockAccessor"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.accessor"
fqcn: "com.hypixel.hytale.server.core.universe.world.accessor.BlockAccessor"
api_surface: true
extends: ~
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
public interface BlockAccessor
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `int` | `getX()` |
| `` | `int` | `getZ()` |
| `` | `ChunkAccessor` | `getChunkAccessor()` |
| `` | `int` | `getBlock(int var1, int var2, int var3)` |
| `` | `int` | `getBlock(@Nonnull Vector3i pos)` |
| `` | `boolean` | `setBlock(int var1, int var2, int var3, int var4, BlockType var5, int var6, int var7, int var8)` |
| `` | `boolean` | `setBlock(int x, int y, int z, int id, BlockType blockType)` |
| `` | `boolean` | `setBlock(int x, int y, int z, String blockTypeKey)` |
| `` | `boolean` | `setBlock(int x, int y, int z, String blockTypeKey, int settings)` |
| `` | `boolean` | `setBlock(int x, int y, int z, int id)` |
| `` | `boolean` | `setBlock(int x, int y, int z, int id, int settings)` |
| `` | `boolean` | `setBlock(int x, int y, int z, @Nonnull BlockType blockType)` |
| `` | `boolean` | `setBlock(int x, int y, int z, @Nonnull BlockType blockType, int settings)` |
| `` | `boolean` | `breakBlock(int x, int y, int z, int filler, int settings)` |
| `` | `boolean` | `breakBlock(int x, int y, int z)` |
| `` | `boolean` | `breakBlock(int x, int y, int z, int settings)` |
| `` | `boolean` | `testBlocks(int x, int y, int z, @Nonnull BlockType blockTypeToTest, int rotation, @Nonnull TriIntPredicate predicate)` |
| `` | `boolean` | `testBlockTypes( int x, int y, int z, @Nonnull BlockType blockTypeToTest, int rotation, @Nonnull IChunkAccessorSync.TestBlockFunction predicate )` |
| `` | `boolean` | `placeBlock( int x, int y, int z, String originalBlockTypeKey, @Nonnull Rotation yaw, @Nonnull Rotation pitch, @Nonnull Rotation roll, int settings )` |
| `` | `boolean` | `placeBlock(int x, int y, int z, String originalBlockTypeKey, @Nonnull RotationTuple rotationTuple, int settings, boolean validatePlacement)` |
| `` | `boolean` | `placeBlock(int x, int y, int z, String blockTypeKey, @Nonnull Rotation yaw, @Nonnull Rotation pitch, @Nonnull Rotation roll)` |
| `` | `boolean` | `testPlaceBlock(int x, int y, int z, @Nonnull BlockType blockTypeToTest, int rotationIndex)` |
| `` | `boolean` | `testPlaceBlock( int x, int y, int z, @Nonnull BlockType blockTypeToTest, int rotationIndex, @Nonnull IChunkAccessorSync.TestBlockFunction filter )` |
| `@Nullable` | `BlockType` | `getBlockType(int x, int y, int z)` |
| `@Nullable` | `BlockType` | `getBlockType(@Nonnull Vector3i block)` |
| `` | `boolean` | `setTicking(int var1, int var2, int var3, boolean var4)` |
| `` | `boolean` | `isTicking(int var1, int var2, int var3)` |
| `@Nullable` | `BlockState` | `getState(int var1, int var2, int var3)` |
| `@Nullable` | `Holder<ChunkStore>` | `getBlockComponentHolder(int var1, int var2, int var3)` |
| `` | `void` | `setState(int var1, int var2, int var3, BlockState var4, boolean var5)` |
| `` | `void` | `setState(int x, int y, int z, BlockState state)` |
| `` | `void` | `setBlockInteractionState(@Nonnull Vector3i blockPosition, @Nonnull BlockType blockType, @Nonnull String state)` |
| `` | `void` | `setBlockInteractionState(int x, int y, int z, @Nonnull BlockType blockType, @Nonnull String state, boolean force)` |
| `` | `int` | `getFluidId(int var1, int var2, int var3)` |
| `` | `byte` | `getFluidLevel(int var1, int var2, int var3)` |
| `` | `int` | `getSupportValue(int var1, int var2, int var3)` |
| `` | `int` | `getFiller(int var1, int var2, int var3)` |
| `` | `int` | `getRotationIndex(int var1, int var2, int var3)` |
| `` | `RotationTuple` | `getRotation(int x, int y, int z)` |
