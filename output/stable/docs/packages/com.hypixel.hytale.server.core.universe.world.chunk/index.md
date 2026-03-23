---
title: "com.hypixel.hytale.server.core.universe.world.chunk"
kind: "package"
package: "com.hypixel.hytale.server.core.universe.world.chunk"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "world"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk`

Core chunk data structures for the world system. A chunk column (32x320x32 blocks) is represented as an ECS entity in the `ChunkStore` with several components: `WorldChunk` (lifecycle, flags, block access), `BlockChunk` (block data, heightmap, tint, environments), `BlockComponentChunk` (per-block ECS entities like block states), `EntityChunk` (world entities), and `ChunkColumn` (vertical section management).

## Types

| Type | Kind | Description |
|---|---|---|
| [WorldChunk](WorldChunk.md) | class | Primary chunk component providing lifecycle management and block access. |
| [BlockChunk](BlockChunk.md) | class | Block data storage with heightmap, tint, environment, and section management. |
| [BlockComponentChunk](BlockComponentChunk.md) | class | Per-block ECS entity storage for block states and block-level components. |
| [EntityChunk](EntityChunk.md) | class | World entity storage for entities associated with a chunk column. |
| [ChunkColumn](ChunkColumn.md) | class | Vertical subdivision managing 10 section references. |
| [AbstractCachedAccessor](AbstractCachedAccessor.md) | abstract class | Base for cached multi-chunk/section accessor patterns. |
| [BlockRotationUtil](BlockRotationUtil.md) | class | Utility for computing rotated and flipped block orientations. |
| [ChunkFlag](ChunkFlag.md) | enum | Lifecycle flags for chunk state management. |
