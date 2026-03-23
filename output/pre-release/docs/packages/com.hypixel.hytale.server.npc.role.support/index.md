---
title: "com.hypixel.hytale.server.npc.role.support"
kind: "package"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "support"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

Support subsystems that compose the runtime state of an NPC `Role`. Each support class owns a distinct domain of responsibility (combat, debug, entity tracking, state machine, world interaction, etc.) and is instantiated by `Role` during construction from a `BuilderRole`. Together they implement the full NPC perception, targeting, navigation, and behavior state model.

## Types

| Type | Kind | Description |
|---|---|---|
| [CombatSupport](CombatSupport.md) | class | Manages NPC combat state: attack chains, friendly fire, damage group filtering. |
| [DebugSupport](DebugSupport.md) | class | Debug flag management, trace logging, and sensor visualization recording. |
| [EntityList](EntityList.md) | class | Distance-bucketed entity list for spatial queries over nearby players/NPCs. |
| [EntitySupport](EntitySupport.md) | class | Entity-level utilities: display names, motion step scheduling, sensor scope, delay tracking. |
| [MarkedEntitySupport](MarkedEntitySupport.md) | class | Named target slot system for tracking marked entities across behavior tree instructions. |
| [PositionCache](PositionCache.md) | class | Spatial perception cache: player/NPC lists, line-of-sight, dropped items, spawn markers. |
| [RoleStats](RoleStats.md) | class | Diagnostic tracking of sensor distance ranges and bucket configurations per role. |
| [StateSupport](StateSupport.md) | class | Behavior state machine: state/sub-state transitions, busy states, interactions, local state machines. |
| [WorldSupport](WorldSupport.md) | class | World interaction: attitude system, block sensors, search rays, environment/weather caching. |

- [DebugSupport.PathWaypointVisData](DebugSupport.PathWaypointVisData.md)
