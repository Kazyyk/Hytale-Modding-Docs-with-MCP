---
title: "com.hypixel.hytale.server.npc.corecomponents.movement.builders"
kind: "package"
package: "com.hypixel.hytale.server.npc.corecomponents.movement.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.builders"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "corecomponents"
  - "movement"
  - "builders"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.movement.builders`

Builder classes for NPC movement behavior tree nodes. Provides configurable builders for actions (crouch, override altitude, recompute path), body motions (find/chase, land, leave, maintain distance, match look, move away, take off, teleport, wander variants), and sensors (in-air, on-ground, motion controller, navigation state).

## Types

| Type | Kind | Description |
|---|---|---|
| [BuilderActionCrouch](BuilderActionCrouch.md) | class | Builder for NPC crouch action |
| [BuilderActionOverrideAltitude](BuilderActionOverrideAltitude.md) | class | Builder for flying NPC altitude override |
| [BuilderActionRecomputePath](BuilderActionRecomputePath.md) | class | Builder for path recomputation action |
| [BuilderBodyMotionFind](BuilderBodyMotionFind.md) | class | Builder for chase-target pathfinding motion |
| [BuilderBodyMotionFindBase](BuilderBodyMotionFindBase.md) | class | Abstract base for pathfinding body motions |
| [BuilderBodyMotionFindWithTarget](BuilderBodyMotionFindWithTarget.md) | class | Abstract base with target tracking params |
| [BuilderBodyMotionLand](BuilderBodyMotionLand.md) | class | Builder for landing motion |
| [BuilderBodyMotionLeave](BuilderBodyMotionLeave.md) | class | Builder for leave-place pathfinding motion |
| [BuilderBodyMotionMaintainDistance](BuilderBodyMotionMaintainDistance.md) | class | Builder for distance-maintaining motion |
| [BuilderBodyMotionMatchLook](BuilderBodyMotionMatchLook.md) | class | Builder for body-to-look rotation matching |
| [BuilderBodyMotionMoveAway](BuilderBodyMotionMoveAway.md) | class | Builder for fleeing motion with erratic behavior |
| [BuilderBodyMotionTakeOff](BuilderBodyMotionTakeOff.md) | class | Builder for walk-to-fly transition |
| [BuilderBodyMotionTeleport](BuilderBodyMotionTeleport.md) | class | Builder for NPC teleportation |
| [BuilderBodyMotionWander](BuilderBodyMotionWander.md) | class | Builder for random linear wandering |
| [BuilderBodyMotionWanderBase](BuilderBodyMotionWanderBase.md) | class | Abstract base for wander motions |
| [BuilderBodyMotionWanderInCircle](BuilderBodyMotionWanderInCircle.md) | class | Builder for circular area wandering |
| [BuilderBodyMotionWanderInRect](BuilderBodyMotionWanderInRect.md) | class | Builder for rectangular area wandering |
| [BuilderSensorInAir](BuilderSensorInAir.md) | class | Builder for not-on-ground sensor |
| [BuilderSensorMotionController](BuilderSensorMotionController.md) | class | Builder for motion controller state sensor |
| [BuilderSensorNav](BuilderSensorNav.md) | class | Builder for navigation state sensor |
| [BuilderSensorOnGround](BuilderSensorOnGround.md) | class | Builder for on-ground sensor |
