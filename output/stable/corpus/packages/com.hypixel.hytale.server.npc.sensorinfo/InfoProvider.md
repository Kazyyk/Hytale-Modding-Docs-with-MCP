# InfoProvider

Type: interface | Package: com.hypixel.hytale.server.npc.sensorinfo

public interface InfoProvider

Interface defining: `getPositionProvider()`, `getParameterProvider()`, `getExtraInfo()`, `passExtraInfo()`....

## Methods

- getPositionProvider() | IPositionProvider | package-private method.
- getParameterProvider(int var1) | ParameterProvider | package-private method.
- getExtraInfo(Class<E> var1) | E | package-private method.
- passExtraInfo(E var1) | void | package-private method.
- getPassedExtraInfo(Class<E> var1) | E | package-private method.
- hasPosition() | boolean | package-private method.

Known implementors: InfoProviderBase, ValueWrappedInfoProvider, WrappedInfoProvider

Also in this package: CachedPositionProvider, EntityPositionProvider, ExtraInfoProvider, IPathProvider, IPositionProvider, InfoProviderBase, PathProvider, PositionProvider, ValueWrappedInfoProvider, WrappedInfoProvider

Complete API:
  IPositionProvider getPositionProvider()
  ParameterProvider getParameterProvider(int var1)
  E getExtraInfo(Class<E> var1)
  void passExtraInfo(E var1)
  E getPassedExtraInfo(Class<E> var1)
  boolean hasPosition()
