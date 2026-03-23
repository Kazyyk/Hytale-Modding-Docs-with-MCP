---
title: "TerrainStage.ColumnData"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages.TerrainStage.ColumnData"
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
private class TerrainStage.ColumnData
```

Computes per-voxel depth and space metrics for a single (x, z) column during material generation in [TerrainStage](TerrainStage.md). Scans from top to bottom to compute `depthIntoFloor` (consecutive solid voxels from surface) and `spaceAboveFloor`, then from bottom to top for `depthIntoCeiling` and `spaceBelowCeiling`. These metrics feed into the `MaterialProvider.Context` for material selection.

## Fields

| Modifier | Type | Name |
|---|---|---|
| | `int` | `worldX` |
| | `int` | `worldZ` |
| | `MaterialProvider<Material>` | `materialProvider` |
| | `int` | `topExclusive` |
| | `int` | `bottom` |
| | `int` | `arrayLength` |
| | `int[]` | `depthIntoFloor` |
| | `int[]` | `spaceBelowCeiling` |
| | `int[]` | `depthIntoCeiling` |
| | `int[]` | `spaceAboveFloor` |
| | `int` | `top` |
| | `FloatContainer3d` | `densityBuffer` |

## Constructors

| Modifier | Signature |
|---|---|
| | `ColumnData(int bottom, int topExclusive, @Nonnull FloatContainer3d densityBuffer)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `void` | `resolve(int worldX, int worldZ, @Nonnull MaterialProvider<Material> materialProvider)` |
