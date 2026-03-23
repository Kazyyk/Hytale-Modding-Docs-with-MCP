---
title: "com.hypixel.hytale.server.npc.navigation"
kind: "package"
package: "com.hypixel.hytale.server.npc.navigation"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "navigation"
  - "pathfinding"
---

**Package:** `com.hypixel.hytale.server.npc.navigation`

A* pathfinding and path-following system for NPC navigation. Provides a half-block-grid A* implementation with 2D/3D support, configurable node limits, object pooling, motion controller integration, debug visualization, and a steering-based path follower with smoothing.

## Types

| Type | Kind | Description |
|---|---|---|
| [AStarBase](AStarBase.md) | class | Core A* pathfinding implementation. |
| [AStarDebugBase](AStarDebugBase.md) | class | Debug visualization helper for A* pathfinding. |
| [AStarDebugWithTarget](AStarDebugWithTarget.md) | class | Extended debug helper that includes the target position in map visualization and extra log output. |
| [AStarEvaluator](AStarEvaluator.md) | interface | Strategy interface for A* goal testing and heuristic estimation. |
| [AStarNode](AStarNode.md) | class | Node in the A* search graph. |
| [AStarNodePool](AStarNodePool.md) | interface | Object pool interface for A* nodes. |
| [AStarNodePoolProvider](AStarNodePoolProvider.md) | interface | Factory interface that returns an `AStarNodePool` for a given search direction count. |
| [AStarNodePoolProviderSimple](AStarNodePoolProviderSimple.md) | class | Simple pool provider implementing both `AStarNodePoolProvider` and `Resource<EntityStore>`. |
| [AStarNodePoolSimple](AStarNodePoolSimple.md) | class | List-backed node pool implementation. |
| [AStarWithTarget](AStarWithTarget.md) | class | A* implementation extended with a target position. |
| [IWaypoint](IWaypoint.md) | interface | Interface for path waypoints. |
| [PathFollower](PathFollower.md) | class | Steers an entity along a waypoint path. |
