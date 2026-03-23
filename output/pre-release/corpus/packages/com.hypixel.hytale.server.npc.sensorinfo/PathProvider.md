# PathProvider

Type: class | Package: com.hypixel.hytale.server.npc.sensorinfo | Implements: IPathProvider

public class PathProvider implements IPathProvider

Implementation of `IPathProvider`.

## Fields

- path | IPath<? extends IPathWaypoint> | IPath<? extends IPathWaypoint> field.
- isValid | boolean | boolean field.

## Methods

- setPath(IPath<? extends IPathWaypoint> path) | void | public method.
- clear() | void | public method.
- hasPath() | boolean | public method.
- getPath() | IPath<? extends IPathWaypoint> | public method.

Also in this package: CachedPositionProvider, EntityPositionProvider, ExtraInfoProvider, IPathProvider, IPositionProvider, InfoProvider, InfoProviderBase, PositionProvider, ValueWrappedInfoProvider, WrappedInfoProvider

Complete API:
  public void setPath(IPath<? extends IPathWaypoint> path)
  public void clear()
  public boolean hasPath()
  public IPath<? extends IPathWaypoint> getPath()

Fields:
private IPath<? extends IPathWaypoint> path
private boolean isValid
