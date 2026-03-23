---
title: "LightLevelGrowthModifierAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.modifiers"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.modifiers.LightLevelGrowthModifierAsset"
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
public class LightLevelGrowthModifierAsset extends GrowthModifierAsset
```

Applies a growth speed multiplier based on ambient light conditions. Supports both artificial RGB light ranges and sunlight intensity ranges. Can require both conditions (`requireBoth`) or either. When only sunlight is active during the initial tick, applies a 0.6x penalty to the base multiplier.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getCurrentGrowthMultiplier(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)` |

## Inner Class: ArtificialLight

`class` -- Inner class holding red/green/blue `Range` thresholds for artificial light validation.
