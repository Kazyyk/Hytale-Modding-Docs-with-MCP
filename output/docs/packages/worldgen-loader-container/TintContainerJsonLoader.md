---
title: "TintContainerJsonLoader"
kind: class
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.TintContainerJsonLoader"
api_surface: "public"
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["worldgen", "loader", "json"]
---

Loads `TintContainer` biome tint color definitions from JSON. Supports default tint colors, arrays of noise-conditioned tint entries, and hex color string parsing via `ColorUtil`.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `load()` | `TintContainer` | Returns a `TintContainer` with default and conditional tint entries. |
| `loadDefault()` | `TintContainer.DefaultTintContainerEntry` | Loads the default tint entry. |
| `loadEntries()` | `List<TintContainer.TintContainerEntry>` | Loads the `Entries` list of conditional tint entries. |

## Inner Types

### TintContainerEntryJsonLoader

*static class*

Loads individual tint entries with weighted color mappings, value noise, and noise mask conditions.

### DefaultTintContainerEntryJsonLoader

*static class*

Extends `TintContainerEntryJsonLoader` for the default entry. Falls back to red (0xFF0000) when no color is specified.

### Constants

*interface*

JSON key constants: `Default`, `Entries`, `Colors`, `Weights`, `Noise`, `NoiseMask`. Default tint color is 16711680 (0xFF0000).

