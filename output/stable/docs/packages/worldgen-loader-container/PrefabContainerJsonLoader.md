---
title: "PrefabContainerJsonLoader"
kind: class
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.PrefabContainerJsonLoader"
api_surface: "public"
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["worldgen", "loader", "json"]
---

Loads `PrefabContainer` biome prefab placement definitions from JSON. Each entry associates a weighted prefab map with a pattern generator and optional environment override.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `load()` | `PrefabContainer` | Returns a `PrefabContainer` with all prefab entries. |
| `loadEntries()` | `PrefabContainer.PrefabContainerEntry[]` | Loads the `Entries` array of prefab container entries. |

## Inner Types

### PrefabContainerEntryJsonLoader

*static class*

Loads individual prefab entries with weighted prefab maps, pattern generators, and environment overrides.

### Constants

*interface*

JSON key constants: `Entries`, `Prefab`, `Weight`, `Pattern`, `Environment`.

