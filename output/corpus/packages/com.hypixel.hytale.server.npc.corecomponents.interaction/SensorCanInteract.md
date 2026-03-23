# SensorCanInteract

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction | Extends: SensorBase

public class SensorCanInteract extends SensorBase

Concrete implementation extending `SensorBase`.

## Fields

- viewCone | float | final float field.
- attitudes | EnumSet<Attitude> | final EnumSet<Attitude> field.

## Constructors

- SensorCanInteract(@Nonnull BuilderSensorCanInteract builder, @Nonnull BuilderSupport support) | Creates a new SensorCanInteract instance.

## Methods

- matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store) | boolean | public method.
- registerWithSupport(@Nonnull Role role) | void | public method.
- getSensorInfo() | InfoProvider | public method.
