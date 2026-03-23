---
title: "com.hypixel.hytale.server.npc.corecomponents.world.builders"
kind: "package"
package: "com.hypixel.hytale.server.npc.corecomponents.world.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.builders"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "builder"
  - "world"
  - "behavior"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.world.builders`

NPC builder behavior components for world-building NPCs. Provides actions (block placement, path creation, position storage, spawner triggering), sensors (block detection, light level, weather, time, path state, water detection), and motion controllers (body path following, head observation) that together implement autonomous NPC construction behaviors.

## Actions

| Type | Description |
|---|---|
| [BuilderActionMakePath](BuilderActionMakePath.md) | Constructs a transient path from rotations and distances. |
| [BuilderActionPlaceBlock](BuilderActionPlaceBlock.md) | Places a block at the target position. |
| [BuilderActionResetBlockSensors](BuilderActionResetBlockSensors.md) | Resets cached block sensor data. |
| [BuilderActionResetPath](BuilderActionResetPath.md) | Resets the current navigation path. |
| [BuilderActionResetSearchRays](BuilderActionResetSearchRays.md) | Resets directional search ray data. |
| [BuilderActionSetBlockToPlace](BuilderActionSetBlockToPlace.md) | Sets the block type for placement. |
| [BuilderActionSetLeashPosition](BuilderActionSetLeashPosition.md) | Sets the builder's leash anchor position. |
| [BuilderActionStorePosition](BuilderActionStorePosition.md) | Stores the current position for later use. |
| [BuilderActionTriggerSpawners](BuilderActionTriggerSpawners.md) | Triggers nearby spawner blocks. |

## Sensors

| Type | Description |
|---|---|
| [BuilderSensorBlock](BuilderSensorBlock.md) | Senses block info at a position. |
| [BuilderSensorBlockChange](BuilderSensorBlockChange.md) | Detects block changes nearby. |
| [BuilderSensorBlockType](BuilderSensorBlockType.md) | Senses block type at a position. |
| [BuilderSensorCanPlace](BuilderSensorCanPlace.md) | Checks if a block can be placed. |
| [BuilderSensorEntityEvent](BuilderSensorEntityEvent.md) | Listens for entity events. |
| [BuilderSensorEvent](BuilderSensorEvent.md) | Listens for general events. |
| [BuilderSensorInWater](BuilderSensorInWater.md) | Detects water submersion. |
| [BuilderSensorLeash](BuilderSensorLeash.md) | Senses leash distance/direction. |
| [BuilderSensorLight](BuilderSensorLight.md) | Senses light level. |
| [BuilderSensorPath](BuilderSensorPath.md) | Provides path state info. |
| [BuilderSensorReadPosition](BuilderSensorReadPosition.md) | Reads a stored position. |
| [BuilderSensorSearchRay](BuilderSensorSearchRay.md) | Casts search rays for blocks. |
| [BuilderSensorTime](BuilderSensorTime.md) | Provides time-of-day info. |
| [BuilderSensorWeather](BuilderSensorWeather.md) | Provides weather conditions. |

## Motion

| Type | Description |
|---|---|
| [BuilderBodyMotionPath](BuilderBodyMotionPath.md) | Controls body motion along a path. |
| [BuilderHeadMotionObserve](BuilderHeadMotionObserve.md) | Controls head rotation for observation. |
