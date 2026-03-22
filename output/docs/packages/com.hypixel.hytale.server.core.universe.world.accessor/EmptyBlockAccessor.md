---
title: "EmptyBlockAccessor"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.accessor"
fqcn: "com.hypixel.hytale.server.core.universe.world.accessor.EmptyBlockAccessor"
api_surface: false
extends: ~
implements: ["BlockAccessor"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "accessor"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.accessor`

```java
public class EmptyBlockAccessor implements BlockAccessor
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `EmptyBlockAccessor` | `INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getX()` |
| `@Override public` | `int` | `getZ()` |
| `@Override public` | `ChunkAccessor` | `getChunkAccessor()` |
| `@Override public` | `int` | `getBlock(int x, int y, int z)` |
| `@Override public` | `boolean` | `setBlock(int x, int y, int z, int id, BlockType blockType, int rotation, int filler, int settings)` |
| `@Override public` | `boolean` | `breakBlock(int x, int y, int z, int filler, int settings)` |
| `@Override public` | `boolean` | `testBlocks(int x, int y, int z, BlockType blockTypeToTest, int rotation, TriIntPredicate predicate)` |
| `@Override public` | `boolean` | `testBlockTypes(int x, int y, int z, BlockType blockTypeToTest, int rotation, IChunkAccessorSync.TestBlockFunction predicate)` |
| `@Override public` | `boolean` | `testPlaceBlock(int x, int y, int z, BlockType blockTypeToTest, int rotation)` |
| `@Override public` | `boolean` | `testPlaceBlock(int x, int y, int z, BlockType blockTypeToTest, int rotation, IChunkAccessorSync.TestBlockFunction filter)` |
| `@Override public` | `boolean` | `setTicking(int x, int y, int z, boolean ticking)` |
| `@Override public` | `boolean` | `isTicking(int x, int y, int z)` |
| `@Override @Nullable public` | `BlockState` | `getState(int x, int y, int z)` |
| `@Override @Nullable public` | `Holder<ChunkStore>` | `getBlockComponentHolder(int x, int y, int z)` |
| `@Override public` | `void` | `setState(int x, int y, int z, BlockState state, boolean notify)` |
| `@Override public` | `int` | `getFluidId(int x, int y, int z)` |
| `@Override public` | `byte` | `getFluidLevel(int x, int y, int z)` |
| `@Override public` | `int` | `getSupportValue(int x, int y, int z)` |
| `@Override public` | `int` | `getFiller(int x, int y, int z)` |
| `@Override public` | `int` | `getRotationIndex(int x, int y, int z)` |
