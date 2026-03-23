---
title: "BuilderMotionControllerFly"
kind: "class"
package: "com.hypixel.hytale.server.npc.movement.controllers.builders"
fqcn: "com.hypixel.hytale.server.npc.movement.controllers.builders.BuilderMotionControllerFly"
api_surface: false
extends: "BuilderMotionControllerBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "movement"
  - "controllers"
  - "builders"
---

**Package:** `com.hypixel.hytale.server.npc.movement.controllers.builders`

```java
public class BuilderMotionControllerFly extends BuilderMotionControllerBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `double` | `minAirSpeed` |
| `private` | `double` | `maxClimbSpeed` |
| `private` | `double` | `maxSinkSpeed` |
| `private` | `double` | `maxSinkSpeedFluid` |
| `private` | `double` | `maxFallSpeed` |
| `private` | `float` | `maxClimbAngle` |
| `private` | `float` | `maxSinkAngle` |
| `private` | `double` | `acceleration` |
| `private` | `double` | `deceleration` |
| `private` | `double` | `gravity` |
| `private` | `float` | `maxTurnSpeed` |
| `private` | `float` | `maxRollAngle` |
| `private` | `float` | `maxRollSpeed` |
| `private` | `float` | `rollDamping` |
| `private final` | `DoubleHolder` | `minHeightOverGround` |
| `private final` | `DoubleHolder` | `maxHeightOverGround` |
| `private` | `double` | `fastFlyThreshold` |
| `private` | `boolean` | `autoLevel` |
| `private` | `double` | `desiredAltitudeWeight` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `MotionControllerFly` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `MotionControllerFly(builderSupport, this)` |
| `public` | `String` | `getShortDescription()` |
| `public` | `String` | `getLongDescription()` |
| `public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `public` | `BuilderMotionControllerFly` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public double` | `getMinAirSpeed()` |
| `` | `public double` | `getMaxClimbSpeed()` |
| `` | `public double` | `getMaxSinkSpeed()` |
| `` | `public double` | `getMaxFallSpeed()` |
| `` | `public double` | `getMaxSinkSpeedFluid()` |
| `` | `public float` | `getMaxClimbAngle()` |
| `` | `public float` | `getMaxSinkAngle()` |
| `` | `public double` | `getAcceleration()` |
| `` | `public double` | `getDeceleration()` |
| `` | `public double` | `getGravity()` |
| `` | `public float` | `getMaxTurnSpeed()` |
| `` | `public float` | `getMaxRollAngle()` |
| `` | `public float` | `getMaxRollSpeed()` |
| `` | `public float` | `getRollDamping()` |
| `` | `public double` | `getMinHeightOverGround(BuilderSupport support)` |
| `` | `public double` | `getMaxHeightOverGround(BuilderSupport support)` |
| `` | `public double` | `getFastFlyThreshold()` |
| `` | `public boolean` | `isAutoLevel()` |
| `` | `public double` | `getDesiredAltitudeWeight()` |
| `public` | `Class<MotionController>` | `category()` |
| `public` | `String` | `getType()` |
| `public` | `SpawnTestResult` | `canSpawn(@Nonnull SpawningContext context)` |
| `public` | `Class<? extends MotionController>` | `getClassType()` |

## Related Types

- [BuilderMotionControllerBase](BuilderMotionControllerBase.md)
