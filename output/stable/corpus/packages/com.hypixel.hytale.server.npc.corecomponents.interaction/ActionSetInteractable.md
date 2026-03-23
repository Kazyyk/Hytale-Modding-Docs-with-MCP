# ActionSetInteractable

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction | Extends: ActionBase

public class ActionSetInteractable extends ActionBase

Concrete implementation extending `ActionBase`.

## Fields

- setTo | boolean | final boolean field.
- hint | String | final String field.
- showPrompt | boolean | final boolean field.

## Constructors

- ActionSetInteractable(@Nonnull BuilderActionSetInteractable builder, @Nonnull BuilderSupport support) | Creates a new ActionSetInteractable instance.

## Methods

- canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store) | boolean | public method.
- execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store) | boolean | public method.

Also in this package: ActionLockOnInteractionTarget, SensorCanInteract, SensorHasInteracted, SensorInteractionContext

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final boolean setTo
protected final String hint
protected final boolean showPrompt
