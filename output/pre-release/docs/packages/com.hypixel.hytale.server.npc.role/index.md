---
title: "com.hypixel.hytale.server.npc.role"
kind: "package"
package: "com.hypixel.hytale.server.npc.role"
fqcn: "com.hypixel.hytale.server.npc.role"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "behavior"
---

**Package:** `com.hypixel.hytale.server.npc.role`

Root package for NPC role runtime. A `Role` is the central runtime object attached to each NPC, owning all behavior support subsystems, the instruction tree (behavior tree), motion controllers, steering state, and configuration derived from the JSON role asset. This package also contains debug display/flag infrastructure, inventory utility methods, and the spawn effect interface.

## Types

| Type | Kind | Description |
|---|---|---|
| [Role](Role.md) | class | Central NPC runtime: owns all support subsystems, behavior tree, motion controllers, and steering. |
| [Role.SeparationMode](Role.SeparationMode.md) | enum | Separation behaviour mode for NPC movement within a Role. |
| [RoleDebugDisplay](RoleDebugDisplay.md) | class | Renders debug information (state, flock, HP, speed, targets) into NPC nameplates. |
| [RoleDebugFlags](RoleDebugFlags.md) | enum | 35 debug flags controlling trace logging, visualization, and display overlays. |
| [RoleUtils](RoleUtils.md) | class | Static utility methods for NPC inventory management (hotbar, off-hand, armor). |
| [SpawnEffect](SpawnEffect.md) | interface | Contract for spawning particle effects at NPC spawn positions. |
