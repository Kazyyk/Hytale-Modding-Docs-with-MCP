# AStarNodePoolProviderSimple

Type: class | Package: com.hypixel.hytale.server.npc.navigation

public class AStarNodePoolProviderSimple

Simple pool provider implementing both `AStarNodePoolProvider` and `Resource<EntityStore>`. Caches `AStarNodePoolSimple` instances per direction count.

Also in this package: AStarBase, AStarDebugBase, AStarDebugWithTarget, AStarEvaluator, AStarNode, AStarNodePool, AStarNodePoolProvider, AStarNodePoolSimple, AStarWithTarget, FrozenWaypoint, IWaypoint, PathFollower, Progress

Complete API:
  public static ResourceType<EntityStore,AStarNodePoolProviderSimple> getResourceType()
  public AStarNodePool getPool(int childNodeCount)
  public Resource<EntityStore> clone()

Fields:
protected Int2ObjectMap<AStarNodePoolSimple> nodePools
