# PatrolPath

Type: class | Package: com.hypixel.hytale.builtin.path.path | Implements: IPrefabPath

public class PatrolPath implements IPrefabPath

Implementation of `IPrefabPath`.

## Fields

- id | UUID | final UUID field.
- name | String | final String field.
- worldgenId | int | final int field.
- waypointList | List<IPrefabPathWaypoint> | List<IPrefabPathWaypoint> field.

## Constructors

- PatrolPath(int worldgenId, UUID id, String name) | Creates a new PatrolPath instance.

## Methods

- getId() | UUID | public method.
- getName() | String | public method.
- getPathWaypoints() | List<IPrefabPathWaypoint> | public method.
- registerNewWaypoint(@Nonnull IPrefabPathWaypoint waypoint, int worldGenId) | short | public method.
- registerNewWaypointAt(int index, @Nonnull IPrefabPathWaypoint waypoint, int worldGenId) | void | public method.
- addLoadedWaypoint(@Nonnull IPrefabPathWaypoint waypoint, int pathLength, int index, int worldGenId) | void | public method.
- removeWaypoint(int index, int worldGenId) | void | public method.
- unloadWaypoint(int index) | void | public method.
- hasLoadedWaypoints() | boolean | public method.
- isFullyLoaded() | boolean | public method.
- loadedWaypointCount() | int | public method.
- getWorldGenId() | int | public method.
- getNearestWaypointPosition(@Nonnull Vector3d origin, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | Vector3d | public method.
- mergeInto(@Nonnull IPrefabPath target, int worldGenId, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | void | public method.
- compact(int worldGenId) | void | public method.
- length() | int | public method.
- get(int index) | IPrefabPathWaypoint | public method.

Also in this package: IPrefabPath, TransientPath, TransientPathDefinition

Complete API:
  public UUID getId()
  public String getName()
  public List<IPrefabPathWaypoint> getPathWaypoints()
  public short registerNewWaypoint(IPrefabPathWaypoint waypoint, int worldGenId)
  public void registerNewWaypointAt(int index, IPrefabPathWaypoint waypoint, int worldGenId)
  public void addLoadedWaypoint(IPrefabPathWaypoint waypoint, int pathLength, int index, int worldGenId)
  public void removeWaypoint(int index, int worldGenId)
  public void unloadWaypoint(int index)
  public boolean hasLoadedWaypoints()
  public boolean isFullyLoaded()
  public int loadedWaypointCount()
  public int getWorldGenId()
  public Vector3d getNearestWaypointPosition(Vector3d origin, ComponentAccessor<EntityStore> componentAccessor)
  public void mergeInto(IPrefabPath target, int worldGenId, ComponentAccessor<EntityStore> componentAccessor)
  public void compact(int worldGenId)
  public int length()
  public IPrefabPathWaypoint get(int index)

Fields:
private final UUID id
private final String name
private final int worldgenId
private final Int2ObjectConcurrentHashMap<IPrefabPathWaypoint> waypoints
private final AtomicInteger length
private final AtomicInteger loadedCount
private final AtomicBoolean pathChanged
private final ReentrantReadWriteLock listLock
private List<IPrefabPathWaypoint> waypointList
