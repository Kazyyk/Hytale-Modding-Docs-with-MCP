---
title: "FadeContainerJsonLoader"
kind: class
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.FadeContainerJsonLoader"
api_surface: "public"
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["worldgen", "loader", "json"]
---

Loads `FadeContainer` zone-border fade configuration from JSON. Controls terrain height blending at zone boundaries by loading fade start/length and terrain start/length parameters.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `load()` | `FadeContainer` | Returns a `FadeContainer` with fade start, fade length, terrain start, terrain length, and fade heightmap values. |
| `loadFadeStart()` | `double` | Reads `FadeStart` from JSON, defaults to 0.0. |
| `loadFadeLength()` | `double` | Reads `FadeLength` from JSON, defaults to 0.0. |
| `loadTerrainStart()` | `double` | Reads `TerrainStart` from JSON, defaults to 0.0. |
| `loadTerrainLength()` | `double` | Reads `TerrainLength` from JSON, defaults to 0.0. |
| `loadFadeHeightmap()` | `double` | Reads `FadeHeightmap` from JSON, defaults to `Double.NEGATIVE_INFINITY`. |

## Inner Types

### Constants

*interface*

JSON key constants: `FadeStart`, `FadeLength`, `TerrainStart`, `TerrainLength`, `FadeHeightmap`.

