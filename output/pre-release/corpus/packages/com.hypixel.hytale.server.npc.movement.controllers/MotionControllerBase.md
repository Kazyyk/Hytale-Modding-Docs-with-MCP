# MotionControllerBase

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers | Implements: MotionController

public abstract class MotionControllerBase implements MotionController

Abstract base class for all motion controllers. Provides shared infrastructure for collision detection, force/velocity management, heading interpolation, movement state updates, bounding box handling, and debug mode support. The three concrete subclasses are MotionControllerWalk, MotionControllerFly, and MotionControllerDive.

Built from JSON configuration via BuilderMotionControllerBase.

## Constants

- FORCE_SCALE | double | 5.0 | Multiplier applied to external forces
- BISECT_DIST | double | 0.05 | Binary search convergence threshold for position bisection
- FILTER_COEFFICIENT | double | 0.7 | Low-pass filter coefficient for speed smoothing
- DOT_PRODUCT_EPSILON | double | 0.001 | Epsilon for dot-product comparisons
- DEFAULT_BLOCK_DRAG | double | 0.82 | Default block surface drag coefficient

## Key Fields

- entity | NPCEntity | The owning NPC entity component
- type | String | Controller type string
- position | Vector3d | Current position (mutable working copy)
- collisionBoundingBox | Box | Collision bounding box
- collisionResult | CollisionResult | Reusable collision result buffer
- forceVelocity | Vector3d | Externally applied velocity
- appliedVelocities | List<AppliedVelocity> | List of stacked applied velocities
- navState | NavState | Current pathfinding navigation state
- motionKind | MotionKind | Current motion animation kind
- moveSpeed | double | Current horizontal move speed
- effectHorizontalSpeedMultiplier | double | Speed multiplier from movement effects
- maxHorizontalSpeed | double | Configured maximum horizontal speed
- gravity | double | Gravity constant
- inertia | double | Mass/inertia factor
- knockbackScale | double | Knockback force multiplier

## Constructor


public MotionControllerBase(BuilderSupport builderSupport, BuilderMotionControllerBase builder)

Reads the entity from builder support and initializes all base parameters from the builder configuration including epsilon values, speed limits, force velocity damping, and head rotation speed.

## Abstract Methods

Subclasses must implement:

- double computeMove(Ref<EntityStore>, Role, Steering, double, Vector3d, ComponentAccessor<EntityStore>) | Computes the movement translation vector for one tick
- double executeMove(Ref<EntityStore>, Role, double, Vector3d, ComponentAccessor<EntityStore>) | Executes collision-checked movement
- boolean isFastMotionKind(double speed) | Determines whether the current speed qualifies as "fast" (running vs walking)

## Key Methods

- void readEntityPosition(Ref<EntityStore>, ComponentAccessor<EntityStore>) | Copies entity transform into working fields
- void moveEntity(Ref<EntityStore>, double, ComponentAccessor<EntityStore>) | Writes working position/rotation back to entity
- void updateMovementState(...) | Maps `MotionKind` to `MovementStates` flags for animation
- boolean touchesWater(boolean, ComponentAccessor<EntityStore>) | Checks fluid presence at the entity's feet
- double bisect(Vector3d, Vector3d, T, BiPredicate, Vector3d) | Binary search between valid and invalid positions to find the last valid point

## Movement State Mapping

The base class maps `MotionKind` values to `MovementStates` animation flags:

- `FLYING` -> `flying=true`, walking/running based on speed
- `SWIMMING` / `SWIMMING_TURNING` -> `swimming=true`, walking/running based on speed
- `ASCENDING` -> delegated to subclass (Jump, Walk, Climb, Fly, or Idle)
- `MOVING` -> standard walk/run with hover check
- `DESCENDING` -> delegated to subclass (Walk, Fall, or Idle based on height)
- `DROPPING` -> `falling=true`
- `STANDING` -> `idle=true`, all locomotion flags false

## Inner Classes

### AppliedVelocity

Tracks a single externally applied velocity with its `VelocityConfig`, a `canClear` flag, and `ignoreDamping` option. Multiple applied velocities are accumulated during force resolution.

Known subclasses: MotionControllerDive, MotionControllerFly, MotionControllerWalk

Also in this package: AppliedVelocity, AscentAnimationType, BuilderMotionControllerMapUtil, DescentAnimationType, MotionControllerDive, MotionControllerFly, MotionControllerWalk, ProbeMoveData, Segment, Type

