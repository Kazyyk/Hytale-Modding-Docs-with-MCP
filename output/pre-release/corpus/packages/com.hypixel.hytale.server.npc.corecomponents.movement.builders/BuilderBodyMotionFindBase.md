# BuilderBodyMotionFindBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders

public abstract class BuilderBodyMotionFindBase

Abstract base builder for pathfinding body motions. Configures steps per tick, max path length, steering, diagonal moves, and related parameters.

Known subclasses: BuilderBodyMotionFindWithTarget, BuilderBodyMotionLeave

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTakeOff, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public BuilderBodyMotionFindBase readConfig(JsonElement data)
  public EnumSet<BodyMotionFindBase.DebugFlags> getParsedDebugFlags()
  public int getNodesPerTick(BuilderSupport support)
  public int getMaxPathLength(BuilderSupport support)
  public int getMaxOpenNodes(BuilderSupport support)
  public int getMaxTotalNodes(BuilderSupport support)
  public boolean isDiagonalMoves(BuilderSupport support)
  public boolean getUseBestPath(BuilderSupport support)
  public boolean isBuildOptimisedPath(BuilderSupport support)
  public int getPathSmoothing(BuilderSupport support)
  public double getRelativeSpeed(BuilderSupport support)
  public double getRelativeSpeedWaypoint(BuilderSupport support)
  public double getWaypointRadius(BuilderSupport support)
  public double getRejectionWeight(BuilderSupport support)
  public double getBlendHeading(BuilderSupport support)
  public boolean isAvoidingBlockDamage(BuilderSupport support)
  public boolean isRelaxedMoveConstraints(BuilderSupport support)
  public double[] getThrottleDelayRange(BuilderSupport support)
  public int getThrottleIgnoreCount(BuilderSupport support)
  public boolean isUseSteering(BuilderSupport support)
  public boolean isUsePathfinder(BuilderSupport support)
  public boolean isSkipSteering(BuilderSupport support)
  public double getMinPathLength(BuilderSupport support)
  public double getDesiredAltitudeWeight(BuilderSupport support)

Fields:
protected static final double[] THROTTLE_DELAY
protected EnumSet<BodyMotionFindBase.DebugFlags> parsedDebugFlags
protected String debugFlags
protected final IntHolder nodesPerTick
protected final IntHolder maxPathLength
protected final IntHolder maxOpenNodes
protected final IntHolder maxTotalNodes
protected final BooleanHolder diagonalMoves
protected final BooleanHolder useBestPath
protected final BooleanHolder buildOptimisedPath
protected final IntHolder pathSmoothing
protected final DoubleHolder relativeSpeed
protected final DoubleHolder relativeSpeedWaypoint
protected final DoubleHolder waypointRadius
protected final DoubleHolder rejectionWeight
protected final DoubleHolder blendHeading
protected final BooleanHolder isAvoidingBlockDamage
protected final BooleanHolder isRelaxedMoveConstraints
protected final NumberArrayHolder throttleDelayRangeHolder
protected final IntHolder throttleIgnoreCount
protected final BooleanHolder useSteering
protected final BooleanHolder usePathfinder
protected final BooleanHolder skipSteering
protected final DoubleHolder minPathLength
protected final DoubleHolder desiredAltitudeWeight
protected final boolean enableSteering
