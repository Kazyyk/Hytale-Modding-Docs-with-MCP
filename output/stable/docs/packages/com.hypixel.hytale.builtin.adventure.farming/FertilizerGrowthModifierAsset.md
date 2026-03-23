---
title: "FertilizerGrowthModifierAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.modifiers"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.modifiers.FertilizerGrowthModifierAsset"
api_surface: false
extends: "GrowthModifierAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "config"
  - "growth-modifier"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.modifiers`

```java
public class FertilizerGrowthModifierAsset extends GrowthModifierAsset
```

Applies a growth speed multiplier when the soil block below the crop is fertilized. Checks the `TilledSoilBlock` component on the block directly below (y-1) for the fertilized flag.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getCurrentGrowthMultiplier(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)` |
