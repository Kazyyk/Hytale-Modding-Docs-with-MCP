# SensorHasInteracted

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction | Extends: SensorBase

public class SensorHasInteracted extends SensorBase

Concrete implementation extending `SensorBase`.

## Constructors

- SensorHasInteracted(@Nonnull BuilderSensorBase builderSensorBase) | Creates a new SensorHasInteracted instance.

## Methods

- matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store) | boolean | public method.
- getSensorInfo() | InfoProvider | public method.

Also in this package: ActionLockOnInteractionTarget, ActionSetInteractable, SensorCanInteract, SensorInteractionContext

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
