---
title: "com.hypixel.hytale.server.core.universe.world.meta.state"
kind: "package"
package: "com.hypixel.hytale.server.core.universe.world.meta.state"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "world"
  - "block-state"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.meta.state`

Block state components for the ECS chunk store. Each type in this package implements `Component<ChunkStore>` and represents additional metadata attached to specific blocks in the world -- item containers, destroyable health, launch pads, respawn points, map markers, placement attribution, and network synchronization flags.

## Types

| Type | Kind | Description |
|---|---|---|
| [BlockMapMarker](BlockMapMarker.md) | class | Manages block-based map markers within a chunk. |
| [BlockMapMarkersResource](BlockMapMarkersResource.md) | class | Per-store resource aggregating block map markers. |
| [BreakValidatedBlockState](BreakValidatedBlockState.md) | class | Custom break validation for blocks. |
| [DestroyableBlockState](DestroyableBlockState.md) | class | Health-based destroyable block state. |
| [ItemContainerBlockState](ItemContainerBlockState.md) | class | Block-based item container (chests, barrels). |
| [ItemContainerState](ItemContainerState.md) | class | Base item container state with slot management. |
| [LaunchPad](LaunchPad.md) | class | Launch pad velocity configuration. |
| [MarkerBlockState](MarkerBlockState.md) | class | World marker block (spawn points, waypoints). |
| [PlacedByBlockState](PlacedByBlockState.md) | class | Tracks which player placed a block. |
| [RespawnBlock](RespawnBlock.md) | class | Respawn point block state. |
| [SendableBlockState](SendableBlockState.md) | class | Flag for client-synchronized block state. |
