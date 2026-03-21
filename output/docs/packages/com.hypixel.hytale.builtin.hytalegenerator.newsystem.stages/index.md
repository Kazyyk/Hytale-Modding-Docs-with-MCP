---
title: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages"
kind: "package"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "pipeline"
  - "stages"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages`

Pipeline stages for the new staged chunk generation system. Each stage implements the `NStage` interface, declaring input/output buffer types and bounds. Stages execute in sequence on worker threads, reading from and writing to typed buffer bundles. Includes biome assignment, biome distance computation, environment mapping, terrain density/material generation, prop placement, tint computation, and test stages.

## Types

| Type | Kind | Description |
|---|---|---|
| [NBiomeDistanceStage](NBiomeDistanceStage.md) | class | Computes per-pixel distance to nearest non-local biome edge. |
| [NBiomeStage](NBiomeStage.md) | class | Assigns biome IDs to pixel buffers from the world structure biome map. |
| [NEnvironmentStage](NEnvironmentStage.md) | class | Fills voxel buffers with environment IDs from biome environment providers. |
| [NPropStage](NPropStage.md) | class | Places props (vegetation, objects) based on biome, density, and position providers. |
| [NStage](NStage.md) | interface | Contract for all generation pipeline stages: run, input/output types, name. |
| [NTerrainStage](NTerrainStage.md) | class | Generates terrain density and material assignment with biome interpolation. |
| [NTestPropStage](NTestPropStage.md) | class | Test stage that places small vertical prop columns at random scan positions. |
| [NTestTerrainStage](NTestTerrainStage.md) | class | Test stage that generates simplex-noise-based terrain with a height cutoff. |
| [NTintStage](NTintStage.md) | class | Computes per-pixel tint values from biome tint providers. |
