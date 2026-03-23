# ValueWrappedInfoProvider

Type: class | Package: com.hypixel.hytale.server.npc.sensorinfo | Implements: InfoProvider

public class ValueWrappedInfoProvider implements InfoProvider

Implementation of `InfoProvider`.

## Fields

- wrappedProvider | InfoProvider | final InfoProvider field.
- parameterProvider | ParameterProvider | final ParameterProvider field.

## Constructors

- ValueWrappedInfoProvider(@Nullable InfoProvider wrappedProvider, @Nonnull ParameterProvider parameterProvider) | Creates a new ValueWrappedInfoProvider instance.

## Methods

- getPositionProvider() | IPositionProvider | public method.
- getParameterProvider(int parameter) | ParameterProvider | public method.
- getExtraInfo(Class<E> clazz) | E | public method.
- passExtraInfo(E provider) | void | public method.
- getPassedExtraInfo(Class<E> clazz) | E | public method.
- hasPosition() | boolean | public method.

Also in this package: CachedPositionProvider, EntityPositionProvider, ExtraInfoProvider, IPathProvider, IPositionProvider, InfoProvider, InfoProviderBase, PathProvider, PositionProvider, WrappedInfoProvider

Complete API:
  public IPositionProvider getPositionProvider()
  public ParameterProvider getParameterProvider(int parameter)
  public E getExtraInfo(Class<E> clazz)
  public void passExtraInfo(E provider)
  public E getPassedExtraInfo(Class<E> clazz)
  public boolean hasPosition()

Fields:
private final InfoProvider wrappedProvider
private final ParameterProvider parameterProvider
