# BodyMotionPath

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: BodyMotionBase

public class BodyMotionPath extends BodyMotionBase

Path-following body motion with configurable shape (LINE, LOOP, POINTS, CHAIN), direction, node delays, observation sectors, and path-width wandering. Uses `SteeringForcePursue` and `SteeringForceRotate` for movement. Each instance has a corresponding `BuilderBodyMotionPath` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean tickObservationDelay(double dt)
  protected void pickNextObservationAngle()
  protected boolean closeToPosition(Vector3d position, MotionController motionController)
  protected void invalidateWaypoint()
  protected boolean nextWayPoint(IPath<?> path, WorldSupport support, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean getFirstWaypoint(Ref<EntityStore> ref, Role role, IPath<?> path, Vector3d lastPos, ComponentAccessor<EntityStore> componentAccessor)
  protected void waypointIndexUpdated(IPath<?> path, ComponentAccessor<EntityStore> componentAccessor)
  protected void initializeCurrentDirection()
  protected void reset()

Fields:
public static final double MIN_GUARD_POINT_WAIT_TIME
public static final boolean TESTING
protected final BodyMotionPath.Shape shape
protected final double pathWidth
protected final double nodeWidth
protected final double minRelativeSpeed
protected final double maxRelativeSpeed
protected final double minWalkDistance
protected final double maxWalkDistance
protected final boolean startAtNearestNode
protected final BodyMotionPath.Direction direction
protected final double minNodeDelay
protected final double maxNodeDelay
protected final int viewSegments
protected final boolean useNodeViewDirection
protected final boolean pickRandomAngle
protected final double minDelayScale
protected final double maxDelayScale
protected final double minPercentage
protected final double maxPercentage
protected int currentWaypointIndex
protected BodyMotionPath.Direction currentDirection
protected final Vector3d currentWaypointPosition
protected final Vector3d lastWaypointPosition
protected final IntList visitOrder
protected int visitIndex
protected final SteeringForceRotate steeringForceRotate
protected final SteeringForcePursue steeringForcePursue
protected double currentSpeed
protected final Vector3d currentPosition
protected final Vector3d nextPosition
protected boolean nextPositionValid
protected double currentNodeDelay
protected boolean pendingNodeDelay
protected boolean rotatingToView
protected float nodeViewDirection
protected double nodeWaitTime
protected float observationSector
protected double currentObservationDelay
protected boolean rotating
protected final Vector3d previousSteeringTranslation
protected int currentViewSegment
