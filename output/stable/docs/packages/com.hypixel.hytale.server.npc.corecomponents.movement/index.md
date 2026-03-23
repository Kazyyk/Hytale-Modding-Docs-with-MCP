---
title: "movement"
kind: "index"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "movement"
  - "index"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.movement`

Movement NPC core components -- actions, body motions, and sensors for NPC pathfinding, wandering, flying, fleeing, and movement state detection.

## Types

| Type | Kind | Description |
|---|---|---|
| [ActionCrouch](ActionCrouch.md) | class | Toggles the NPC's crouching state via `MovementStatesComponent`. Sets `movementS... |
| [ActionOverrideAltitude](ActionOverrideAltitude.md) | class | Overrides the NPC's target altitude for flying by setting `desiredAltitudeOverri... |
| [ActionRecomputePath](ActionRecomputePath.md) | class | Forces the NPC's active motion controller to recompute its current path by setti... |
| [BodyMotionFind](BodyMotionFind.md) | class | Pathfinds to a sensor-provided target position using A* navigation. Core pursue ... |
| [BodyMotionFindBase](BodyMotionFindBase.md) | class | Abstract base class for pathfinding motions with A* integration. Manages the pat... |
| [BodyMotionFindWithTarget](BodyMotionFindWithTarget.md) | class | Extension of `BodyMotionFindBase` that tracks a target entity reference. Monitor... |
| [BodyMotionLand](BodyMotionLand.md) | class | Lands a flying NPC on the ground. Extends `BodyMotionFind` with a goal lenience ... |
| [BodyMotionLeave](BodyMotionLeave.md) | class | Moves the NPC away from a position using A* pathfinding. Goal is reached when th... |
| [BodyMotionMaintainDistance](BodyMotionMaintainDistance.md) | class | Maintains a specific distance from a target entity. Combines pursue and evade st... |
| [BodyMotionMatchLook](BodyMotionMatchLook.md) | class | Rotates the NPC body to match its head look direction. Reads the yaw from `HeadR... |
| [BodyMotionMoveAway](BodyMotionMoveAway.md) | class | Flees from a target position using pathfinding and evade steering. Supports conf... |
| [BodyMotionTakeOff](BodyMotionTakeOff.md) | class | Launches a grounded NPC into the air for flying. Applies an upward velocity impu... |
| [BodyMotionTeleport](BodyMotionTeleport.md) | class | Teleports the NPC to a sensor-provided position with configurable offset range a... |
| [BodyMotionWander](BodyMotionWander.md) | class | Random wandering within the NPC's leash radius. Picks random positions within th... |
| [BodyMotionWanderBase](BodyMotionWanderBase.md) | class | Abstract base for wandering behaviors. Extends `BodyMotionFindBase` with configu... |
| [BodyMotionWanderInCircle](BodyMotionWanderInCircle.md) | class | Wanders in a circular pattern around the NPC's leash point. Constrains wander ta... |
| [BodyMotionWanderInRect](BodyMotionWanderInRect.md) | class | Wanders in a rectangular region around the NPC's leash point. Constrains wander ... |
| [SensorInAir](SensorInAir.md) | class | Detects if the NPC is airborne by checking the movement states component for `in... |
| [SensorMotionController](SensorMotionController.md) | class | Checks the active motion controller type against a configured type string. Match... |
| [SensorNav](SensorNav.md) | class | Checks the NPC's navigation state against a configured `NavState` value. Used to... |
| [SensorOnGround](SensorOnGround.md) | class | Detects if the NPC is standing on ground by checking the movement states compone... |
