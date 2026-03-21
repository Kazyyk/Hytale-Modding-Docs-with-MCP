---
title: "com.hypixel.hytale.server.core.universe.world"
---

## Package `com.hypixel.hytale.server.core.universe.world`

Core world types for the Hytale server. This package contains the `World` class (a ticking thread managing chunks, entities, players, and map data), its configuration, and supporting utilities for blocks, particles, sound, spawning, and player notifications.

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [ClientEffectWorldSettings](ClientEffectWorldSettings.md) | class | Yes | Client-side sun, bloom, and sunshaft settings. |
| [IWorldChunks](IWorldChunks.md) | interface | Yes | Deprecated synchronous chunk access. |
| [IWorldChunksAsync](IWorldChunksAsync.md) | interface | Yes | Deprecated asynchronous chunk access. |
| [ParticleUtil](ParticleUtil.md) | class | No | Static particle spawning utilities. |
| [PlaceBlockSettings](PlaceBlockSettings.md) | class | No | Block placement bitfield flags. |
| [PlayerUtil](PlayerUtil.md) | class | No | Player iteration and broadcast utilities. |
| [SetBlockSettings](SetBlockSettings.md) | class | No | Block-set operation bitfield flags. |
| [SoundUtil](SoundUtil.md) | class | No | Sound event playback utilities. |
| [SpawnUtil](SpawnUtil.md) | class | No | Spawn transform application utilities. |
| [ValidationOption](ValidationOption.md) | enum | Yes | World validation subsystem options. |
| [World](World.md) | class | Yes | Central world class owning chunks, entities, and lifecycle. |
| [WorldConfig](WorldConfig.md) | class | Yes | World configuration (seed, spawn, gen, game mode, etc.). |
| [WorldConfigProvider](WorldConfigProvider.md) | interface | Yes | Strategy for loading/saving world config. |
| [WorldMapTracker](WorldMapTracker.md) | class | Yes | Per-player world map state tracker. |
| [WorldNotificationHandler](WorldNotificationHandler.md) | class | Yes | Block change notification broadcaster. |
| [WorldProvider](WorldProvider.md) | interface | Yes | Simple world reference provider. |
