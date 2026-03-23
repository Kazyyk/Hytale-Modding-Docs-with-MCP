# BodyMotionFindWithTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionFindBase<AStarWithTarget>

public abstract class BodyMotionFindWithTarget extends BodyMotionFindBase<AStarWithTarget>

Extension of `BodyMotionFindBase` that tracks a target entity reference. Monitors target movement and triggers path recomputation when the target moves beyond configured thresholds. Supports adjusting range by hitbox size.

## Key Fields

- minMoveDistanceWait | double | Target movement distance before waiting
- minMoveDistanceRecompute | double | Target movement distance triggering recompute
- minMoveDistanceReproject | double | Target movement distance triggering reproject
- adjustRangeByHitboxSize | boolean | Whether to adjust goal range by target bounding box

Known subclasses: BodyMotionFind, BodyMotionMoveAway

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public boolean canComputeMotion(Ref<EntityStore> ref, Role role, InfoProvider infoProvider, ComponentAccessor<EntityStore> componentAccessor)
  public boolean mustRecomputePath(MotionController activeMotionController)
  public void forceRecomputePath(MotionController activeMotionController)
  public boolean shouldDeferPathComputation(MotionController motionController, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean mustAbortThrottling(MotionController motionController, Ref<EntityStore> ref)
  public boolean isGoalReached(Ref<EntityStore> ref, MotionController activeMotionController, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public AStarBase.Progress startComputePath(Ref<EntityStore> ref, Role role, MotionController activeMotionController, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public void onBlockedPath()
  public void onNoPathFound(MotionController motionController)
  protected void onSteering(MotionController activeMotionController, Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  protected void decorateDebugString(StringBuilder dbgString)
  protected abstract boolean isGoalReached(Ref<EntityStore> var1, MotionController var2, Vector3d var3, Vector3d var4, ComponentAccessor<EntityStore> var5)
  protected Vector3d getLastTargetPosition()
  protected Vector3d getLastAccessibleTargetPosition(MotionController motionController, boolean approximate, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final double minMoveDistanceWait
protected final double minMoveDistanceWaitSquared
protected final double minMoveDistanceRecompute
protected final double minMoveDistanceRecomputeSquared
protected final float cosHalfRecomputeConeAngle
protected final double minMoveDistanceReproject
protected final double minMoveDistanceReprojectSquared
protected final boolean adjustRangeByHitboxSize
protected final Vector3d lastPathedPosition
protected final Vector3d conePosition
protected final Vector3d coneDirection
protected Box targetBoundingBox
protected Box selfBoundingBox
protected boolean waitForTargetMovement
private final Vector3d lastTargetPosition
private final Vector3d lastAccessibleTargetPosition
private boolean haveValidTargetPosition
private boolean haveAccessibleTargetPosition
private boolean lastAccessibleTargetPositionIsCurrent
protected String self
protected String other
