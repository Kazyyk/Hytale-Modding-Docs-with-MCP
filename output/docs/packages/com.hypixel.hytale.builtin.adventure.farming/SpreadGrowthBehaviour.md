---
title: "SpreadGrowthBehaviour"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread.SpreadGrowthBehaviour"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "config"
  - "spread"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages.spread`

```java
public abstract class SpreadGrowthBehaviour
```

Abstract base class for spread growth behaviours used by [SpreadFarmingStageData](SpreadFarmingStageData.md). Subclasses define how blocks spread to new positions. Supports configurable `WorldLocationCondition` arrays for position validation.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `WorldLocationCondition[]` | `worldLocationConditions` |

## Abstract Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `void` | `execute(@Nonnull ComponentAccessor<ChunkStore> var1, @Nonnull Ref<ChunkStore> var2, @Nonnull Ref<ChunkStore> var3, int var4, int var5, int var6, float var7)` |

## Concrete Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `boolean` | `validatePosition(@Nonnull World world, int worldX, int worldY, int worldZ)` |

## Known Subclasses

- [DirectionalGrowthBehaviour](DirectionalGrowthBehaviour.md)
