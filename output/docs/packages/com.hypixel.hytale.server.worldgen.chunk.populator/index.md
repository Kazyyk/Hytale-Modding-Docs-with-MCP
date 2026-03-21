---
title: "com.hypixel.hytale.server.worldgen.chunk.populator"
kind: "package"
package: "com.hypixel.hytale.server.worldgen.chunk.populator"
fqcn: "com.hypixel.hytale.server.worldgen.chunk.populator"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "chunk"
  - "populator"
---

**Package:** `com.hypixel.hytale.server.worldgen.chunk.populator`

Chunk population phases for world generation. Each populator fills a specific aspect of a chunk: terrain blocks, cave carving, water/fluid placement, and prefab structures. Called in sequence during `ChunkGeneratorExecution`.

## Types

| Type | Kind | Description |
|---|---|---|
| [BlockPopulator](BlockPopulator.md) | class | Fills terrain blocks from height thresholds, layers, and cover containers. |
| [CavePopulator](CavePopulator.md) | class | Carves caves and places cave prefabs from zone cave generators. |
| [PrefabPopulator](PrefabPopulator.md) | class | Places biome-defined prefab structures with conflict resolution. |
| [WaterPopulator](WaterPopulator.md) | class | Fills water and fluid blocks from biome water containers. |
