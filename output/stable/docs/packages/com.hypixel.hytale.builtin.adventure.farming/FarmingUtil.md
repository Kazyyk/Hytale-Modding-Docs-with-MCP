---
title: "FarmingUtil"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.FarmingUtil"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "utility"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming`

```java
public class FarmingUtil
```

Utility class containing the core farming tick logic and harvest methods. Called by [FarmingSystems.Ticking](FarmingSystems.Ticking.md) and [FarmingSystems.OnFarmBlockAdded](FarmingSystems.OnFarmBlockAdded.md) to advance crop growth, and by [HarvestCropInteraction](HarvestCropInteraction.md) to process harvests.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `int` | `MAX_SECONDS_BETWEEN_TICKS` | `15` |
| `private static final` | `int` | `BETWEEN_RANDOM` | `10` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `tickFarming(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull BlockChunk blockChunk, @Nonnull BlockSection blockSection, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, @Nonnull FarmingBlock farmingBlock, int x, int y, int z, boolean initialTick)` |
| `public static` | `boolean` | `harvest(@Nonnull World world, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull BlockType blockType, int rotationIndex, @Nonnull Vector3i blockPosition)` |
| `@Nullable public static` | `CapturedNPCMetadata` | `generateCapturedNPCMetadata(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> entityRef, String npcNameKey)` |
| `protected static` | `boolean` | `harvest0(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull BlockType blockType, int rotationIndex, @Nonnull Vector3i blockPosition)` |
| `protected static` | `void` | `giveDrops(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Vector3d origin, @Nonnull BlockType blockType)` |

## Behavior

`tickFarming` advances a farming block through its configured stage pipeline. For each stage, it computes the duration (randomized from the stage's `Rangef`), applies all growth modifiers (fertilizer, light, water) as multipliers, and either advances to the next stage or schedules a future tick. When a stage completes, `stages[nextStage].apply(...)` is called to apply the visual/structural change (block type swap, prefab placement, spread, etc.). The tick caps at `MAX_SECONDS_BETWEEN_TICKS + BETWEEN_RANDOM` seconds of real-time game ticks to prevent unbounded catch-up.

`harvest` delegates to `harvest0`, which drops items via `BlockHarvestUtils.getDrops` and either transitions to the `stageSetAfterHarvest` stage set or breaks the block entirely.
