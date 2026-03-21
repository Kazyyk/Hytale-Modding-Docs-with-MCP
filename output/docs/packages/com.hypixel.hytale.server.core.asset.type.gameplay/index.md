---
title: "com.hypixel.hytale.server.core.asset.type.gameplay"
kind: "package"
package: "com.hypixel.hytale.server.core.asset.type.gameplay"
fqcn: "com.hypixel.hytale.server.core.asset.type.gameplay"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "config"
  - "gameplay"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.gameplay`

Gameplay configuration asset types defining server-side game rules. Covers combat, crafting, death, gathering, item durability, player settings, respawn, spawn, sleep, camera effects, world, and world map configurations. Most types are loaded from JSON via codec builders.

## Types

| Type | Kind | Description |
|---|---|---|
| [BrokenPenalties](BrokenPenalties.md) | class | Configures penalty multipliers applied when tools, armor, or weapons are broken. |
| [CameraEffectsConfig](CameraEffectsConfig.md) | class | Maps `DamageCause` values to `CameraEffect` indices. |
| [CombatConfig](CombatConfig.md) | class | Combat system configuration including attack reach, knockback strength, invulnerability duration, PvP toggles, fall damage settings, healing rate, and combat-related timings. |
| [CraftingConfig](CraftingConfig.md) | class | Crafting system configuration including the crafting result slot index and recipe book availability flag. |
| [DeathConfig](DeathConfig.md) | class | Death system configuration controlling item drop behavior, experience retention, and death message visibility. |
| [GameplayConfig](GameplayConfig.md) | class | Top-level gameplay configuration asset that aggregates all sub-configs (combat, crafting, death, gathering, player, respawn, spawn, world, etc. |
| [GatheringConfig](GatheringConfig.md) | class | Gathering system configuration for block breaking, including break speed multiplier, tool requirement mode, and whether tool durability is consumed. |
| [GatheringEffectsConfig](GatheringEffectsConfig.md) | class | Configuration for visual and audio effects during gathering. |
| [ItemDurabilityConfig](ItemDurabilityConfig.md) | class | Item durability configuration including broken-tool penalties and the durability damage multiplier. |
| [PlayerConfig](PlayerConfig.md) | class | Player-specific configuration including health, stamina, sprint, jump, fall damage, encumbrance, and interaction reach settings. |
| [RespawnConfig](RespawnConfig.md) | class | Respawn configuration controlling the respawn timer duration and spectator mode toggle during respawn. |
| [SleepConfig](SleepConfig.md) | class | Sleep system configuration controlling the required player percentage for sleeping and the time-skip speed. |
| [SpawnConfig](SpawnConfig.md) | class | Spawn point configuration including the spawn type (world spawn, bed, or custom) and spawn radius. |
| [WorldConfig](WorldConfig.md) | class | World-level configuration including daylight cycle duration, time pause state, moon phase, and starting day time. |
| [WorldMapConfig](WorldMapConfig.md) | class | World map configuration controlling map visibility, update intervals, and which entity types are tracked on the map. |
