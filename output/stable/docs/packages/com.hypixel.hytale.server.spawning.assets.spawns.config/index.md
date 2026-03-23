---
title: "com.hypixel.hytale.server.spawning.assets.spawns.config"
kind: "package"
package: "com.hypixel.hytale.server.spawning.assets.spawns.config"
fqcn: "com.hypixel.hytale.server.spawning.assets.spawns.config"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "spawning"
  - "config"
  - "npc"
---

**Package:** `com.hypixel.hytale.server.spawning.assets.spawns.config`

NPC spawn configuration assets defining how NPCs are spawned in the world. Supports beacon-based spawns (at fixed prefab locations) and world-level spawns (biome-driven ambient spawning), with configurable group sizes, cooldowns, time-of-day restrictions, spawn suppression, and role parameters.

## Types

| Type | Kind | Description |
|---|---|---|
| [NPCSpawn](NPCSpawn.md) | class | Abstract base for NPC spawn configurations. |
| [BeaconNPCSpawn](BeaconNPCSpawn.md) | class | NPC spawn configuration for beacon-based spawning at fixed prefab locations. |
| [RoleSpawnParameters](RoleSpawnParameters.md) | class | Configuration for role-specific spawn parameters. |
| [WorldNPCSpawn](WorldNPCSpawn.md) | class | NPC spawn configuration for world-level ambient spawning. |
