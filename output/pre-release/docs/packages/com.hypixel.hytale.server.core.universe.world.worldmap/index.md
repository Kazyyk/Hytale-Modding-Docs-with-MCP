---
title: "com.hypixel.hytale.server.core.universe.world.worldmap"
kind: "package"
package: "com.hypixel.hytale.server.core.universe.world.worldmap"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldmap"
  - "world"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap`

In-game world map system responsible for asynchronous map image generation, caching, marker management (spawn, death, player, shared, POI), and player-visibility-based image lifecycle. Each world has a dedicated `WorldMapManager` running on its own ticking thread.

## Types

| Type | Kind | Description |
|---|---|---|
| [IWorldMap](IWorldMap.md) | interface | Generator interface for producing map images and points of interest. |
| [WorldMapLoadException](WorldMapLoadException.md) | class | Checked exception for world map loading failures. |
| [WorldMapManager](WorldMapManager.md) | class | Per-world manager handling image generation, caching, markers, and player visibility. |
| [WorldMapSettings](WorldMapSettings.md) | class | Configuration for map area, image scale, and view radius bounds. |
