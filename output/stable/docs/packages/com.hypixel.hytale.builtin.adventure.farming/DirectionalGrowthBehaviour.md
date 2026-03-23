---
title: "DirectionalGrowthBehaviour"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread.DirectionalGrowthBehaviour"
api_surface: false
extends: "SpreadGrowthBehaviour"
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
public class DirectionalGrowthBehaviour extends SpreadGrowthBehaviour
```

A spread growth behaviour that places blocks at randomized positions within configurable horizontal and vertical ranges from the source. Supports weighted random block type selection and vertical direction constraints (`UPWARDS`, `DOWNWARDS`, `BOTH`). Validates placement against block physics before placing.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `IWeightedMap<DirectionalGrowthBehaviour.BlockTypeWeight>` | `blockTypes` |
| `protected` | `IntRange` | `horizontalRange` |
| `protected` | `IntRange` | `verticalRange` |
| `protected` | `DirectionalGrowthBehaviour.VerticalDirection` | `verticalDirection` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `IWeightedMap<DirectionalGrowthBehaviour.BlockTypeWeight>` | `getBlockTypes()` |
| `public` | `IntRange` | `getHorizontalRange()` |
| `public` | `IntRange` | `getVerticalRange()` |
| `public` | `DirectionalGrowthBehaviour.VerticalDirection` | `getVerticalDirection()` |
| `public` | `void` | `execute(@Nonnull ComponentAccessor<ChunkStore> componentAccessor, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int worldX, int worldY, int worldZ, float newSpreadRate)` |

## Inner Classes

| Type | Kind | Description |
|---|---|---|
| [BlockTypeWeight](DirectionalGrowthBehaviour.BlockTypeWeight.md) | class | Weighted block type entry for spread selection. |
| [VerticalDirection](DirectionalGrowthBehaviour.VerticalDirection.md) | enum | Direction constraint for vertical spread. |
