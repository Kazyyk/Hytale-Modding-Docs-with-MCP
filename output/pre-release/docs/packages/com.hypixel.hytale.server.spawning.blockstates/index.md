---
title: "com.hypixel.hytale.server.spawning.blockstates"
package: "com.hypixel.hytale.server.spawning.blockstates"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.server.spawning.blockstates`

This package implements block state types and ECS systems for spawn marker blocks, which place and manage spawn marker entities tied to specific block positions.

## Classes

| Type | Description |
|---|---|
| [SpawnMarkerBlockReference](SpawnMarkerBlockReference.md) | ECS component linking an entity back to its originating spawn marker block position |
| `SpawnMarkerBlockState` | Block state for spawn marker blocks |
| [SpawnMarkerBlockStateSystems](SpawnMarkerBlockStateSystems.md) | Container for ECS systems managing spawn marker block state lifecycle: creating marker entities when blocks are placed and cleaning up when blocks or markers are removed |

- [SpawnMarkerBlock.Data](SpawnMarkerBlock.Data.md)
- [SpawnMarkerBlockStateSystems.TickHeartbeat](SpawnMarkerBlockStateSystems.TickHeartbeat.md)
