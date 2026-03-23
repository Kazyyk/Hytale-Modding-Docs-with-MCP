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

Also in this package: AppliedVelocity, AscentAnimationType, BuilderMotionControllerMapUtil, DescentAnimationType, MotionControllerBase, MotionControllerFly, MotionControllerWalk, ProbeMoveData, Segment, Type

Complete API:
  public void activate()
  public double getWanderVerticalMovementRatio()
  public MotionController.VerticalRange getDesiredVerticalRange(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  protected double computeMove(Ref<EntityStore> ref, Role role, Steering steering, double dt, Vector3d translation, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean shouldDampenAppliedVelocitiesY()
  protected boolean shouldAlwaysUseGroundResistance()
  private void computeTranslation(Vector3d translation, double dt, float heading, double moveSpeed, double climbSpeed)
  private boolean isNearZero(float angle)
  public void setMotionKind(MotionKind motionKind)
  protected double executeMove(Ref<EntityStore> ref, Role role, double dt, Vector3d translation, ComponentAccessor<EntityStore> componentAccessor)
  public void constrainRotations(Role role, TransformComponent transform)
  public double getCurrentMaxBodyRotationSpeed()
  public boolean canAct(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public boolean inAir()
  public boolean inWater()
  public boolean onGround()
  public String getType()
  public double bisect(Ref<EntityStore> ref, Vector3d validPosition, double validDistance, Vector3d invalidPosition, double invalidDistance, Vector3d result, ComponentAccessor<EntityStore> componentAccessor)
  public double bisect(Ref<EntityStore> ref, Vector3d validPosition, Vector3d invalidPosition, Vector3d result, ComponentAccessor<EntityStore> componentAccessor)
  public double probeMove(Ref<EntityStore> ref, ProbeMoveData probeMoveData, ComponentAccessor<EntityStore> componentAccessor)
  public void spawned()
  public double getCurrentSpeed()
  public double getCurrentTurnRadius()
  public float getMaxClimbAngle()
  public float getMaxSinkAngle()
  public double getMaximumSpeed()
  public boolean isFastMotionKind(double speed)
  public boolean is2D()
  public boolean canRestAtPlace()
  public double getDesiredAltitudeWeight()
  public double getHeightOverGround()
  public boolean estimateVelocity(Steering steering, Vector3d velocityOut)
  public void updateModelParameters(Ref<EntityStore> ref, Model model, Box boundingBox, ComponentAccessor<EntityStore> componentAccessor)
  protected void dampForceVelocity(Vector3d forceVelocity, double forceVelocityDamping, double interval, ComponentAccessor<EntityStore> componentAccessor)
  public static double relativeSwimDepthToBoundingBox(double swimDepth, Box boundingBox, float eyeHeight)
  public static double relativeSwimDepthToHeight(double swimDepth, Box boundingBox, float eyeHeight)
  public static double relativeSwimDepthToHeight(Ref<EntityStore> ref, double swimDepth, Model model, Box boundingBox, ComponentAccessor<EntityStore> componentAccessor)
  public double getDampingDeceleration()

Fields:
public static final String TYPE
public static final int COLLISION_MATERIALS_ACTIVE
public static final int COLLISION_MATERIALS_PASSIVE
public static final double DEFAULT_SWIM_DEPTH
protected static double DAMPING_FACTOR
protected final double maxVerticalSpeed
protected final double acceleration
protected final double maxFallSpeed
protected final double maxSinkSpeed
protected final double maxRotationSpeed
protected final float maxMoveTurnAngle
protected final double minDiveDepth
protected final double maxDiveDepth
protected final double minWaterDepth
protected final double maxWaterDepth
protected final double minDepthAboveGround
protected final double minDepthBelowSurface
protected final double relativeSwimDepth
protected final double sinkRatio
protected final double fastDiveThreshold
protected final double minSpeedAfterForceSquared
protected final double desiredDepthWeight
protected double swimDepth
protected double climbSpeed
protected double currentRelativeSpeed
protected boolean collisionWithSolid
protected final MotionController.VerticalRange verticalRange
protected final PositionProbeWater moveProbe
protected final PositionProbeWater probeMoveProbe
protected final Vector3d tempPosition
protected final Vector3d tempDirection
private static final EnumSet<MotionKind> VALID_MOTIONS
