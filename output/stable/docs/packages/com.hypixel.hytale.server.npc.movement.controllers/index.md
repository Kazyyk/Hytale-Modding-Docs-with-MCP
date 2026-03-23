---
title: "com.hypixel.hytale.server.npc.movement.controllers"
kind: "package"
package: "com.hypixel.hytale.server.npc.movement.controllers"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "movement"
  - "controllers"
---

**Package:** `com.hypixel.hytale.server.npc.movement.controllers`

This package implements the NPC motion controller system. It provides three concrete locomotion modes -- walking, flying, and diving/swimming -- all unified behind the [MotionController](MotionController.md) interface. Each controller handles collision detection, velocity computation, steering integration, and movement state management for its locomotion type. A companion `builders` sub-package supplies the JSON-driven builder classes that construct controllers from NPC role configuration.

All types in this package are internal (`api_surface: false`). They are not part of the public plugin API.

## Architecture

The controller hierarchy follows the pattern: [MotionController](MotionController.md) (interface) -> [MotionControllerBase](MotionControllerBase.md) (abstract base) -> concrete controllers ([MotionControllerWalk](MotionControllerWalk.md), [MotionControllerFly](MotionControllerFly.md), [MotionControllerDive](MotionControllerDive.md)). NPCs can switch between controllers at runtime via a named controller map built by [BuilderMotionControllerMap](BuilderMotionControllerMap.md).

## Types

### Core

| Type | Kind | Description |
|---|---|---|
| [MotionController](MotionController.md) | interface | Root contract for all motion controllers |
| [MotionControllerBase](MotionControllerBase.md) | abstract class | Shared collision, physics, and steering logic |
| [MotionControllerWalk](MotionControllerWalk.md) | class | Ground-based walking with gravity, jumping, climbing |
| [MotionControllerFly](MotionControllerFly.md) | class | 3D flight with roll, altitude constraints |
| [MotionControllerDive](MotionControllerDive.md) | class | Underwater swimming and diving |
| [ProbeMoveData](ProbeMoveData.md) | class | Movement probe data structure with path segments |
| [BuilderMotionControllerMapUtil](BuilderMotionControllerMapUtil.md) | class | Type token utility for motion controller maps |

### Builders (sub-package `builders`)

| Type | Kind | Description |
|---|---|---|
| [BuilderMotionControllerBase](BuilderMotionControllerBase.md) | abstract class | Base JSON builder for all motion controllers |
| [BuilderMotionControllerWalk](BuilderMotionControllerWalk.md) | class | JSON builder for walk controllers |
| [BuilderMotionControllerFly](BuilderMotionControllerFly.md) | class | JSON builder for fly controllers |
| [BuilderMotionControllerDive](BuilderMotionControllerDive.md) | class | JSON builder for dive controllers |
| [BuilderMotionControllerMap](BuilderMotionControllerMap.md) | class | JSON builder for named controller map |
