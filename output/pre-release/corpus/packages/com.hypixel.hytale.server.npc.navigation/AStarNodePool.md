# AStarNodePool

Type: interface | Package: com.hypixel.hytale.server.npc.navigation

public interface AStarNodePool

Object pool interface for A* nodes. Provides `allocate()` and `deallocate(AStarNode)` to reduce garbage collection pressure during pathfinding.

Known implementors: AStarNodePoolSimple

Also in this package: AStarBase, AStarDebugBase, AStarDebugWithTarget, AStarEvaluator, AStarNode, AStarNodePoolProvider, AStarNodePoolProviderSimple, AStarNodePoolSimple, AStarWithTarget, FrozenWaypoint, IWaypoint, PathFollower, Progress

Complete API:
  AStarNode allocate()
  void deallocate(AStarNode var1)
