---
title: "BlockTypeFarmingStageData"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.BlockTypeFarmingStageData"
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
public class BlockTypeFarmingStageData extends FarmingStageData
```

A farming stage that transitions a block to a completely different block type. Resolves the target block via `BlockType.getAssetMap().getIndex(block)` and replaces the block in the world chunk.

## Codec Fields

block (String)

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `apply(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, @Nullable FarmingStageData previousStage)` |
