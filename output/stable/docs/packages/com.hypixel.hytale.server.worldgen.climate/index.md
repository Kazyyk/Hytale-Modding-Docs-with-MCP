---
title: "com.hypixel.hytale.server.worldgen.climate"
kind: "package"
package: "com.hypixel.hytale.server.worldgen.climate"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "worldgen"
  - "climate"
  - "biome"
---

**Package:** `com.hypixel.hytale.server.worldgen.climate`

Climate and biome classification system for Hytale's procedural world generation. Maps 2D temperature-humidity noise fields onto a precomputed climate graph to determine biome types. Supports hierarchical climate types with parent-child relationships and smooth boundary transitions via distance-transform fading.

## Core Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [ClimateType](ClimateType.md) | class | yes | Definition of a distinct climate/biome with generation parameters. |
| [ClimateGraph](ClimateGraph.md) | class | yes | 512x512 lookup table mapping temperature-humidity to climate type. |
| [ClimateNoise](ClimateNoise.md) | class | yes | Noise function configuration for temperature/humidity generation. |
| [ClimatePoint](ClimatePoint.md) | class | yes | Temperature-humidity coordinate for a climate type center. |
| [ClimateColor](ClimateColor.md) | class | yes | Map visualization colors per terrain category. |
| [UniqueClimateGenerator](UniqueClimateGenerator.md) | class | yes | Combines noise layers with the graph for world climate assignment. |

## Internal Types

| Type | Kind | Description |
|---|---|---|
| [ClimateMaskProvider](ClimateMaskProvider.md) | class | Generates per-chunk climate masks for terrain generation. |
| [ClimateSearch](ClimateSearch.md) | class | Spatial search for nearest matching climate type. |
| [DirectGrid](DirectGrid.md) | class | Fixed-resolution 2D backing storage for the climate graph. |
