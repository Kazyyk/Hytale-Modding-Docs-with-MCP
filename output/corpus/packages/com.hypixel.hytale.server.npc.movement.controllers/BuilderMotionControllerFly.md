# BuilderMotionControllerFly

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers.builders | Extends: BuilderMotionControllerBase

public class BuilderMotionControllerFly extends BuilderMotionControllerBase

JSON builder for MotionControllerFly. Reads flight-specific configuration from NPC role JSON.

## JSON Configuration Properties

- MinAirSpeed | double | 0.1 | Minimum airborne speed
- MaxHorizontalSpeed | double | 8.0 | Maximum horizontal speed
- MaxClimbSpeed | double | 6.0 | Maximum climbing speed
- MaxSinkSpeed | double | 10.0 | Maximum descending speed
- MaxFallSpeed | double | 40.0 | Terminal velocity
- MaxSinkSpeedFluid | double | 4.0 | Terminal velocity in fluid
- MaxClimbAngle | float | 45.0 | Maximum climb angle (degrees)
- MaxSinkAngle | float | 85.0 | Maximum dive angle (degrees)
- Acceleration | double | 4.0 | Speed-up rate
- Deceleration | double | 4.0 | Slow-down rate
- Gravity | double | 40.0 | Gravity when not flying
- MaxTurnSpeed | float | 180.0 | Max yaw turn speed (degrees/s)
- MaxRollAngle | float | 45.0 | Max bank roll (degrees)
- MaxRollSpeed | float | 180.0 | Max roll rate (degrees/s)
- RollDamping | float | 0.9 | Roll smoothing factor (0..1)
- MinHeightOverGround | double | 1.0 | Minimum altitude above ground
- MaxHeightOverGround | double | 20.0 | Maximum altitude above ground
- FastFlyThreshold | double | 0.6 | Relative speed for fast fly animation (0..1)
- AutoLevel | boolean | true | Reset pitch to 0 when idle
- DesiredAltitudeWeight | double | 0.0 | Altitude preference strength (0..1)

## Spawn Validation


public SpawnTestResult canSpawn(SpawningContext context)

Requires at least 2.0 blocks of air (`isInAir(2.0)`) and valid position with material check 22.

## Key Methods

- MotionControllerFly build(BuilderSupport) | Constructs a `MotionControllerFly
- String getType() | Returns `"fly"
- Class<? extends MotionController> getClassType() | Returns `MotionControllerFly.class
