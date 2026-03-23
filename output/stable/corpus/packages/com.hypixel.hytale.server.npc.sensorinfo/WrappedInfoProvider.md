# WrappedInfoProvider

Type: class | Package: com.hypixel.hytale.server.npc.sensorinfo | Implements: InfoProvider

public class WrappedInfoProvider implements InfoProvider

Implementation of `InfoProvider`.

## Fields

- sensors | List<Sensor> | final List<Sensor> field.
- positionMatch | IPositionProvider | IPositionProvider field.
- passedExtraInfo | ExtraInfoProvider | ExtraInfoProvider field.

## Constructors

- WrappedInfoProvider() | Creates a new WrappedInfoProvider instance.
- WrappedInfoProvider(Sensor[] sensors) | Creates a new WrappedInfoProvider instance.

## Methods

- getExtraInfo(Class<E> clazz) | E | public method.
- passExtraInfo(E provider) | void | public method.
- getPassedExtraInfo(Class<E> clazz) | E | public method.
- hasPosition() | boolean | public method.
- getPositionProvider() | IPositionProvider | public method.
- getParameterProvider(int parameter) | ParameterProvider | public method.
- clearMatches() | void | public method.
- addMatch(Sensor sensor) | void | public method.
- clearPositionMatch() | void | public method.
- setPositionMatch(IPositionProvider provider) | void | public method.

Also in this package: CachedPositionProvider, EntityPositionProvider, ExtraInfoProvider, IPathProvider, IPositionProvider, InfoProvider, InfoProviderBase, PathProvider, PositionProvider, ValueWrappedInfoProvider

Complete API:
  public E getExtraInfo(Class<E> clazz)
  public void passExtraInfo(E provider)
  public E getPassedExtraInfo(Class<E> clazz)
  public boolean hasPosition()
  public IPositionProvider getPositionProvider()
  public ParameterProvider getParameterProvider(int parameter)
  public void clearMatches()
  public void addMatch(Sensor sensor)
  public void clearPositionMatch()
  public void setPositionMatch(IPositionProvider provider)

Fields:
private final List<Sensor> sensors
private IPositionProvider positionMatch
protected ExtraInfoProvider passedExtraInfo
