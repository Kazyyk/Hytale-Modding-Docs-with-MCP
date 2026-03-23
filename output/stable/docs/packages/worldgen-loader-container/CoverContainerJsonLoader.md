---
title: "CoverContainerJsonLoader"
kind: class
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.CoverContainerJsonLoader"
api_surface: "public"
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["worldgen", "loader", "json"]
---

Loads `CoverContainer` biome cover definitions from JSON. Parses cover block types, weights, offsets, noise masks, height thresholds, parent block filters, and on-water flags from the JSON configuration.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `load()` | `CoverContainer` | Parses the JSON element and returns a fully constructed `CoverContainer` with all cover entries. |

## Inner Types

### CoverContainerEntryJsonLoader

*static class*

Inner loader for individual cover container entries. Loads block type arrays, weighted maps, density, noise masks, height conditions, parent masks, and on-water settings.

### Constants

*interface*

JSON key constants: `Type`, `Weight`, `Density`, `NoiseMask`, `HeightThreshold`, `Offset`, `Parent`, `OnWater`.

