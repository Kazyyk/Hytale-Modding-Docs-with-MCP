---
title: "spawning"
kind: "index"
package: "com.hypixel.hytale.server.spawning"
fqcn: "com.hypixel.hytale.server.spawning"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "spawning"
  - "index"
---

**Package:** `com.hypixel.hytale.server.spawning`

Core spawning system types for the root `server.spawning` package. Includes interfaces for spawnable entities, the central spawn position validation context, the spawning plugin, and result/rejection enums.

## Types

| Type | Kind | Description |
|---|---|---|
| [ISpawnable](ISpawnable.md) | interface | Contract for entities that can be spawned via the spawning system. Requires an i... |
| [ISpawnableWithModel](ISpawnableWithModel.md) | interface | Extension of [ISpawnable](ISpawnable.md) that adds model-related spawn requireme... |
| [LoadedNPCEvent](LoadedNPCEvent.md) | class | Event fired when an NPC builder info is loaded and confirmed to be spawnable. Va... |
| [SpawningContext](SpawningContext.md) | class | Central position validation mechanism shared by all spawn modes (world spawning,... |
| [SpawningPlugin](SpawningPlugin.md) | class | Central plugin managing all NPC spawning: world-based environment spawning, beac... |
| [SpawnRejection](SpawnRejection.md) | enum | Reasons why a spawn attempt was rejected during position validation.... |
| [SpawnTestResult](SpawnTestResult.md) | enum | Result codes returned by [SpawningContext](SpawningContext.md) spawn validation ... |
