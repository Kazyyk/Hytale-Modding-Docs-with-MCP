# SimplePathWaypoint

Type: class | Package: com.hypixel.hytale.server.core.universe.world.path | Implements: IPathWaypoint

public class SimplePathWaypoint implements IPathWaypoint

## Fields

- private int order
- private Transform transform

## Methods

- @Override public int getOrder()
- @Nonnull @Override public Vector3d getWaypointPosition(ComponentAccessor<EntityStore> componentAccessor)
- @Nonnull @Override public Vector3f getWaypointRotation(ComponentAccessor<EntityStore> componentAccessor)
- @Override public double getPauseTime()
- @Override public float getObservationAngle()

Also in this package: IPath, IPathWaypoint, WorldPath, WorldPathChangedEvent, WorldPathConfig

Complete API:
  public int getOrder()
  public Vector3d getWaypointPosition(ComponentAccessor<EntityStore> componentAccessor)
  public Vector3f getWaypointRotation(ComponentAccessor<EntityStore> componentAccessor)
  public double getPauseTime()
  public float getObservationAngle()

Fields:
private int order
private Transform transform
