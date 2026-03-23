# AStarNodePoolSimple

Type: class | Package: com.hypixel.hytale.server.npc.navigation

public class AStarNodePoolSimple

List-backed node pool implementation. Reuses deallocated `AStarNode` instances from an internal list.

Also in this package: AStarBase, AStarDebugBase, AStarDebugWithTarget, AStarEvaluator, AStarNode, AStarNodePool, AStarNodePoolProvider, AStarNodePoolProviderSimple, AStarWithTarget, FrozenWaypoint, IWaypoint, PathFollower, Progress

Complete API:
  public AStarNode allocate()
  public void deallocate(AStarNode node)

Fields:
protected final List<AStarNode> nodePool
private final int childCount
