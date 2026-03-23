# AStarBase

Type: class | Package: com.hypixel.hytale.server.npc.navigation

public class AStarBase

Core A* pathfinding implementation. Manages open/visited node lists, half-block grid indexing, search direction computation (2D/3D, diagonal), motion controller integration, and path construction. Supports node limits, optimized path building, and multiple path strategies (longest, furthest, closest).

Known subclasses: AStarWithTarget

Also in this package: AStarDebugBase, AStarDebugWithTarget, AStarEvaluator, AStarNode, AStarNodePool, AStarNodePoolProvider, AStarNodePoolProviderSimple, AStarNodePoolSimple, AStarWithTarget, FrozenWaypoint, IWaypoint, PathFollower, Progress

Complete API:
  public void setCanMoveDiagonal(boolean canMoveDiagonal)
  public void setMaxPathLength(int maxPathLength)
  public void setOpenNodesLimit(int openNodesLimit)
  public void setTotalNodesLimit(int totalNodesLimit)
  public void setStartPosition(Vector3d position)
  public Vector3d getStartPosition()
  public void setOptimizedBuildPath(boolean optimizedBuildPath)
  public AStarEvaluator getEvaluator()
  public List<AStarNode> getOpenNodes()
  public int getOpenCount()
  public Long2ObjectMap<AStarNode> getVisitedBlocks()
  public long getStartPositionIndex()
  public AStarNode getPath()
  public Vector3d getPosition()
  public int getLength()
  public int getIterations()
  public Vector3d getEndPosition()
  public void clearPath()
  public AStarBase.Progress initComputePath(Ref<EntityStore> ref, Vector3d start, AStarEvaluator evaluator, MotionController motionController, ProbeMoveData probeMoveData, AStarNodePoolProvider nodePoolProvider, ComponentAccessor<EntityStore> componentAccessor)
  public AStarBase.Progress computePath(Ref<EntityStore> ref, MotionController motionController, ProbeMoveData probeMoveData, int nodesToProcess, ComponentAccessor<EntityStore> componentAccessor)
  public AStarBase.Progress getProgress()
  public boolean isComputing()
  public float buildLongestPath()
  public float buildFurthestPath()
  public AStarNode buildBestPath(ToFloatFunction<AStarNode> weight, BiFloatPredicate predicate, float initialValue)
  public AStarNode findBestVisitedNode(ToFloatFunction<AStarNode> weight, BiFloatPredicate predicate, float initialValue)
  public AStarNode buildBestPath(BiToFloatFunction<AStarNode,T> weight, BiFloatPredicate predicate, float initialValue, T obj)
  public AStarNode findBestVisitedNode(BiToFloatFunction<AStarNode,T> weight, BiFloatPredicate predicate, float initialValue, T obj)
  public AStarDebugBase createDebugHelper(HytaleLogger logger)
  public static long indexFromXYZ(long dx, long dy, long dz)
  public static int zFromIndex(long index)
  public static int yFromIndex(long index)
  public static int xFromIndex(long index)
  public static String positionIndexToString(long index)
  protected AStarBase.Progress setProgress(AStarBase.Progress progress)
  protected Vector3d canAdvance(Ref<EntityStore> ref, Vector3d startPosition, Vector3d destination, MotionController motionController, ProbeMoveData probeMoveData, ComponentAccessor<EntityStore> componentAccessor)
  protected void addStartNode(Vector3d startPosition, Vector3d position, MotionController motionController)
  protected void addOpenNode(AStarNode parentNode, int directionIndex, Vector3d position, long positionIndex, float cost, MotionController motionController)
  protected void addOpenNode(AStarNode node, long index)
  protected void updateNode(AStarNode node, int directionIndex, AStarNode targetNode, MotionController motionController)
  protected void addOrUpdateNode(AStarNode node, int directionIndex, Vector3d position, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  protected void updateNodeCost(AStarNode node, int directionIndex, AStarNode targetNode, float stepCost)
  protected long positionToIndex(Vector3d position)
  protected float measureWalkCost(Vector3d fromPosition, Vector3d toPosition, MotionController motionController)
  protected void buildPath(AStarNode endNode)
  protected long addOffsetToIndex(long index, long xSteps, long ySteps, long zSteps)

Fields:
public static final double FULL_STEP_THRESHOLD
public static final double REQUIRED_TARGET_DISTANCE
public static final double HALF_STEP_THRESHOLD
public static final double ON_GRID_THRESHOLD
protected static final int INDEX_FRACTIONAL_BITS
protected static final int POSITION_BITS
protected static final int POSITION_OFFSET
protected static final int POSITION_MASK
protected int maxPathLength
protected int openNodesLimit
protected int totalNodesLimit
protected boolean canMoveDiagonal
protected boolean optimizedBuildPath
protected boolean isAvoidingBlockDamage
protected boolean isRelaxedMoveConstraints
protected final Vector3d startPosition
protected AStarEvaluator evaluator
protected double positionToIndexOffsetX
protected double positionToIndexOffsetY
protected double positionToIndexOffsetZ
protected long indexToPositionOffsetX
protected long indexToPositionOffsetY
protected long indexToPositionOffsetZ
protected long startPositionIndex
protected boolean is2D
protected boolean projectedX
protected boolean projectedY
protected boolean projectedZ
protected final Vector3d searchDirectionsWorldNormal
protected boolean searchDirectionIsDiagonalMoves
protected boolean searchDirectionIs2D
protected Vector3d[] searchDirections
protected double[] searchDirectionDistances
protected int[] inverseSearchDirections
protected int normalsPerDirection
protected int[] normalDirections
protected AStarNodePool nodePool
protected final List<AStarNode> openNodes
protected final Long2ObjectMap<AStarNode> visitedBlocks
protected int iterations
protected AStarNode path
protected AStarBase.Progress progress
protected final Vector3d pathEnd
protected final Vector3d tempPositionVector
protected final Vector3d tempDirectionVector
