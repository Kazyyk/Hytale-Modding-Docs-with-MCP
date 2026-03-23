---
title: "WaterContainerJsonLoader"
kind: class
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.WaterContainerJsonLoader"
api_surface: "public"
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["worldgen", "loader", "json"]
---

Loads `WaterContainer` biome water/fluid placement definitions from JSON. Supports legacy `Block`/`Fluid` shorthand and structured `Entries` arrays with min/max height ranges, noise, and noise mask conditions.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `load()` | `WaterContainer` | Returns a `WaterContainer`. Handles three JSON formats: `Block` key (block-based fluid), `Fluid` key (fluid-based), or `Entries` array. |
| `loadEntries()` | `WaterContainer.Entry[]` | Loads the structured `Entries` array of water container entries. |

## Inner Types

### WaterContainerEntryJsonLoader

*static class*

Loads individual water entries with fluid/block type, min/max height suppliers, and noise mask conditions.

### Constants

*interface*

JSON key constants: `Entries`, `Block`, `Fluid`, `Min`, `MinNoise`, `Max`, `MaxNoise`, `NoiseMask`.

