# MotionControllerWalk

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers | Extends: MotionControllerBase

public class MotionControllerWalk extends MotionControllerBase

Ground-based walking motion controller. Handles gravity, jumping, climbing over blocks, step-up logic, fluid interaction, hover oscillation, ground snapping, and fall damage. Uses 2D pathfinding (the Y axis is projected out of distance calculations via `is2D() = true`).

Built from JSON configuration via BuilderMotionControllerWalk with the type string `"Walk"`.

## Constants

- TYPE | String | "Walk" | Controller type identifier
- CLIMB_FORWARD_DISTANCE | double | 0.1 | Forward distance during climb step
- JUMP_FORWARD_DISTANCE | double | 0.5 | Forward distance during jump
- COLLISION_MATERIALS | int | 4 | Collision material mask (passive)
- WALKING_MATERIALS | int | 5 | Walking material mask (active)
- WALKING_MATERIALS_RELAXED | int | 13 | Relaxed walking material mask

## Key Fields

- minHorizontalSpeed | double | Minimum walking speed
- maxVerticalSpeed | double | Maximum fall speed
- acceleration | double | Acceleration rate
- maxRotationSpeed | double | Maximum rotation speed (radians/s)
- maxClimbHeight | double | Maximum height the NPC can climb over
- jumpHeight | double | Jump height above climb height
- jumpForce | double | Upward force multiplier for jumps
- maxDropHeight | double | Maximum safe drop height
- minHover` / `maxHover | double | Hover height range (0 = no hover)
- hoverFreq | double | Hover oscillation frequency
- fenceBlockSet | int | Block set index for unclimbable blocks
- onGround | boolean | Current ground contact state
- inWater | boolean | Current fluid contact state
- belowBlockType | BlockType | Block type directly below the NPC

## Constructor


public MotionControllerWalk(BuilderMotionControllerWalk builder, BuilderSupport builderSupport)

## Key Behaviors

### Ground Movement

The controller computes horizontal translation by accelerating toward the steering target speed, clamping to `maxMoveTurnAngle`, and applying heading rotation limits. When the turn angle exceeds `maxMoveTurnAngle`, horizontal speed is zeroed (the NPC turns in place).

### Climbing

When the NPC encounters an obstacle taller than step-up height but within `maxClimbHeight`, it enters the `ASCENDING` motion kind. Climb speed follows the formula: `climbSpeedConst + climbSpeedMult * walkSpeed ^ climbSpeedPow`.

### Jumping

Jumps trigger when the obstacle exceeds `minJumpHeight` and the distance exceeds `minJumpDistance`. The jump trajectory is shaped by `jumpForce`, `jumpBlending` (0 = curved, 1 = linear ascent), and `jumpDescentBlending` / `jumpDescentSteepness` for the descent arc.

### Hover

When `maxHover > 0`, the NPC hovers above ground with a sinusoidal oscillation between `minHover` and `maxHover` at `hoverFreq` Hz. Hover height adjusts during climbing (contracts) and dropping (expands). If `floatsDown` is true, the NPC gently descends; otherwise gravity applies normally.

### Descent

Descent animation is controlled by `descentAnimationType` (Walk, Fall, or Idle) and triggers when the predicted fall height exceeds `minDescentAnimationHeight`. Descent steepness and blending shape the forward motion curve during descent.

## Overrides

- getType() | "Walk" | Type identifier
- is2D() | true | Uses 2D projected pathfinding
- canRestAtPlace() | true | Can idle on ground
- getWanderVerticalMovementRatio() | 0.0 | No vertical wandering
- onGround() | boolean | Ground contact from footing probe
- inWater() | boolean | Fluid contact state

## Inner Enums

### DescentAnimationType


public static enum DescentAnimationType { Walk, Fall, Idle }

Controls which animation plays when the NPC walks downward over terrain.

### AscentAnimationType


public static enum AscentAnimationType { Walk, Jump, Climb, Fly, Idle }

Controls which animation plays when the NPC climbs upward over terrain.

Also in this package: AppliedVelocity, AscentAnimationType, BuilderMotionControllerMapUtil, DescentAnimationType, MotionControllerBase, MotionControllerDive, MotionControllerFly, ProbeMoveData, Segment, Type

