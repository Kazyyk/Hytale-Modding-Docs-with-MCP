# AStarWithTarget

Type: class | Package: com.hypixel.hytale.server.npc.navigation

public class AStarWithTarget

A* implementation extended with a target position. Provides `findClosestPath()` for partial pathfinding when the goal is unreachable.

Also in this package: AStarBase, AStarDebugBase, AStarDebugWithTarget, AStarEvaluator, AStarNode, AStarNodePool, AStarNodePoolProvider, AStarNodePoolProviderSimple, AStarNodePoolSimple, FrozenWaypoint, IWaypoint, PathFollower, Progress

Complete API:
  public Vector3d getTargetPosition()
  public long getTargetPositionIndex()
  public AStarDebugWithTarget createDebugHelper(HytaleLogger logger)
  public AStarBase.Progress initComputePath(Ref<EntityStore> ref, Vector3d start, Vector3d end, AStarEvaluator evaluator, MotionController motionController, ProbeMoveData probeMoveData, AStarNodePoolProvider nodePoolProvider, ComponentAccessor<EntityStore> componentAccessor)
  public float findClosestPath()

Fields:
protected Vector3d targetPosition
protected long targetPositionIndex
