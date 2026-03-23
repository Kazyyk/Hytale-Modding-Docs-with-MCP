# MotionControllerFly

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers | Extends: MotionControllerBase

public class MotionControllerFly extends MotionControllerBase

Flying motion controller for airborne NPCs. Handles 3D movement with pitch/yaw/roll, altitude constraints, acceleration/deceleration, auto-leveling, and transition to dropping when unable to act. Uses `PositionProbeAir` for position validation.

Built from JSON configuration via BuilderMotionControllerFly with the type string `"Fly"`.

## Constants

- TYPE | String | "Fly" | Controller type identifier
- DAMPING_FACTOR | double | 20.0 | Force velocity damping multiplier
- COLLISION_MATERIALS_PASSIVE | int | 4 | Passive collision material mask
- COLLISION_MATERIALS_ACTIVE | int | 6 | Active collision material mask

## Key Fields

- minAirSpeed | double | Minimum speed while airborne
- maxClimbSpeed | double | Maximum climbing (ascending) speed
- maxSinkSpeed | double | Maximum sinking speed
- maxFallSpeed | double | Terminal velocity when falling
- maxSinkSpeedFluid | double | Terminal velocity in fluid
- maxClimbAngle | float | Maximum climb angle (radians)
- maxSinkAngle | float | Maximum dive angle (radians)
- acceleration` / `deceleration | double | Speed change rates
- maxTurnSpeed | float | Maximum yaw turn speed (radians/s)
- maxRollAngle | float | Maximum bank roll angle (radians)
- maxRollSpeed | float | Maximum roll change rate (radians/s)
- rollDamping | float | Roll smoothing factor (0..1)
- minHeightOverGround` / `maxHeightOverGround | double | Desired altitude band
- autoLevel | boolean | Whether pitch resets to 0 when no steering
- desiredAltitudeWeight | double | How strongly the NPC seeks its altitude band (0..1)

## Constructor


public MotionControllerFly(BuilderSupport builderSupport, BuilderMotionControllerFly builder)

## Key Behaviors

### Flight Physics

The controller computes velocity from the steering direction, applying acceleration/deceleration limits and speed limits derived from the current pitch via `computeMaxSpeedFromPitch()`. The maximum speed at a given pitch is computed as: `sqrt((cos(pitch) * maxHorizontalSpeed)^2 + (sin(pitch) * maxClimb_or_SinkSpeed)^2)`.

### Roll

Banking roll is computed from the lateral component of the turn. Roll is damped by `rollDamping` (higher = more persistent roll) and clamped to `maxRollAngle`. Speed factor attenuates roll at low speeds.

### Altitude Control

`getDesiredVerticalRange()` probes the world for ground level and ceiling at the entity's XZ position, then computes a vertical band: `[groundLevel + minHeightOverGround, min(groundLevel + maxHeightOverGround, ceilingLevel)]`. The `desiredAltitudeOverride` array can override these values at runtime.

### Gravity / Dropping

When the NPC cannot act (dead, on ground, etc.), it switches to `DROPPING` motion kind and applies gravity drag. Horizontal velocity decays proportionally.

## Overrides

- getType() | "Fly" | Type identifier
- is2D() | false | Full 3D pathfinding
- canRestAtPlace() | false | Cannot idle in mid-air
- getWanderVerticalMovementRatio() | 0.5 | Half vertical movement during wander
- getCurrentSpeed() | 0.0 | Speed tracked via `lastSpeed` instead
- canAct(...) | boolean | Requires alive, in air, and non-zero speed multiplier

## Additional Methods

- void takeOff(Ref<EntityStore>, double, ComponentAccessor<EntityStore>) | Initiates takeoff at 45-degree pitch with given speed
- void setDesiredAltitudeOverride(double[]) | Overrides the min/max altitude bounds
- double getDampingDeceleration() | Returns `forceVelocityDamping * 20.0
- double getMinSpeedAfterForceSquared() | Threshold below which force velocity is zeroed
