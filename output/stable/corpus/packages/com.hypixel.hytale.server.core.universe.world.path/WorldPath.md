# WorldPath

Type: class | Package: com.hypixel.hytale.server.core.universe.world.path | Implements: IPath

public class WorldPath implements IPath

## Fields

- public static final BuilderCodec<WorldPath> CODEC
- protected UUID id
- protected String name
- protected List<Transform> waypoints
- protected List<SimplePathWaypoint> simpleWaypoints

## Methods

- @Override public UUID getId()
- @Override public String getName()
- @Nonnull @Override public List<SimplePathWaypoint> getPathWaypoints()
- @Override public int length()
- public SimplePathWaypoint get(int index)
- public List<Transform> getWaypoints()
- @Nonnull @Override public String toString()
