---
title: "com.hypixel.hytale.builtin.crafting.component"
package: "com.hypixel.hytale.builtin.crafting.component"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "crafting"
  - "builtin"
  - "package-index"
---

**Package:** `com.hypixel.hytale.builtin.crafting.component`

ECS component types for the crafting system. Contains the per-player `CraftingManager` component and its inner types for tracking crafting jobs, bench upgrades, and material lookups. None of the types in this package are part of the public API surface.

## ECS Components

| Type | Kind | Store | Description |
|---|---|---|---|
| [CraftingManager](CraftingManager.md) | class | `EntityStore` | Per-player crafting state manager with job queuing, bench tracking, and tier upgrades. |

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [CraftingManager.CraftingJob](CraftingManager.CraftingJob.md) | class | Tracks a queued crafting operation with timing and input/output state. |
| [CraftingManager.BenchUpgradingJob](CraftingManager.BenchUpgradingJob.md) | class | Tracks a bench tier upgrade operation. |
| [CraftingManager.ChestLookupResult](CraftingManager.ChestLookupResult.md) | record | Result of spatial query for nearby item containers. |
| [CraftingManager.InputRemovalType](CraftingManager.InputRemovalType.md) | enum | NORMAL or ORDERED input material removal strategy. |
- [ProcessingBenchBlock](ProcessingBenchBlock.md)
