---
title: "WaterGrowthModifierAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.modifiers"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.modifiers.WaterGrowthModifierAsset"
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
public class WaterGrowthModifierAsset extends GrowthModifierAsset
```

Applies a growth speed multiplier when the crop has access to water. Water can come from adjacent fluid blocks (checked via `FluidSection`), active rain weather (checked via `WeatherResource` with line-of-sight to sky), or manual watering (via `TilledSoilBlock.wateredUntil` set by [UseWateringCanInteraction](UseWateringCanInteraction.md)). Also updates the soil's `externalWater` flag and schedules soil ticks when water state changes.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getCurrentGrowthMultiplier(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)` |
