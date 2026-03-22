---
title: "world"
kind: "index"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "world"
  - "index"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.world`

World-interaction NPC core components -- actions, sensors, and motions for NPC interaction with the block world, paths, weather, time, and events.

## Types

| Type | Kind | Description |
|---|---|---|
| [ActionMakePath](ActionMakePath.md) | class | Builds a transient path from a `TransientPathDefinition` and assigns it to the N... |
| [ActionPlaceBlock](ActionPlaceBlock.md) | class | Places a block at a sensor-provided position. Validates range, block type, and p... |
| [ActionResetBlockSensors](ActionResetBlockSensors.md) | class | Resets cached block targets for specified block sets on the NPC's `WorldSupport`... |
| [ActionResetPath](ActionResetPath.md) | class | Clears the NPC's current path via `PathManager`, stopping path-following behavio... |
| [ActionResetSearchRays](ActionResetSearchRays.md) | class | Resets the NPC's search ray state, clearing cached search results and targets. |
| [ActionSetBlockToPlace](ActionSetBlockToPlace.md) | class | Sets the block type that the NPC should place, stored in `WorldSupport.blockToPl... |
| [ActionSetLeashPosition](ActionSetLeashPosition.md) | class | Stores a leash anchor position from sensor info into the NPC's blackboard for bo... |
| [ActionStorePosition](ActionStorePosition.md) | class | Stores a position from sensor info into a named slot in the NPC's `WorldSupport`... |
| [ActionTriggerSpawners](ActionTriggerSpawners.md) | class | Triggers manual spawn markers within a radius of the NPC's position using the sp... |
| [BodyMotionPath](BodyMotionPath.md) | class | Path-following body motion with configurable shape (LINE, LOOP, POINTS, CHAIN), ... |
| [HeadMotionObserve](HeadMotionObserve.md) | class | Head motion that sweeps the NPC's gaze across an angle range with configurable p... |
| [SensorBlock](SensorBlock.md) | class | Detects blocks from a configured block set within range. Caches found blocks wit... |
| [SensorBlockChange](SensorBlockChange.md) | class | Detects when the block at a cached position has changed since it was last observ... |
| [SensorBlockType](SensorBlockType.md) | class | Checks whether the NPC is standing on or inside a specific block type. |
| [SensorCanPlace](SensorCanPlace.md) | class | Checks whether a block can be placed at the current target position, validating ... |
| [SensorEntityEvent](SensorEntityEvent.md) | class | Listens for entity events (damage, interactions) from the NPC's blackboard event... |
| [SensorEvent](SensorEvent.md) | class | Listens for named events from the NPC's blackboard event view, matching by event... |
| [SensorInWater](SensorInWater.md) | class | Detects whether the NPC is currently in water by checking the fluid at the entit... |
| [SensorLeash](SensorLeash.md) | class | Checks whether the NPC has strayed beyond a configured distance from its leash p... |
| [SensorLight](SensorLight.md) | class | Checks the block light level at the NPC's position against a configured range, u... |
| [SensorPath](SensorPath.md) | class | Detects and follows paths of various types: world paths, prefab paths, or transi... |
| [SensorReadPosition](SensorReadPosition.md) | class | Reads a previously stored position from a named slot in `WorldSupport` and provi... |
| [SensorSearchRay](SensorSearchRay.md) | class | Performs raycasting to find blocks or entities along a search ray pattern, with ... |
| [SensorTime](SensorTime.md) | class | Checks whether the current game time falls within a configured range, using the ... |
| [SensorWeather](SensorWeather.md) | class | Checks the current weather state at the NPC's position against a configured weat... |
