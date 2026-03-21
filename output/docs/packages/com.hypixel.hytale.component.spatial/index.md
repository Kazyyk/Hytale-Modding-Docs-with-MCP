---
title: "com.hypixel.hytale.component.spatial"
kind: "package"
package: "com.hypixel.hytale.component.spatial"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "ecs"
  - "spatial"
  - "query"
---

**Package:** `com.hypixel.hytale.component.spatial`

Spatial indexing and query infrastructure for the ECS framework. Provides a k-d tree-based spatial index that is rebuilt each tick from entity positions, enabling efficient nearest-neighbor, radius, cylinder, and box queries. Uses Morton code (Z-order curve) sorting for cache-friendly tree construction.

## Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [SpatialStructure](SpatialStructure.md) | interface | yes | Spatial index interface with query operations. |
| [SpatialData](SpatialData.md) | class | yes | Parallel-array storage for entity positions and data. |
| [SpatialResource](SpatialResource.md) | class | yes | ECS resource holding the spatial index for a store. |
| [KDTree](KDTree.md) | class | no | K-d tree implementation with pooled nodes. |
| [MortonCode](MortonCode.md) | class | no | 3D Morton code computation for spatial sorting. |
| [SpatialSystem](SpatialSystem.md) | class | no | Abstract ticking system that rebuilds the spatial index. |
