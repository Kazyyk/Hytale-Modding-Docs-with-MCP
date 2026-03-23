# BodyMotionWanderBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionFindBase<AStarBase>

public abstract class BodyMotionWanderBase extends BodyMotionFindBase<AStarBase>

Abstract base for wandering behaviors. Extends `BodyMotionFindBase` with configurable idle pause durations between wander goals. Subclasses define the wander area shape.

Known subclasses: BodyMotionWander, BodyMotionWanderInCircle, BodyMotionWanderInRect

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public void deactivate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean findBestDirection(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  protected abstract double constrainMove(Ref<EntityStore> var1, Role var2, Vector3d var3, Vector3d var4, double var5, ComponentAccessor<EntityStore> var7)
  protected void restartSearch(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController activeMotionController, ComponentAccessor<EntityStore> componentAccessor)
  protected void computeHeightRange(Ref<EntityStore> ref, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean probeDirection(Ref<EntityStore> ref, int dirIndex, Role role, ComponentAccessor<EntityStore> componentAccessor)
  private void computeTargetPosition(Ref<EntityStore> ref, float heading, double distance, ComponentAccessor<EntityStore> componentAccessor)
  protected float toAngle(Ref<EntityStore> ref, int direction, ComponentAccessor<EntityStore> componentAccessor)
  private int addPreOrderedDirection(int direction, int count)

Fields:
public static final HytaleLogger LOGGER
public static final int DIRECTION_COUNT
public static final float SEGMENT_ANGLE
public static final double MIN_DISTANCE_SHRINK
public static final double MIN_DISTANCE_SHRINK_SCALE
protected final double minWalkTime
protected final double maxWalkTime
protected final float minHeadingChange
protected final float maxHeadingChange
protected final byte minDirection
protected final byte maxDirection
protected final boolean relaxHeadingChange
protected final double relativeSpeed
protected final double minMoveDistance
protected final double stopDistance
protected final int testsPerTick
protected final boolean isAvoidingBlockDamage
protected final boolean isRelaxedMoveConstraints
protected final double desiredAltitudeWeight
protected final byte[] preOrderedDirections
protected final int insideConeCount
protected final Vector3d targetPosition
protected final Vector3d probeDirection
protected final Vector3d probePosition
protected final SteeringForcePursue seekTarget
protected final ProbeMoveData probeMoveData
protected boolean debugSteer
protected BodyMotionWanderBase.State state
protected float angleOffset
protected double probeDY
protected double maxDistanceAbove
protected double maxDistanceBelow
protected double walkTime
protected float walkHeading
protected double walkDistance
protected int directionIndex
protected double desiredWalkDistance
protected final double[] walkDistances
protected final byte[] walkDirections
