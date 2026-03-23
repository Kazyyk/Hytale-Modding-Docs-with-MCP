# MotionControllerDive

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers | Extends: MotionControllerBase

public class MotionControllerDive extends MotionControllerBase

Swimming and diving motion controller for aquatic NPCs. Handles fluid-based movement with `PositionProbeWater` for position validation, depth constraints, collision with solid blocks, and gravity sinking when out of water. Only the `SWIMMING`, `SWIMMING_TURNING`, and `MOVING` motion kinds are valid.

Built from JSON configuration via BuilderMotionControllerDive with the type string `"Dive"`.

## Constants

- TYPE | String | "Dive" | Controller type identifier
- COLLISION_MATERIALS_ACTIVE | int | 5 | Active collision material mask
- COLLISION_MATERIALS_PASSIVE | int | 4 | Passive collision material mask
- DEFAULT_SWIM_DEPTH | double | 0.5 | Default swim depth ratio

## Key Fields

- maxVerticalSpeed | double | Maximum vertical swim speed
- acceleration | double | Acceleration rate
- maxFallSpeed | double | Terminal velocity in air
- maxSinkSpeed | double | Terminal velocity sinking in water
- maxRotationSpeed | double | Maximum rotation speed (radians/s)
- maxMoveTurnAngle | float | Maximum swim turn angle before speed zeroes
- minDiveDepth` / `maxDiveDepth | double | Dive depth range below water surface
- minDepthAboveGround | double | Minimum distance from floor desired
- minDepthBelowSurface | double | Minimum distance from water surface desired
- relativeSwimDepth | double | Submersion ratio for swim activation (-1..1)
- sinkRatio | double | Vertical movement ratio during wander
- desiredDepthWeight | double | How strongly the NPC seeks its depth band (0..1)
- swimDepth | double | Computed absolute swim depth from model
- collisionWithSolid | boolean | Whether last collision was with a solid block

## Constructor


public MotionControllerDive(BuilderSupport builderSupport, BuilderMotionControllerDive builder)

## Key Behaviors

### Swimming Physics

Horizontal and vertical speeds are computed independently. Horizontal speed tracks the steering direction projected onto the XZ plane; vertical speed (`climbSpeed`) tracks the Y component. Both accelerate toward target speeds using `NPCPhysicsMath.accelerateToTargetSpeed()`. When the turn angle exceeds `maxMoveTurnAngle`, horizontal speed is zeroed.

### Depth Control

`getDesiredVerticalRange()` computes the allowed vertical band from the water surface level, ground level, and the configured depth constraints. The vertical range is `[max(groundLevel + minDepthAboveGround, waterLevel - maxDiveDepth), waterLevel - swimDepth - minDepthBelowSurface]`.

### Collision Handling

On solid block collision, both `moveSpeed` and `climbSpeed` are zeroed, and all forces/applied velocities are cleared. The `collisionWithSolid` flag is set for the current tick.

### Swim Depth Computation

The swim depth is relative to the model's bounding box and eye height. Static utility methods convert between the relative depth config value and absolute height:


public static double relativeSwimDepthToHeight(double swimDepth, Box boundingBox, float eyeHeight)


public static double relativeSwimDepthToHeight(Ref<EntityStore>, double, Model, Box, ComponentAccessor<EntityStore>)

## Overrides

- getType() | "Dive" | Type identifier
- is2D() | false | Full 3D pathfinding
- canRestAtPlace() | true | Can idle while swimming
- getWanderVerticalMovementRatio() | configured `sinkRatio | From builder config
- getMaxClimbAngle() | PI/2 | Can climb vertically
- getMaxSinkAngle() | PI/2 | Can dive vertically
- canAct(...) | boolean | Requires alive and in water
- constrainRotations(...) | sets roll to 0 | No banking while diving
