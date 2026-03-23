# SensorInteractionContext

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction | Extends: SensorBase

public class SensorInteractionContext extends SensorBase

Concrete implementation extending `SensorBase`.

## Fields

- interactionContext | String | final String field.

## Constructors

- SensorInteractionContext(@Nonnull BuilderSensorInteractionContext builder, @Nonnull BuilderSupport support) | Creates a new SensorInteractionContext instance.

## Methods

- matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store) | boolean | public method.
- getSensorInfo() | InfoProvider | public method.

Also in this package: ActionLockOnInteractionTarget, ActionSetInteractable, SensorCanInteract, SensorHasInteracted

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
private final String interactionContext
