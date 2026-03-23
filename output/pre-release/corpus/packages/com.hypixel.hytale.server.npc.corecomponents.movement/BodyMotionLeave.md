# BodyMotionLeave

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionFindBase<AStarBase>

public class BodyMotionLeave extends BodyMotionFindBase<AStarBase>

Moves the NPC away from a position using A* pathfinding. Goal is reached when the NPC exceeds the configured distance from the starting position. Uses a basic `AStarBase` (no target tracking).

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public boolean isGoalReached(Ref<EntityStore> ref, MotionController controller, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isGoalReached(Ref<EntityStore> ref, AStarBase aStarBase, AStarNode aStarNode, MotionController controller, ComponentAccessor<EntityStore> componentAccessor)
  public float estimateToGoal(AStarBase aStarBase, Vector3d fromPosition, MotionController motionController)
  public void findBestPath(AStarBase aStarBase, MotionController controller)

Fields:
protected final double distanceSquared
