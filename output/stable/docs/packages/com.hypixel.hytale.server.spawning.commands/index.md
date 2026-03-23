---
title: "com.hypixel.hytale.server.spawning.commands"
kind: "package"
package: "com.hypixel.hytale.server.spawning.commands"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "spawning"
  - "command"
---

**Package:** `com.hypixel.hytale.server.spawning.commands`

Server commands for managing the NPC spawning system. Provides the `/spawning` command tree with subcommands for enabling/disabling spawning, managing beacons and markers, repopulating worlds, viewing statistics, and configuring spawn suppression zones.

## Types

| Type | Kind | Description |
|---|---|---|
| [SpawnCommand](SpawnCommand.md) | class | Top-level `/spawning` command collection. |
| [SpawnBeaconsCommand](SpawnBeaconsCommand.md) | class | Subcommand collection for managing spawn beacons. |
| [SpawnMarkersCommand](SpawnMarkersCommand.md) | class | Subcommand collection for managing spawn markers. |
| [SpawnPopulateCommand](SpawnPopulateCommand.md) | class | Subcommand that removes all tracked NPCs (optionally filtered by environment) and re-enables NPC spawning to repopulate the world. |
| [SpawnStatsCommand](SpawnStatsCommand.md) | class | Subcommand that logs detailed spawning statistics: per-environment NPC expected vs actual counts, spawn rejection breakdowns, spawn marker counts per type, and role distributions. |
| [SpawnSuppressionCommand](SpawnSuppressionCommand.md) | class | Subcommand collection for spawn suppression zones. |
