---
title: "com.hypixel.hytale.builtin.path"
kind: "package"
package: "com.hypixel.hytale.builtin.path"
fqcn: "com.hypixel.hytale.builtin.path"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "path"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.path`

Path and patrol system plugin. Manages prefab-based patrol paths for NPCs, including spatial indexing, waypoint lifecycle, and integration with the prefab paste system.

## Types

| Type | Kind | Description |
|---|---|---|
| [PathPlugin](PathPlugin.md) | class | Main plugin registering path systems and commands. |
| [PathSpatialSystem](PathSpatialSystem.md) | class | Spatial indexing system for path markers. |
| [PrefabPathCollection](PrefabPathCollection.md) | class | Collection of prefab paths in a worldgen context. |
| [PrefabPathSystems](PrefabPathSystems.md) | class | ECS systems for path marker lifecycle. |
| [WorldPathBuilder](WorldPathBuilder.md) | class | Component for path construction state. |
| [WorldPathData](WorldPathData.md) | class | Resource holding all prefab path data. |
