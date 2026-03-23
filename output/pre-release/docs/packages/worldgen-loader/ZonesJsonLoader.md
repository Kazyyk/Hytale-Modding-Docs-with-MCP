---
title: "ZonesJsonLoader"
kind: class
package: "com.hypixel.hytale.server.worldgen.loader"
fqcn: "com.hypixel.hytale.server.worldgen.loader.ZonesJsonLoader"
api_surface: "public"
extends: "Loader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["worldgen", "loader"]
---

Loads all zones for a world generator. Iterates the zone registry from `FileLoadingContext`, loading each zone's `Zone.json` file via `ZoneJsonLoader`, and returns the complete `Zone[]` array.

## Hierarchy

- **Extends:** `Loader`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `load()` | `Zone[]` | Iterates the zone file context registry and loads each zone from its `Zone.json` file. |

## Inner Types

### Constants

*interface*

Constants: `PATH_ZONES` = `Zones`, `FILE_ZONE_MAIN_FILE` = `Zone.json`.

