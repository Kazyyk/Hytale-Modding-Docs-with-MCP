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
