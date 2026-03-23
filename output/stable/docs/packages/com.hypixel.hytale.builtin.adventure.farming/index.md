---
title: "com.hypixel.hytale.builtin.adventure.farming"
kind: "package"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "builtin"
  - "adventure"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming`

The farming system for Hytale's adventure mode. Implements crop growth with configurable multi-stage pipelines, growth modifiers (fertilizer, light, water), soil management with decay timers, block spreading mechanics, prefab-based growth stages, and animal coops with resident NPC management and produce generation.

## Types

| Type | Kind | Description |
|---|---|---|
| [FarmingPlugin](FarmingPlugin.md) | class | |
| [FarmingSystems](FarmingSystems.md) | class | |
| [FarmingUtil](FarmingUtil.md) | class | |
| [CoopResidentComponent](CoopResidentComponent.md) | class | |
| [FarmingCoopAsset](FarmingCoopAsset.md) | class | |
| [FertilizerGrowthModifierAsset](FertilizerGrowthModifierAsset.md) | class | |
| [LightLevelGrowthModifierAsset](LightLevelGrowthModifierAsset.md) | class | |
| [LightLevelGrowthModifierAsset.ArtificialLight](LightLevelGrowthModifierAsset.ArtificialLight.md) | class | |
| [WaterGrowthModifierAsset](WaterGrowthModifierAsset.md) | class | |
| [BlockStateFarmingStageData](BlockStateFarmingStageData.md) | class | |
| [BlockTypeFarmingStageData](BlockTypeFarmingStageData.md) | class | |
| [PrefabFarmingStageData](PrefabFarmingStageData.md) | class | |
| [PrefabFarmingStageData.PrefabStage](PrefabFarmingStageData.PrefabStage.md) | class | |
| [SpreadFarmingStageData](SpreadFarmingStageData.md) | class | |
| [SpreadGrowthBehaviour](SpreadGrowthBehaviour.md) | class | |
| [DirectionalGrowthBehaviour](DirectionalGrowthBehaviour.md) | class | |
| [DirectionalGrowthBehaviour.BlockTypeWeight](DirectionalGrowthBehaviour.BlockTypeWeight.md) | class | |
| [DirectionalGrowthBehaviour.VerticalDirection](DirectionalGrowthBehaviour.VerticalDirection.md) | class | |
| [ChangeFarmingStageInteraction](ChangeFarmingStageInteraction.md) | class | |
| [FertilizeSoilInteraction](FertilizeSoilInteraction.md) | class | |
| [HarvestCropInteraction](HarvestCropInteraction.md) | class | |
| [UseCaptureCrateInteraction](UseCaptureCrateInteraction.md) | class | |
| [UseCoopInteraction](UseCoopInteraction.md) | class | |
| [UseWateringCanInteraction](UseWateringCanInteraction.md) | class | |
| [CoopBlock](CoopBlock.md) | class | |
| [CoopBlock.CoopResident](CoopBlock.CoopResident.md) | class | |
| [FarmingBlock](FarmingBlock.md) | class | |
| [FarmingBlockState](FarmingBlockState.md) | class | |
| [FarmingBlockState.RefreshFlags](FarmingBlockState.RefreshFlags.md) | class | |
| [TilledSoilBlock](TilledSoilBlock.md) | class | |
| [FarmingSystems.CoopResidentEntitySystem](FarmingSystems.CoopResidentEntitySystem.md) | class | |
| [FarmingSystems.CoopResidentTicking](FarmingSystems.CoopResidentTicking.md) | class | |
| [FarmingSystems.MigrateFarming](FarmingSystems.MigrateFarming.md) | class | |
| [FarmingSystems.OnCoopAdded](FarmingSystems.OnCoopAdded.md) | class | |
| [FarmingSystems.OnFarmBlockAdded](FarmingSystems.OnFarmBlockAdded.md) | class | |
| [FarmingSystems.OnSoilAdded](FarmingSystems.OnSoilAdded.md) | class | |
| [FarmingSystems.Ticking](FarmingSystems.Ticking.md) | class | |