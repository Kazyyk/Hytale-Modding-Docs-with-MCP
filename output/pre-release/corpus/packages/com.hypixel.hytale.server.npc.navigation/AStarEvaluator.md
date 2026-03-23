# AStarEvaluator

Type: interface | Package: com.hypixel.hytale.server.npc.navigation

public interface AStarEvaluator

Strategy interface for A* goal testing and heuristic estimation. `isGoalReached()` determines path completion; `estimateToGoal()` provides the heuristic cost.

Known implementors: BodyMotionFindBase

Also in this package: AStarBase, AStarDebugBase, AStarDebugWithTarget, AStarNode, AStarNodePool, AStarNodePoolProvider, AStarNodePoolProviderSimple, AStarNodePoolSimple, AStarWithTarget, FrozenWaypoint, IWaypoint, PathFollower, Progress

Complete API:
  boolean isGoalReached(Ref<EntityStore> var1, AStarBase var2, AStarNode var3, MotionController var4, ComponentAccessor<EntityStore> var5)
  float estimateToGoal(AStarBase var1, Vector3d var2, MotionController var3)
