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
