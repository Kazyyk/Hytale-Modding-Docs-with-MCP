# EntityPositionProvider

Type: class | Package: com.hypixel.hytale.server.npc.sensorinfo | Extends: PositionProvider

public class EntityPositionProvider extends PositionProvider

Concrete implementation extending `PositionProvider`.

## Fields

- target | Ref<EntityStore> | Ref<EntityStore> field.

## Constructors

- EntityPositionProvider() | Creates a new EntityPositionProvider instance.
- EntityPositionProvider(ParameterProvider parameterProvider) | Creates a new EntityPositionProvider instance.

## Methods

- clear() | void | public method.
- setTarget(@Nullable Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | Ref<EntityStore> | public method.
- getTarget() | Ref<EntityStore> | public method.
- hasPosition() | boolean | public method.
