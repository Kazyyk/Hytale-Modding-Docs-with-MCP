---
title: "DirectionalGrowthBehaviour"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread.DirectionalGrowthBehaviour"
api_surface: false
extends: "SpreadGrowthBehaviour"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "farming"
  - "config"
  - "stages"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages.spread`

```java
public class DirectionalGrowthBehaviour extends SpreadGrowthBehaviour
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<DirectionalGrowthBehaviour>` | `CODEC` |
| `private static final` | `int` | `PLACE_BLOCK_TRIES` |
| `protected` | `IWeightedMap<DirectionalGrowthBehaviour.BlockTypeWeight>` | `blockTypes` |
| `protected` | `IntRange` | `horizontalRange` |
| `protected` | `IntRange` | `verticalRange` |
| `protected` | `DirectionalGrowthBehaviour.VerticalDirection` | `verticalDirection` |
| `` | `int` | `x` |
| `` | `int` | `z` |
| `` | `FastRandom` | `random` |
| `` | `DirectionalGrowthBehaviour.BlockTypeWeight` | `blockTypeWeight` |
| `` | `String` | `blockTypeKey` |
| `` | `World` | `world` |
| `` | `LocalCachedChunkAccessor` | `chunkAccessor` |
| `` | `double` | `angle` |
| `` | `int` | `radius` |
| `` | `int` | `targetX` |
| `` | `int` | `targetZ` |
| `` | `int` | `chunkX` |
| `` | `int` | `chunkZ` |
| `` | `long` | `chunkIndex` |
| `` | `WorldChunk` | `worldChunkComponent` |
| `` | `int` | `targetY` |
| `` | `int` | `directionValue` |
| `` | `int` | `finalTargetY` |
| `` | `long` | `loadedChunkIndex` |
| `` | `WorldChunk` | `loadedChunk` |
| `` | `BlockComponentChunk` | `blockComponentChunk` |
| `` | `int` | `blockIndex` |
| `` | `Ref<ChunkStore>` | `blockRefPlaced` |
| `` | `FarmingBlock` | `farmingPlaced` |
| `` | `BlockType` | `blockTypeAsset` |
| `` | `int` | `chunkY` |
| `` | `ChunkStore` | `chunkStore` |
| `` | `Ref<ChunkStore>` | `sectionRef` |
| `` | `Store<ChunkStore>` | `store` |
| `` | `BlockPhysics` | `blockPhysicsComponent` |
| `` | `FluidSection` | `fluidSectionComponent` |
| `` | `BlockSection` | `blockSectionComponent` |
| `` | `int` | `filler` |
| `` | `BlockPhysicsSystems.CachedAccessor` | `cachedAccessor` |
| `` | `public static final BuilderCodec<DirectionalGrowthBehaviour.BlockTypeWeight>` | `CODEC` |
| `` | `protected double` | `weight` |
| `` | `protected String` | `blockTypeKey` |
| `` | `private final int` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public IWeightedMap<DirectionalGrowthBehaviour.BlockTypeWeight>` | `getBlockTypes()` |
| `` | `public IntRange` | `getHorizontalRange()` |
| `` | `public IntRange` | `getVerticalRange()` |
| `` | `public DirectionalGrowthBehaviour.VerticalDirection` | `getVerticalDirection()` |
| `public` | `void` | `execute(@Nonnull ComponentAccessor<ChunkStore> componentAccessor,
        @Nonnull Ref<ChunkStore> sectionRef,
        @Nonnull Ref<ChunkStore> blockRef,
        int worldX,
        int worldY,
        int worldZ,
        float newSpreadRate)` |
| `` | `private static void` | `decaySpread(@Nonnull ComponentAccessor<ChunkStore> commandBuffer,
        @Nonnull BlockComponentChunk blockComponentChunk,
        int worldX,
        int worldY,
        int worldZ,
        float newSpreadRate)` |
| `` | `private boolean` | `tryPlaceBlock(@Nonnull World world, @Nonnull WorldChunk chunk, int worldX, int worldY, int worldZ, @Nonnull String blockTypeKey, int rotation)` |
| `public` | `String` | `toString()` |
| `` | `public double` | `getWeight()` |
| `` | `public String` | `getBlockTypeKey()` |
| `` | `public String` | `toString()` |
| `` | `private` | `VerticalDirection(int value)` |
| `` | `public int` | `getValue()` |

## Inner Types

- `DirectionalGrowthBehaviour.BlockTypeWeight`
- `DirectionalGrowthBehaviour.VerticalDirection`

## Related Types

- [SpreadGrowthBehaviour](SpreadGrowthBehaviour.md)
