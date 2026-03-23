# TransientPathDefinition

Type: class | Package: com.hypixel.hytale.builtin.path.path

public class TransientPathDefinition

Class in the path subsystem.

## Fields

- waypointDefinitions | List<RelativeWaypointDefinition> | final List<RelativeWaypointDefinition> field.
- scale | double | final double field.

## Constructors

- TransientPathDefinition(List<RelativeWaypointDefinition> waypointDefinitions, double scale) | Creates a new TransientPathDefinition instance.

## Methods

- buildPath(@Nonnull Vector3d position, @Nonnull Vector3f rotation) | IPath<SimplePathWaypoint> | public method.

Also in this package: IPrefabPath, PatrolPath, TransientPath

Complete API:
  public IPath<SimplePathWaypoint> buildPath(Vector3d position, Vector3f rotation)

Fields:
protected final List<RelativeWaypointDefinition> waypointDefinitions
protected final double scale
