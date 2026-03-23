---
title: "FarmingPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.FarmingPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "plugin"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming`

```java
public class FarmingPlugin extends JavaPlugin
```

The main plugin class for the farming system. Registers all farming-related components, interactions, codec types, growth modifiers, farming stage data types, and ECS systems with the server plugin framework.

On setup, this plugin:
- Registers asset stores for `GrowthModifierAsset` (path `Farming/Modifiers`) and [FarmingCoopAsset](FarmingCoopAsset.md) (path `Farming/Coops`)
- Registers interactions: `HarvestCrop`, `FertilizeSoil`, `ChangeFarmingStage`, `UseWateringCan`, `UseCoop`, `UseCaptureCrate`
- Registers growth modifier codecs: `Fertilizer`, `LightLevel`, `Water`
- Registers farming stage data codecs: `BlockType`, `BlockState`, `Prefab`, `Spread`
- Registers spread growth behaviour codec: `Directional`
- Registers `ChunkStore` components: [TilledSoilBlock](TilledSoilBlock.md), [FarmingBlock](FarmingBlock.md), [FarmingBlockState](FarmingBlockState.md), [CoopBlock](CoopBlock.md)
- Registers `EntityStore` component: [CoopResidentComponent](CoopResidentComponent.md)
- Registers ECS systems: [FarmingSystems.OnSoilAdded](FarmingSystems.OnSoilAdded.md), [FarmingSystems.OnFarmBlockAdded](FarmingSystems.OnFarmBlockAdded.md), [FarmingSystems.Ticking](FarmingSystems.Ticking.md), [FarmingSystems.MigrateFarming](FarmingSystems.MigrateFarming.md), [FarmingSystems.OnCoopAdded](FarmingSystems.OnCoopAdded.md), [FarmingSystems.CoopResidentEntitySystem](FarmingSystems.CoopResidentEntitySystem.md), [FarmingSystems.CoopResidentTicking](FarmingSystems.CoopResidentTicking.md)
- Listens for `ChunkPreLoadProcessEvent` to prevent spread on newly generated chunks

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static` | `FarmingPlugin` | `instance` |
| `private` | `ComponentType<ChunkStore, TilledSoilBlock>` | `tiledSoilBlockComponentType` |
| `private` | `ComponentType<ChunkStore, FarmingBlock>` | `farmingBlockComponentType` |
| `private` | `ComponentType<ChunkStore, FarmingBlockState>` | `farmingBlockStateComponentType` |
| `private` | `ComponentType<ChunkStore, CoopBlock>` | `coopBlockStateComponentType` |
| `private` | `ComponentType<EntityStore, CoopResidentComponent>` | `coopResidentComponentType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `FarmingPlugin` | `get()` |
| `public` | | `FarmingPlugin(@Nonnull JavaPluginInit init)` |
| `protected` | `void` | `setup()` |
| `public` | `ComponentType<ChunkStore, TilledSoilBlock>` | `getTiledSoilBlockComponentType()` |
| `public` | `ComponentType<ChunkStore, FarmingBlock>` | `getFarmingBlockComponentType()` |
| `public` | `ComponentType<ChunkStore, FarmingBlockState>` | `getFarmingBlockStateComponentType()` |
| `public` | `ComponentType<ChunkStore, CoopBlock>` | `getCoopBlockStateComponentType()` |
| `public` | `ComponentType<EntityStore, CoopResidentComponent>` | `getCoopResidentComponentType()` |

## Related Types

- [FarmingSystems](FarmingSystems.md) -- ECS systems registered by this plugin
- [FarmingUtil](FarmingUtil.md) -- utility methods for farming tick logic and harvesting
