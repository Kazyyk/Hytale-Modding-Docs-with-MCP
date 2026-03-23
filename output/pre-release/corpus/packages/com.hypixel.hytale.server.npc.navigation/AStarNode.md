# AStarNode

Type: class | Package: com.hypixel.hytale.server.npc.navigation

public class AStarNode

Node in the A* search graph. Stores position, position index, travel cost, estimated cost, predecessor chain, successor links by direction, and path length. Implements `IWaypoint`.

Also in this package: AStarBase, AStarDebugBase, AStarDebugWithTarget, AStarEvaluator, AStarNodePool, AStarNodePoolProvider, AStarNodePoolProviderSimple, AStarNodePoolSimple, AStarWithTarget, FrozenWaypoint, IWaypoint, PathFollower, Progress

Complete API:
  public long getPositionIndex()
  public AStarNode[] getSuccessors()
  public AStarNode getSuccessor(int index)
  public void setSuccessor(int directionIndex, AStarNode node, int inverseDirectionIndex, float cost)
  public AStarNode getPredecessor()
  public AStarNode getNextPathNode()
  public void setNextNode(AStarNode next, int length)
  public float getTravelCost()
  public float getEstimateToGoal()
  public float getTotalCost()
  public int getPredecessorDirection()
  public void close()
  public boolean isOpen()
  public boolean isInvalid()
  public int getLength()
  public AStarNode next()
  public Vector3d getPosition()
  public AStarNode advance(int skip)
  public AStarNode initAsStartNode(Vector3d position, long positionIndex, float cost, float estimateCost)
  public AStarNode initWithPredecessor(AStarNode predecessor, int directionIndex, Vector3d position, long positionIndex, int inverseDirectionIndex, float travelCost, float estimateCost)
  public AStarNode initAsInvalid(Vector3d position, long positionIndex)
  public void adjustOptimalPath(AStarNode parentNode, float deltaCost, int direction)
  public String toString()

Fields:
public static final AStarNode ENTRY_NODE_TAG
protected final Vector3d position
protected float travelCost
protected float estimateToGoal
protected float totalCost
protected AStarNode predecessor
protected int predecessorDirection
protected final AStarNode[] successors
protected final float[] stepCost
protected AStarNode nextPathNode
protected int length
protected long positionIndex
protected boolean open
