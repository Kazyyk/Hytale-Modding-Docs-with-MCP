---
title: "TilledSoilBlock"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.states"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.states.TilledSoilBlock"
api_surface: false
extends: null
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "component"
  - "soil"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.states`

```java
public class TilledSoilBlock implements Component<ChunkStore>
```

A `ChunkStore` component tracking the state of tilled soil. Manages whether a crop is planted above, whether the soil is fertilized (boosting growth via [FertilizerGrowthModifierAsset](FertilizerGrowthModifierAsset.md)), whether external water is present, a manual watering expiry time, and a decay timer that converts the soil back to its base block type when no crop is planted.

The `computeBlockType` method returns the appropriate block state key (`Fertilized_Watered`, `Fertilized`, `Watered`, or `default`) based on the current fertilized and watered flags.

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static` | `int` | `VERSION` (= 1) |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `boolean` | `planted` |
| `protected` | `boolean` | `fertilized` |
| `protected` | `boolean` | `externalWater` |
| `@Nullable protected` | `Instant` | `wateredUntil` |
| `@Nullable protected` | `Instant` | `decayTime` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore, TilledSoilBlock>` | `getComponentType()` |
| `public` | `boolean` | `isPlanted()` |
| `public` | `void` | `setPlanted(boolean planted)` |
| `public` | `void` | `setWateredUntil(@Nullable Instant wateredUntil)` |
| `@Nullable public` | `Instant` | `getWateredUntil()` |
| `public` | `boolean` | `isFertilized()` |
| `public` | `void` | `setFertilized(boolean fertilized)` |
| `public` | `boolean` | `hasExternalWater()` |
| `public` | `void` | `setExternalWater(boolean externalWater)` |
| `@Nullable public` | `Instant` | `getDecayTime()` |
| `public` | `void` | `setDecayTime(@Nullable Instant decayTime)` |
| `@Nullable public` | `String` | `computeBlockType(@Nonnull Instant gameTime, @Nonnull BlockType type)` |
| `@Nullable public` | `Component<ChunkStore>` | `clone()` |
