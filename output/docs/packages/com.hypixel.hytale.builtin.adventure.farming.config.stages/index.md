---
title: "com.hypixel.hytale.builtin.adventure.farming.config.stages"
kind: "package"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "farming"
  - "config"
  - "stage"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages`

Farming stage data implementations that define how crop growth stages are applied to the world. Supports block state transitions, block type replacements, and prefab-based growth stages with obstruction checking and replace masks.

## Types

| Type | Kind | Description |
|---|---|---|
| [BlockStateFarmingStageData](BlockStateFarmingStageData.md) | class | Farming stage that transitions a block to a named block state variant of the same block type. |
| [BlockTypeFarmingStageData](BlockTypeFarmingStageData.md) | class | Farming stage that replaces the current block with an entirely different block type identified by name. |
| [PrefabFarmingStageData](PrefabFarmingStageData.md) | class | Farming stage that places or transitions a prefab structure. |
