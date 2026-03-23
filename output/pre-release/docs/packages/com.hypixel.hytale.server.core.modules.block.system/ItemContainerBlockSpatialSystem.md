---
title: "ItemContainerBlockSpatialSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block.system"
fqcn: "com.hypixel.hytale.server.core.modules.block.system.ItemContainerBlockSpatialSystem"
api_surface: false
extends: "SpatialSystem<ChunkStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:59Z"
tags:
  - "block"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.block.system`

```java
public class ItemContainerBlockSpatialSystem extends SpatialSystem<ChunkStore>
```

Spatial system that maintains a KD-tree index of block entities that have an `ItemContainerBlock` component. Only rebuilds the index when `BlockStateInfoNeedRebuild` is flagged. Computes world positions from `BlockStateInfo` chunk reference and block index.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Vector3d` | `getPosition(ArchetypeChunk<ChunkStore> archetypeChunk, int index)` |
| `public` | `Query<ChunkStore>` | `getQuery()` |

## Relationships

- Extends `SpatialSystem<ChunkStore>`
- Queries for [ItemContainerBlock](../com.hypixel.hytale.server.core.modules.block.components/ItemContainerBlock.md)
