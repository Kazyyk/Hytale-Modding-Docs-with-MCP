# IPositionProvider

Type: interface | Package: com.hypixel.hytale.server.npc.sensorinfo

public interface IPositionProvider

Interface defining: `hasPosition()`, `providePosition()`, `getX()`, `getY()`....

## Methods

- hasPosition() | boolean | package-private method.
- providePosition(Vector3d var1) | boolean | package-private method.
- getX() | double | package-private method.
- getY() | double | package-private method.
- getZ() | double | package-private method.
- getTarget() | Ref<EntityStore> | package-private method.
- clear() | void | package-private method.

Known implementors: PositionProvider

Also in this package: CachedPositionProvider, EntityPositionProvider, ExtraInfoProvider, IPathProvider, InfoProvider, InfoProviderBase, PathProvider, PositionProvider, ValueWrappedInfoProvider, WrappedInfoProvider

Complete API:
  boolean hasPosition()
  boolean providePosition(Vector3d var1)
  double getX()
  double getY()
  double getZ()
  Ref<EntityStore> getTarget()
  void clear()
