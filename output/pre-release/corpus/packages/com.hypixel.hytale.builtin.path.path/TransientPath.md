# TransientPath

Type: class | Package: com.hypixel.hytale.builtin.path.path | Implements: IPath<SimplePathWaypoint>

public class TransientPath implements IPath<SimplePathWaypoint>

Implementation of `IPath<SimplePathWaypoint>`.

## Methods

- addWaypoint(@Nonnull Vector3d position, @Nonnull Vector3f rotation) | void | public method.
- getId() | UUID | public method.
- getName() | String | public method.
- getPathWaypoints() | List<SimplePathWaypoint> | public method.
- length() | int | public method.
- get(int index) | SimplePathWaypoint | public method.

Also in this package: IPrefabPath, PatrolPath, TransientPathDefinition

Complete API:
  public void addWaypoint(Vector3d position, Vector3f rotation)
  public UUID getId()
  public String getName()
  public List<SimplePathWaypoint> getPathWaypoints()
  public int length()
  public SimplePathWaypoint get(int index)
  public static IPath<SimplePathWaypoint> buildPath(Vector3d origin, Vector3f rotation, Queue<RelativeWaypointDefinition> instructions, double scale)

Fields:
protected final List<SimplePathWaypoint> waypoints
