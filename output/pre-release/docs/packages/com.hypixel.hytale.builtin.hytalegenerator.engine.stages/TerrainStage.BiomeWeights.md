---
title: "TerrainStage.BiomeWeights"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages.TerrainStage.BiomeWeights"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "stages"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.stages`

```java
private static class TerrainStage.BiomeWeights
```

Holds a list of biome weight entries used during density blending in [TerrainStage](TerrainStage.md). Each entry maps a biome ID to a normalized weight derived from circle-curve area calculations.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [TerrainStage.BiomeWeights.Entry](TerrainStage.BiomeWeights.Entry.md) | class | Single biome weight entry |

## Fields

| Modifier | Type | Name |
|---|---|---|
| | `List<TerrainStage.BiomeWeights.Entry>` | `entries` |
