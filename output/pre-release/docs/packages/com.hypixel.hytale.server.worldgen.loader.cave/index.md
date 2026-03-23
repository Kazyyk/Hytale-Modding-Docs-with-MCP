---
title: "com.hypixel.hytale.server.worldgen.loader.cave"
kind: "package"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "loader"
  - "json"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

JSON loading infrastructure for the cave generation system. Provides loaders for the full cave configuration hierarchy: cave generators, cave types, node types, child entries, cover entries, prefab containers, biome masks, and fluid levels. All loaders extend `JsonLoader` and produce the corresponding domain objects.

## Types

| Type | Kind | Description |
|---|---|---|
| [CaveBiomeMaskJsonLoader](CaveBiomeMaskJsonLoader.md) | class | Loads cave biome mask conditions with generate/populate/terminate flags. |
| [CaveGeneratorJsonLoader](CaveGeneratorJsonLoader.md) | class | Top-level loader reading `Caves.json` to construct a `CaveGenerator`. |
| [CaveNodeChildEntryJsonLoader](CaveNodeChildEntryJsonLoader.md) | class | Loads child node entries with weighted types, anchors, orientation modifiers. |
| [CaveNodeCoverEntryJsonLoader](CaveNodeCoverEntryJsonLoader.md) | class | Loads cover (floor/ceiling decoration) entries with conditions and weights. |
| [CaveNodeTypeJsonLoader](CaveNodeTypeJsonLoader.md) | class | Loads cave node types with shape, filling, covers, children, and conditions. |
| [CaveNodeTypeStorage](CaveNodeTypeStorage.md) | class | Registry caching loaded node types with lazy file-based loading. |
| [CavePrefabConfigJsonLoader](CavePrefabConfigJsonLoader.md) | class | Loads prefab placement config: rotations, masks, iterations, displacement. |
| [CavePrefabContainerJsonLoader](CavePrefabContainerJsonLoader.md) | class | Loads prefab containers with entry arrays. |
| [CavePrefabEntryJsonLoader](CavePrefabEntryJsonLoader.md) | class | Loads individual prefab entries with weighted prefabs and config. |
| [CaveTypeJsonLoader](CaveTypeJsonLoader.md) | class | Loads complete cave types with all parameters and conditions. |
| [CaveTypesJsonLoader](CaveTypesJsonLoader.md) | class | Loads the "Types" array from `Caves.json` into `CaveType[]`. |
| [FluidLevelJsonLoader](FluidLevelJsonLoader.md) | class | Loads cave fluid level configuration (type, level, height). |

- [CaveGeneratorJsonLoader.Constants](CaveGeneratorJsonLoader.Constants.md)
