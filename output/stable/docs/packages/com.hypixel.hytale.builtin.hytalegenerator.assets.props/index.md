---
title: "com.hypixel.hytale.builtin.hytalegenerator.assets.props"
kind: "package"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.props"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.props"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "prop"
  - "asset"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.props`

Prop asset definitions for the Hytale world generator. Props are structures placed during terrain generation, supporting box fills, cluster placement, column extrusion, density-driven placement, imported prefabs, offset transforms, pond filling, queued sequences, unions, and weighted random selection.

## Types

| Type | Kind | Description |
|---|---|---|
| [PropAsset](PropAsset.md) | class | Abstract base for all prop assets. |
| [BoxPropAsset](BoxPropAsset.md) | class | Places a filled box of blocks at the prop origin. |
| [ClusterPropAsset](ClusterPropAsset.md) | class | Places clusters of a delegate prop around the origin point, controlled by cluster size and spacing parameters. |
| [ColumnPropAsset](ColumnPropAsset.md) | class | Extrudes a column of blocks vertically from the prop origin, using a material provider for block selection. |
| [DensityPropAsset](DensityPropAsset.md) | class | Places props based on a density field, only generating in positions where the density exceeds a threshold. |
| [ImportedPropAsset](ImportedPropAsset.md) | class | References a prop exported by another asset via its name. |
| [NoPropAsset](NoPropAsset.md) | class | A no-op prop that places nothing. |
| [OffsetPropAsset](OffsetPropAsset.md) | class | Wraps a delegate prop with a spatial offset, shifting its placement position. |
| [PondFillerPropAsset](PondFillerPropAsset.md) | class | Fills depressions in terrain with a material to create ponds, controlled by depth and fill parameters. |
| [QueuePropAsset](QueuePropAsset.md) | class | Applies a sequence of props in order at the same location. |
| [UnionPropAsset](UnionPropAsset.md) | class | Combines multiple props into a union, placing all of them at the prop origin. |
| [WeightedPropAsset](WeightedPropAsset.md) | class | Selects a prop randomly from a weighted list, with an optional skip chance and seed for deterministic randomness. |
