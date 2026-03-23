# IPath

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.path

public interface IPath<Waypoint>

## Methods

- @Nullable UUID getId()
- @Nullable String getName()
- List<Waypoint> getPathWaypoints()
- int length()
- Waypoint get(int var1)

Known implementors: IPrefabPath, TransientPath, WorldPath

Also in this package: IPathWaypoint, SimplePathWaypoint, WorldPath, WorldPathChangedEvent, WorldPathConfig

Complete API:
  UUID getId()
  String getName()
  List<Waypoint> getPathWaypoints()
  int length()
  Waypoint get(int var1)
