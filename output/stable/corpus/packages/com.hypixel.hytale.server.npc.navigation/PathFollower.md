# PathFollower

Type: class | Package: com.hypixel.hytale.server.npc.navigation

public class PathFollower

Steers an entity along a waypoint path. Handles waypoint radius detection, path smoothing via binary-search line-of-sight skipping, heading blending, rejection-based steering, and frozen waypoint support for final approach.

Also in this package: AStarBase, AStarDebugBase, AStarDebugWithTarget, AStarEvaluator, AStarNode, AStarNodePool, AStarNodePoolProvider, AStarNodePoolProviderSimple, AStarNodePoolSimple, AStarWithTarget, FrozenWaypoint, IWaypoint, Progress

Complete API:
  public void setPathSmoothing(int pathSmoothing)
  public double getRelativeSpeed()
  public void setRelativeSpeed(double relativeSpeed)
  public void setRelativeSpeedWaypoint(double relativeSpeedWaypoint)
  public void setWaypointRadius(double waypointRadius)
  public void setDebugNodes(boolean debugNodes)
  public boolean shouldSmoothPath()
  public void setRejectionWeight(double rejectionWeight)
  public void setBlendHeading(double blendHeading)
  public IWaypoint getCurrentWaypoint()
  public Vector3d getCurrentWaypointPosition()
  public IWaypoint getNextWaypoint()
  public Vector3d getNextWaypointPosition()
  public void setPath(IWaypoint firstWaypoint, Vector3d startPosition)
  public void clearPath()
  public boolean pathInFinalStage()
  public boolean freezeWaypoint()
  public boolean isWaypointFrozen()
  public void setWaypointFrozen(boolean waypointFrozen)
  public void executePath(Vector3d currentPosition, MotionController activeMotionController, Steering desiredSteering)
  public void computeRejection(Vector3d currentPosition, Vector3d target, MotionController activeMotionController)
  public boolean updateCurrentTarget(Vector3d entityPosition, MotionController motionController)
  public void smoothPath(Ref<EntityStore> ref, Vector3d position, MotionController motionController, ProbeMoveData probeMoveData, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean canMoveTo(Ref<EntityStore> ref, MotionController motionController, Vector3d position, Vector3d targetPosition, ProbeMoveData probeMoveData, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected IWaypoint currentWaypoint
protected double currentWaypointDistanceSquared
protected PathFollower.FrozenWaypoint frozenWaypoint
protected boolean isWaypointFrozen
protected final Vector3d lastWaypointPosition
protected final Vector3d direction
protected final Vector3d tempVector
protected final Vector3d tempPath
protected final Vector3d projection
protected final Vector3d rejection
protected int pathSmoothing
protected double blendHeading
protected double relativeSpeed
protected double relativeSpeedWaypoint
protected double waypointRadius
protected double rejectionWeight
protected double waypointRadiusSquared
protected boolean debugNodes
protected boolean shouldSmoothPath
