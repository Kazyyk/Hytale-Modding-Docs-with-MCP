# IWaypoint

Type: interface | Package: com.hypixel.hytale.server.npc.navigation

public interface IWaypoint

Interface for path waypoints. Exposes `getLength()`, `getPosition()`, `advance(int)`, and `next()` for path traversal.

Known implementors: AStarNode, FrozenWaypoint

Also in this package: AStarBase, AStarDebugBase, AStarDebugWithTarget, AStarEvaluator, AStarNode, AStarNodePool, AStarNodePoolProvider, AStarNodePoolProviderSimple, AStarNodePoolSimple, AStarWithTarget, FrozenWaypoint, PathFollower, Progress

Complete API:
  int getLength()
  Vector3d getPosition()
  IWaypoint advance(int var1)
  IWaypoint next()
