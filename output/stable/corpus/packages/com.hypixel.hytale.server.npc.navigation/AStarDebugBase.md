# AStarDebugBase

Type: class | Package: com.hypixel.hytale.server.npc.navigation

public class AStarDebugBase

Debug visualization helper for A* pathfinding. Renders ASCII grid maps of visited/open/path nodes and dumps open node lists and path details to the logger.

Known subclasses: AStarDebugWithTarget

Also in this package: AStarBase, AStarDebugWithTarget, AStarEvaluator, AStarNode, AStarNodePool, AStarNodePoolProvider, AStarNodePoolProviderSimple, AStarNodePoolSimple, AStarWithTarget, FrozenWaypoint, IWaypoint, PathFollower, Progress

Complete API:
  public void dumpOpens(MotionController controller)
  public void dumpPath()
  public void dumpMap(boolean drawPath, MotionController controller)
  public void dumpMap(AStarNode pathNode, boolean isFinalPath, MotionController controller)
  protected void plot(long positionIndex, char character, StringBuilder[] map, int minX, int minZ)
  protected void drawMapFinish(StringBuilder[] map, int minX, int minZ)
  protected int getDumpMapRegionZ(int def)
  protected int getDumpMapRegionX(int def)
  protected String getExtraLogString(MotionController controller)

Fields:
public static final char CENTER
public static final char CROSS
public static final char HLINE
public static final char VLINE
public static final char OPEN_NODE
public static final char CLOSED_NODE
public static final char CLOSED_PATH_NODE
public static final char OPEN_PATH_NODE
public static final char BLOCKED_NODE
public static final char START_POSITION
public static final char END_POSITION
public static final String BORDER_PATTERN
public static final String CENTER_PATTERN
protected AStarBase aStarBase
protected HytaleLogger logger
protected HytaleLogger.Api loggerInfo
