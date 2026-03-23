---
title: "com.hypixel.hytale.server.core.modules.entity.teleport"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.entity.teleport"
fqcn: "com.hypixel.hytale.server.core.modules.entity.teleport"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "modules"
  - "entity"
  - "teleport"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.teleport`

Entity teleportation system. Provides components for pending and completed teleports, teleport history recording, and ECS systems for processing teleport requests.

## Types

| Type | Kind | Description |
|---|---|---|
| [PendingTeleport](PendingTeleport.md) | class | Component for a pending teleport request |
| [Teleport](Teleport.md) | class | Component for a teleport being processed |
| [TeleportRecord](TeleportRecord.md) | class | Component recording teleport history |
| [TeleportSystems](TeleportSystems.md) | class | ECS systems for teleport lifecycle |
