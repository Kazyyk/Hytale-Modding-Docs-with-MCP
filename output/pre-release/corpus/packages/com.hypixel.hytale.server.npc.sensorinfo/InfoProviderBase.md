# InfoProviderBase

Type: class | Package: com.hypixel.hytale.server.npc.sensorinfo | Implements: InfoProvider

public abstract class InfoProviderBase implements InfoProvider

Implementation of `InfoProvider`.

## Fields

- parameterProvider | ParameterProvider | final ParameterProvider field.
- extraProviders | Map<Class<? extends ExtraInfoProvider>, ExtraInfoProvider> | final Map<Class<? extends ExtraInfoProvider>, ExtraInfoProvider> field.
- passedExtraInfo | ExtraInfoProvider | ExtraInfoProvider field.

## Constructors

- InfoProviderBase() | Creates a new InfoProviderBase instance.
- InfoProviderBase(ParameterProvider parameterProvider) | Creates a new InfoProviderBase instance.
- InfoProviderBase(ParameterProvider parameterProvider, @Nonnull ExtraInfoProvider... providers) | Creates a new InfoProviderBase instance.

## Methods

- getParameterProvider(int parameter) | ParameterProvider | public method.
- getExtraInfo(Class<E> clazz) | E | public method.
- passExtraInfo(E provider) | void | public method.
- getPassedExtraInfo(Class<E> clazz) | E | public method.

Known subclasses: PositionProvider

Also in this package: CachedPositionProvider, EntityPositionProvider, ExtraInfoProvider, IPathProvider, IPositionProvider, InfoProvider, PathProvider, PositionProvider, ValueWrappedInfoProvider, WrappedInfoProvider

Complete API:
  public ParameterProvider getParameterProvider(int parameter)
  public E getExtraInfo(Class<E> clazz)
  public void passExtraInfo(E provider)
  public E getPassedExtraInfo(Class<E> clazz)

Fields:
protected final ParameterProvider parameterProvider
protected final Map<Class<? extends ExtraInfoProvider>,ExtraInfoProvider> extraProviders
protected ExtraInfoProvider passedExtraInfo
