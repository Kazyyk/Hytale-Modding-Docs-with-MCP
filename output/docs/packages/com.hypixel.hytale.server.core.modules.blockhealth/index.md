---
title: "com.hypixel.hytale.server.core.modules.blockhealth"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.blockhealth"
fqcn: "com.hypixel.hytale.server.core.modules.blockhealth"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blockhealth"
  - "damage"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.blockhealth`

Block health and damage system. Tracks per-block health state within chunks, handles damage application with network sync, time-delayed regeneration (0.1 HP/sec after 5s), and temporary block fragility after placement.

## Types

| Type | Kind | Description |
|---|---|---|
| [BlockHealthModule](BlockHealthModule.md) | class | Core plugin registering the block health component and ECS systems. |
| [BlockHealthChunk](BlockHealthChunk.md) | class | ChunkStore component tracking per-block health and fragility maps. |
| [BlockHealth](BlockHealth.md) | class | Per-block health state with damage time tracking. |
| [FragileBlock](FragileBlock.md) | class | Per-block fragility timer tracking. |
