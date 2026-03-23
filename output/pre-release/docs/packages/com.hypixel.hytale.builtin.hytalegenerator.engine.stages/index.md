---
title: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.stages`

## Interfaces

| Type | Description |
|---|---|
| [Stage](Stage.md) | Defines a single step in staged chunk generation |
| [Stage.Context](Stage.Context.md) | Execution context with buffer access and worker ID |

## Classes

| Type | Description |
|---|---|
| [BiomeDistanceStage](BiomeDistanceStage.md) | Computes distance to biome boundaries |
| [BiomeDistanceStage.BiomeDistanceCounter](BiomeDistanceStage.BiomeDistanceCounter.md) | Accumulates closest-distance-per-biome |
| [BiomeDistanceStage.BiomeDistanceEntries](BiomeDistanceStage.BiomeDistanceEntries.md) | Result container of biome distance entries |
| [BiomeDistanceStage.BiomeDistanceEntry](BiomeDistanceStage.BiomeDistanceEntry.md) | Single biome ID and distance pair |
| [BiomeStage](BiomeStage.md) | Populates biome IDs from world structure |
| [EnvironmentStage](EnvironmentStage.md) | Generates per-voxel environment IDs |
| [PropStage](PropStage.md) | Places props (trees, rocks, entities) |
| [TerrainStage](TerrainStage.md) | Generates terrain density and materials |
| [TerrainStage.BiomeWeights](TerrainStage.BiomeWeights.md) | Weighted biome entries for density blending |
| [TerrainStage.BiomeWeights.Entry](TerrainStage.BiomeWeights.Entry.md) | Single biome weight entry |
| [TerrainStage.ColumnData](TerrainStage.ColumnData.md) | Per-column depth and space metrics |
| [TintStage](TintStage.md) | Generates per-column tint values |
