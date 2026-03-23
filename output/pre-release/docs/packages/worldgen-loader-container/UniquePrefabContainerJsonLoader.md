---
title: "UniquePrefabContainerJsonLoader"
kind: class
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.UniquePrefabContainerJsonLoader"
api_surface: "public"
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["worldgen", "loader", "json"]
---

Loads `UniquePrefabContainer` zone-level unique prefab definitions from JSON. Unique prefabs are named, categorized structures placed once per zone using configuration-driven placement rules.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `load()` | `UniquePrefabContainer` | Returns a `UniquePrefabContainer` with an array of `UniquePrefabGenerator` instances. |

## Inner Types

### UniquePrefabGeneratorJsonLoader

*static class*

Loads individual unique prefab generators with name, category, weighted prefab map, and unique placement configuration.

### Constants

*interface*

JSON key constants: `Entries`, `Config`, `Prefab`, `Weights`, `Name`.

