---
title: "BuilderMotionControllerDive"
kind: "class"
package: "com.hypixel.hytale.server.npc.movement.controllers.builders"
fqcn: "com.hypixel.hytale.server.npc.movement.controllers.builders.BuilderMotionControllerDive"
api_surface: false
extends: "BuilderMotionControllerBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "movement"
  - "controllers"
  - "builders"
---

**Package:** `com.hypixel.hytale.server.npc.movement.controllers.builders`

```java
public class BuilderMotionControllerDive extends BuilderMotionControllerBase
```

JSON builder for [MotionControllerDive](MotionControllerDive.md). Reads diving/swimming-specific configuration from NPC role JSON.

## JSON Configuration Properties

| Property | Type | Default | Description |
|---|---|---|---|
| `MaxSwimSpeed` | `double` | `3.0` | Maximum horizontal swim speed |
| `MaxDiveSpeed` | `double` | `8.0` | Maximum vertical speed |
| `MaxFallSpeed` | `double` | `10.0` | Terminal velocity in air |
| `MaxSinkSpeed` | `double` | `4.0` | Terminal velocity sinking in water |
| `Gravity` | `double` | `10.0` | Gravity constant |
| `Acceleration` | `double` | `3.0` | Acceleration rate |
| `MaxRotationSpeed` | `double` | `360.0` | Max rotation speed (degrees/s) |
| `MaxSwimTurnAngle` | `float` | `90.0` | Max swim turn angle (degrees, 0..180) |
| `FastSwimThreshold` | `double` | `0.6` | Relative speed for fast swim animation (0..1) |
| `SwimDepth` | `double` | `0.4` | Submersion ratio (-1..1; 0=eye height) |
| `SinkRatio` | `double` | `1.0` | Vertical movement ratio while wandering |
| `MinDiveDepth` | `double` | `0.0` | Minimum dive depth below surface |
| `MaxDiveDepth` | `double` | `MAX_VALUE` | Maximum dive depth below surface |
| `MinDepthAboveGround` | `double` | `1.0` | Minimum distance from floor |
| `MinDepthBelowSurface` | `double` | `1.0` | Minimum distance from surface |
| `MinWaterDepth` | `double` | `1.0` | Minimum required water depth |
| `MaxWaterDepth` | `double` | `0.0` | Maximum required water depth |
| `DesiredDepthWeight` | `double` | `0.0` | Depth preference strength (0..1) |

## Spawn Validation

```java
public SpawnTestResult canSpawn(SpawningContext context)
```

Requires the spawn position to be in water at the configured swim depth (`isInWater(swimDepth)`) and valid position with material check 20.

## Key Methods

| Method | Description |
|---|---|
| `MotionControllerDive build(BuilderSupport)` | Constructs a `MotionControllerDive` |
| `Class<? extends MotionController> getClassType()` | Returns `MotionControllerDive.class` |
