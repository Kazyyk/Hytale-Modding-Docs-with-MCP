# PositionProvider

Type: class | Package: com.hypixel.hytale.server.npc.sensorinfo | Extends: InfoProviderBase | Implements: IPositionProvider

public class PositionProvider extends InfoProviderBase implements IPositionProvider

Implementation of `IPositionProvider`.

## Fields

- x | double | double field.
- y | double | double field.
- z | double | double field.
- isValid | boolean | boolean field.

## Constructors

- PositionProvider() | Creates a new PositionProvider instance.
- PositionProvider(ParameterProvider parameterProvider) | Creates a new PositionProvider instance.
- PositionProvider(ParameterProvider parameterProvider, ExtraInfoProvider... providers) | Creates a new PositionProvider instance.

## Methods

- clear() | void | public method.
- setTarget(@Nullable Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | Ref<EntityStore> | public method.
- setTarget(@Nonnull Vector3d pos) | void | public method.
- setTarget(double x, double y, double z) | void | public method.
- providePosition(@Nonnull Vector3d result) | boolean | public method.
- getX() | double | public method.
- getY() | double | public method.
- getZ() | double | public method.
- getPositionProvider() | IPositionProvider | public method.
- hasPosition() | boolean | public method.
- getTarget() | Ref<EntityStore> | public method.
