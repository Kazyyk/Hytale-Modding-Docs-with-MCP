# BodyMotionFind

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionFindWithTarget

public class BodyMotionFind extends BodyMotionFindWithTarget

Pathfinds to a sensor-provided target position using A* navigation. Core pursue behavior for NPC movement. Configurable distance thresholds control when the NPC considers the goal reached, when to abort, and when to switch from pathfinding to direct steering.

## Key Fields

- distance | double | Goal-reached distance threshold
- reachable | boolean | Whether the target must be reachable
- heightDifferenceMin` / `heightDifferenceMax | double | Vertical range constraints
- abortDistance | double | Distance at which pathfinding aborts
- switchToSteeringDistance | double | Distance at which A* switches to direct steering

Known subclasses: BodyMotionLand

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  protected boolean canSwitchToSteering(Ref<EntityStore> ref, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean shouldSkipSteering(Ref<EntityStore> ref, MotionController activeMotionController, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean computeSteering(Ref<EntityStore> ref, Role role, Vector3d position, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  public boolean canComputeMotion(Ref<EntityStore> ref, Role role, InfoProvider infoProvider, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean isGoalReached(Ref<EntityStore> ref, MotionController motionController, Vector3d position, Vector3d targetPosition, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isGoalReached(Ref<EntityStore> ref, AStarBase aStarBase, AStarNode aStarNode, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public float estimateToGoal(AStarBase aStarBase, Vector3d fromPosition, MotionController motionController)
  public void findBestPath(AStarBase aStarBase, MotionController controller)
  protected void onThrottling(MotionController motionController, Ref<EntityStore> ref, Steering steering, ComponentAccessor<EntityStore> componentAccessor)
  protected void onDeferring(MotionController motionController, Ref<EntityStore> ref, Steering steering, ComponentAccessor<EntityStore> componentAccessor)
  protected void lookAtTarget(Ref<EntityStore> ref, Steering steering, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean canReachTarget(Ref<EntityStore> ref, MotionController motionController, Vector3d position, Vector3d targetPosition, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean isBoundingBoxesOverlapping(Vector3d position, Vector3d endPosition)
  protected boolean containsPosition(Vector3d position, Vector3d endPosition)
  protected static boolean containsPosition(double p, double min, double max, double v)

Fields:
protected final double distance
protected final double distanceSquared
protected final boolean reachable
protected final double heightDifferenceMin
protected final double heightDifferenceMax
protected final double abortDistance
protected final double abortDistanceSquared
protected final double switchToSteeringDistance
protected final double switchToSteeringDistanceSquared
protected final SteeringForcePursue seek
protected final Vector3d tempDirectionVector
protected double effectiveDistanceSquared
