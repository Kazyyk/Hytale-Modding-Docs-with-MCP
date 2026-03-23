# IPathWaypoint

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.path

public interface IPathWaypoint

## Methods

- int getOrder()
- Vector3d getWaypointPosition(ComponentAccessor<EntityStore> var1)
- Vector3f getWaypointRotation(ComponentAccessor<EntityStore> var1)
- double getPauseTime()
- float getObservationAngle()

Known implementors: IPrefabPathWaypoint, SimplePathWaypoint

Also in this package: IPath, SimplePathWaypoint, WorldPath, WorldPathChangedEvent, WorldPathConfig

Complete API:
  int getOrder()
  Vector3d getWaypointPosition(ComponentAccessor<EntityStore> var1)
  Vector3f getWaypointRotation(ComponentAccessor<EntityStore> var1)
  double getPauseTime()
  float getObservationAngle()
