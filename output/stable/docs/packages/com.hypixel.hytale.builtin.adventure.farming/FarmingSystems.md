---
title: "FarmingSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.FarmingSystems"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "ecs"
  - "systems"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming`

```java
public class FarmingSystems
```

Container class for all farming-related ECS systems. Contains static inner classes that handle soil lifecycle, farm block initialization, crop growth ticking, coop management, and data migration. Registered as systems by [FarmingPlugin](FarmingPlugin.md) during setup.

## Inner Classes

| Type | Kind | Description |
|---|---|---|
| [CoopResidentEntitySystem](FarmingSystems.CoopResidentEntitySystem.md) | class | Handles coop resident entity add/remove events on `EntityStore`. |
| [CoopResidentTicking](FarmingSystems.CoopResidentTicking.md) | class | Ticks coop residents, removing those marked for despawn. |
| [MigrateFarming](FarmingSystems.MigrateFarming.md) | class | Deprecated migration system converting old [FarmingBlockState](FarmingBlockState.md) to [FarmingBlock](FarmingBlock.md). |
| [OnCoopAdded](FarmingSystems.OnCoopAdded.md) | class | Schedules coop block ticks when a coop block entity is added. |
| [OnFarmBlockAdded](FarmingSystems.OnFarmBlockAdded.md) | class | Initializes farming state when a [FarmingBlock](FarmingBlock.md) component is added. |
| [OnSoilAdded](FarmingSystems.OnSoilAdded.md) | class | Schedules soil decay ticks when a [TilledSoilBlock](TilledSoilBlock.md) is added. |
| [Ticking](FarmingSystems.Ticking.md) | class | Main block-tick system for farming, soil, and coop blocks in `ChunkStore`. |

## Private Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private static` | `boolean` | `hasCropAbove(@Nonnull BlockChunk blockChunk, int x, int y, int z)` |
| `private static` | `boolean` | `updateSoilDecayTime(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull TilledSoilBlock soilBlock, @Nullable BlockType blockType)` |
