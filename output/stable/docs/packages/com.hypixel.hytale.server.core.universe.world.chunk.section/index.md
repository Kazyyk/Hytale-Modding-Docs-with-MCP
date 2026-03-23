---
title: "com.hypixel.hytale.server.core.universe.world.chunk.section"
kind: "package"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "section"
  - "world"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section`

Chunk section data structures representing the 32x32x32 vertical subdivisions of a chunk column. Each section stores block data (via palette-based compression), fluid data, lighting data (octree-compressed), and ticking state.

## Types

| Type | Kind | Description |
|---|---|---|
| [BlockSection](BlockSection.md) | class | Block data, rotation, filler, ticking, and lighting for a 32x32x32 section. |
| [ChunkLightData](ChunkLightData.md) | class | Immutable octree-compressed lighting data with 4-channel RGBS support. |
| [ChunkLightDataBuilder](ChunkLightDataBuilder.md) | class | Mutable builder for constructing `ChunkLightData` octrees. |
| [FluidSection](FluidSection.md) | class | Fluid type and level data for a 32x32x32 section. |
| [ChunkSection](ChunkSection.md) | class | Anchor ECS component linking a section entity to its chunk column and coordinates. |
| [ChunkSectionReference](ChunkSectionReference.md) | class | Convenience holder binding a `BlockChunk`, `BlockSection`, and section index. |
