---
title: "com.hypixel.hytale.server.core.modules.entity.repulsion"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.entity.repulsion"
fqcn: "com.hypixel.hytale.server.core.modules.entity.repulsion"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "modules"
  - "entity"
  - "repulsion"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.repulsion`

Entity repulsion system. Provides configurable force-based repulsion between entities using spatial queries, with network synchronization through the entity tracker.

## Types

| Type | Kind | Description |
|---|---|---|
| [Repulsion](Repulsion.md) | class | ECS component storing a repulsion config index for an entity |
| [RepulsionConfig](RepulsionConfig.md) | class | Asset-backed repulsion configuration defining radius, minimu |
| [RepulsionConfigPacketGenerator](RepulsionConfigPacketGenerator.md) | class | Generates `UpdateRepulsionConfig` packets for asset synchron |
| [RepulsionSystems](RepulsionSystems.md) | class | Container for repulsion ECS systems: entity tracker update/r |
