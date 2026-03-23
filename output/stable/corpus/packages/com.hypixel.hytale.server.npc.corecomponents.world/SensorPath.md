# SensorPath

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorPath extends SensorBase

Detects and follows paths of various types: world paths, prefab paths, or transient paths. Finds the nearest waypoint and provides path/position info. Supports path disallowing for variety. Each instance has a corresponding `BuilderSensorPath` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType (and 11 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  protected boolean pathMatches(IPath<?> path)
  protected boolean isInRange(double squaredDistance)
  protected IPath<?> findPath(Ref<EntityStore> ref, Vector3d position, Store<EntityStore> store, Set<UUID> disallowedPaths, boolean newPathRequested)
  protected void findClosestWaypoint(IPath<?> path, Vector3d position, Vector3d cachedTarget, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final double range
protected final SensorPath.PathType pathType
protected final Vector3d closestWaypoint
protected final HashSet<UUID> disallowedPaths
protected final PathProvider pathProvider
protected final PositionProvider positionProvider
protected final ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> prefabPathSpatialResource
protected final ComponentType<EntityStore,PatrolPathMarkerEntity> patrolPathMarkerEntityComponentType
protected final ComponentType<EntityStore,WorldGenId> worldGenIdComponentType
protected String path
protected int pathIndex
protected int pathChangeRevision
protected double distanceSquared
protected SensorPath.LoadStatus loadStatus
