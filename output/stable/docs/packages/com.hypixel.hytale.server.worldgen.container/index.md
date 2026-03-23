---
title: "com.hypixel.hytale.server.worldgen.container"
kind: "package"
package: "com.hypixel.hytale.server.worldgen.container"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "container"
---

**Package:** `com.hypixel.hytale.server.worldgen.container`

Data containers for the procedural world generation pipeline. Each container holds configuration entries that drive a specific generation phase: terrain layers, cover placement, water bodies, environment mapping, prefabs, tint colors, and zone border fading.

## Types

| Type | Kind | Description |
|---|---|---|
| [CoverContainer](CoverContainer.md) | class | Container for world generation cover entries (surface decorations). |
| [EnvironmentContainer](EnvironmentContainer.md) | class | Container mapping world coordinates to environment IDs using noise-based weighted maps and coordinate conditions. |
| [FadeContainer](FadeContainer.md) | class | Container defining zone border fade parameters for world generation. |
| [LayerContainer](LayerContainer.md) | class | Container for terrain layer generation. |
| [PrefabContainer](PrefabContainer.md) | class | Container for prefab placement during world generation. |
| [TintContainer](TintContainer.md) | class | Container for biome tint color generation. |
| [UniquePrefabContainer](UniquePrefabContainer.md) | class | Container for unique (one-per-world) prefab placement. |
| [WaterContainer](WaterContainer.md) | class | Container for water body generation. |