Complete API:
  public Role getRole()
  public void setRole(Role role)
  public void setInertia(double inertia)
  public void setKnockbackScale(double knockbackScale)
  public void updateModelParameters(Ref<EntityStore> ref, Model model, Box boundingBox, ComponentAccessor<EntityStore> componentAccessor)
  public void setHeadPitchAngleRange(float[] headPitchAngleRange)
  protected void readEntityPosition(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void postReadPosition(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void moveEntity(Ref<EntityStore> ref, double dt, ComponentAccessor<EntityStore> componentAccessor)
  public float getYaw()
  public float getPitch()
  public float getRoll()
  public boolean touchesWater(boolean defaultValue, ComponentAccessor<EntityStore> componentAccessor)
  public void updateMovementState(Ref<EntityStore> ref, MovementStates movementStates, Steering steering, Vector3d velocity, ComponentAccessor<EntityStore> componentAccessor)
  protected abstract boolean isFastMotionKind(double var1)
  protected void updateFlyingStates(MovementStates movementStates, boolean idle, boolean fastMotionKind)
  protected void updateSwimmingStates(MovementStates movementStates, boolean idle, boolean fastMotionKind, boolean horizontalIdleKind)
  protected static void updateMovingStates(Ref<EntityStore> ref, MovementStates movementStates, boolean fastMotionKind, ComponentAccessor<EntityStore> componentAccessor)
  protected void updateAscendingStates(Ref<EntityStore> ref, MovementStates movementStates, boolean fastMotionKind, boolean horizontalIdleKind, ComponentAccessor<EntityStore> componentAccessor)
  protected void updateDescendingStates(Ref<EntityStore> ref, MovementStates movementStates, boolean fastMotionKind, boolean hovering, ComponentAccessor<EntityStore> componentAccessor)
  protected void updateDroppingStates(MovementStates movementStates)
  protected void updateStandingStates(MovementStates movementStates, MotionKind motionKind, boolean hovering)
  public double steer(Ref<EntityStore> ref, Role role, Steering bodySteering, Steering headSteering, double interval, ComponentAccessor<EntityStore> componentAccessor)
  public double steer0(Ref<EntityStore> ref, Role role, Steering bodySteering, Steering headSteering, double interval, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean shouldDampenAppliedVelocitiesY()
  protected boolean shouldAlwaysUseGroundResistance()
  protected void calculateYaw(Ref<EntityStore> ref, Steering bodySteering, Steering headSteering, float maxHeadRotation, float maxBodyRotation, ComponentAccessor<EntityStore> componentAccessor)
  protected float blendBodyYaw(Ref<EntityStore> ref, float yawOffset, float maxBodyRotation, ComponentAccessor<EntityStore> componentAccessor)
  protected void calculatePitch(Ref<EntityStore> ref, Steering bodySteering, Steering headSteering, float maxHeadRotation, ComponentAccessor<EntityStore> componentAccessor)
  protected void calculateRoll(Steering bodySteering, Steering headSteering)
  protected void dampForceVelocity(Vector3d forceVelocity, double forceVelocityDamping, double interval, ComponentAccessor<EntityStore> componentAccessor)
  private static double convertToNewRange(double value, double oldMinRange, double oldMaxRange, double newMinRange, double newMaxRange)
  public double probeMove(Ref<EntityStore> ref, Vector3d position, Vector3d direction, ProbeMoveData probeMoveData, ComponentAccessor<EntityStore> componentAccessor)
  protected void postExecuteMove()
  protected void adjustReadPosition(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  protected void adjustWritePosition(Ref<EntityStore> ref, double dt, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isInProgress()
  public boolean isObstructed()
  public NavState getNavState()
  public double getThrottleDuration()
  public double getTargetDeltaSquared()
  public void setNavState(NavState navState, double throttleDuration, double targetDeltaSquared)
  public boolean isForceRecomputePath()
  public void setForceRecomputePath(boolean recomputePath)
  public void beforeInstructionSensorsAndActions(double physicsTickDuration)
  public void beforeInstructionMotion(double physicsTickDuration)
  public boolean isHorizontalIdle(double speed)
  public boolean canAct(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public String canActFailReason(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isMovementBlocked(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  protected abstract double computeMove(Ref<EntityStore> var1, Role var2, Steering var3, double var4, Vector3d var6, ComponentAccessor<EntityStore> var7)
  protected abstract double executeMove(Ref<EntityStore> var1, Role var2, double var3, Vector3d var5, ComponentAccessor<EntityStore> var6)
  public double bisect(Vector3d validPosition, Vector3d invalidPosition, T t, BiPredicate<T,Vector3d> validate, Vector3d result)
  public double bisect(Vector3d validPosition, Vector3d invalidPosition, T t, BiPredicate<T,Vector3d> validate, double maxDistance, Vector3d result)
  public Vector3d getForce()
  public void addForce(Vector3d force, VelocityConfig velocityConfig)
  public void forceVelocity(Vector3d velocity, VelocityConfig velocityConfig, boolean ignoreDamping)
  public void clearForce()
  protected void dumpCollisionResults()
  public void setEnableTriggers(boolean enableTriggers)
  public void setEnableBlockDamage(boolean enableBlockDamage)
  public boolean willReceiveBlockDamage()
  public void setAvoidingBlockDamage(boolean avoid)
  public boolean isAvoidingBlockDamage()
  public void processTriggers(Ref<EntityStore> ref, CollisionResult collisionResult, double t, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isProcessTriggersHasMoved()
  protected boolean isAlive(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void onDebugFlagsChanged(EnumSet<RoleDebugFlags> newFlags)
  public void activate()
  public void resetNavState()
  public void resetObstructedFlags()
  public void deactivate()
  public double getEpsilonSpeed()
  public float getEpsilonAngle()
  public Vector3d getComponentSelector()
  public Vector3d getPlanarComponentSelector()
  public void setComponentSelector(Vector3d componentSelector)
  public Vector3d getWorldNormal()
  public Vector3d getWorldAntiNormal()
  public double waypointDistance(Vector3d p, Vector3d q)
  public double waypointDistanceSquared(Vector3d p, Vector3d q)
  public double waypointDistance(Ref<EntityStore> ref, Vector3d p, ComponentAccessor<EntityStore> componentAccessor)
  public double waypointDistanceSquared(Ref<EntityStore> ref, Vector3d p, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isValidPosition(Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isValidPosition(Vector3d position, CollisionResult collisionResult, ComponentAccessor<EntityStore> componentAccessor)
  public int getInvalidOverlapMaterials()
  protected void saveMotionKind()
  protected boolean switchedToMotionKind(MotionKind motionKind)
  public MotionKind getMotionKind()
  public void setMotionKind(MotionKind motionKind)
  public double getGravity()
  public void setGravity(double gravity)
  public boolean translateToAccessiblePosition(Vector3d position, Box boundingBox, double minYValue, double maxYValue, ComponentAccessor<EntityStore> componentAccessor)
  public boolean standingOnBlockOfType(int blockSet)
  public void requirePreciseMovement(Vector3d positionHint)
  public void clearRequirePreciseMovement()
  public boolean isRequiresPreciseMovement()
  public void requireDepthProbing()
  public void clearRequireDepthProbing()
  public boolean isRequiresDepthProbing()
  public void enableHeadingBlending(double heading, Vector3d targetPosition, double blendLevel)
  public void enableHeadingBlending()
  public void clearBlendHeading()
  public void setRelaxedMoveConstraints(boolean relax)
  public boolean isRelaxedMoveConstraints()
  public void updatePhysicsValues(PhysicsValues values)

Fields:
public static final double FORCE_SCALE
public static final double BISECT_DIST
public static final double FILTER_COEFFICIENT
public static final double DOT_PRODUCT_EPSILON
public static final double DEFAULT_BLOCK_DRAG
protected static final HytaleLogger LOGGER
public static final boolean DEBUG_APPLIED_FORCES
protected final NPCEntity entity
protected final String type
protected final double epsilonSpeed
protected final float epsilonAngle
protected final double forceVelocityDamping
protected final double maxHorizontalSpeed
protected final double fastMotionThreshold
protected final double fastMotionThresholdRange
protected final float maxHeadRotationSpeed
protected Role role
protected double inertia
protected double knockbackScale
protected double gravity
protected float[] headPitchAngleRange
protected boolean debugModeSteer
protected boolean debugModeMove
protected boolean debugModeCollisions
protected boolean debugModeBlockCollisions
protected boolean debugModeProbeBlockCollisions
protected boolean debugModeValidatePositions
protected boolean debugModeOverlaps
protected boolean debugModeValidateMath
protected final Vector3d position
protected final Box collisionBoundingBox
protected final CollisionResult collisionResult
protected final Vector3d translation
protected final Vector3d bisectValidPosition
protected final Vector3d bisectInvalidPosition
protected final Vector3d lastValidPosition
protected final Vector3d forceVelocity
protected final Vector3d appliedForce
protected boolean ignoreDamping
protected final List<MotionControllerBase.AppliedVelocity> appliedVelocities
protected boolean isObstructed
protected NavState navState
protected double throttleDuration
protected double targetDeltaSquared
protected boolean recomputePath
protected final Vector3d worldNormal
protected final Vector3d worldAntiNormal
protected final Vector3d componentSelector
protected final Vector3d planarComponentSelector
protected boolean enableTriggers
protected boolean enableBlockDamage
protected boolean isReceivingBlockDamage
protected boolean isAvoidingBlockDamage
protected boolean requiresPreciseMovement
protected boolean requiresDepthProbing
protected boolean havePreciseMovementTarget
protected Vector3d preciseMovementTarget
protected boolean isRelaxedMoveConstraints
protected boolean isBlendingHeading
protected double blendHeading
protected boolean haveBlendHeadingPosition
protected Vector3d blendHeadingPosition
protected double blendLevelAtTargetPosition
protected boolean fastMotionKind
protected boolean idleMotionKind
protected boolean horizontalIdleKind
protected double moveSpeed
protected double previousSpeed
protected MotionKind motionKind
protected MotionKind lastMovementStateUpdatedMotionKind
protected MotionKind previousMotionKind
protected double effectHorizontalSpeedMultiplier
protected boolean cachedMovementBlocked
private float yaw
private float pitch
private float roll
private final Vector3d beforeTriggerForce
private final Vector3d beforeTriggerPosition
private boolean processTriggersHasMoved
protected MovementSettings movementSettings
