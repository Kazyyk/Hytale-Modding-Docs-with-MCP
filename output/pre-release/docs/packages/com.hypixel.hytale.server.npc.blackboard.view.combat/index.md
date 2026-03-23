---
title: "com.hypixel.hytale.server.npc.blackboard.view.combat"
kind: "package"
package: "com.hypixel.hytale.server.npc.blackboard.view.combat"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.combat"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "blackboard"
  - "combat"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.combat`

NPC blackboard combat view subsystem. Interprets active interaction chains to produce structured combat data (attack type, charging state, melee/ranged/block status) used by NPC AI decision-making.

## Types

| Type | Kind | Description |
|---|---|---|
| [CombatViewSystems](CombatViewSystems.md) | class | Container for ECS systems that manage per-entity combat data interpretation. |
| [InterpretedCombatData](InterpretedCombatData.md) | class | Mutable data object holding interpreted combat state for a single active attack interaction. |
