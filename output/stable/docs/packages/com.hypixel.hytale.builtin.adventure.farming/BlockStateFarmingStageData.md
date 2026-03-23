---
title: "BlockStateFarmingStageData"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.BlockStateFarmingStageData"
api_surface: false
extends: "FarmingStageData"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "config"
  - "stage"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages`

```java
public class BlockStateFarmingStageData extends FarmingStageData
```

A farming stage that transitions a block to a different block state (variant of the same block type). Resolves the target state via `BlockType.getBlockForState(state)` and replaces the block in the world chunk.

## Codec Fields

state (String)

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `apply(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, @Nullable FarmingStageData previousStage)` |
