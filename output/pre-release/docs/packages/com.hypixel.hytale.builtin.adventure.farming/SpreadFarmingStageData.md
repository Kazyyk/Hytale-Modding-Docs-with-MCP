---
title: "SpreadFarmingStageData"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread.SpreadFarmingStageData"
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

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages.spread`

```java
public class SpreadFarmingStageData extends FarmingStageData
```

A farming stage that spreads blocks outward from the source position. Implements `shouldStop` to limit executions based on spread rate decay. Each execution runs all configured [SpreadGrowthBehaviour](SpreadGrowthBehaviour.md) instances, passing a decayed spread rate. The stage repeats until the execution count reaches `executions * spreadRate`.

## Codec Fields

executions (IntRange), spreadDecayPercent (IntRange), spreadGrowthBehaviours (SpreadGrowthBehaviour[])

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `apply(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, @Nullable FarmingStageData previousStage)` |
