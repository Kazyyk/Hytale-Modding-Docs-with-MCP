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

Also in this package: AppliedVelocity, AscentAnimationType, BuilderMotionControllerMapUtil, DescentAnimationType, MotionControllerBase, MotionControllerDive, MotionControllerWalk, ProbeMoveData, Segment, Type

Complete API:
  public String getType()
  protected double computeMove(Ref<EntityStore> ref, Role role, Steering steering, double dt, Vector3d translation, ComponentAccessor<EntityStore> componentAccessor)
  private void setDirectionFromTranslation(Steering steering, Vector3d translation)
  public double probeMove(Ref<EntityStore> ref, ProbeMoveData probeMoveData, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isFastMotionKind(double speed)
  public MotionController.VerticalRange getDesiredVerticalRange(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public double getWanderVerticalMovementRatio()
  protected double doMove(Ref<EntityStore> ref, Vector3d position, Vector3d translation, PositionProbeAir moveProbe, ProbeMoveData probeMoveData, ComponentAccessor<EntityStore> componentAccessor)
  protected double executeMove(Ref<EntityStore> ref, Role role, double dt, Vector3d translation, ComponentAccessor<EntityStore> componentAccessor)
  public void constrainRotations(Role role, TransformComponent transform)
  public double getCurrentMaxBodyRotationSpeed()
  protected void dampForceVelocity(Vector3d forceVelocity, double forceVelocityDamping, double interval, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean shouldDampenAppliedVelocitiesY()
  protected boolean shouldAlwaysUseGroundResistance()
  public void spawned()
  public boolean canAct(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public boolean inAir()
  public boolean onGround()
  public boolean inWater()
  public double getCurrentSpeed()
  public double getCurrentTurnRadius()
  public float getMaxClimbAngle()
  public float getMaxSinkAngle()
  public double getMaximumSpeed()
  public boolean is2D()
  public boolean canRestAtPlace()
  public double getDesiredAltitudeWeight()
  public double getHeightOverGround()
  public boolean isHorizontalIdle(double speed)
  public boolean estimateVelocity(Steering steering, Vector3d velocityOut)
  public void clearOverrides()
  public void setDesiredAltitudeOverride(double[] desiredAltitudeOverride)
  public void takeOff(Ref<EntityStore> ref, double speed, ComponentAccessor<EntityStore> componentAccessor)
  public double getMinSpeedAfterForceSquared()
  public double getDampingDeceleration()
  protected double computeMaxSpeedFromPitch(double pitch)

Fields:
public static final String TYPE
public static final double DAMPING_FACTOR
public static final int COLLISION_MATERIALS_PASSIVE
public static final int COLLISION_MATERIALS_ACTIVE
protected final double minAirSpeed
protected final double maxClimbSpeed
protected final double maxSinkSpeed
protected final double maxFallSpeed
protected final double maxSinkSpeedFluid
protected final float maxClimbAngle
protected final float maxSinkAngle
protected final double acceleration
protected final double deceleration
protected final double sinkRatio
protected final double desiredAltitudeWeight
protected final float maxTurnSpeed
protected final float maxRollAngle
protected final float maxRollSpeed
protected final float rollDamping
protected final double fastFlyThreshold
protected final double minHeightOverGround
protected final double maxHeightOverGround
protected final boolean autoLevel
protected final double sinMaxClimbAngle
protected final double sinMaxSinkAngle
protected final MotionController.VerticalRange verticalRange
protected final PositionProbeAir moveProbe
protected final PositionProbeAir probeMoveProbe
protected int lastVerticalPositionX
protected int lastVerticalPositionZ
protected final Vector3d lastVelocity
protected double lastSpeed
protected float lastRoll
protected double currentRelativeSpeed
protected double minSpeedAfterForceSquared
protected double[] desiredAltitudeOverride
