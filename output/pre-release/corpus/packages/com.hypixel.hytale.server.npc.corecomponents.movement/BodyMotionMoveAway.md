# BodyMotionMoveAway

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionFindWithTarget

public class BodyMotionMoveAway extends BodyMotionFindWithTarget

Flees from a target position using pathfinding and evade steering. Supports configurable flee direction holding, jitter angles for erratic movement, and distance-based erratic behavior escalation.

## Key Fields

- stopDistance | double | Distance at which fleeing stops
- holdDirectionDurationRange | double[] | Duration range for holding a flee direction
- jitterAngle | float | Angular jitter for flee direction variation
- erraticDistanceSquared | double | Distance threshold for erratic movement

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider infoProvider, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean computeSteering(Ref<EntityStore> ref, Role role, Vector3d position, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isGoalReached(Ref<EntityStore> ref, AStarBase aStarBase, AStarNode aStarNode, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean isGoalReached(Ref<EntityStore> ref, MotionController motionController, Vector3d position, Vector3d lastTestedPosition, ComponentAccessor<EntityStore> componentAccessor)
  public float estimateToGoal(AStarBase aStarBase, Vector3d fromPosition, MotionController motionController)
  public void findBestPath(AStarBase aStarBase, MotionController controller)

Fields:
protected final double stopDistance
protected final double stopDistanceSquared
protected final double[] holdDirectionDurationRange
protected final float changeDirectionViewSector
protected final float jitterAngle
protected final double erraticDistanceSquared
protected final float erraticJitter
protected final double erraticChangeDurationMultiplier
protected final SteeringForceEvade evade
protected float fleeDirection
protected double holdDirectionTimeRemaining
