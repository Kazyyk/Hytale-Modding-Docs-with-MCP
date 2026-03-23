# BodyMotionFindBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionBase | Implements: A, S, t, a, r, E, v, a, l, u, a, t, o, r

public abstract class BodyMotionFindBase<T extends AStarBase> extends BodyMotionBase implements AStarEvaluator

Abstract base class for pathfinding motions with A* integration. Manages the pathfinding lifecycle: path computation, path following, throttling, and debug visualization. Subclasses provide goal-reached and goal-evaluation logic.

## Key Fields

- nodesPerTick | int | Maximum A* nodes expanded per tick
- useBestPath | boolean | Whether to use the best partial path if goal is unreachable
- throttleDelayMin | double | Minimum delay between path recomputations

Known subclasses: BodyMotionFindWithTarget, BodyMotionLeave

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public void deactivate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider infoProvider, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  public abstract void findBestPath(AStarBase var1, MotionController var2)
  protected boolean startPathFinder(Ref<EntityStore> ref, Vector3d position, Role role, MotionController activeMotionController, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean continuePathFinder(Ref<EntityStore> ref, MotionController activeMotionController, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean updatePathFollower(Ref<EntityStore> ref, Vector3d position, MotionController activeMotionController, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean canSwitchToSteering(Ref<EntityStore> ref, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean shouldSkipSteering(Ref<EntityStore> ref, MotionController activeMotionController, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean computeSteering(Ref<EntityStore> ref, Role role, Vector3d position, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean scaleSteering(Ref<EntityStore> ref, Role role, SteeringForceWithTarget steeringForce, Steering desiredSteering, double desiredAltitudeWeight, ComponentAccessor<EntityStore> componentAccessor)
  protected double computeDesiredYTranslation(Steering desiredSteering, float maxAngle, double desiredAltitudeWeight)
  protected void onNoPathFound(MotionController motionController)
  protected void onBlockedPath()
  protected void onSteering(MotionController activeMotionController, Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  protected void onThrottling(MotionController motionController, Ref<EntityStore> ref, Steering steering, ComponentAccessor<EntityStore> componentAccessor)
  protected void onDeferring(MotionController motionController, Ref<EntityStore> ref, Steering steering, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean mustAbortThrottling(MotionController motionController, Ref<EntityStore> ref)
  protected abstract boolean isGoalReached(Ref<EntityStore> var1, MotionController var2, Vector3d var3, ComponentAccessor<EntityStore> var4)
  protected void setNavState(NavState state, String label, boolean reset, MotionController activeMotionController)
  protected void decorateDebugString(StringBuilder dbgString)
  protected void setNavStateInit(MotionController motionController)
  protected void setNavStateComputing(MotionController motionController)
  protected void setNavStateDeferred(MotionController motionController)
  protected void setNavStateAtGoal(MotionController motionController)
  protected void setNavStateFollowing(MotionController motionController)
  protected void setNavStateSteering(MotionController motionController)
  protected void setNavStateBlocked(MotionController motionController)
  protected void setNavStateAborted(MotionController motionController)
  protected void setNavStateThrottling(MotionController motionController)
  protected void setPath(Ref<EntityStore> ref, Vector3d position, MotionController activeMotionController, ComponentAccessor<EntityStore> componentAccessor)
  protected void resetThrottleCount()
  protected AStarBase.Progress startComputePath(Ref<EntityStore> ref, Role role, MotionController activeMotionController, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean shouldDeferPathComputation(MotionController motionController, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean canComputeMotion(Ref<EntityStore> ref, Role role, InfoProvider positionProvider, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean mustRecomputePath(MotionController activeMotionController)
  protected double getRelativeSpeed()
  protected void forceRecomputePath(MotionController activeMotionController)

Fields:
protected final int nodesPerTick
protected final boolean useBestPath
protected final double throttleDelayMin
protected final double throttleDelayMax
protected final int throttleIgnoreCount
protected final boolean useSteering
protected final boolean usePathfinder
protected final boolean skipSteering
protected final double minPathLength
protected final double minPathLengthSquared
protected final boolean canSkipSteering
protected final boolean isAvoidingBlockDamage
protected final boolean isRelaxedMoveConstraints
protected final double desiredAltitudeWeight
protected final boolean dbgStatus
protected final boolean dbgProfile
protected final boolean dbgMaps
protected final boolean dbgOpens
protected final boolean dbgPath
protected final boolean dbgRebuild
protected final boolean dbgNodes
protected final boolean dbgStay
protected final boolean dbgMotionState
protected final T aStar
protected final AStarDebugBase aStarDebug
protected final PathFollower pathFollower
protected final ProbeMoveData probeMoveData
protected AStarNodePoolProvider sharedNodePoolProvider
protected int throttleCount
protected double throttleTime
protected double targetDeltaSquared
protected boolean wasSteering
protected double throttleDelay
protected boolean passedWaypoint
protected boolean wasAvoidingBlockDamage
protected boolean dbgDisplayString
protected StringBuilder debugString
