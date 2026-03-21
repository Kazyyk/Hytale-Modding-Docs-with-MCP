---
title: "SpreadFarmingStageData"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread.SpreadFarmingStageData"
api_surface: false
extends: "FarmingStageData"
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
public class SpreadFarmingStageData extends FarmingStageData
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SpreadFarmingStageData>` | `CODEC` |
| `protected` | `IntRange` | `executions` |
| `protected` | `IntRange` | `spreadDecayPercent` |
| `protected` | `SpreadGrowthBehaviour[]` | `spreadGrowthBehaviours` |
| `` | `FarmingBlock` | `farmingBlockComponent` |
| `` | `ChunkSection` | `chunkSectionComponent` |
| `` | `int` | `worldX` |
| `` | `int` | `worldY` |
| `` | `int` | `worldZ` |
| `` | `float` | `spreadRate` |
| `` | `float` | `executions` |
| `` | `int` | `executed` |
| `` | `int` | `generation` |
| `` | `double` | `executions` |
| `` | `SpreadGrowthBehaviour` | `spreadGrowthBehaviour` |
| `` | `float` | `decayRate` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `throw new` | `IllegalArgumentException("The min value for Executions range must be >= 1! Current min value is: " + stageData.executions.getInclusiveMin()` |
| `` | `throw new` | `IllegalArgumentException("The min value for SpreadDecayPercent range must be >= 0! Current min value is: " + stageData.spreadDecayPercent.getInclusiveMin()` |
| `` | `public IntRange` | `getExecutions()` |
| `` | `public IntRange` | `getSpreadDecayPercent()` |
| `` | `public SpreadGrowthBehaviour[]` | `getSpreadGrowthBehaviours()` |
| `public` | `boolean` | `implementsShouldStop()` |
| `public` | `boolean` | `shouldStop(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z)` |
| `public` | `void` | `apply(@Nonnull ComponentAccessor<ChunkStore> commandBuffer,
        @Nonnull Ref<ChunkStore> sectionRef,
        @Nonnull Ref<ChunkStore> blockRef,
        int x,
        int y,
        int z,
        @Nullable FarmingStageData previousStage)` |
| `public` | `void` | `remove(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z)` |
| `public` | `String` | `toString()` |

## Related Types

- [SpreadGrowthBehaviour](SpreadGrowthBehaviour.md)