Complete API:
  public String getType()
  public void spawned()
  public double getWanderVerticalMovementRatio()
  public MotionController.VerticalRange getDesiredVerticalRange(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  protected void adjustReadPosition(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  protected void adjustWritePosition(Ref<EntityStore> ref, double dt, ComponentAccessor<EntityStore> componentAccessor)
  protected void updateAscendingStates(Ref<EntityStore> ref, MovementStates movementStates, boolean fastMotionKind, boolean horizontalIdleKind, ComponentAccessor<EntityStore> componentAccessor)
  protected void updateDescendingStates(Ref<EntityStore> ref, MovementStates movementStates, boolean fastMotionKind, boolean hovering, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isFastMotionKind(double speed)
  public boolean isInProgress()
  public boolean canAct(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public String canActFailReason(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void updateModelParameters(Ref<EntityStore> ref, Model model, Box boundingBox, ComponentAccessor<EntityStore> componentAccessor)
  public void constrainRotations(Role role, TransformComponent transform)
  public void forceVelocity(Vector3d velocity, VelocityConfig velocityConfig, boolean ignoreDamping)
  public boolean inAir()
  public boolean onGround()
  public boolean standingOnBlockOfType(int blockSet)
  public boolean inWater()
  public boolean touchesWater(boolean defaultValue, ComponentAccessor<EntityStore> componentAccessor)
  public double getCurrentSpeed()
  public double getCurrentTurnRadius()
  public float getMaxClimbAngle()
  public float getMaxSinkAngle()
  public double getMaximumSpeed()
  public boolean is2D()
  public boolean canRestAtPlace()
  public double getDesiredAltitudeWeight()
  public double getHeightOverGround()
  public boolean estimateVelocity(Steering steering, Vector3d velocityOut)
  public void setMotionKind(MotionKind motionKind)
  public void postReadPosition(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public boolean translateToAccessiblePosition(Vector3d position, Box boundingBox, double minYValue, double maxYValue, ComponentAccessor<EntityStore> componentAccessor)
  public int translateToAccessiblePosition(Vector3d position, double minYValue, double maxYValue, ComponentAccessor<EntityStore> componentAccessor)
  protected double computeMove(Ref<EntityStore> ref, Role role, Steering steering, double dt, Vector3d translation, ComponentAccessor<EntityStore> componentAccessor)
  private double computeNewFallSpeed(double dt, double fallSpeed)
  protected double executeMove(Ref<EntityStore> ref, Role role, double dt, Vector3d translation, ComponentAccessor<EntityStore> componentAccessor)
  public double probeMove(Ref<EntityStore> ref, ProbeMoveData probeMoveData, ComponentAccessor<EntityStore> componentAccessor)
  protected void postExecuteMove()
  public double getCurrentMaxBodyRotationSpeed()
  protected float computeHeading(float desiredAngle, double relativeTurnSpeed, float heading, double dt, boolean updateFullyRotated, boolean stopIfTurnedTooFar)
  protected boolean initiateDescend(Vector3d translation, boolean wasOnGround, String logName, ComponentAccessor<EntityStore> componentAccessor)
  protected double updateMovementVector(Vector3d probePosition, Vector3d probeMovement, Vector3d targetPosition, Vector3d directionComponentSelector)
  private BlockCollisionData discardIgnorableSlideCollisions(CollisionResult collisionResult, BlockCollisionData startCollision, boolean acknowledgeDamage)
  private BlockCollisionData getFirstCollision(CollisionResult collisionResult, boolean acknowledgeDamage)
  private double bisect(Vector3d validPosition, Vector3d invalidPosition, Vector3d result, ComponentAccessor<EntityStore> componentAccessor)
  private double shortenSlide(Vector3d translation, double endSlide)
  private double shortenMovement(Vector3d start, Vector3d end, Vector3d result)
  private double shortenMovement(double triggerScale)
  private void validateTranslation(Vector3d translation, String kind)
  private void validateSpeeds(Ref<EntityStore> ref, String kind, ComponentAccessor<EntityStore> componentAccessor)
  private void lockOrientation(Steering steering, Vector3d translation, float heading)
  private float computeBlendHeading(float heading, float moveHeading, double dt, double speedEstimate, double relativeTurnSpeed)
  private float computeBlendHeading(float heading, float moveHeading, double dt, double speedEstimate, float turnAngle, double relativeTurnSpeed)
  private float computeBlendTurnAngle(float heading, float moveHeading)
  private double computeClimbMove(Vector3d climbDirection, double climbDistance, double distance, Vector3d translation)
  private void computeDescendDirection(Vector3d translation)
  private double computeClimbSpeed(double walkSpeed)
  private boolean tryClimb(Vector3d translation, boolean avoidingBlockDamage, boolean relaxMoveConstraints, ComponentAccessor<EntityStore> componentAccessor)
  private double computeClimbHeight(Vector3d position, Vector3d direction, double height, double forward, Vector3d targetPosition, Vector2d results, boolean acknowledgeDamage, boolean relaxMoveConstraints, ComponentAccessor<EntityStore> componentAccessor)
  private boolean isDropBlocked(Vector3d position, double maxDropHeight, boolean updatePosition, boolean acknowledgeDamage, boolean relaxedMoveConstraints, ComponentAccessor<EntityStore> componentAccessor)
  private double dropDistance(Vector3d position, double maxTestDistance, ComponentAccessor<EntityStore> componentAccessor)
  private BlockCollisionData findDropBlockCollision(Vector3d position, double maxTestDistance, ComponentAccessor<EntityStore> componentAccessor)
  private boolean isClimbable(BlockType blockType, Fluid fluid, boolean avoidDamageBlocks)
  private boolean isValidWalkPosition(Ref<ChunkStore> chunkRef, ComponentAccessor<ChunkStore> chunkStore, double x, double y, double z, boolean acknowledgeDamage, boolean relaxedMoveConstraints)
  private boolean isValidWalkPosition(ChunkStore chunkStore, double x, double y, double z, boolean acknowledgeDamage, boolean relaxedMoveConstraints)
  private double maxMoveFactor(Vector3d position, Vector3d velocity, boolean acknowledgeDamage, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final String TYPE
public static final double CLIMB_FORWARD_DISTANCE
public static final double CLIMB_FORWARD_DISTANCE_SQUARED
public static final double JUMP_FORWARD_DISTANCE
public static final double ONE_PLUS_THRESHOLD
public static final double DROP_MIN_STOP_DIST
protected static final EnumSet<MotionKind> STATE_CAN_HOVER
protected static final EnumSet<MotionKind> VALID_MOTIONS
protected static final int COLLISION_MATERIALS
protected static final int WALKING_MATERIALS
protected static final int WALKING_MATERIALS_RELAXED
protected final double minHorizontalSpeed
protected final double maxVerticalSpeed
protected final double maxVerticalSpeedFluid
protected final double acceleration
protected final double maxRotationSpeed
protected final float maxMoveTurnAngle
protected final float blendRestTurnAngle
protected final double blendRestRelativeSpeed
protected final double maxClimbHeight
protected final double jumpHeight
protected final double minJumpHeight
protected final double minJumpDistance
protected final double jumpForce
protected final double jumpDescentSteepness
protected final double jumpBlending
protected final double jumpDescentBlending
protected final double climbSpeedMult
protected final double climbSpeedPow
protected final double climbSpeedConst
protected final double maxDropHeight
protected final double minDescentAnimationHeight
protected final double descendFlatness
protected final double descendSpeedCompensation
protected final double descentSteepness
protected final double descentBlending
protected final MotionControllerWalk.DescentAnimationType descentAnimationType
protected final MotionControllerWalk.AscentAnimationType ascentAnimationType
protected final double maxWalkSpeedAfterHitMultiplier
protected final int fenceBlockSet
protected final double minHover
protected final double maxHover
protected final double hoverFreq
protected final float hoverCycle
protected final double minHoverClimb
protected final double minHoverDrop
protected final boolean floatsDown
protected boolean onGround
protected boolean inWater
protected double horizontalSpeedMultiplier
protected double fallStartHeight
protected double fallSpeed
protected double currentRelativeSpeed
protected boolean isFullyRotated
protected BlockType belowBlockType
protected int belowBlockTypeId
protected int[] footingBlocks
protected short[] footingFillers
protected byte[] footingRotations
protected final Vector3d footingPosition
protected boolean footingBlocksValid
protected double breathingDepth
protected double constraintDepth
protected double climbUpDistance
protected double currentJumpHeight
protected double jumpDropHeight
protected double jumpBlockHeight
protected double predictedFallHeight
protected final Vector3d jumpDropDirection
protected final Vector3d climbUpDirection
protected double currentClimbForwardDistance
protected double maxClimbForwardDistance
protected double totalDropDistance
protected final Vector3d climbForwardDirection
protected double climbSpeed
protected boolean jumping
protected final MotionController.VerticalRange verticalRange
protected final Vector3d tmpClimbPosition
protected final Vector3d tmpClimbMovement
protected final Vector3d tmpMovePosition
protected final CollisionResult tmpResults
protected final Vector2d tmpClimbHeightResults
